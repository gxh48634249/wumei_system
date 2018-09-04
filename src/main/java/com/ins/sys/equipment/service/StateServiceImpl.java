package com.ins.sys.equipment.service;

import com.ins.sys.equipment.domain.QStateInfoEntity;
import com.ins.sys.equipment.domain.StateInfoEntity;
import com.ins.sys.equipment.domain.StateRepository;
import com.ins.sys.tools.BasicService;
import com.ins.sys.tools.MD5;
import com.ins.sys.tools.PageInfo;
import com.ins.sys.tools.StringTool;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StateServiceImpl extends BasicService<StateInfoEntity> implements StateService {

    @Autowired
    private StateRepository repository;

    @Override
    public StateInfoEntity save(StateInfoEntity stateInfoEntity) throws Exception {
        String id = MD5.id();
        stateInfoEntity.setStateId(id);
        return repository.save(stateInfoEntity);
    }

    @Transactional
    @Override
    public void remove(StateInfoEntity stateInfoEntity) throws Exception {
        String id = stateInfoEntity.getStateId();
        QStateInfoEntity qStateInfoEntity = QStateInfoEntity.stateInfoEntity;
        queryFactory.delete(qStateInfoEntity).where(qStateInfoEntity.stateId.eq(id)).execute();
    }

    @Transactional
    @Override
    public StateInfoEntity modify(StateInfoEntity stateInfoEntity) throws Exception {
        return null;
    }

    @Override
    public Page<StateInfoEntity> findByPage(StateInfoEntity stateInfoEntity, PageInfo pageInfo) throws Exception {
        String eqId = stateInfoEntity.getEqId();
        String stateId = stateInfoEntity.getStateId();
        String stateName = stateInfoEntity.getStateName();
        String stateCode = stateInfoEntity.getStateCode();
        Long endTime = stateInfoEntity.getEndTime();
        Long startTime = stateInfoEntity.getStartTime();
        Integer number = stateInfoEntity.getNumber();
        QStateInfoEntity qStateInfoEntity = QStateInfoEntity.stateInfoEntity;
        Predicate predicate = qStateInfoEntity.eqId.isNotNull();
        if(!StringTool.isnull(eqId)) {
            predicate = ExpressionUtils.and(predicate,qStateInfoEntity.eqId.eq(eqId));
        }
        if(!StringTool.isnull(stateId)) {
            predicate = ExpressionUtils.and(predicate,qStateInfoEntity.stateId.eq(stateId));
        }
        if(!StringTool.isnull(stateName)) {
            predicate = ExpressionUtils.and(predicate,qStateInfoEntity.stateName.eq(stateName));
        }
        if(!StringTool.isnull(stateCode)) {
            predicate = ExpressionUtils.and(predicate,qStateInfoEntity.stateCode.eq(stateCode));
        }
        if(null!=number) {
            predicate = ExpressionUtils.and(predicate,qStateInfoEntity.number.eq(number));
        }
        if(null!=endTime) {
            predicate = ExpressionUtils.and(predicate,qStateInfoEntity.endTime.gt(endTime));
        }
        if(null!=startTime) {
            predicate = ExpressionUtils.and(predicate,qStateInfoEntity.startTime.lt(startTime));
        }
        Sort sort = new Sort(Sort.Direction.DESC,"startTime");
        PageRequest request = pageInfo.getPageRequest(sort);
        Page<StateInfoEntity> page = repository.findAll(predicate,request);
        return page;
    }

    @Override
    public List<StateInfoEntity> findAll() throws Exception {
        Sort sort = new Sort(Sort.Direction.DESC,"startTime");
        return repository.findAll(sort);
    }

    @Override
    public StateInfoEntity findById(String id) throws Exception {
        QStateInfoEntity qStateInfoEntity = QStateInfoEntity.stateInfoEntity;
        JPAQuery<StateInfoEntity> query = queryFactory.select(qStateInfoEntity)
                .from(qStateInfoEntity)
                .where(qStateInfoEntity.stateId.eq(id));
        return query.fetchFirst();
    }
}
