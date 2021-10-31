package com.abi.archetype.server.controller.app;

import com.abi.base.common.response.ApiResponse;
import com.abi.archetype.api.request.UserReq;
import com.abi.archetype.api.response.UserResp;
import com.abi.archetype.server.client.TestClient;
import com.abi.archetype.server.client.response.TestUserResp;
import com.abi.archetype.server.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@Api(tags = "用户管理")
@RestController
@RequestMapping("/user-app")
public class UserAppController {

    @Autowired
    private UserService userService;

    @Autowired
    private TestClient testClient;

    @ApiOperation("查询用户信息 ")
    @GetMapping("/userinfo")
    public ApiResponse<UserResp> getUserInfo(@RequestParam("userId") @ApiParam("用户ID") int usedId) {
        ApiResponse<TestUserResp> response = testClient.getUserInfo(usedId, "ABI");
        if (response.success()) {
            TestUserResp data = response.getData();
            UserResp userResp = new UserResp();
            userResp.setPhone(data.getPhone());
            userResp.setId((long) usedId);
            return ApiResponse.result(userResp);
        }
        return ApiResponse.result(response.getCode(), response.getMessage());
    }

    @PutMapping("/userinfo")
    public ApiResponse<Boolean> updateUserInfo(@Valid @RequestBody UserReq req) {
        return ApiResponse.result(userService.updateUserInfo(req));
    }
}
