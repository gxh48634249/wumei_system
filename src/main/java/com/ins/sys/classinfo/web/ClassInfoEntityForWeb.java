package com.ins.sys.classinfo.web;

import com.ins.sys.classinfo.domain.ClassInfoEntity;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

public class ClassInfoEntityForWeb {

    @ApiModelProperty("分类名称")
    private String className;

    @ApiModelProperty("分类编码")
    private String classCode;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassInfoEntityForWeb that = (ClassInfoEntityForWeb) o;
        return  Objects.equals(className, that.className) &&
                Objects.equals(classCode, that.classCode) ;
    }

    @Override
    public int hashCode() {

        return Objects.hash(className, classCode);
    }

    public ClassInfoEntity rev() {
        ClassInfoEntity classInfoEntity = new ClassInfoEntity();
        classInfoEntity.setClassCode(this.classCode);
        classInfoEntity.setClassName(this.className);
        return classInfoEntity;
    }
}
