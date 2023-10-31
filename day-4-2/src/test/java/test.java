import lgj.com.Girl;
import lgj.com.WangMeilProxy;
import lgj.com.WangMeili;

public class test {
    public static void main(String[] args) {
//        隔壁有个女孩，叫王美丽
        WangMeili wangMeili = new WangMeili();
//        她有个庞大的家庭WangMeiliProxy类，即代理
        WangMeilProxy family = new WangMeilProxy(wangMeili);
//        有一次去约王美丽,得经过她妈妈同意（增强型里的方法）
        Girl mother = (Girl) family.getProxyInstance();
        mother.date();
        System.out.println("---------------------");
//        mother.movie();
    }
}
