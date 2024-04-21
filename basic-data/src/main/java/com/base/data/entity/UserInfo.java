package com.base.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName("user_info")
@ApiModel(value = "UserInfo对象", description = "人员信息表")
public class UserInfo {
    @TableId(type = IdType.AUTO)
    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("name")
    private String userName;

    @ApiModelProperty("password")
    private String password;

    @ApiModelProperty("role")
    private String role;
}
