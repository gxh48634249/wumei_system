package com.ins.sys.equipment.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "equipment_info", schema = "wumei_system", catalog = "")
public class EquipmentInfoEntity {

    @ApiModelProperty("主键")
    private String eqId;

    @ApiModelProperty("所属分类主键")
    private String classId;

    @ApiModelProperty("所属机构主键")
    private String organId;

    @ApiModelProperty("设备名称")
    private String eqName;

    @ApiModelProperty("品牌")
    private String eqBrand;

    @ApiModelProperty("型号")
    private String eqModel;

    @ApiModelProperty("设别规格")
    private String eqSpec;

    @ApiModelProperty("所属分类")
    private String eqClass;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("创建人")
    private String createUser;

    @ApiModelProperty("设备单价")
    private Integer eqPrice;

    @Id
    @Column(name = "eq_id")
    public String getEqId() {
        return eqId;
    }

    public void setEqId(String eqId) {
        this.eqId = eqId;
    }

    @Basic
    @Column(name = "class_id")
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "organ_id")
    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId;
    }

    @Basic
    @Column(name = "eq_name")
    public String getEqName() {
        return eqName;
    }

    public void setEqName(String eqName) {
        this.eqName = eqName;
    }

    @Basic
    @Column(name = "eq_brand")
    public String getEqBrand() {
        return eqBrand;
    }

    public void setEqBrand(String eqBrand) {
        this.eqBrand = eqBrand;
    }

    @Basic
    @Column(name = "eq_model")
    public String getEqModel() {
        return eqModel;
    }

    public void setEqModel(String eqModel) {
        this.eqModel = eqModel;
    }

    @Basic
    @Column(name = "eq_spec")
    public String getEqSpec() {
        return eqSpec;
    }

    public void setEqSpec(String eqSpec) {
        this.eqSpec = eqSpec;
    }

    @Basic
    @Column(name = "eq_class")
    public String getEqClass() {
        return eqClass;
    }

    public void setEqClass(String eqClass) {
        this.eqClass = eqClass;
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
    @Column(name = "create_user")
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "eq_price")
    public Integer getEqPrice() {
        return eqPrice;
    }

    public void setEqPrice(Integer eqPrice) {
        this.eqPrice = eqPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipmentInfoEntity that = (EquipmentInfoEntity) o;
        return Objects.equals(eqId, that.eqId) &&
                Objects.equals(classId, that.classId) &&
                Objects.equals(organId, that.organId) &&
                Objects.equals(eqName, that.eqName) &&
                Objects.equals(eqBrand, that.eqBrand) &&
                Objects.equals(eqModel, that.eqModel) &&
                Objects.equals(eqSpec, that.eqSpec) &&
                Objects.equals(eqClass, that.eqClass) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(eqPrice, that.eqPrice);
    }

    @Override
    public int hashCode() {

        return Objects.hash(eqId, classId, organId, eqName, eqBrand, eqModel, eqSpec, eqClass, createTime, createUser, eqPrice);
    }
}
