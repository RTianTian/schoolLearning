import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.management.snmp.jvminstr.JvmOSImpl;
import tiantian.com.Controller.UserController;
import tiantian.com.Service.UserService;
import tiantian.com.pojo.User;

import java.util.List;

public class UserTest {

@Test
        public void abc(){
    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
    UserController userController = (UserController)applicationContext.getBean("userController");
    userController.add();
    userController.update();
    userController.del();
    System.out.println(userController.findbyid().toString());
    List<User> list = userController.findAll();
    for (User user:list){
        System.out.println(user.toString());
    }


}
}
