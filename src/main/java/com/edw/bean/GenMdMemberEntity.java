package com.edw.bean;

import org.infinispan.api.annotations.indexing.Basic;
import org.infinispan.api.annotations.indexing.Indexed;
import org.infinispan.protostream.annotations.ProtoField;

import java.util.Date;

@Indexed
public class GenMdMemberEntity {

    private Long memberId;

    private String memberCode;

    private String shortCode;

    private String memberName;

    private Integer roleType;

    private Integer memberCategory;

    private String memberType;

    private Long agentCodeId;

    private Long tmAccountId;

    private String address1;

    private String address2;

    private String countryCode;

    private String cityCode;

    private String otherCity;

    private String postCode;

    private String telephone;

    private String fax;

    private String email;

    private String website;

    private String taxNo;

    private String autPerson1;

    private String autPerson2;

    private String externalRef;

    private String blockingReason;

    private Integer memberStatus;

    private Long bankId;

    private String createdBy;

    private Date createdOn;

    private String modifiedBy;

    private Date modifiedOn;

    private String checkedBy;

    private Date checkedOn;

    private String approvedBy;

    private Date approvedOn;

    private String memberBuyerSeller;

    @ProtoField(number = 1)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Long getMemberId() {
        return memberId;
    }

    @ProtoField(number = 2)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getMemberCode() {
        return memberCode;
    }

    @ProtoField(number = 3)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getShortCode() {
        return shortCode;
    }

    @ProtoField(number = 4)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getMemberName() {
        return memberName;
    }

    @ProtoField(number = 5)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Integer getRoleType() {
        return roleType;
    }

    @ProtoField(number = 6)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Integer getMemberCategory() {
        return memberCategory;
    }

    @ProtoField(number = 7)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getMemberType() {
        return memberType;
    }

    @ProtoField(number = 8)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Long getAgentCodeId() {
        return agentCodeId;
    }

    @ProtoField(number = 9)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Long getTmAccountId() {
        return tmAccountId;
    }

    @ProtoField(number = 10)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getAddress1() {
        return address1;
    }

    @ProtoField(number = 11)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getAddress2() {
        return address2;
    }

    @ProtoField(number = 12)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getCountryCode() {
        return countryCode;
    }

    @ProtoField(number = 13)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getCityCode() {
        return cityCode;
    }

    @ProtoField(number = 14)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getOtherCity() {
        return otherCity;
    }

    @ProtoField(number = 15)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getPostCode() {
        return postCode;
    }

    @ProtoField(number = 16)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getTelephone() {
        return telephone;
    }

    @ProtoField(number = 17)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getFax() {
        return fax;
    }

    @ProtoField(number = 18)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getEmail() {
        return email;
    }

    @ProtoField(number = 19)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getWebsite() {
        return website;
    }

    @ProtoField(number = 20)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getTaxNo() {
        return taxNo;
    }

    @ProtoField(number = 21)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getAutPerson1() {
        return autPerson1;
    }

    @ProtoField(number = 22)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getAutPerson2() {
        return autPerson2;
    }

    @ProtoField(number = 23)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getExternalRef() {
        return externalRef;
    }

    @ProtoField(number = 24)
    @Basic(sortable = true, searchable = true, projectable = true)
    public String getBlockingReason() {
        return blockingReason;
    }

    @ProtoField(number = 25)
    @Basic(sortable = true, searchable = true, projectable = true)
    public Integer getMemberStatus() {
        return memberStatus;
    }

    @ProtoField(number = 26)
    public Long getBankId() {
        return bankId;
    }

    @ProtoField(number = 27)
    public String getCreatedBy() {
        return createdBy;
    }

    @ProtoField(number = 28)
    public Date getCreatedOn() {
        return createdOn;
    }

    @ProtoField(number = 29)
    public String getModifiedBy() {
        return modifiedBy;
    }

    @ProtoField(number = 30)
    public Date getModifiedOn() {
        return modifiedOn;
    }

    @ProtoField(number = 31)
    public String getCheckedBy() {
        return checkedBy;
    }

    @ProtoField(number = 32)
    public Date getCheckedOn() {
        return checkedOn;
    }

    @ProtoField(number = 33)
    public String getApprovedBy() {
        return approvedBy;
    }

    @ProtoField(number = 34)
    public Date getApprovedOn() {
        return approvedOn;
    }

    @ProtoField(number = 35)
    public String getMemberBuyerSeller() {
        return memberBuyerSeller;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public void setMemberCategory(Integer memberCategory) {
        this.memberCategory = memberCategory;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public void setAgentCodeId(Long agentCodeId) {
        this.agentCodeId = agentCodeId;
    }

    public void setTmAccountId(Long tmAccountId) {
        this.tmAccountId = tmAccountId;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public void setAutPerson1(String autPerson1) {
        this.autPerson1 = autPerson1;
    }

    public void setAutPerson2(String autPerson2) {
        this.autPerson2 = autPerson2;
    }

    public void setExternalRef(String externalRef) {
        this.externalRef = externalRef;
    }

    public void setBlockingReason(String blockingReason) {
        this.blockingReason = blockingReason;
    }

    public void setMemberStatus(Integer memberStatus) {
        this.memberStatus = memberStatus;
    }

    public void setBankId(Long bankId) {
        this.bankId = bankId;
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

    public void setMemberBuyerSeller(String memberBuyerSeller) {
        this.memberBuyerSeller = memberBuyerSeller;
    }

    public GenMdMemberEntity(Long memberId, String memberCode, String shortCode, String memberName, Integer roleType, Integer memberCategory, String memberType, Long agentCodeId, Long tmAccountId, String address1, String address2, String countryCode, String cityCode, String otherCity, String postCode, String telephone, String fax, String email, String website, String taxNo, String autPerson1, String autPerson2, String externalRef, String blockingReason, Integer memberStatus, Long bankId, String createdBy, Date createdOn, String modifiedBy, Date modifiedOn, String checkedBy, Date checkedOn, String approvedBy, Date approvedOn, String memberBuyerSeller) {
        this.memberId = memberId;
        this.memberCode = memberCode;
        this.shortCode = shortCode;
        this.memberName = memberName;
        this.roleType = roleType;
        this.memberCategory = memberCategory;
        this.memberType = memberType;
        this.agentCodeId = agentCodeId;
        this.tmAccountId = tmAccountId;
        this.address1 = address1;
        this.address2 = address2;
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.otherCity = otherCity;
        this.postCode = postCode;
        this.telephone = telephone;
        this.fax = fax;
        this.email = email;
        this.website = website;
        this.taxNo = taxNo;
        this.autPerson1 = autPerson1;
        this.autPerson2 = autPerson2;
        this.externalRef = externalRef;
        this.blockingReason = blockingReason;
        this.memberStatus = memberStatus;
        this.bankId = bankId;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.modifiedBy = modifiedBy;
        this.modifiedOn = modifiedOn;
        this.checkedBy = checkedBy;
        this.checkedOn = checkedOn;
        this.approvedBy = approvedBy;
        this.approvedOn = approvedOn;
        this.memberBuyerSeller = memberBuyerSeller;
    }

    public GenMdMemberEntity() {
    }
}
