package lgj.com.pojo;


import java.util.*;

public class Student {
//  1.  普通属性
    private Integer id;
    private String name;
//    2.对象属性 :就是其他类的对象在本类中做属性，也就是创建两个类的关系
    private Address address;
//  3. 数组类型数据
    private String[] books;
//    4.habbys  List集合数据类型
    private List<String> habbys;
//    5. map键值对 的集合类型数据
    private Map<String,String> card;
//    6.set 集合数据类型
    private Set<String> games;
//7. 空值注入
    private String wife;
//    java属性值注入
    private Properties info;

    public Student() {
    }

    public Student(Integer id, String name, Address address, String[] books, List<String> habbys, Map<String, String> card, Set<String> games, String wife, Properties info) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = books;
        this.habbys = habbys;
        this.card = card;
        this.games = games;
        this.wife = wife;
        this.info = info;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHabbys() {
        return habbys;
    }

    public void setHabbys(List<String> habbys) {
        this.habbys = habbys;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", habbys=" + habbys +
                ", card=" + card +
                ", games=" + games +
                ", wife='" + wife + '\'' +
                ", info=" + info +
                '}';
    }
}
