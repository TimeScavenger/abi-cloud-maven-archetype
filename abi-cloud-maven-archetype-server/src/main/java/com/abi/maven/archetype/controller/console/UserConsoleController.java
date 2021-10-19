package com.abi.maven.archetype.controller.console;

import com.abi.maven.archetype.service.UserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Api(tags = "用户console管理")
@RestController
@RequestMapping("/user-console")
public class UserConsoleController {

    @Autowired
    private UserService userService;

}
