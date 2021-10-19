package com.abi.maven.archetype.client;

import com.abi.base.foundation.code.ResultCode;
import com.abi.base.foundation.response.ApiResponse;
import com.abi.maven.archetype.client.response.TestUserResp;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "abi-cloud-user", url = "${user-service-url:http://abi-cloud-user:8080/user-server/}", fallbackFactory = TestClient.TestClientFallbackFactory.class)
@RequestMapping({"/api/user"})
public interface TestClient {

    @GetMapping("/get-user-info-by-abi-one-id-and-type")
    ApiResponse<TestUserResp> getUserInfo(@RequestParam("abiOneId") int usedId, @RequestParam("userType") String userType);

    @Component
    @Slf4j
    class TestClientFallbackFactory implements FallbackFactory<TestClient> {

        @Override
        public TestClient create(Throwable throwable) {
            return new TestClient() {
                @Override
                public ApiResponse<TestUserResp> getUserInfo(int usedId, String userType) {
                    log.error("getUserInfo error {}", usedId, throwable);
                    return ApiResponse.result(ResultCode.UNKNOW_ERROR.code(), ResultCode.UNKNOW_ERROR.message());
                }
            };
        }
    }

}
