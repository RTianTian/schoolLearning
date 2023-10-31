package ljg.com.demo2;
//UserService的实现类
public class UserServiceImpl implements UserService{

    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void find() {
        System.out.println("查找用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }
}
