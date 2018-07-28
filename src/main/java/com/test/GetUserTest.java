package com.test;

import com.main.entity.User;
import com.main.service.UserService;
import com.main.serviceimpl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 *
 * @author:zhongxiaowa
 * @Date:2018/7/27
 * @Time:01:33
 */

public class GetUserTest {
    @Test
    public void Test1(){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("/web/WEB-INF/applicationContext.xml");
        UserServiceImpl userServiceimpl = (UserServiceImpl) ctx.getBean("UserServiceImpl");
        User uname = userServiceimpl.SelectByUserId(1);
        System.out.println(uname);
    }

}
