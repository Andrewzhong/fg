package com.main.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

/**
 * Created with IDEA
 *
 * @author:zhongxiaowa
 * @Date:2018/7/25
 * @Time:10:29
 */
public class User {

    /**
     * 字段说明：
     * uid:用户编号
     * employeeid:员工编号
     * username:员工名字
     * phonenum:电话号码
     * title:职位
     * email:电子邮件/辅助识别码
     * photo:照片/只存储照片的路径
     * authorization:授权/主要用于区分功能
     * remarkes:备注
     */
    private int uid;
    private int employeeid;
    private String username;
    private int phonenum;
    private String title;
    private String email;
    private String photo;
    private int authorization;
    private String remarkes;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getAuthorization() {
        return authorization;
    }

    public void setAuthorization(int authorization) {
        this.authorization = authorization;
    }

    public String getRemarkes() {
        return remarkes;
    }

    public void setRemarkes(String remarkes) {
        this.remarkes = remarkes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return uid == user.uid &&
                employeeid == user.employeeid &&
                phonenum == user.phonenum &&
                authorization == user.authorization &&
                Objects.equals(username, user.username) &&
                Objects.equals(title, user.title) &&
                Objects.equals(email, user.email) &&
                Objects.equals(photo, user.photo) &&
                Objects.equals(remarkes, user.remarkes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, employeeid, username, phonenum, title, email, photo, authorization, remarkes);
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", employeeid=" + employeeid +
                ", username='" + username + '\'' +
                ", phonenum=" + phonenum +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", photo='" + photo + '\'' +
                ", authorization=" + authorization +
                ", remarkes='" + remarkes + '\'' +
                '}';
    }
}
