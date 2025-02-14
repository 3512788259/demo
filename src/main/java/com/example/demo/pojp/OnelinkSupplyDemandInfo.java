package com.example.demo.pojp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.meritdata.ids.entity.BaseEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * 供需信息表
 *
 * @author ZhangWei
 */
@Entity
@Table(name = "onelink_supply_demand_info")
@EntityListeners(AuditingEntityListener.class)
public class OnelinkSupplyDemandInfo extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -184828827340512151L;
    /**
     * 标题
     */
    @Column(name="title",length = 50)
    private String title;
    /**
     * 描述
     */
    @Column(name = "info_desc")
    private String infoDesc;

    /**
     * 类型(0：需求，1：共享资源)
     */
    @Column(name = "type")
    private String type;

    /**
     * 分类
     */
    @Column(name = "classify")
    private String classify;

    /**
     * 截止日期
     */
    @Column(name = "expiration_date")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate expirationDate;

    /**
     * 发布区域-省
     */
    @Column(name = "province")
    private String province;

    /**
     * 发布区域-省-编码
     */
    @Column(name = "province_code")
    private String provinceCode;

    /**
     * 发布区域-市
     */
    @Column(name = "city")
    private String city;

    /**
     * 发布区域-市-编码
     */
    @Column(name = "city_code")
    private String cityCode;

    /**
     * 发布区域-区
     */
    @Column(name = "district")
    private String district;

    /**
     * 发布区域-区-编码
     */
    @Column(name = "district_code")
    private String districtCode;

    /**
     * 详细地址
     */
    @Column(name = "address")
    private String address;

    public String getExamineWay() {
        return examineWay;
    }

    public void setExamineWay(String examineWay) {
        this.examineWay = examineWay;
    }

    /**
     * 经度
     */
    @Column(name = "longitude")
    private String longitude;

    /**
     * 纬度
     */
    @Column(name = "latitude")
    private String latitude;

    /**
     * 发布人id
     */
    @Column(name = "publisher")
    private String publisher;

    /**
     * 所属企业
     */
    @Column(name = "credit_code")
    private String creditCode;

    /**
     * 浏览次数
     */
    @Column(name = "views_num")
    private Integer viewsNum = 0;
    /**
     * 评论次数
     */
    @Column(name = "review_num")
    private Integer reviewNum = 0;
    /**
     * 供应产品数
     */
    @Column(name = "supply_num")
    private Integer supplyNum = 0;

    /**
     * 状态值（0:关闭;1:打开(待审核),2:审核通过;3:审核驳回)
     */
    @Column(name = "status")
    private String status;

    /**
     * 审核方式(0:自动审核;1:人工审核)
     */
    @Column(name = "examine_way")
    private String examineWay;

    /**
     * 审核日期
     */
    @Column(name = "examine_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String examineTime;

    /**
     * 创建人
     */
    @Column(name = "user_id")
    private String userId;

    @Transient
    private OnelinkSupplyExamineRecords examineRecords;

    public OnelinkSupplyExamineRecords getExamineRecords() {
        return examineRecords;
    }

    public OnelinkSupplyDemandInfo setExamineRecords(OnelinkSupplyExamineRecords examineRecords) {
        this.examineRecords = examineRecords;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public OnelinkSupplyDemandInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getReviewNum() {
        return reviewNum;
    }

    public OnelinkSupplyDemandInfo setReviewNum(Integer reviewNum) {
        this.reviewNum = reviewNum;
        return this;
    }

    public Integer getSupplyNum() {
        return supplyNum;
    }

    public OnelinkSupplyDemandInfo setSupplyNum(Integer supplyNum) {
        this.supplyNum = supplyNum;
        return this;
    }

    /**
     * 描述
     */
    public OnelinkSupplyDemandInfo setInfoDesc(String infoDesc) {
        this.infoDesc = infoDesc;
        return this;
    }

    /**
     * 描述
     */
    public String getInfoDesc() {
        return infoDesc;
    }

    /**
     * 类型(0：需求，1：共享资源)
     */
    public OnelinkSupplyDemandInfo setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型(0：需求，1：共享资源)
     */
    public String getType() {
        return type;
    }

    /**
     * 分类
     */
    public OnelinkSupplyDemandInfo setClassify(String classify) {
        this.classify = classify;
        return this;
    }

    /**
     * 分类
     */
    public String getClassify() {
        return classify;
    }

    /**
     * 截止日期
     */
    public OnelinkSupplyDemandInfo setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * 截止日期
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * 发布区域-省
     */
    public OnelinkSupplyDemandInfo setProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 发布区域-省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 发布区域-省-编码
     */
    public OnelinkSupplyDemandInfo setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }

    /**
     * 发布区域-省-编码
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 发布区域-市
     */
    public OnelinkSupplyDemandInfo setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 发布区域-市
     */
    public String getCity() {
        return city;
    }

    /**
     * 发布区域-市-编码
     */
    public OnelinkSupplyDemandInfo setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }

    /**
     * 发布区域-市-编码
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 发布区域-区
     */
    public OnelinkSupplyDemandInfo setDistrict(String district) {
        this.district = district;
        return this;
    }

    /**
     * 发布区域-区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 发布区域-区-编码
     */
    public OnelinkSupplyDemandInfo setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }

    /**
     * 发布区域-区-编码
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * 详细地址
     */
    public OnelinkSupplyDemandInfo setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 经度
     */
    public OnelinkSupplyDemandInfo setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 经度
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 纬度
     */
    public OnelinkSupplyDemandInfo setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 纬度
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 发布人id
     */
    public OnelinkSupplyDemandInfo setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * 发布人id
     */
    public String getPublisher() {
        return publisher;
    }

    public String getExamineTime() {
        return examineTime;
    }

    public void setExamineTime(String examineTime) {
        this.examineTime = examineTime;
    }

    /**
     * 所属企业
     */
    public OnelinkSupplyDemandInfo setCreditCode(String creditCode) {
        this.creditCode = creditCode;
        return this;
    }

    /**
     * 所属企业
     */
    public String getCreditCode() {
        return creditCode;
    }

    /**
     * 浏览次数
     */
    public OnelinkSupplyDemandInfo setViewsNum(Integer viewsNum) {
        this.viewsNum = viewsNum;
        return this;
    }

    /**
     * 浏览次数
     */
    public Integer getViewsNum() {
        return viewsNum;
    }

    /**
     * 状态值（0:关闭，1:打开）
     */
    public OnelinkSupplyDemandInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态值（0:关闭，1:打开）
     */
    public String getStatus() {
        return status;
    }

    public String getUserId() {
        return userId;
    }

    public OnelinkSupplyDemandInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String toString() {
        return "OnelinkSupplyDemandInfo{" +
                "infoDesc='" + infoDesc + '\'' +
                ", type='" + type + '\'' +
                ", classify='" + classify + '\'' +
                ", expirationDate=" + expirationDate +
                ", province='" + province + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", city='" + city + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", district='" + district + '\'' +
                ", districtCode='" + districtCode + '\'' +
                ", address='" + address + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", publisher='" + publisher + '\'' +
                ", creditCode='" + creditCode + '\'' +
                ", viewsNum=" + viewsNum +
                ", reviewNum=" + reviewNum +
                ", supplyNum=" + supplyNum +
                ", status='" + status + '\'' +
                ", examineWay='" + examineWay + '\'' +
                ", examineTime='" + examineTime + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
