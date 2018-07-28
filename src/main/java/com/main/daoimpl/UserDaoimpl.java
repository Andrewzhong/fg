package com.main.daoimpl;

import com.main.dao.UserDao;
import com.main.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created with IDEA
 *
 * @author:zhongxiaowa
 * @Date:2018/7/27
 * @Time:10:08
 */
@Repository
public class UserDaoimpl implements UserDao{

    @Override
    public List<User> Selectall() {
        return null;
    }

    @Override
    public User SelectByUserId(int uid) {
        return null;
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
