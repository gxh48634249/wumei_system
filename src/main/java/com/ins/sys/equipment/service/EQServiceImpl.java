package com.ins.sys.equipment.service;

import com.ins.sys.equipment.domain.EquipmentInfoEntity;
import com.ins.sys.equipment.domain.EquipmentRepository;
import com.ins.sys.equipment.domain.QEquipmentInfoEntity;
import com.ins.sys.tools.BasicService;
import com.ins.sys.tools.MD5;
import com.ins.sys.tools.PageInfo;
import com.ins.sys.tools.StringTool;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAUpdateClause;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EQServiceImpl extends BasicService<EquipmentInfoEntity> implements EQService{

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Override
    public EquipmentInfoEntity save(EquipmentInfoEntity equipmentInfoEntity) throws Exception {
        String id = MD5.id();
        equipmentInfoEntity.setEqId(id);
        equipmentInfoEntity.setCreateTime(new Date().getTime());
        return this.equipmentRepository.save(equipmentInfoEntity);
    }

    @Override
    public void remove(EquipmentInfoEntity equipmentInfoEntity) throws Exception {
        String id = equipmentInfoEntity.getEqId();
        if(StringTool.isnull(id)) {
            throw new Exception("请指定主键");
        }
        QEquipmentInfoEntity qEquipmentInfoEntity = QEquipmentInfoEntity.equipmentInfoEntity;
        queryFactory.delete(qEquipmentInfoEntity)
                .where(qEquipmentInfoEntity.eqId.eq(id)).execute();
    }

    @Override
    public EquipmentInfoEntity modify(EquipmentInfoEntity equipmentInfoEntity) throws Exception {
        String eqName = equipmentInfoEntity.getEqName();
        String eqBrand = equipmentInfoEntity.getEqBrand();
        String eqModel = equipmentInfoEntity.getEqModel();
        String eqSpec = equipmentInfoEntity.getEqSpec();
        String eqClass = equipmentInfoEntity.getEqClass();
        QEquipmentInfoEntity qEquipmentInfoEntity = QEquipmentInfoEntity.equipmentInfoEntity;
        JPAUpdateClause clause = queryFactory.update(qEquipmentInfoEntity);
        if(!StringTool.isnull(eqName)) {
            clause = clause.set(qEquipmentInfoEntity.eqName,eqName);
        }
        if(!StringTool.isnull(eqBrand)) {
            clause = clause.set(qEquipmentInfoEntity.eqBrand,eqBrand);
        }
        if(!StringTool.isnull(eqModel)) {
            clause = clause.set(qEquipmentInfoEntity.eqModel,eqModel);
        }
        if(!StringTool.isnull(eqSpec)) {
            clause = clause.set(qEquipmentInfoEntity.eqSpec,eqSpec);
        }
        if(!StringTool.isnull(eqClass)) {
            clause = clause.set(qEquipmentInfoEntity.eqClass,eqClass);
        }
        clause.execute();
        return equipmentInfoEntity;
    }

    @Override
    public Page<EquipmentInfoEntity> findByPage(EquipmentInfoEntity equipmentInfoEntity, PageInfo pageInfo) throws Exception {
        String eqName = equipmentInfoEntity.getEqName();
        String eqBrand = equipmentInfoEntity.getEqBrand();
        String eqModel = equipmentInfoEntity.getEqModel();
        String eqSpec = equipmentInfoEntity.getEqSpec();
        String eqClass = equipmentInfoEntity.getEqClass();
        QEquipmentInfoEntity qEquipmentInfoEntity = QEquipmentInfoEntity.equipmentInfoEntity;
        Predicate predicate = qEquipmentInfoEntity.eqId.isNotNull();
        if(!StringTool.isnull(eqName)) {
            predicate = ExpressionUtils.and(predicate,qEquipmentInfoEntity.eqName.like(StringTool.sqlLike(eqName)));
        }
        if(!StringTool.isnull(eqBrand)) {
            predicate = ExpressionUtils.and(predicate,qEquipmentInfoEntity.eqBrand.eq(eqBrand));
        }
        if(!StringTool.isnull(eqModel)) {
            predicate = ExpressionUtils.and(predicate,qEquipmentInfoEntity.eqModel.eq(eqModel));
        }
        if(!StringTool.isnull(eqSpec)) {
            predicate = ExpressionUtils.and(predicate,qEquipmentInfoEntity.eqSpec.eq(eqSpec));
        }
        if(!StringTool.isnull(eqClass)) {
            predicate = ExpressionUtils.and(predicate,qEquipmentInfoEntity.eqClass.eq(eqClass));
        }
        Sort sort = new Sort(Sort.Direction.DESC,"createTime");
        PageRequest request = pageInfo.getPageRequest(sort);
        Page<EquipmentInfoEntity> page = equipmentRepository.findAll(predicate,request);
        return page;
    }

    @Override
    public List<EquipmentInfoEntity> findAll() throws Exception {
        Sort sort = new Sort(Sort.Direction.DESC,"createTime");
        return equipmentRepository.findAll(sort);
    }

    @Override
    public EquipmentInfoEntity findById(String id) throws Exception {
        QEquipmentInfoEntity qEquipmentInfoEntity = QEquipmentInfoEntity.equipmentInfoEntity;
        JPAQuery<EquipmentInfoEntity> query = queryFactory.select(qEquipmentInfoEntity)
                .from(qEquipmentInfoEntity)
                .where(qEquipmentInfoEntity.eqId.eq(id));
        return query.fetchFirst();
    }
}
