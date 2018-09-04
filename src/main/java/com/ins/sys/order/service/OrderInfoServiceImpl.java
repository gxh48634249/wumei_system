package com.ins.sys.order.service;

import com.ins.sys.order.domain.OrderInfoEntity;
import com.ins.sys.order.domain.OrderInfoRepository;
import com.ins.sys.tools.BasicService;
import com.ins.sys.tools.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderInfoServiceImpl extends BasicService<OrderInfoEntity> implements OrderInfoService {

    @Autowired
    private OrderInfoRepository repository;

    @Override
    public OrderInfoEntity save(OrderInfoEntity orderInfoEntity) throws Exception {
        return null;
    }

    @Transactional
    @Override
    public void remove(OrderInfoEntity orderInfoEntity) throws Exception {

    }

    @Transactional
    @Override
    public OrderInfoEntity modify(OrderInfoEntity orderInfoEntity) throws Exception {
        return null;
    }

    @Override
    public Page<OrderInfoEntity> findByPage(OrderInfoEntity orderInfoEntity, PageInfo pageInfo) throws Exception {
        return null;
    }

    @Override
    public List<OrderInfoEntity> findAll() throws Exception {
        return null;
    }

    @Override
    public OrderInfoEntity findById(String id) throws Exception {
        return null;
    }
}
