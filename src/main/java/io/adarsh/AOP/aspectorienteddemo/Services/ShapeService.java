package io.adarsh.AOP.aspectorienteddemo.Services;

import io.adarsh.AOP.aspectorienteddemo.Annotations.Loggable;
import io.adarsh.AOP.aspectorienteddemo.Models.Circle;
import io.adarsh.AOP.aspectorienteddemo.Models.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShapeService {

    @Autowired
    private Circle circle;
    @Autowired
    private Triangle triangle;

    /*public ShapeService() {
    }

    public ShapeService(Circle circle) {
        System.out.println("Shape circle constructor called");
        this.circle = circle;
    }

    public ShapeService(Circle circle, Triangle triangle) {
        System.out.println("Shape circle and triangle constructor called");
        this.circle = circle;
        this.triangle = triangle;
    }

    public ShapeService(Triangle triangle) {
        System.out.println("Shape triangle constructor called");
        this.triangle = triangle;
    }*/

    @Loggable
    public Circle getCircle() {
        System.out.println("Shape service getter called");
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        System.out.println("ShapeService triangle getter called");
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
