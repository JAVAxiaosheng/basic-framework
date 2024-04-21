package com.base.core.metadata;

import com.baomidou.mybatisplus.extension.service.IService;
import com.base.data.entity.UserInfo;

public interface UserInfoService extends IService<UserInfo> {
    UserInfo getOneUserInfoById(Integer id);
}
