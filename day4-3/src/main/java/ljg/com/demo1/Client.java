package ljg.com.demo1;

import ljg.com.demo1.Host;
import ljg.com.demo1.Proxy;

public class Client {
    public static void main(String[] args) {
//        直接找房东租房子，不是用代理
        Host host = new Host();
        host.reant();
        System.out.println("--------------");
//        找代理租房子，不直接找房东
        Host host1 = new Host();
//        中介：代理的房东出租房子，要加一些附属操作，比如收费、签合同
        Proxy proxy = new Proxy(host1);
        proxy.reant();

    }
}
