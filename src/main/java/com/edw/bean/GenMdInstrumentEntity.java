package com.edw.bean;

import org.infinispan.api.annotations.indexing.Basic;
import org.infinispan.api.annotations.indexing.Indexed;
import org.infinispan.protostream.annotations.ProtoField;

import java.util.Date;

@Indexed
public class GenMdInstrumentEntity {

    private Long instrumentId;

    private String instrumentCode;

    private String instrumentName;

    private String instrumentType;

    private String isinCode;

    private String isoCode;

    private String currencyCode;

    private String nomenclature;

    private Date listingDate;

    private Long numberIssued;

    private Long underlyingInstrumentId;

    private String strikePrice;

    private String oldInstrumentCode;

    private Date oldInstrumentLastDate;

    private String collateralHaircut;

    private Long minimumCollateral;

    private Long minimumTradeableAmount;

    private Integer minimumDenomination;

    private String bondType;

    private Byte bondTenor;

    private Integer bondDayBasis;

    private String bondCouponRate;

    private String bondCouponPeriod;

    private Date bondIssueDate;

    private Date bondMaturityDate;

    private Date bondCouponDate;

    private Date nextBondCouponDate;

    private String bondRating;

    private String blockingReason;

    private Long secNum;

    private Long codeActiSec;

    private Character instrumentStatus;

    private String createdBy;

    private Date createdOn;

    private String modifiedBy;

    private Date modifiedOn;

    private String checkedBy;

    private Date checkedOn;

    private String approvedBy;

    private Date approvedOn;

    @ProtoField(number = 1)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Long getInstrumentId() {
        return instrumentId;
    }

    @ProtoField(number = 2)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getInstrumentCode() {
        return instrumentCode;
    }

    @ProtoField(number = 3)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getInstrumentName() {
        return instrumentName;
    }

    @ProtoField(number = 4)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getInstrumentType() {
        return instrumentType;
    }

    @ProtoField(number = 5)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getIsinCode() {
        return isinCode;
    }

    @ProtoField(number = 6)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getIsoCode() {
        return isoCode;
    }

    @ProtoField(number = 7)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getCurrencyCode() {
        return currencyCode;
    }

    @ProtoField(number = 8)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getNomenclature() {
        return nomenclature;
    }

    @ProtoField(number = 9)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Date getListingDate() {
        return listingDate;
    }

    @ProtoField(number = 10)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Long getNumberIssued() {
        return numberIssued;
    }

    @ProtoField(number = 11)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Long getUnderlyingInstrumentId() {
        return underlyingInstrumentId;
    }

    @ProtoField(number = 12)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getStrikePrice() {
        return strikePrice;
    }

    @ProtoField(number = 13)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getOldInstrumentCode() {
        return oldInstrumentCode;
    }

    @ProtoField(number = 14)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Date getOldInstrumentLastDate() {
        return oldInstrumentLastDate;
    }

    @ProtoField(number = 15)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getCollateralHaircut() {
        return collateralHaircut;
    }

    @ProtoField(number = 16)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Long getMinimumCollateral() {
        return minimumCollateral;
    }

    @ProtoField(number = 17)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Long getMinimumTradeableAmount() {
        return minimumTradeableAmount;
    }

    @ProtoField(number = 18)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Integer getMinimumDenomination() {
        return minimumDenomination;
    }

    @ProtoField(number = 19)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getBondType() {
        return bondType;
    }

    @ProtoField(number = 20)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Byte getBondTenor() {
        return bondTenor;
    }

    @ProtoField(number = 21)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Integer getBondDayBasis() {
        return bondDayBasis;
    }

    @ProtoField(number = 22)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getBondCouponRate() {
        return bondCouponRate;
    }

    @ProtoField(number = 23)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getBondCouponPeriod() {
        return bondCouponPeriod;
    }

    @ProtoField(number = 24)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Date getBondIssueDate() {
        return bondIssueDate;
    }

    @ProtoField(number = 25)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Date getBondMaturityDate() {
        return bondMaturityDate;
    }

    @ProtoField(number = 26)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Date getBondCouponDate() {
        return bondCouponDate;
    }

    @ProtoField(number = 27)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Date getNextBondCouponDate() {
        return nextBondCouponDate;
    }

    @ProtoField(number = 28)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getBondRating() {
        return bondRating;
    }

    @ProtoField(number = 29)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getBlockingReason() {
        return blockingReason;
    }

    @ProtoField(number = 30)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Long getSecNum() {
        return secNum;
    }

    @ProtoField(number = 31)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Long getCodeActiSec() {
        return codeActiSec;
    }

    @ProtoField(number = 32)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Character getInstrumentStatus() {
        return instrumentStatus;
    }

    @ProtoField(number = 33)
    public String getCreatedBy() {
        return createdBy;
    }

    @ProtoField(number = 34)
    public Date getCreatedOn() {
        return createdOn;
    }

    @ProtoField(number = 35)
    public String getModifiedBy() {
        return modifiedBy;
    }

    @ProtoField(number = 36)
    public Date getModifiedOn() {
        return modifiedOn;
    }

    @ProtoField(number = 37)
    public String getCheckedBy() {
        return checkedBy;
    }

    @ProtoField(number = 38)
    public Date getCheckedOn() {
        return checkedOn;
    }

    @ProtoField(number = 39)
    public String getApprovedBy() {
        return approvedBy;
    }

    @ProtoField(number = 40)
    public Date getApprovedOn() {
        return approvedOn;
    }

    public void setInstrumentId(Long instrumentId) {
        this.instrumentId = instrumentId;
    }

    public void setInstrumentCode(String instrumentCode) {
        this.instrumentCode = instrumentCode;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public void setIsinCode(String isinCode) {
        this.isinCode = isinCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setNomenclature(String nomenclature) {
        this.nomenclature = nomenclature;
    }

    public void setListingDate(Date listingDate) {
        this.listingDate = listingDate;
    }

    public void setNumberIssued(Long numberIssued) {
        this.numberIssued = numberIssued;
    }

    public void setUnderlyingInstrumentId(Long underlyingInstrumentId) {
        this.underlyingInstrumentId = underlyingInstrumentId;
    }

    public void setStrikePrice(String strikePrice) {
        this.strikePrice = strikePrice;
    }

    public void setOldInstrumentCode(String oldInstrumentCode) {
        this.oldInstrumentCode = oldInstrumentCode;
    }

    public void setOldInstrumentLastDate(Date oldInstrumentLastDate) {
        this.oldInstrumentLastDate = oldInstrumentLastDate;
    }

    public void setCollateralHaircut(String collateralHaircut) {
        this.collateralHaircut = collateralHaircut;
    }

    public void setMinimumCollateral(Long minimumCollateral) {
        this.minimumCollateral = minimumCollateral;
    }

    public void setMinimumTradeableAmount(Long minimumTradeableAmount) {
        this.minimumTradeableAmount = minimumTradeableAmount;
    }

    public void setMinimumDenomination(Integer minimumDenomination) {
        this.minimumDenomination = minimumDenomination;
    }

    public void setBondType(String bondType) {
        this.bondType = bondType;
    }

    public void setBondTenor(Byte bondTenor) {
        this.bondTenor = bondTenor;
    }

    public void setBondDayBasis(Integer bondDayBasis) {
        this.bondDayBasis = bondDayBasis;
    }

    public void setBondCouponRate(String bondCouponRate) {
        this.bondCouponRate = bondCouponRate;
    }

    public void setBondCouponPeriod(String bondCouponPeriod) {
        this.bondCouponPeriod = bondCouponPeriod;
    }

    public void setBondIssueDate(Date bondIssueDate) {
        this.bondIssueDate = bondIssueDate;
    }

    public void setBondMaturityDate(Date bondMaturityDate) {
        this.bondMaturityDate = bondMaturityDate;
    }

    public void setBondCouponDate(Date bondCouponDate) {
        this.bondCouponDate = bondCouponDate;
    }

    public void setNextBondCouponDate(Date nextBondCouponDate) {
        this.nextBondCouponDate = nextBondCouponDate;
    }

    public void setBondRating(String bondRating) {
        this.bondRating = bondRating;
    }

    public void setBlockingReason(String blockingReason) {
        this.blockingReason = blockingReason;
    }

    public void setSecNum(Long secNum) {
        this.secNum = secNum;
    }

    public void setCodeActiSec(Long codeActiSec) {
        this.codeActiSec = codeActiSec;
    }

    public void setInstrumentStatus(Character instrumentStatus) {
        this.instrumentStatus = instrumentStatus;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public void setCheckedBy(String checkedBy) {
        this.checkedBy = checkedBy;
    }

    public void setCheckedOn(Date checkedOn) {
        this.checkedOn = checkedOn;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public void setApprovedOn(Date approvedOn) {
        this.approvedOn = approvedOn;
    }

    public GenMdInstrumentEntity(Long instrumentId, String instrumentCode, String instrumentName, String instrumentType, String isinCode, String isoCode, String currencyCode, String nomenclature, Date listingDate, Long numberIssued, Long underlyingInstrumentId, String strikePrice, String oldInstrumentCode, Date oldInstrumentLastDate, String collateralHaircut, Long minimumCollateral, Long minimumTradeableAmount, Integer minimumDenomination, String bondType, Byte bondTenor, Integer bondDayBasis, String bondCouponRate, String bondCouponPeriod, Date bondIssueDate, Date bondMaturityDate, Date bondCouponDate, Date nextBondCouponDate, String bondRating, String blockingReason, Long secNum, Long codeActiSec, Character instrumentStatus, String createdBy, Date createdOn, String modifiedBy, Date modifiedOn, String checkedBy, Date checkedOn, String approvedBy, Date approvedOn) {
        this.instrumentId = instrumentId;
        this.instrumentCode = instrumentCode;
        this.instrumentName = instrumentName;
        this.instrumentType = instrumentType;
        this.isinCode = isinCode;
        this.isoCode = isoCode;
        this.currencyCode = currencyCode;
        this.nomenclature = nomenclature;
        this.listingDate = listingDate;
        this.numberIssued = numberIssued;
        this.underlyingInstrumentId = underlyingInstrumentId;
        this.strikePrice = strikePrice;
        this.oldInstrumentCode = oldInstrumentCode;
        this.oldInstrumentLastDate = oldInstrumentLastDate;
        this.collateralHaircut = collateralHaircut;
        this.minimumCollateral = minimumCollateral;
        this.minimumTradeableAmount = minimumTradeableAmount;
        this.minimumDenomination = minimumDenomination;
        this.bondType = bondType;
        this.bondTenor = bondTenor;
        this.bondDayBasis = bondDayBasis;
        this.bondCouponRate = bondCouponRate;
        this.bondCouponPeriod = bondCouponPeriod;
        this.bondIssueDate = bondIssueDate;
        this.bondMaturityDate = bondMaturityDate;
        this.bondCouponDate = bondCouponDate;
        this.nextBondCouponDate = nextBondCouponDate;
        this.bondRating = bondRating;
        this.blockingReason = blockingReason;
        this.secNum = secNum;
        this.codeActiSec = codeActiSec;
        this.instrumentStatus = instrumentStatus;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.modifiedBy = modifiedBy;
        this.modifiedOn = modifiedOn;
        this.checkedBy = checkedBy;
        this.checkedOn = checkedOn;
        this.approvedBy = approvedBy;
        this.approvedOn = approvedOn;
    }

    public GenMdInstrumentEntity() {
    }
}
