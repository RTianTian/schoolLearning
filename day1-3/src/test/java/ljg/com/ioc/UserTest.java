package ljg.com.ioc;

import ljg.com.Service.UserService;
import ljg.com.Service.UserServiceImpI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
//1.创建Bean工厂，读取配置文件，同时创建配置文件配置好的所以对象，对象一直存在
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        2.从Bean工厂中取对象
        UserService userService = (UserServiceImpI) applicationContext.getBean("userservice");
//        3.使用对象
        userService.add();
        userService.del();
        userService.findById(1002);
        userService.update();
    }
}
