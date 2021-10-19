package com.abi.maven.archetype.client;

import com.abi.base.foundation.response.ApiResponse;
import com.abi.maven.archetype.to.request.UserReq;
import com.abi.maven.archetype.to.response.UserResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserApi {

    @GetMapping("/userinfo")
    ApiResponse<UserResp> getUserInfo(@RequestParam("userId") int usedId);

    @PutMapping("/userinfo")
    ApiResponse<Boolean> updateUserInfo(@RequestBody UserReq req);

}
