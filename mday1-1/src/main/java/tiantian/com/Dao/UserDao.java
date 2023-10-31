package tiantian.com.Dao;

import tiantian.com.pojo.User;

import java.util.List;

public interface UserDao {
    public int addUser(User user);
    public int delUser(int id);
    public int updateUser(User user);
    public User findbyid(int id);
    public List<User> findAll();

}
