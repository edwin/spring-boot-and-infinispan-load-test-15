package com.edw.controller;

import com.edw.bean.GenMdAccountEntity;
import com.edw.bean.GenMdSidMappingEntity;
import com.edw.helper.CacheHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * <pre>
 *  com.edw.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 22 Feb 2025 16:12
 */
@RestController
@Slf4j
public class IndexController {

    private CacheHelper cacheHelper;
    private List<String> listSID = new ArrayList();
    private List<String> listShortCode = new ArrayList();
    private List<String> listAcc = new ArrayList();

    @Value("${jdg.thread:1}")
    private Integer numThread;

    @Value("${jdg.chunk:1}")
    private Integer numChunk;

    private Integer dataCount;

    @Autowired
    public IndexController(CacheHelper cacheHelper, @Value("${jdg.dataCount:1}") Integer dataCount) {//1000
        this.cacheHelper = cacheHelper;
        this.dataCount = dataCount;
        Random random = new Random();
        long number = random.nextLong(9999999999L);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < dataCount; i++) {
            listSID.add(String.format("%06d", number));
            listShortCode.add("DX");
            listShortCode.add("YP");
            listShortCode.add("PD");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("accid.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                listAcc.add(line.trim());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        log.info("Initiate Data DONE : {}", System.currentTimeMillis()-startTime);
    }



    @GetMapping(path = "/generate-md-account")
    public Map generateMdAccount() {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

        for (int i = 0; i < 100; i++) {
            executor.execute(() ->
                    executor.execute(() -> {
                        for (String accId : listAcc) {
                            log.info("saving : {}", accId);
                            cacheHelper.saveAccountId(accId);
                        }
                    })
            );
        }

        return new HashMap() {{
            put("status", "success");
        }};
    }

    @GetMapping(path = "/get-md-account")
    public Map getMdAccount() {
        log.info("Start get-md-account Data (/get-md-account)");

        for (String accId : listAcc) {
            long startTime = System.currentTimeMillis();
            log.trace(""+cacheHelper.getAccountId(accId));
            log.info("Duration get-md-account : {} - {}", accId, System.currentTimeMillis()-startTime);
        }
        log.info("End get-md-account Data (/get-md-account)");

        return new HashMap() {{
            put("status", "success");
        }};
    }
    @GetMapping(path = "/")
    public Map index() {
        return new HashMap() {{
            put("hello", "world");
        }};
    }

    @GetMapping(path = "/generate-data")
    public Map generateData() {
        log.info("Start Generate Data (/generate-data)");
        long startTime = System.currentTimeMillis();

        for (String tradingId : listSID) {
            cacheHelper.save(new GenMdSidMappingEntity(UUID.randomUUID().toString(), new Date(), "approvedBy" , new Date(), "checkedBy", new Date(), "modifiedBy",
                    new Date(), "createdBy", new Random().nextLong(), "c", new Random().nextLong(), tradingId, "sidCode",
                    new Random().nextLong(), new Random().nextLong()));
        }
        log.info("Generate Data Time : {}", System.currentTimeMillis()-startTime);

        return new HashMap() {{
            put("status", "success");
        }};
    }

    @GetMapping(path = "/generate-key")
    public Map generateKey() {
        log.info("Start Generate KEY (/generate-key)");

        long startTime = System.currentTimeMillis();
        listSID.clear();
        listAcc.clear();

        List<GenMdSidMappingEntity> genMdSidMappingNewEntityList = cacheHelper.getSIDFree(dataCount);
        List<GenMdAccountEntity> genMdAccountEntityList = cacheHelper.getAccountFree(dataCount);
        for(GenMdSidMappingEntity genMdSidMappingNew: genMdSidMappingNewEntityList) {
            listSID.add(genMdSidMappingNew.getTradingId());
        }

        for(GenMdAccountEntity genMdAccountEntity : genMdAccountEntityList) {
            listAcc.add(String.valueOf(genMdAccountEntity.getAccountId()));
        }
        log.info("Generate Key Data Time : {}", System.currentTimeMillis()-startTime);

        return new HashMap() {{
            put("status", "success");
        }};
    }

    @GetMapping(path = "/generate-get")
    public Map generateGet() {

        log.info("Start Generate GET (/generate-get)");

        ExecutorService executor = Executors.newFixedThreadPool(numThread);//10
        for (int i = 0; i < numChunk; i++) {//100
            executor.execute(new CacheInquiry());
            executor.execute(new CacheInquiry());
            executor.execute(new CacheInquiryAcc());
            executor.execute(new CacheInquiryAcc());
            executor.execute(new CacheInquiryMember());
            executor.execute(new CacheInquiryMember());
            executor.execute(new CacheInquirySIDByAccId());
            executor.execute(new CacheInquiryAccByMember());
            executor.execute(new CacheInquirySIDByAccId());
            executor.execute(new CacheInquiryAccByMember());
        }

        return new HashMap() {{
            put("status", "success");
        }};
    }

    private class CacheInquiry implements Runnable
    {
        @Override
        public void run()
        {
            long startTimeThread = System.currentTimeMillis();
            for (String tradingId : listSID) {
                long startTime = System.currentTimeMillis();
                log.trace(""+cacheHelper.getSIDByTradingID(tradingId));
                log.info("Duration SID per query cache : {}", System.currentTimeMillis()-startTime);
            }
            log.info("Duration TOTAL SID per Thread list : {}", System.currentTimeMillis()-startTimeThread);
        }
    }

    private class CacheInquirySIDByAccId implements Runnable
    {
        @Override
        public void run()
        {
            long startTimeThread = System.currentTimeMillis();
            for (String accId : listAcc) {
                long startTime = System.currentTimeMillis();
                log.trace(""+cacheHelper.getSIDByAccountId(accId));
                log.info("Duration SID by ACC per query cache : {}", System.currentTimeMillis()-startTime);
            }
            log.info("Duration TOTAL SID by ACC per Thread list : {}", System.currentTimeMillis()-startTimeThread);
        }
    }

    private class CacheInquiryAcc implements Runnable
    {
        @Override
        public void run()
        {
            long startTimeThread = System.currentTimeMillis();
            for (String tradingId : listAcc) {
                long startTime = System.currentTimeMillis();
                log.trace(""+cacheHelper.getAccount(tradingId));
                log.info("Duration ACC per query cache : {}", System.currentTimeMillis()-startTime);
            }
            log.info("Duration TOTAL ACC per Thread list : {}", System.currentTimeMillis()-startTimeThread);
        }
    }

    private class CacheInquiryAccByMember implements Runnable
    {
        @Override
        public void run()
        {
            long startTimeThread = System.currentTimeMillis();
            for (String tradingId : listAcc) {
                long startTime = System.currentTimeMillis();
                log.trace(""+cacheHelper.getAccountByMember(tradingId));
                log.info("Duration ACC by Member per query cache : {}", System.currentTimeMillis()-startTime);
            }
            log.info("Duration TOTAL ACC by Mmber per Thread list : {}", System.currentTimeMillis()-startTimeThread);
        }
    }

    private class CacheInquiryMember implements Runnable
    {
        @Override
        public void run()
        {
            long startTimeThread = System.currentTimeMillis();
            for (String shortCode : listShortCode) {
                long startTime = System.currentTimeMillis();
                log.trace(""+cacheHelper.getMember(shortCode));
                log.info("Duration Member per query cache : {}", System.currentTimeMillis()-startTime);
            }
            log.info("Duration TOTAL Member per Thread list : {}", System.currentTimeMillis()-startTimeThread);
        }
    }

    private class CacheInquiryInstrument implements Runnable
    {
        @Override
        public void run()
        {
            long startTimeThread = System.currentTimeMillis();
            for (String shortCode : listShortCode) {
                long startTime = System.currentTimeMillis();
                log.trace(""+cacheHelper.getMember(shortCode));
                log.info("Duration Member per query cache : {}", System.currentTimeMillis()-startTime);
            }
            log.info("Duration TOTAL Member per Thread list : {}", System.currentTimeMillis()-startTimeThread);
        }
    }
}