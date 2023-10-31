package 注解;

import java.util.ArrayList;
import java.util.List;

public class test01 extends Object{
//    内置注解
//    什么是注解
//  @Override 重写的注解
    @Override
    public String toString() {
        return super.toString();
    }
//    Deprecated 不推荐程序员使用，或者可以使用，但存在更好的方式
    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }
//    强制镇压警告
    @SuppressWarnings("all")
    public void test02(){
        List list = new ArrayList();
    }

    public static void main(String[] args) {
        test();
    }
}
