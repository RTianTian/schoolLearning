import ljg.com.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class StuTest {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean.xml");
        Student stu1 =(Student) ioc.getBean("stu1");
        //
        Set<String> set =new HashSet<String>() ;
        set.add("大头");
        set.add("小兔");
        set.add("小头");
        stu1.setGames(set);
        System.out.println(stu1.toString());

    }
}
