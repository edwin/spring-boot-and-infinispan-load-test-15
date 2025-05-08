package com.edw.helper;

import com.edw.bean.GenMdAccountEntity;
import com.edw.bean.GenMdInstrumentEntity;
import com.edw.bean.GenMdMemberEntity;
import com.edw.bean.GenMdSidMappingEntity;
import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.Search;
import org.infinispan.query.dsl.Query;
import org.infinispan.query.dsl.QueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <pre>
 *  com.edw.helper.CacheHelper
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 22 Feb 2025 16:20
 */
@Service
public class CacheHelper {

    private RemoteCacheManager remoteCacheManager;

    @Autowired
    public CacheHelper(RemoteCacheManager remoteCacheManager) {
        this.remoteCacheManager = remoteCacheManager;
    }

    public void save(GenMdSidMappingEntity genMdSidMappingEntity) {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_SID_MAPPING");
        cache.put(genMdSidMappingEntity.getMappingId(), genMdSidMappingEntity);
    }

    public List<GenMdSidMappingEntity> getSIDByTradingID(String tradingId) {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_SID_MAPPING");
        QueryFactory queryFactory = Search.getQueryFactory(cache);
        Query<GenMdSidMappingEntity> query = queryFactory.create("from default.GenMdSidMappingEntity where tradingId = :param1");
        query.setParameter("param1", tradingId);
        return query.execute().list();
    }

    public List<GenMdSidMappingEntity> getSIDByAccountId(String accountId) {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_SID_MAPPING");
        QueryFactory queryFactory = Search.getQueryFactory(cache);
        Query<GenMdSidMappingEntity> query = queryFactory.create("from default.GenMdSidMappingEntity where accountId = :param1");
        query.setParameter("param1", accountId);
        return query.execute().list();
    }

    public List<GenMdSidMappingEntity> getSIDFree(int maxResult) {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_SID_MAPPING");
        char recordStatus = '1';
        QueryFactory queryFactory = Search.getQueryFactory(cache);
        Query<GenMdSidMappingEntity> query = queryFactory.create("from default.GenMdSidMappingEntity where recordStatus = :param1");
        query.setParameter("param1", recordStatus);
        query.maxResults(maxResult);
        return query.execute().list();
    }

    public List<GenMdAccountEntity> getAccount(String accountId) {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_ACCOUNT");
        QueryFactory queryFactory = Search.getQueryFactory(cache);
        Query<GenMdAccountEntity> query = queryFactory.create("from default.GenMdAccountEntity where accountId = :param1");
        query.setParameter("param1", accountId);
        return query.execute().list();
    }

    public List<GenMdInstrumentEntity> getInstrument(String instrumentCode) {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_INSTRUMENT");
        QueryFactory queryFactory = Search.getQueryFactory(cache);
        Query<GenMdInstrumentEntity> query = queryFactory.create("from default.GenMdInstrumentEntity where instrumentCode = :param1");
        query.setParameter("param1", instrumentCode);
        return query.execute().list();
    }

    public List<GenMdAccountEntity> getAccountByMember(String memberId) {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_ACCOUNT");
        QueryFactory queryFactory = Search.getQueryFactory(cache);
        String clientCode = "0000";
        String accountType = "004";
        Query<GenMdAccountEntity> query = queryFactory.create("from default.GenMdAccountEntity where memberId = :param1" +
                " and clientCode = :param2" +
                " and accountType = :param3");
        query.setParameter("param1", memberId);
        query.setParameter("param2", clientCode);
        query.setParameter("param3", accountType);
        return query.execute().list();
    }

    public List<GenMdMemberEntity> getMember(String shortCode) {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_MEMBER");
        int memberStatus = 1;
        QueryFactory queryFactory = Search.getQueryFactory(cache);
        Query<GenMdMemberEntity> query = queryFactory.create("from default.GenMdMemberEntity where shortCode = :param1" +
                " and memberStatus = :param2");
        query.setParameter("param1", shortCode);
        query.setParameter("param2", memberStatus);
        return query.execute().list();
    }

    public List<GenMdAccountEntity> getAccountFree(int maxResult) {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_ACCOUNT");
        char accountStatus = '1';
        QueryFactory queryFactory = Search.getQueryFactory(cache);
        Query<GenMdAccountEntity> query = queryFactory.create("from default.GenMdAccountEntity where accountStatus = :param1");
        query.setParameter("param1", accountStatus);
        query.maxResults(maxResult);
        return query.execute().list();
    }

    public List<GenMdAccountEntity> getAccountId(String accId) {
        final RemoteCache cache = remoteCacheManager.getCache("GEN_MD_ACCOUNT");
        QueryFactory queryFactory = Search.getQueryFactory(cache);
        Query<GenMdAccountEntity> query = queryFactory.create("from default.GenMdAccountEntity where accountId in ( :param1 )");
        query.setParameter("param1", accId);
        return query.execute().list();
    }


}
