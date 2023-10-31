package ljg.com;

import ljg.com.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void  adb(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("bean.xml");
        User  user1 =  (User) applicationContext.getBean("user");
        System.out.println(user1.toString());

        User  user2 =  (User) applicationContext.getBean("user");
        System.out.println("user1==user2的结果"+(user1==user2));//true 因为用的单例singleton，指向同一个对象
        System.out.println(user2.toString());
        User  user3 =  (User) applicationContext.getBean("user1");
        User  user4 =  (User) applicationContext.getBean("user1");
        User  user5 =  (User) applicationContext.getBean("user1");
        User  user6 =  (User) applicationContext.getBean("user1");

        System.out.println(user3==user4);//
        System.out.println(user3==user5);
        System.out.println(user3==user6);
        System.out.println(user5==user6);

    }


}

