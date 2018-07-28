package com.main.serviceimpl;

import com.main.dao.UserDao;
import com.main.entity.User;
import com.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 *
 * @author:zhongxiaowa
 * @Date:2018/7/27
 * @Time:10:43
 */

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public List<User> Selectall() {
        return null;
    }

    @Override
    public User SelectByUserId(int uid) {
        User uname = userDao.SelectByUserId(uid);
        if (uname!=null){
            System.out.println(uname);
        }else{
            System.out.println("查询错误");
        }

        return uname;
    }

    @Override
    public User SelectByUserName(String username) {
        return null;
    }

    @Override
    public int InsterUser(User user) {
        return 0;
    }

    @Override
    public int UpdateUser(User user) {
        return 0;
    }

    @Override
    public int DeletUser(User user) {
        return 0;
    }
}
