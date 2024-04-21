package com.base.frame.controller;

import com.base.common.protocol.result.Result;
import com.base.core.metadata.UserInfoService;
import com.base.data.entity.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/info")
@Api(tags = "人员信息", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping(value = "/query/one", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "查询单个人员信息", httpMethod = "GET")
    public Result<UserInfo> queryOneInfo(@RequestParam("id") Integer id) {
        return Result.succ(userInfoService.getOneUserInfoById(id));
    }

    @GetMapping(value = "/get/one", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "查询人员信息根据id", httpMethod = "GET")
    public Result<UserInfo> queryOneInfoById(@RequestParam("id") Integer id) {
        return Result.succ(userInfoService.getOneUserInfoById(id));
    }
}
