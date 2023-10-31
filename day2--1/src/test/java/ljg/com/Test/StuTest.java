package ljg.com.Test;

import lgj.com.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class StuTest {
    @Test
    public void abc(){
//        创建一个bean工厂
        ApplicationContext ioc = new ClassPathXmlApplicationContext("bean.xml");
//        调用bean工厂里面的数据，然后强制转换成Student类。
        Student stu1 =(Student) ioc.getBean("stu1");
//        将之前bean工厂里面的泡泡修改成天天
        stu1.setName("天天");
//        打印输出数据
        System.out.println(stu1.toString());
    }

}

