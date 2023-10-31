package tiantian;
//静态代理模式
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.seeHouse();
        proxy.rent();
        proxy.contact();
        proxy.fare();
    }
}
