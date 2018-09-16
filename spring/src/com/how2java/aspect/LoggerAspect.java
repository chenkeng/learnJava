package com.how2java.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


/**
 * @Auther: superhan
 * @Contact: chenchaohan@live.com
 * @Date: 2018/9/16 17:06
 * @Description:
 */

@Aspect
@Component
public class LoggerAspect {

    @Around(value = "execution(* com.how2java.service.ProductService.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object=joinPoint.proceed();
        System.out.println("end log:"+ joinPoint.getSignature().getName());
        return object;
    }
}
