package com.ins.sys.classinfo.service;

import com.ins.sys.classinfo.domain.ClassInfoEntity;
import com.ins.sys.tools.SimpleService;

import javax.transaction.Transactional;

public interface ClassService extends SimpleService<ClassInfoEntity> {

    @Transactional
    ClassInfoEntity findByCode(String code)throws  Exception;
}
