package tiantian2;
//真实的类，实现UserService接口里的方法
public class UserServiceImpl implements UserService {

    public void add() {
        System.out.println("添加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("更新了一个用户");
    }

    public void find() {
        System.out.println("查询了一个用户");
    }
}
