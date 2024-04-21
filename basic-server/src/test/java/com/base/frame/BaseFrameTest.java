package com.base.frame;

import com.base.core.metadata.UserInfoService;
import com.base.data.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseFrameTest {
    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void getOneInfoTest() {
        UserInfo info = userInfoService.getOneUserInfoById(24);
        System.out.println(info);
    }
}
