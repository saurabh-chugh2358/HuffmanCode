package org.javabrains.spring.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_config1.xml");
		Triangle t = (Triangle)context.getBean("triangle");
		t.draw();
		Triangle t1 = (Triangle)context.getBean("triangleval");
		t1.draw();
	}
}