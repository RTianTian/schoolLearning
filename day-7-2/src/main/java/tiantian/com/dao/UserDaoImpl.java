package tiantian.com.dao;

import org.springframework.stereotype.Repository;
import tiantian.com.pojo.User;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao{
    public void addUser(User user) {
        System.out.println("添加方法");
        System.out.println(user.toString());
    }

    public void delUser(int id) {
        System.out.println("删除了id为"+id+"的用户");
    }

    public void updateUser(User user) {
        System.out.println("更新方法");
        System.out.println(user.toString());
    }

    public User findbyid(int id) {
        return new User(id, "李明", 20, "女", "北京");
    }

    public List<User> findAll() {
        ArrayList<User> list = new ArrayList<User>();
        list.add(new User(5,"李明",20,"女","北京"));
        list.add(new User(5,"李明",20,"女","北京"));
        list.add(new User(5,"李明",20,"女","北京"));
        list.add(new User(5,"李明",20,"女","北京"));
        return list;
    }
}
