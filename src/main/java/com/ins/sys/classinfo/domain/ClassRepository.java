package com.ins.sys.classinfo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ClassRepository extends
        JpaRepository<ClassInfoEntity,String>,QuerydslPredicateExecutor {
}
