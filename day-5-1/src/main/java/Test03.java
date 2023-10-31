import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//@interface 自定义注解
public class Test03 {
//    如果注解没有默认值，则必须赋值，如果有默认值，则不需要加参数
    @MyAnnotation(name="秦疆")
    public void test(){}
//      @MyAnnotation3这个注解 参数是value，所以在这不用写属性
    @MyAnnotation3("天天")
    public void test3(){}
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
//    注解的参数：参数类型+参数名 ()
    String name() default "";
    int age() default 0;
    int id() default -1;//如果默认值为-1，代表找不到
    String[] schools() default {"两部开源","清华大学"};

}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    String value();
}