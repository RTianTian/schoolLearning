package ljg.com.pojo;

import java.util.*;

public class Student {
    private Integer id;
private String name;
private Address address;
private String[] books;
private List<String> habbys;
private Map<String,String> cards;
private Set<String> games;
private String wife;
private Properties info;

    public Student() {
    }

    public Student(Integer id, String name, Address address, String[] books, List<String> habbys, Set<String> games, String wife, Properties info) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = books;
        this.habbys = habbys;
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

    public Map<String, String> getCards() {
        return cards;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", habbys=" + habbys +
                ", cards=" + cards +
                ", games=" + games +
                ", wife='" + wife + '\'' +
                ", info=" + info +
                '}';
    }
}
