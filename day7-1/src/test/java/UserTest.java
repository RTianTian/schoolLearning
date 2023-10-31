import com.tiantian.controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void abc(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserController usercontroller = (UserController)applicationContext.getBean("controller");
        usercontroller.add();
        usercontroller.update();
    }
}
