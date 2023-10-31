package ljg.com.demo1;

public class Proxy implements Rent {
//    这个代理类里面需要包含实体类对象
private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void reant() {
        seehost();//看房子--前置通知
        host.reant();//租房
        fare();//签合同--后置通知
        hetong();//收中介费--后界通知
    }
    public void  seehost(){
        System.out.println("看房");
    }
    public void fare(){
        System.out.println("收中介费");
    }
    public void hetong(){
        System.out.println("我们签合同");
    }
}
