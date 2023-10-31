package tiantian;
//也要实现租房操作，Proxy类和Host类共同的目的都是租房
public class Proxy implements Rent{
//    在代理类中，我们应该将房东这一角色注入过来
private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
    }
//    以下是三个方法
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    public void contact(){
        System.out.println("中介带你签合同");
    }
    public  void fare(){
        System.out.println("中介收取费用");
    }

}
