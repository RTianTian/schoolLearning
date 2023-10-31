package ljg.com;
//代理模式（Proxy）是通过代理对象访问目标对象，这样可以在目标对象基础上增强额外的功能，如添加权限，访问控制和审计等功能。
//实现类
public class Proxy {
    private Rent target;
//构造器
    public Proxy(Rent target) {
        this.target = target;
    }

    public Proxy() {
    }

    //重写update方法
    public void update(){
    System.out.println("修该个人信息前记录日志");
        Host host = new Host();
//        调用一下目标对象里的update方法
        host.update();
    System.out.println("修该个人信息后记录日志");
    }
    public void find() {
        System.out.println("判断用户是否有权限进行find操作");
        Host host = new Host();
        host.find();
        System.out.println("记录用户执行find操作的用户信息、查看内容和时间等");
    }

}



