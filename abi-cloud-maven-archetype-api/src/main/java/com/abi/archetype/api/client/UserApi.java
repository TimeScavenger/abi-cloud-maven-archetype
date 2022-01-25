package com.abi.archetype.api.client;

import com.abi.archetype.api.request.UserReq;
import com.abi.archetype.api.response.UserResp;
import com.abi.base.foundation.response.ApiResponse;
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
