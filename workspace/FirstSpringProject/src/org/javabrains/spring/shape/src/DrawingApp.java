package org.javabrains.spring.shape.src;

import org.javabrains.spring.shape.src.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_config4.xml");
		//context.registerShutdownHook();
		Shape s1 = (Circle) context.getBean("circle");
		s1.draw();
		
		Shape s2 = (Triangle) context.getBean("triangle");
		s2.draw();
		
		Shape s3 = (Rectangle) context.getBean("rectangle");
		s3.draw();
		
		String msg = context.getMessage("greeting", null, "Default Greeting", null);
		System.out.println(msg);
		String err = context.getMessage("error1", null, "Default Error", null);
		System.out.println(err);

		Circle s4 = (Circle) context.getBean("circle");
		System.out.println(s4.getMessageSource().getMessage("greeting", null, "Default Message", null));
		System.out.println(s4.getMessageSource().getMessage("drawing.point", new Object[] {s4.getCenter().getX(),s4.getCenter().getY()}, "Default Message", null));
	}
}