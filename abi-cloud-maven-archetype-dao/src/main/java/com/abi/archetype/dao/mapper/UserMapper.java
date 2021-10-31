package com.abi.archetype.dao.mapper;

import com.abi.archetype.dao.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<UserInfo> {

    List<UserInfo> getAllUserInfos();

}