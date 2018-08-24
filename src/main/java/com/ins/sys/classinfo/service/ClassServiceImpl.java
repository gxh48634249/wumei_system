package com.ins.sys.classinfo.service;

import com.ins.sys.classinfo.domain.ClassInfoEntity;
import com.ins.sys.classinfo.domain.ClassRepository;
import com.ins.sys.classinfo.domain.QClassInfoEntity;
import com.ins.sys.tools.*;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;
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
public class ClassServiceImpl extends BasicService<ClassInfoEntity> implements ClassService{

    @Autowired
    private ClassRepository repository;

    @Override
    public ClassInfoEntity save(ClassInfoEntity classInfoEntity) throws Exception {
        String code = classInfoEntity.getClassCode();
        if(StringTool.isnull(code)){
            throw new Exception("编码不能为空");
        }
        String id = MD5.id();
        classInfoEntity.setClassId(id);
        classInfoEntity.setCreateTime(new Date().getTime());
        return repository.save(classInfoEntity);
    }

    @Transactional
    @Override
    public void remove(ClassInfoEntity classInfoEntity) throws Exception {
        String id = classInfoEntity.getClassId();
        if(StringTool.isnull(id)) {
            throw new Exception("请指定主键");
        }
        QClassInfoEntity qClassInfoEntity = QClassInfoEntity.classInfoEntity;
        queryFactory.delete(qClassInfoEntity)
                .where(qClassInfoEntity.classId.eq(id)).execute();
    }

    @Transactional
    @Override
    public ClassInfoEntity modify(ClassInfoEntity classInfoEntity) throws Exception {
        String id = classInfoEntity.getClassId();
        if(StringTool.isnull(id)) {
            throw new Exception("请指定主键");
        }
        QClassInfoEntity qClassInfoEntity = QClassInfoEntity.classInfoEntity;
        JPAUpdateClause clause = queryFactory.update(qClassInfoEntity);
        if(!StringTool.isnull(classInfoEntity.getClassCode()))  {
            clause = clause.set(qClassInfoEntity.classCode,classInfoEntity.getClassCode());
        }
        if(!StringTool.isnull(classInfoEntity.getClassName())){
            clause = clause.set(qClassInfoEntity.className,classInfoEntity.getClassName());
        }
        clause.execute();
        return classInfoEntity;
    }

    @Override
    public Page<ClassInfoEntity> findByPage(ClassInfoEntity classInfoEntity, PageInfo pageInfo) throws Exception {
        QClassInfoEntity qClassInfoEntity = QClassInfoEntity.classInfoEntity;
        Predicate predicate = qClassInfoEntity.classId.isNotNull();
        String code = classInfoEntity.getClassCode();
        String name = classInfoEntity.getClassName();
        if(!StringTool.isnull(code)) {
            predicate = ExpressionUtils.and(predicate,qClassInfoEntity.classCode.eq(code));
        }
        if(!StringTool.isnull(name)) {
            predicate = ExpressionUtils.and(predicate,qClassInfoEntity.className.like(StringTool.sqlLike(name)));
        }
        Sort sort = new Sort(Sort.Direction.DESC,"createTime");
        PageRequest request = pageInfo.getPageRequest(sort);
        Page<ClassInfoEntity> page = repository.findAll(predicate,request);
        return page;
    }

    @Override
    public List<ClassInfoEntity> findAll() throws Exception {
        Sort sort = new Sort(Sort.Direction.DESC,"createTime");
        return repository.findAll(sort);
    }

    @Override
    public ClassInfoEntity findById(String id) throws Exception {
        QClassInfoEntity qClassInfoEntity = QClassInfoEntity.classInfoEntity;
        JPAQuery<ClassInfoEntity> query = queryFactory.select(qClassInfoEntity)
                .from(qClassInfoEntity)
                .where(qClassInfoEntity.classId.eq(id)).orderBy(qClassInfoEntity.createTime.desc());
        return query.fetchFirst();
    }

    @Override
    public ClassInfoEntity findByCode(String code) throws Exception {
        if(StringTool.isnull(code)){
            throw new Exception("编码不能为空");
        }
        QClassInfoEntity qClassInfoEntity = QClassInfoEntity.classInfoEntity;
        JPAQuery<ClassInfoEntity> query = queryFactory.select(qClassInfoEntity)
                .from(qClassInfoEntity)
                .where(qClassInfoEntity.classCode.eq(code)).orderBy(qClassInfoEntity.createTime.desc());
        return query.fetchFirst();
    }
}
