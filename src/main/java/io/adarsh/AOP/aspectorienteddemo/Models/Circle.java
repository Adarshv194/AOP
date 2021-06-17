package io.adarsh.AOP.aspectorienteddemo.Models;

import io.adarsh.AOP.aspectorienteddemo.Annotations.Loggable;
import org.springframework.stereotype.Component;

public class Circle {
    private String name;

    public String getName() {
        System.out.println("circle getter called");
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Circle setter called");
        throw new RuntimeException("Runtime exception being thrown");
    }

    @Loggable
    public String setNameAndReturn(String name) {
        this.name = name;
        System.out.println(" Circle setNameAndReturn called with value " + name);
        return name;
    }
}
