import ljg.com.Host;
import ljg.com.Proxy;
//静态代理
public class test {
    public static void main(String[] args) {
//        Host h = new Host();
        Proxy p = new Proxy();
        p.update();
        System.out.println("----------------");
        p.find();
    }
}
