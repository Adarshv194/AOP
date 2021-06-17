package io.adarsh.AOP.aspectorienteddemo;

import io.adarsh.AOP.aspectorienteddemo.Models.Circle;
import io.adarsh.AOP.aspectorienteddemo.Models.Triangle;
import io.adarsh.AOP.aspectorienteddemo.Services.ShapeService;

public class FactoryBean {

    public Object getBean(String name) {
        if(name.equals("shapeService")) return new ShapeServiceProxy();
        if(name.equals("circle")) return new Circle();
        if(name.equals("triangle")) return new Triangle();
        return null;
    }
}
