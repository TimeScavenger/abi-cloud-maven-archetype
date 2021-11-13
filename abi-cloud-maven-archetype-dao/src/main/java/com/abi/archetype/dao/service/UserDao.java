package com.abi.archetype.dao.service;

import com.abi.archetype.dao.entity.UserInfo;
import com.abi.archetype.dao.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends ServiceImpl<UserMapper, UserInfo> {

}
