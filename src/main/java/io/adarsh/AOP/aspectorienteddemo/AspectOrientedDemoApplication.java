package io.adarsh.AOP.aspectorienteddemo;

import io.adarsh.AOP.aspectorienteddemo.Models.Circle;
import io.adarsh.AOP.aspectorienteddemo.Models.Triangle;
import io.adarsh.AOP.aspectorienteddemo.Services.ShapeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AspectOrientedDemoApplication {

	@Bean(name = "circle")
	public Circle getCircleBean() {
		return new Circle();
	}

	@Bean(name = "triangle")
	public Triangle getTriangleBean() {
		Triangle triangle = new Triangle();
		triangle.setName("Triangle name");
		return triangle;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AspectOrientedDemoApplication.class, args);
		/*Circle circle = (Circle) context.getBean("circle");
		Triangle triangle = (Triangle) context.getBean("triangle");*/
		/*ShapeService shapeService = (ShapeService) context.getBean("shapeService");*/
		/*Circle circle = (Circle) context.getBean("circle");*/
		FactoryBean factoryBean = new FactoryBean();
		ShapeService shapeService = (ShapeService) factoryBean.getBean("shapeService");
		shapeService.getCircle();
		/*System.out.println("Finally value is set to " + shapeService.getCircle().getName());*/
		/*System.out.println(shapeService.getTriangle().getName());*/
/*		System.out.println(circle.getName());
		System.out.println(triangle.getName());*/
	}

	// We achieve the AOP in spring using the OOPS concept and internally spring uses the proxy object


}



