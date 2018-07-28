package com.main.service;

import com.main.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 *
 * @author:zhongxiaowa
 * @Date:2018/7/26
 * @Time:21:46
 */

public interface UserService {
    /**
     * 此类的主要作用是用作User用户的业务层的数据操作
     * 例如实现相应的数据查询和展示的功能
     */
    /**
     * 查询
     * @return
     */
    public List<User> Selectall();
    public User SelectByUserId(int uid);
    public User SelectByUserName(String username);

    /**
     * 插入
     * @param user
     * @return
     */
    public int InsterUser(User user);

    /**
     * 更新
     * @param user
     * @return
     */
    public int UpdateUser(User user);

    /**
     * 删除
     * @param user
     * @return
     */
    public int DeletUser(User user);
}
