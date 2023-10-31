import java.lang.annotation.*;

//测试元注解
//定义到类上了
@MyAnnotation(name = "天天")
public class Test02 {
//    test是个方法，即能定义到方法 上
//    @MyAnnotation
    public void test(){}
}
//@Target 表示我们的注解可以用到哪些地方
//定义一个注解  METHOD 定义到方法上   ElementType.TYPE定义到类上
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//Retention 表示我们的注解可以用到哪些地方
//runtime >class >sources
@Retention(value = RetentionPolicy.RUNTIME)
//Documented 表示是否要将我们的注解生成在JAVAdoc中
    @Documented
//Inherited 子类可以继承父类的注解
    @Inherited
@interface MyAnnotation{
    String name();
}