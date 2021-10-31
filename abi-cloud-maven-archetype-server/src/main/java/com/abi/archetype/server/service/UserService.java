package com.abi.archetype.server.service;

import com.abi.archetype.api.request.UserReq;
import com.abi.archetype.dao.entity.UserInfo;

public interface UserService {

    UserInfo getUserInfo(int userId);

    Boolean updateUserInfo(UserReq req);

}
