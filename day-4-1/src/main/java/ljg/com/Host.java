package ljg.com;
//目标对象
//实现类
public class Host implements Rent{

    public void update() {
        System.out.println("修改个人信息");
    }

    public Object find() {
        System.out.println("查看管理系统数据");
        return new Object();
    }
}

