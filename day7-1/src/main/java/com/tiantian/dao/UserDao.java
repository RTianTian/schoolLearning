package com.tiantian.dao;

import com.tiantian.pojo.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public void delUser(User user);
    public void updateUser(User user);
    public User findbyName(String name);
    public List<User> findAll(User user);

}
