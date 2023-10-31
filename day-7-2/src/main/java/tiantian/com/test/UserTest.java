package tiantian.com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import tiantian.com.Controller.UserController;

public class UserTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("bean.xml");
        UserController usercontroller = (UserController) act.getBean("userController");
    usercontroller.add();










    }
}
