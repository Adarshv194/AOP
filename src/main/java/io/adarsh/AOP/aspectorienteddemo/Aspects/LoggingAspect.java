package io.adarsh.AOP.aspectorienteddemo.Aspects;

import io.adarsh.AOP.aspectorienteddemo.Models.Circle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    // Proxy AOP OOPS

    /*@Pointcut("execution(* io.adarsh.AOP.aspectorienteddemo.Models.Circle.*(..))")
    public void allCircleMethods() { }

    @Before("shapeServiceGetterPointcut()")
    public void loggingShapeServiceGetterAdvice(JoinPoint joinPoint) {
        System.out.println("Shape service getter advice called");
        System.out.println(joinPoint.getSignature().getName());
    }

    @Pointcut("execution(* io.adarsh.AOP.aspectorienteddemo.Services.*.get*())")
    public void shapeServiceGetterPointcut() { }
*/
    // Custom advice annotations

    /*@Around("@annotation(io.adarsh.AOP.aspectorienteddemo.Annotations.Loggable)")
    public Object customAnnotatedLoggableAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        Object toReturn = null;
        System.out.println("Before execution... Before advice working");
        try {
            *//*if(name != null) {
                proceedingJoinPoint.proceed(new Object[]{name});
            }
            else {*//*
                toReturn = proceedingJoinPoint.proceed();
            *//*}*//*
            System.out.println("After execution... AfterReturning advice working");
        } catch (Throwable t) {
            System.out.println("After exception execution.. AfterThrowing");
        }
        return toReturn;
    }*/

    // Around :- Advice which helps us to write the code around the targeted method and
    // gives more control over the execution of the targeted method
    // we can write some code before executing the targeted method(which we usually do using @Before) and
    // according to some condition we can manage whether we have to execute the targeted method or not
    // and similarly we can write code after the execution of the targeted method(which we usually do using @AfterReturning and @AfterThrowing)

    /*@Around("allGetters() && allCircleMethods()")
    public Object aroundAdviceCircleGetters(ProceedingJoinPoint proceedingJoinPoint) {
        Object returnValue = null;
        try {
            System.out.println("Before type advice");
            returnValue = *//*(String)*//* proceedingJoinPoint.proceed();// executing the targeted method
            System.out.println("After returning type advice");
        } catch (Throwable t) {
            System.out.println("After throwing type advice");
        }

        System.out.println("After finally");@Pointcut("execution(* io.adarsh.AOP.aspectorienteddemo.Models.Circle.*(..))")
    public void allCircleMethods() { }
        return returnValue;
    }

    @Pointcut("within(io.adarsh.AOP.aspectorienteddemo.Models.Circle)") // all circle methods
    public void allCircleMethods() { }

    @Pointcut("execution(* get*())") // all getters of the application
    public void allGetters() { }

    @Pointcut("execution(io.adarsh.AOP.aspectorienteddemo.Services.*Service.*(..))")
    public void inServicesPackageToAllServiceClass() { }
*/
    // @After :- Advice which we want to execute before executing the targeted method

    // only when the targeted method gets successfully executed
    /*@AfterReturning(pointcut = "stringArgumentPointcut(name) && allMethodsOfTheApplicationPointcut()", returning = "returnValue")
    public void afterAdviceOnSuccessfullyTargetMethodExecution(String name, String returnValue) {
        System.out.println("After returning advice executed.. only when the targeted method gets successfully executed");
        System.out.println("with input value :- " + name + " and returning the :- " + returnValue);
    }*/

    /*@AfterThrowing(pointcut = "stringArgumentPointcut(name) && allMethodsOfTheApplicationPointcut()", throwing = "e")
    public void afterAdviceOnExceptionByTargetMethod(String name, Exception e) {
        System.out.println("After throwing advice executed.. only when the targeted method throws an exception");
        System.out.println("Exception object being returned is :- " + e.getMessage());
    }*/

    // @After works for when the method gets successfully executed and
    // even for when the method throws an exception
  /*  @After("stringArgumentPointcut(name) && allMethodsOfTheApplicationPointcut()")
    public void afterAdviceForAllStatus(String name) {
        System.out.println("After advice executed..  with the input to the targeted method : " + name);
    }*/

    /*@Pointcut("within(io.adarsh.AOP.aspectorienteddemo..*)")  // all the methods in the application
    public void allMethodsOfTheApplicationPointcut() { }*/

    /*@Pointcut("args(name)")  // All the methods which takes an argument
    public void stringArgumentPointcut(String name) { }*/


    // @Before :- Advice which we want to execute before executing the targeted method.

    /*@Before("stringArgumentPointcut(name) && allCircleMethods()")
    public void stringArgumentAdvice(String name) {
        System.out.println("Advice executed for string argument call with value " + name);
    }

    @Pointcut("args(name)")
    public void stringArgumentPointcut(String name) { }*/

    /*@Before("allCircleMethods()")
    public void loggingAdvice(JoinPoint joinPoint) {
        System.out.println(joinPoint.toString());
        System.out.println("Logging advice is running .. " + joinPoint.getSignature().getName() + " method");
        Circle target = (Circle) joinPoint.getTarget();
        System.out.println(target.getName());
    }*/

    // Goal is to print all the getters method of circle class using the logical operations in the pointcut

   /* @Before("allGetters() && allCircleMethods()")
    public void loggingAdvice() {
        System.out.println("Logging Advice for circle class getters only");
    }*/

   /* @Pointcut("execution(* get*(..))")       // represents all the getters of the application
    public void allGetters() {
        System.out.println("Advice execute ... all getters");
    }

    @Pointcut("within(io.adarsh.AOP.aspectorienteddemo.Models.Circle)")  // represent all the circle class methods
    public void allCircleMethods() { }*/

    // it takes the argument as a class name or an interface name so that it can be used for all the methods
    // which takes a particular arguments
    /*@Pointcut("args(can pass one or more arguments as a Class type)")
    public void allArgsMethodOfAClass() { }*/

    // within takes the argument as the class name or a wild card which describes the class name
    // using within is more readable compare to the writing code in the pointcut using the execution property
    /*@Pointcut("within(io.adarsh.AOP.aspectorienteddemo.Models.Circle)")
    public void allCircleMethods() { }*/

    // point cut expression for all the methods of a particular class
    /*@Pointcut("execution(* io.adarsh.AOP.aspectorienteddemo.Models.Circle.*(..))")
    public void allCircleMethods() { }*/

    // execution takes the input as the method name or a wild card which describes the method name
    /*@Before("allGetters()")
    public void loggingAdvice1() {
        System.out.println("Advice method1.. for all getters");
    }

    @Before("allGetters()")
    public void loggingAdvice2() {
        System.out.println("Advice method2.. for all getters");
    }

    @Pointcut("execution(* io.adarsh.AOP.aspectorienteddemo.*.get*())")
    public void allGetters() { }*/

    // for all the getters in the io.adarsh.AOP.aspectorienteddemo.* package
    /*@Before("execution(* io.adarsh.AOP.aspectorienteddemo.*.get*())")  // * will acts as a wildcard
    public void loggingAdvice() {
        System.out.println("Advice method.. for all getters");
    }*/

    // for all the join points with signature public String getName() in a particular package or in a particular class
    /*@Before("execution(public String io.adarsh.AOP.aspectorienteddemo.Models.*.getName())")
    public void loggingAdvice() {
        System.out.println("advice executed");
    }*/

    // for all the methods in the application with the joinPoint public String getName()
    /*@Before("execution(public String getName())")
    public void loggingAdvice() {
        System.out.println("Advice run.. Get method called");
    }*/
}
