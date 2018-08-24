package com.ins.sys.order.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_details", schema = "wumei_system", catalog = "")
public class OrderDetailsEntity {
    private String detailsId;
    private String eqId;
    private String userId;
    private String detailsName;
    private Integer detailsNumber;
    private String provideName;
    private Integer startTime;
    private Integer endTime;

    @Id
    @Column(name = "details_id")
    public String getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(String detailsId) {
        this.detailsId = detailsId;
    }

    @Basic
    @Column(name = "eq_id")
    public String getEqId() {
        return eqId;
    }

    public void setEqId(String eqId) {
        this.eqId = eqId;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "details_name")
    public String getDetailsName() {
        return detailsName;
    }

    public void setDetailsName(String detailsName) {
        this.detailsName = detailsName;
    }

    @Basic
    @Column(name = "details_number")
    public Integer getDetailsNumber() {
        return detailsNumber;
    }

    public void setDetailsNumber(Integer detailsNumber) {
        this.detailsNumber = detailsNumber;
    }

    @Basic
    @Column(name = "provide_name")
    public String getProvideName() {
        return provideName;
    }

    public void setProvideName(String provideName) {
        this.provideName = provideName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailsEntity that = (OrderDetailsEntity) o;
        return Objects.equals(detailsId, that.detailsId) &&
                Objects.equals(eqId, that.eqId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(detailsName, that.detailsName) &&
                Objects.equals(detailsNumber, that.detailsNumber) &&
                Objects.equals(provideName, that.provideName) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(detailsId, eqId, userId, detailsName, detailsNumber, provideName, startTime, endTime);
    }
}
