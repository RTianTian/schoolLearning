package lgj.com;
//真实对象
public class WangMeili implements Girl{
//    重写一下抽象接口里的方法
@Override
    public void date() {
        System.out.println("王美丽说，跟你约会很开心");
    }
@Override
    public void movie() {
    System.out.println("王美丽说，这个电影我不喜欢看");
    }
}
