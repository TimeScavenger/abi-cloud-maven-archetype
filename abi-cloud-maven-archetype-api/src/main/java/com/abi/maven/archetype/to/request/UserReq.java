package com.abi.maven.archetype.to.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel
public class UserReq {

    @ApiModelProperty("用户ID")
    @NotNull(message = "用户ID不能为空")
    public Integer id;

    @ApiModelProperty("用户姓名")
    public String realEnName;

}
