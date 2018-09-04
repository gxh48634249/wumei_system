package com.ins.sys.organ.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "organ_info", schema = "wumei_system", catalog = "")
public class OrganInfoEntity {

    @ApiModelProperty("单位主键")
    private String organId;

    @ApiModelProperty("单位名称")
    private String organName;

    @ApiModelProperty("单位电话")
    private Integer organPhon;

    @ApiModelProperty("单位领导")
    private String organHead;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("单位地址")
    private String organAddress;

    @Id
    @Column(name = "organ_id")
    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId;
    }

    @Basic
    @Column(name = "organ_name")
    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    @Basic
    @Column(name = "organ_phon")
    public Integer getOrganPhon() {
        return organPhon;
    }

    public void setOrganPhon(Integer organPhon) {
        this.organPhon = organPhon;
    }

    @Basic
    @Column(name = "organ_head")
    public String getOrganHead() {
        return organHead;
    }

    public void setOrganHead(String organHead) {
        this.organHead = organHead;
    }

    @Basic
    @Column(name = "create_time")
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "organ_address")
    public String getOrganAddress() {
        return organAddress;
    }

    public void setOrganAddress(String organAddress) {
        this.organAddress = organAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganInfoEntity that = (OrganInfoEntity) o;
        return Objects.equals(organId, that.organId) &&
                Objects.equals(organName, that.organName) &&
                Objects.equals(organPhon, that.organPhon) &&
                Objects.equals(organHead, that.organHead) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(organAddress, that.organAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(organId, organName, organPhon, organHead, createTime, organAddress);
    }
}
