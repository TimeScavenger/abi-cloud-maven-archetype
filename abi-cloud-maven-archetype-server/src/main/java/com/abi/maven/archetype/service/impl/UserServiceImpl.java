package com.abi.maven.archetype.service.impl;

import com.abi.maven.archetype.dao.entity.UserInfo;
import com.abi.maven.archetype.dao.mapper.UserMapper;
import com.abi.maven.archetype.service.UserService;
import com.abi.maven.archetype.to.request.UserReq;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo getUserInfo(int userId) {
        return new UserInfo();
    }

    @Override
    @Transactional
    public Boolean updateUserInfo(UserReq req) {
        HintManager hintManager = HintManager.getInstance();
        hintManager.setMasterRouteOnly();

        UserInfo userInfo = userMapper.selectById(1L);
        log.info(userInfo.toString());

        UserInfo entity = new UserInfo();
        entity.setId(1L);
        entity.setRealEnName("11");
        userMapper.updateById(entity);

        hintManager.close();
        return true;
    }

}
