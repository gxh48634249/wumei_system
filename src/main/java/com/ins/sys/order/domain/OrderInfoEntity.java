package com.ins.sys.order.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_info", schema = "wumei_system", catalog = "")
public class OrderInfoEntity {

    @ApiModelProperty("下单人主键")
    private String userId;

    @ApiModelProperty("订单主键")
    private String orderId;

    @ApiModelProperty("订单编码")
    private String orderCode;

    @ApiModelProperty("乙方信息")
    private String partBInfo;

    @ApiModelProperty("设备信息")
    private String eqInfo;

    @ApiModelProperty("设备主两")
    private Integer number;

    @ApiModelProperty("订单地址")
    private String orderAddress;

    @ApiModelProperty("收获人信息")
    private String receiveUser;

    @ApiModelProperty("收获人电话")
    private Integer receivePhon;

    @ApiModelProperty("开始时间")
    private Integer startTime;

    @ApiModelProperty("结束时间")
    private Integer endTime;

    @ApiModelProperty("单价")
    private Integer unitPrice;

    @ApiModelProperty("总价")
    private Integer totalPrice;

    @Id
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "order_id")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_code")
    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    @Basic
    @Column(name = "part_b_info")
    public String getPartBInfo() {
        return partBInfo;
    }

    public void setPartBInfo(String partBInfo) {
        this.partBInfo = partBInfo;
    }

    @Basic
    @Column(name = "eq_info")
    public String getEqInfo() {
        return eqInfo;
    }

    public void setEqInfo(String eqInfo) {
        this.eqInfo = eqInfo;
    }

    @Basic
    @Column(name = "number")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "order_address")
    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    @Basic
    @Column(name = "receive_user")
    public String getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser;
    }

    @Basic
    @Column(name = "receive_phon")
    public Integer getReceivePhon() {
        return receivePhon;
    }

    public void setReceivePhon(Integer receivePhon) {
        this.receivePhon = receivePhon;
    }

    @Basic
    @Column(name = "start_time")
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time")
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "unit_price")
    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "total_price")
    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderInfoEntity that = (OrderInfoEntity) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(orderCode, that.orderCode) &&
                Objects.equals(partBInfo, that.partBInfo) &&
                Objects.equals(eqInfo, that.eqInfo) &&
                Objects.equals(number, that.number) &&
                Objects.equals(orderAddress, that.orderAddress) &&
                Objects.equals(receiveUser, that.receiveUser) &&
                Objects.equals(receivePhon, that.receivePhon) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(unitPrice, that.unitPrice) &&
                Objects.equals(totalPrice, that.totalPrice);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, orderId, orderCode, partBInfo, eqInfo, number, orderAddress, receiveUser, receivePhon, startTime, endTime, unitPrice, totalPrice);
    }
}
