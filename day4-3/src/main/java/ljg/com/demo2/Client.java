package ljg.com.demo2;

import org.springframework.cglib.proxy.Proxy;

public class Client {

    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        UseServiceProxy Proxy = new UseServiceProxy(userServiceImpl);
        Proxy.setUserServiceImpl(userServiceImpl);

        Proxy.add();
        Proxy.delete();
        Proxy.find();
        Proxy.update();


    }
}
