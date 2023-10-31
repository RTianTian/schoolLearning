package lgj.com.pojo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

//实体类：就是有私有属性
public class User {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String address;

    //    构造器:构造器的名字和类的名字相同，在创建对象时，用于初始化对象的初值，对象值还可以重载每一个版本的参数个数
//    在创建对象时，根据实参的个数，调用对应的构造器
//无参构造器：
    public User() {
    }
//两参构造器


    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(Integer id, String name, String sex, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    //2.私有属性对外提供的接口

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //对外写一个输出的方法
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                ", sex=" + sex +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

}