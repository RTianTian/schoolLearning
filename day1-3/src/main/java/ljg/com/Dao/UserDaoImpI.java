package ljg.com.Dao;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class UserDaoImpI implements UserDao{

    public void add(){
        System.out.println("增加一个方法");
    }
    public void del(){
        System.out.println("删除一个方法");
    }
    public void update(){
        System.out.println("更新一个方法");
    }
    public void findById(int id){
        System.out.println("查询出"+id+"的用户");
    }
}
