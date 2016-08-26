package org.javabrains.spring.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp2 {
	
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring_config2.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring_config2.xml");
		
		//Register the shut down hook for life cycle callback methods
		context.registerShutdownHook();
		
		Triangle t = (Triangle)context.getBean("triangle");
		t.draw();
		Triangle t1 = (Triangle)context.getBean("triangleval");
		t1.draw();
		
		Triangle t2 = (Triangle)context.getBean("childTriangle");
		t2.draw();
		
		Triangle t3 = (Triangle)context.getBean("triangleval");
		t1.draw();
		
		// To test the use of ApplicationContextAware & BeanNameAware
		System.out.println(t1.getBeanName());
		System.out.println(t1.getApplicationContext());
		
		//To test the bean scope
		Point pt = (Point)context.getBean("zeroPoint");
		pt.setX(12);
		pt.setY(12);
		System.out.println(pt);
		Point pt1 = (Point)context.getBean("zeroPoint");
		System.out.println(pt1);
		Point pt2 = (Point)context.getBean("zeroPoint");
		System.out.println(pt2);
	}
}
