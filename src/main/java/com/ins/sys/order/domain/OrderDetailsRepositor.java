package com.ins.sys.order.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface OrderDetailsRepositor extends JpaRepository<OrderDetailsEntity,String> ,QuerydslPredicateExecutor {
}
