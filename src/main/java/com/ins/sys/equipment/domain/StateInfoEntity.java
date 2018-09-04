package com.ins.sys.equipment.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "state_info", schema = "wumei_system", catalog = "")
public class StateInfoEntity {

    @ApiModelProperty("设备主键")
    private String eqId;

    @ApiModelProperty("主键")
    private String stateId;

    @ApiModelProperty("状态名称")
    private String stateName;

    @ApiModelProperty("状态编码")
    private String stateCode;

    @ApiModelProperty("结束时间")
    private Long endTime;

    @ApiModelProperty("开始时间")
    private Long startTime;

    @ApiModelProperty("数量")
    private Integer number;

    @Basic
    @Column(name = "eq_id")
    public String getEqId() {
        return eqId;
    }

    public void setEqId(String eqId) {
        this.eqId = eqId;
    }

    @Id
    @Column(name = "state_id")
    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    @Basic
    @Column(name = "state_name")
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Basic
    @Column(name = "state_code")
    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @Basic
    @Column(name = "start_time")
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time")
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "number")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StateInfoEntity that = (StateInfoEntity) o;
        return Objects.equals(eqId, that.eqId) &&
                Objects.equals(stateId, that.stateId) &&
                Objects.equals(stateName, that.stateName) &&
                Objects.equals(stateCode, that.stateCode) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {

        return Objects.hash(eqId, stateId, stateName, stateCode, endTime, number);
    }
}
