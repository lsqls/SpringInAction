package com.lbs.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


@Aspect
@Component
public class BaseBeanAspect {
    private Logger logger = LoggerFactory.getLogger(BaseBeanAspect.class);

    HashSet<String> recordAuthors=new HashSet<>();

    @Pointcut("execution(* com.lbs.aop.*.*(..))")
    public void pointCut(){ }


    /**
     * 方法执行前的通知
     */
    @Before("pointCut()")
    public void beforeInvoke(){
        logger.debug("方法执行前");
    }
    /**
     * 方法执行后的通知
     */
    @After("pointCut()")
    public void afterInvoke(){
        logger.debug("方法执行后");
    }

    /**
     * 方法执行返回后的通知
     */
    @AfterReturning("pointCut()")
    public void afterReturning(){
        logger.debug("==================方法执行完成");
    }

    /**
     * 方法抛出异常的通知
     */
    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        logger.debug("==================方法执行报错");
    }

    @Around("pointCut()")
    public void aroundInvoke(ProceedingJoinPoint jp){
        try {
            logger.debug("=====================环绕执行方法开始");
            Signature signature = jp.getSignature();
            String methodName = signature.getName();
            MethodSignature methodSignature = (MethodSignature) signature;
            logger.debug("方法名:{}",methodName);
            List<Object> args = Arrays.asList(jp.getArgs());
            logger.debug("参数列表：{}",args);
            if(methodName.equals("addSong")){
                String author=String.valueOf( args.get(0));
                recordAuthors.add(author);
                logger.debug("已经记录在册的作者"+recordAuthors.toString());
            }
            Class<?> returnType = methodSignature.getMethod().getReturnType();
            logger.debug("方法返回类型：{}",returnType);
            Object proceed = jp.proceed();
            logger.debug("======================环绕执行方法结束，方法执行结果:{}",proceed);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}