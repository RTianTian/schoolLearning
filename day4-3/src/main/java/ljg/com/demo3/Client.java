package ljg.com.demo3;

import ljg.com.demo1.Host;
import ljg.com.demo1.Rent;
import ljg.com.demo2.UserService;
import ljg.com.demo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
//        真实对象
        UserServiceImpl userService = new UserServiceImpl();
//        代理对象--当前不存在
        ProxyInvocationHandler pih =new ProxyInvocationHandler();
//        为userService 代理对象
        pih.setTarget(userService);
//调用getProxy生成代理对象
        UserService procy = (UserService)pih.getProxy();//代理的一定是接口
        procy.add();
        procy.delete();
        procy.find();
        procy.update();

        Host host = new Host();

        ProxyInvocationHandler pihl = new ProxyInvocationHandler();
        pihl.setTarget(host);
//        代理的一定是接口
        Rent proxy1 = (Rent)pihl.getProxy();
        proxy1.reant();
    }
}
