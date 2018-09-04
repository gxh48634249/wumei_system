package com.ins.sys.organ.service;

import com.ins.sys.organ.domain.OrganInfoEntity;
import com.ins.sys.organ.domain.OrganRepository;
import com.ins.sys.organ.domain.QOrganInfoEntity;
import com.ins.sys.tools.BasicService;
import com.ins.sys.tools.MD5;
import com.ins.sys.tools.PageInfo;
import com.ins.sys.tools.StringTool;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAUpdateClause;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class OrganServiceImpl extends BasicService<OrganInfoEntity> implements OrganService {

    @Autowired
    private OrganRepository repository;

    @Override
    public OrganInfoEntity save(OrganInfoEntity organInfoEntity) throws Exception {
        String id = MD5.id();
        organInfoEntity.setOrganId(id);
        organInfoEntity.setCreateTime(new Date().getTime());
        return this.repository.save(organInfoEntity);
    }

    @Transactional
    @Override
    public void remove(OrganInfoEntity organInfoEntity) throws Exception {
        QOrganInfoEntity qOrganInfoEntity = QOrganInfoEntity.organInfoEntity;
        queryFactory.delete(qOrganInfoEntity).where(qOrganInfoEntity.organId.eq(organInfoEntity.getOrganId())).execute();
    }

    @Transactional
    @Override
    public OrganInfoEntity modify(OrganInfoEntity organInfoEntity) throws Exception {
        String organName = organInfoEntity.getOrganName();
        String organAddress = organInfoEntity.getOrganAddress();
        Integer organPhon = organInfoEntity.getOrganPhon();
        String organHead = organInfoEntity.getOrganHead();
        QOrganInfoEntity qOrganInfoEntity = QOrganInfoEntity.organInfoEntity;
        JPAUpdateClause clause = queryFactory.update(qOrganInfoEntity);
        if(!StringTool.isnull(organName)) {
            clause.set(qOrganInfoEntity.organName,organName);
        }
        if(!StringTool.isnull(organAddress)) {
            clause.set(qOrganInfoEntity.organAddress,organAddress);
        }
        if(!StringTool.isnull(organHead)) {
            clause.set(qOrganInfoEntity.organHead,organHead);
        }
        if(null!=organPhon) {
            clause.set(qOrganInfoEntity.organPhon,organPhon);
        }
        clause.execute();
        return organInfoEntity;
    }

    @Override
    public Page<OrganInfoEntity> findByPage(OrganInfoEntity organInfoEntity, PageInfo pageInfo) throws Exception {
        String organName = organInfoEntity.getOrganName();
        String organAddress = organInfoEntity.getOrganAddress();
        Integer organPhon = organInfoEntity.getOrganPhon();
        String organHead = organInfoEntity.getOrganHead();
        QOrganInfoEntity qOrganInfoEntity = QOrganInfoEntity.organInfoEntity;
        Sort sort = new Sort(Sort.Direction.DESC,"createTime");
        PageRequest request = pageInfo.getPageRequest(sort);
        Predicate predicate = qOrganInfoEntity.organId.isNotNull();
        if(!StringTool.isnull(organName)) {
            predicate = ExpressionUtils.and(predicate,qOrganInfoEntity.organName.like(StringTool.sqlLike(organName)));
        }
        if(!StringTool.isnull(organAddress)) {
            predicate = ExpressionUtils.and(predicate,qOrganInfoEntity.organAddress.like(StringTool.sqlLike(organAddress)));
        }
        if(!StringTool.isnull(organHead)) {
            predicate = ExpressionUtils.and(predicate,qOrganInfoEntity.organHead.like(StringTool.sqlLike(organHead)));
        }
        if(null!=organPhon) {
            predicate = ExpressionUtils.and(predicate,qOrganInfoEntity.organPhon.like("%"+organPhon+"%"));
        }
        return this.repository.findAll(predicate,request);
    }

    @Override
    public List<OrganInfoEntity> findAll() throws Exception {
        return null;
    }

    @Override
    public OrganInfoEntity findById(String id) throws Exception {
        return null;
    }
}
