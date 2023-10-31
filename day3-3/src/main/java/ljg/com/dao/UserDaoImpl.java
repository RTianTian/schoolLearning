package ljg.com.dao;

import ljg.com.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao{

    public void addUser(User user) {
        System.out.println("你添加了对象，非常成功，添加信息如下：");
        System.out.println(user.toString());
    }

    public void delUser(int id) {
        System.out.println("删除了id="+id+"的用户");
    }

    public void updateUser(User user) {
        System.out.println("更新了对象");
        System.out.println(user.toString());
    }

    public User findbyid(int id) {
        return new User(id,"李明7",20,"女","北京");
    }

    public List<User> findALL() {
        User user1 =new User(1002,"李明1",20,"女","北京");
        User user2 =new User(1002,"李明",20,"女","北京");
        User user3 =new User(1002,"李明",20,"女","北京");
        User user4 =new User(1002,"李明",20,"女","北京");

        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return list;
    }
}
