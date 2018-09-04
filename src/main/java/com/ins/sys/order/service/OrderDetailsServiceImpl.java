package com.ins.sys.order.service;

import com.ins.sys.order.domain.OrderDetailsEntity;
import com.ins.sys.tools.BasicService;
import com.ins.sys.tools.PageInfo;
import org.springframework.data.domain.Page;

import java.util.List;

public class OrderDetailsServiceImpl extends BasicService<OrderDetailsEntity> implements OrderDetailsService {

    @Override
    public OrderDetailsEntity save(OrderDetailsEntity orderDetailsEntity) throws Exception {
        return null;
    }

    @Override
    public void remove(OrderDetailsEntity orderDetailsEntity) throws Exception {

    }

    @Override
    public OrderDetailsEntity modify(OrderDetailsEntity orderDetailsEntity) throws Exception {
        return null;
    }

    @Override
    public Page<OrderDetailsEntity> findByPage(OrderDetailsEntity orderDetailsEntity, PageInfo pageInfo) throws Exception {
        return null;
    }

    @Override
    public List<OrderDetailsEntity> findAll() throws Exception {
        return null;
    }

    @Override
    public OrderDetailsEntity findById(String id) throws Exception {
        return null;
    }
}
