package com.ins.sys.equipment.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface EquipmentRepository extends JpaRepository<EquipmentInfoEntity,String>
        , QuerydslPredicateExecutor {
}
