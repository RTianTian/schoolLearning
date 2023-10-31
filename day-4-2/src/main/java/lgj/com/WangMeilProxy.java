package lgj.com;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理：InvocationHandler和
//通过了王美丽的同意，到增强版了，开始要征得他们家人的同意了
public class WangMeilProxy implements InvocationHandler {
//    在代理对象中，写入真实对象,将此接口作为参数，传入真实对象中
    private Girl girl;
//    private WangMeili wangMeili;
//真实对象
//
//    public WangMeilProxy() {
//    }
//
//    public WangMeilProxy(WangMeili wangMeili) {
//        this.wangMeili = wangMeili;
//    }

        public WangMeilProxy() {
    }

    public WangMeilProxy(Girl girl) {
        super();
        this.girl = girl;
    }
//增强型里的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       doingSomeBefore();
//       调用自身的方法，method指调用WangMeili类中的date和movie方法
        Object ret = method.invoke(girl,args);
        doingSomeEnd();
        return ret;
    }
    private void doingSomeBefore(){
        System.out.println("王美丽父母说，我得先调查一下这个男孩子的背景");
    }

    private void doingSomeEnd(){
        System.out.println("王美丽的父母说，这个小伙子对你动手脚没有？");
    }
//    另一个小伙伴proxy
//    getClassLoader()类加载器    girl.getClass().getInterfaces()指定的接口   this 指InvocationHandler这个接口
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(girl.getClass().getClassLoader(),girl.getClass().getInterfaces(),this);
    }



}
