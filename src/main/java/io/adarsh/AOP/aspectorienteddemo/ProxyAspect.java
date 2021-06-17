package io.adarsh.AOP.aspectorienteddemo;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProxyAspect {

    public void shapeServiceGetterAdvice() {
        System.out.println("Shape service getter advice invoked");
    }

    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
        Object toReturn = null;
        System.out.println("@Before code");
        try {
            toReturn = proceedingJoinPoint.proceed();
            System.out.println("@After code");
        } catch (Throwable t) {
            System.out.println(" ");
        }
        return toReturn;
    }
}
