package tiantian.com.dao;

import tiantian.com.pojo.User;

import java.util.List;

public interface UserDao {
    public void  addUser(User user);
    public void  delUser(int id);
    public void updateUser(User user);
    public User findbyid(int id);
    public List<User> findAll();

}
