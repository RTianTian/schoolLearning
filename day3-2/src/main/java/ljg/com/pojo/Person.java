package ljg.com.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
//@Component用于创建对象，value设置对象的名称,如果没有设置value值，则自动默认为此类的小写。

@Component
public class Person {
    private Integer id;
    private String name;
    @Resource
    private Dog dog;
    @Autowired
    @Qualifier(value = "dog2")
    private Dog dog2;
   @Resource(name = "cat21")
    private Cat cat;




    public Person() {
    }

    public Person(Integer id, String name, Dog dog, Cat cat) {
        this.id = id;
        this.name = name;
        this.dog = dog;
        this.cat = cat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Dog getDog2() {
        return dog2;
    }

    public void setDog2(Dog dog2) {
        this.dog2 = dog2;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dog=" + dog +
                ", dog2=" + dog2 +
                ", cat=" + cat +
                '}';
    }
}
