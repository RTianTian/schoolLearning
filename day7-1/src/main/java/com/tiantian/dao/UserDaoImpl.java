package com.tiantian.dao;

import com.tiantian.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    public void addUser(User user) {
        System.out.println("添加成功");
        System.out.println(user.toString());
    }

    public void delUser(User user) {
        System.out.println("更新成功");
        System.out.println(user.toString());
    }

    public void updateUser(User user) {
        System.out.println("更新成功");
        System.out.println(user.toString());
    }

    public User findbyName(String name) {
        User user = new User(123,name,23,"男","北京");
        return user;
    }

    public List<User> findAll(User user) {
        List<User> list = new ArrayList<User>();
        list.add(new User( 123,"天天",23,"女","北京"));
        list.add(new User(123,"天天",23,"女","北京"));
        list.add(new User( 123,"天天",23,"女","北京"));
        list.add(new User( 123,"天天",23,"女","北京"));
        list.add(new User( 123,"天天",23,"女","北京"));
        return list;
    }
}
