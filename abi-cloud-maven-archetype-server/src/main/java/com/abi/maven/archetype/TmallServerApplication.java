package com.abi.maven.archetype;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import static com.abi.base.foundation.constant.CommonConstant.LOG_PRE;

@Slf4j
@ComponentScan("com.abi")
@EnableFeignClients(basePackages = "com.abi")  // 告诉Spring，远程调用的接口都在哪个包下
@EnableDiscoveryClient // 服务注册到注册中心
@EnableTransactionManagement
@SpringBootApplication
public class TmallServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmallServerApplication.class, args);
        log.info(LOG_PRE + "------------ abi-cloud-tmall- 服务 启动成功 ------------");
    }

}
