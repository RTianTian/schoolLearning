package tiantian3;

public class Client {
    public static void main(String[] args) {
//        真实角色
        Host1 host = new Host1();
//        代理角色：现在没有，接下来创建
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
//      将真实角色注入到代理类中,设置代理对象
//         pih. setRent1(host);
        pih.setTarget(host);
//        这里的proxy1是动态生成的，我们并没有写
        Rent1 proxy1 =(Rent1) pih.getProxy();
        proxy1.delete();
    }
}
