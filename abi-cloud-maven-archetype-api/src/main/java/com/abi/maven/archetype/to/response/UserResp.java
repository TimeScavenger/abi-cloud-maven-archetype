package com.abi.maven.archetype.to.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class UserResp {

    @ApiModelProperty("用户ID")
    private Long id;

    @ApiModelProperty("用户姓名")
    private String realEnName;

    @ApiModelProperty("用户电话")
    private String phone;

}
