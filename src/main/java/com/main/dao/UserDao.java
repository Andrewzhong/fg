package com.main.dao;

import com.main.entity.User;

import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 *
 * @author:zhongxiaowa
 * @Date:2018/7/26
 * @Time:16:32
 */
public interface UserDao {
    /**
     * 在这个接口中完成用户类的数据访问的
     * 接口设计
     * 主要就是完成用户的CURD
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
