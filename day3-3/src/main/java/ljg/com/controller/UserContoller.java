package ljg.com.controller;

import ljg.com.pojo.User;
import ljg.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller(value = "userController")
public class UserContoller {
//    在调用对象前，注入 @Autowired
    @Autowired
    private UserService userService;
    public void add(){
//        新建的user对象
        User user =new User(2001,"李明",20,"女","北京");
        userService.addUser(user);
    }
    public void  del(){
        userService.delUser(39008);
    }
    public void update(){
        User user = new User(78900,"aaa",20,"女","河北");
        userService.updateUser(user);
    }
    public User findbyid(){
       return userService.findbyid(2000100);
    }
    public List<User> findAll(){
       return userService.findALL();
    }


}
