package ljg.com.test;

import ljg.com.controller.UserContoller;
import ljg.com.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {
    @Test
    public void xyz() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserContoller userController =(UserContoller)applicationContext.getBean("userController");
        userController.add();
        userController.del();
        userController.update();
        System.out.println(userController.findbyid().toString());
        List<User> list=userController.findAll();
        for(User user:list){
            System.out.println(user.toString());
        }
    }
}
