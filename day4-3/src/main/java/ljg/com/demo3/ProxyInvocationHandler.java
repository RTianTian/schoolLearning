package ljg.com.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这类，动态生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
//    代理的接口---目标对象
    private Object target;

//目标对象的设定，有可能是Host，有可能是UserServiceImpl
    public void setTarget(Object target) {
        this.target = target;
    }
//生成得到代理类
    public Object getProxy(){
    return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        将代理的方法名字  传入log()方法的msg形参中
      log(method.getName());
      Object result = method.invoke(target,args);
      return result;
    }

    private void log(String msg) {
        System.out.println("执行了"+msg+"方法");
    }

}
