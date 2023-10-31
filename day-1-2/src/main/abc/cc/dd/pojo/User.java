package cc.dd.pojo;

public class User {
private Integer userid;
private String username;
private  String usersex;
private Integer userage;
private String useraddress;

    public User() {
    }

    public User(Integer userid, String username, String usersex, Integer userage, String useraddress) {
        this.userid = userid;
        this.username = username;
        this.usersex = usersex;
        this.userage = userage;
        this.useraddress = useraddress;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", usersex='" + usersex + '\'' +
                ", userage=" + userage +
                ", useraddress='" + useraddress + '\'' +
                '}';
    }
}
