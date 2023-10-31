package ljg.com.test;

import ljg.com.pojo.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Person person =(Person) applicationContext.getBean("person");
        person.getDog().spack();
        person.getCat().spack2();
    }
}
