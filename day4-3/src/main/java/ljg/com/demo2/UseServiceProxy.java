package ljg.com.demo2;

public class UseServiceProxy implements UserService {
//    这个代理类中需要包含userServiceImpl这个目标对象
    private UserServiceImpl userServiceImpl;
//构造器

    public UseServiceProxy() {
    }

    public UseServiceProxy(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    public void setUserServiceImpl(UserServiceImpl userServiceImpl){
        this.userServiceImpl=userServiceImpl;
    }

    @Override
    public void add() {
        printrz();
        userServiceImpl.add();
        over();
    }

    @Override
    public void find() {
        printrz();
        userServiceImpl.find();
        over();
    }

    @Override
    public void delete() {
        printrz();
        userServiceImpl.delete();
        over();
    }

    @Override
    public void update() {
        printrz();
        userServiceImpl.update();
        over();
    }
//    增加了打印日志的方法  ---前置通知
    public void printrz(){
        System.out.println("我打印了日志");
    }
    //    增加了打印日志的方法  ---后置通知
    public void over(){
        System.out.println("你的操作成功");
    }
}
