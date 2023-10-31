package ljg.com.Test;

import lgj.com.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {

//        第一步：创建bean工厂，读配置文件，同时创建配置好的对象
//        *这些对象就一直生存在工厂中，随时可以使用，工厂销毁，对象销毁*
        ApplicationContext APPlicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//第二步：从工厂中获取对象
//        user1,user2,user3分别对应User类中的三个构造方法
//        ----------获取对象方法一：getBean获取，使用强转
        User user1 = (User) APPlicationContext.getBean("user1");  //无参，看application的配置文件中
        User user2 = (User) APPlicationContext.getBean("user2");
        User user3 = (User) APPlicationContext.getBean("user3");  //两参
User user4 = (User)APPlicationContext.getBean("user4");
User user6 = (User) APPlicationContext.getBean("user6");
        User user7 = (User)APPlicationContext.getBean("user666");
        System.out.println(user1.getId()+user1.getName());
        System.out.println(user2.toString());
        System.out.println("user3"+ user3.toString());
        System.out.println("user4"+user4.toString());
        System.out.println(user3==user4);
        System.out.println(user6.toString());
        System.out.println(user7.toString());
//        -------------获取对象方法2：使用泛型
//        User user6 = APPlicationContext.getBean(User.class);
//        System.out.println(user6.toString());


    }
}
