package com.ins.sys.order.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface OrderInfoRepository extends JpaRepository<OrderInfoEntity,String>,QuerydslPredicateExecutor {
}
