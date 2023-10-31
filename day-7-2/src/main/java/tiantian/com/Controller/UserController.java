package tiantian.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tiantian.com.Service.UserService;
import tiantian.com.pojo.User;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public void add(){
        User user = new User(2001,"天天",20,"女","河北");
        userService.addUser(user);

    }
    public void del(){
//        User user2 = new User(2001,"天天",20,"女","河北");
        userService.delUser(2002);
    }
    public void update(){
        User user = new User(2001,"天天",20,"女","河北");
        userService.updateUser(user);
    }
    public User findbyid(){
        return userService.findbyid(20002);
    }
    public List<User> findAll(){
        return userService.findAll();
}

}
