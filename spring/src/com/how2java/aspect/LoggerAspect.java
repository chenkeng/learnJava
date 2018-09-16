package com.how2java.aspect;
import org.aspectj.lang.ProceedingJoinPoint;


/**
 * @Auther: superhan
 * @Contact: chenchaohan@live.com
 * @Date: 2018/9/16 17:06
 * @Description:
 */
public class LoggerAspect {
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object=joinPoint.proceed();
        System.out.println("end log:"+ joinPoint.getSignature().getName());
        return object;
    }
}
