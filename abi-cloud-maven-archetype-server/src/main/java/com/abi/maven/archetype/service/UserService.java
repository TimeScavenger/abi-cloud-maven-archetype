package com.abi.maven.archetype.service;

import com.abi.maven.archetype.dao.entity.UserInfo;
import com.abi.maven.archetype.to.request.UserReq;

public interface UserService {

    UserInfo getUserInfo(int userId);

    Boolean updateUserInfo(UserReq req);

}
