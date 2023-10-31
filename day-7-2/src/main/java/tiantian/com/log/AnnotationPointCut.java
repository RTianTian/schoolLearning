package tiantian.com.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.zip.GZIPOutputStream;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* tiantian.com.Service.UserServiceImpl.*(..))")
    public void beforeAdvice(){
        System.out.println("我是前置通知，我在你前面吃了大闸蟹，是甜的");
    }
//    将这个方法标注为最终方法（通知），而且设置给那些关注点切入
    @AfterReturning("execution(* tiantian.com.Service.UserServiceImpl.*(..))")
public void afterReturning(){
        System.out.println("-------执行后我插入新功能");
    }

    @Around("execution(* tiantian.com.Service.UserServiceImpl.*(..))")
    public void Around(ProceedingJoinPoint jp)throws Throwable{
        System.out.println("----------环绕通知---执行前----");
//        正常去执行我们的业务，而我们最后返回的那个返回值就是我们的proceed
        Object proceed = jp.proceed();
        System.out.println("-------环绕通知-----执行后----");
    }
    @AfterThrowing("execution(* tiantian.com.Service.UserServiceImpl.*(..))")
    public void After(){
        System.out.println("---------我是最终通知");
    }




}
