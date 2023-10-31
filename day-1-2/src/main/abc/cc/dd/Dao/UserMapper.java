package cc.dd.Dao;



import cc.dd.pojo.User;

import java.util.List;

public interface UserMapper {
    public int addUser(User user);
    public int delUser(int id);
    public int updateUser(User user);
    public User findbyid(int id);
    public List<User> findAll();
}
