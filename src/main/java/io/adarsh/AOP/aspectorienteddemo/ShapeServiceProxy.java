package io.adarsh.AOP.aspectorienteddemo;

import io.adarsh.AOP.aspectorienteddemo.Models.Circle;
import io.adarsh.AOP.aspectorienteddemo.Services.ShapeService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.SourceLocation;
import org.aspectj.runtime.internal.AroundClosure;

public class ShapeServiceProxy extends ShapeService implements ProceedingJoinPoint {

    @Override
    public Circle getCircle() {
        /*new ProxyAspect().shapeServiceGetterAdvice();  // @Before
        return super.getCircle();*/
        return (Circle) new ProxyAspect().aroundMethod(this);
    }

    @Override
    public void set$AroundClosure(AroundClosure aroundClosure) {

    }

    @Override
    public Object proceed() throws Throwable {
        return super.getCircle();
    }

    @Override
    public Object proceed(Object[] objects) throws Throwable {
        return null;
    }

    @Override
    public String toShortString() {
        return null;
    }

    @Override
    public String toLongString() {
        return null;
    }

    @Override
    public Object getThis() {
        return null;
    }

    @Override
    public Object getTarget() {
        return null;
    }

    @Override
    public Object[] getArgs() {
        return new Object[0];
    }

    @Override
    public Signature getSignature() {
        return null;
    }

    @Override
    public SourceLocation getSourceLocation() {
        return null;
    }

    @Override
    public String getKind() {
        return null;
    }

    @Override
    public StaticPart getStaticPart() {
        return null;
    }
}
