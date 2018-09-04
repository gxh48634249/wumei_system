package com.ins.sys.user.service;

import com.ins.sys.tools.BasicService;
import com.ins.sys.tools.PageInfo;
import com.ins.sys.user.domain.SysUserInfoEntity;
import com.ins.sys.user.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BasicService<SysUserInfoEntity> implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public SysUserInfoEntity save(SysUserInfoEntity userInfoEntity) throws Exception {
        return null;
    }

    @Override
    public void remove(SysUserInfoEntity userInfoEntity) throws Exception {

    }

    @Override
    public SysUserInfoEntity modify(SysUserInfoEntity userInfoEntity) throws Exception {
        return null;
    }

    @Override
    public Page<SysUserInfoEntity> findByPage(SysUserInfoEntity userInfoEntity, PageInfo pageInfo) throws Exception {
        return null;
    }

    @Override
    public List<SysUserInfoEntity> findAll() throws Exception {
        return null;
    }

    @Override
    public SysUserInfoEntity findById(String id) throws Exception {
        return null;
    }
}
