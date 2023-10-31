package tiantian.com.Dao;

import tiantian.com.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public int addUser(User user);
    public int delUser(int id);
    public int updateUser(User user);
    public User findbyid(int id);
    public List<User> findAll();
//万能的map
    public int addUser2(Map<String,Object> map);
//    不是全部的修改，只修改几个属性
    public User findbyid2 (Map<String,Object> map);
    public int update2 (Map<String,Object> map);
    public int delUser2 (Map<String,Object> map);
}
