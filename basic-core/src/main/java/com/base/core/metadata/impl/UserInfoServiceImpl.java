package com.base.core.metadata.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.base.core.metadata.UserInfoService;
import com.base.data.entity.UserInfo;
import com.base.data.mapper.UserInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getOneUserInfoById(Integer id) {
        UserInfo info = userInfoMapper.getOneInfoById(id);
        log.info("查询结果显示:" + info);
        return info;
    }
}
