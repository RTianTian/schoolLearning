package tiantian2;
//静态代理模式进阶版
public class Client {
    public static void main(String[] args) {
// 真实对象-例房东
        UserServiceImpl userService = new UserServiceImpl();
//代理对象
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
        proxy.delete();
        proxy.find();
        proxy.update();
    }
}
