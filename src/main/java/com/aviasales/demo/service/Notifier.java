package com.aviasales.demo.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Notifier {

    @Pointcut("@annotation(com.aviasales.demo.annotation.Loggable)")
    public void log(){}

    @After("log()")
    public void logAfter(JoinPoint point){
        System.out.println("Вы успешно преобрели билет ");
    }

    @AfterThrowing("log()")
    public void logAfterThrownig(JoinPoint point){
        System.out.println("Упали с ошибкой в методе " + point.getSignature().getName() + "()");
    }

}
