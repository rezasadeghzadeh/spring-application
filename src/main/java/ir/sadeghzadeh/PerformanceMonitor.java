package ir.sadeghzadeh;

import ir.sadeghzadeh.utils.LogUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by reza on 9/20/15.
 */
@Aspect
@Component
public class PerformanceMonitor {

    @Pointcut("within(ir.sadeghzadeh..*)")
    public void performance(){

    }


    @Before("execution(* ir.sadeghzadeh.HelloService.*(..))")
    public void logOnEnter(){
        LogUtils.i("performance monitoring", new Date().toString());
    }

    @After("execution(* ir.sadeghzadeh.HelloService.*(..))")
    public void logOnEnter2(){
        LogUtils.i("performance monitoring", new Date().toString());
    }

}
