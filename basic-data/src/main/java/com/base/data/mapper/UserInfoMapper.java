package com.base.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.base.data.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    UserInfo getOneInfoById(@Param("id") Integer id);
}
