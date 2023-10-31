package com.tiantian.Service;

import com.tiantian.dao.UserDao;
import com.tiantian.pojo.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

//    用于bean工厂的   <property name="userDao" ref="userDao"></property> name寻找
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUser(User user){
        userDao.addUser(user);
    }

    public void delUser(User user){
        userDao.delUser(user);
    }

    public void updateUser(User user){
        userDao.updateUser(user);
    }

    public User findbyName(String name){
        return userDao.findbyName(name);
    }

    public List<User> findAll(User user){
        return userDao.findAll(user);
    }

}
