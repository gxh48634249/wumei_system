package com.ins.sys.classinfo.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "class_info", schema = "wumei_system", catalog = "")
public class ClassInfoEntity {

    @ApiModelProperty("分类主键")
    private String classId;

    @ApiModelProperty("分类名称")
    private String className;

    @ApiModelProperty("分类编码")
    private String classCode;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @Id
    @Column(name = "class_id")
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "class_name")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "class_code")
    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Basic
    @Column(name = "create_time")
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassInfoEntity that = (ClassInfoEntity) o;
        return Objects.equals(classId, that.classId) &&
                Objects.equals(className, that.className) &&
                Objects.equals(classCode, that.classCode) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(classId, className, classCode, createTime);
    }
}
