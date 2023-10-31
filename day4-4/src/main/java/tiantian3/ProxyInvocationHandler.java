package tiantian3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理实现的是InvocationHandler接口
public class ProxyInvocationHandler implements InvocationHandler {
//    被代理的接口  整个rent1接口目前是死的我们可以把它设置成活的
//private Rent1 rent1;
    private Object target;

//set方法
//    public void setRent1(Rent1 rent1) {
//        this.rent1 = rent1;
//    }
//target的目标对象
    public void setTarget(Object target) {
        this.target = target;
    }

    //处理代理实例，并返回结果
//    Object proxy 调用该方法的实例
//    所述方法对应于调用代理实例，方法对象的声明类是该方法声明的接口，它可以是代理类继承该方法的代理接口的超级接口
//  包含的方法调用传递代理实例的参数值的对象的阵列。
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }
//    生成得到的代理类
//    this.getClass().getClassLoader() 代理的类在哪个位置
//    rent1.getClass().getInterfaces() 代理的接口
//    this：代表自己的InvocationHandler对象
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }
//   写一个log方法
    public void log(String msg){
        System.out.println("调用了"+msg+"的方法");
    }
}
