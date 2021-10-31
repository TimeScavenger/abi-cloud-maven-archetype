package com.abi.archetype.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("abi_user")
public class UserInfo {

    @TableId(type = IdType.INPUT)
    private Long id;

    @TableField("real_en_name")
    private String realEnName;

    @TableField("phone")
    private String phone;

}