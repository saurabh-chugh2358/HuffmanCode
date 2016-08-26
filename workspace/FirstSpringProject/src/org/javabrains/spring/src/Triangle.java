package org.javabrains.spring.src;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean{
	private int area;
	private String type;

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private ApplicationContext context = null;
	private String beanName;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Triangle() {
		super();
	}

	public Triangle(int area, String type) {
		super();
		this.area = area;
		this.type = type;
	}

	public Triangle(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getArea() {
		return area;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
	
	public Triangle(int area, String type, Point pointA, Point pointB,
			Point pointC) {
		super();
		this.area = area;
		this.type = type;
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public void draw(){
		System.out.println("Drawing the "+ type +" triangle");
		System.out.println("Area is :"+ area );
		System.out.println("pointA is :"+ pointA);
		System.out.println("pointB is :"+ pointB);
		System.out.println("pointC is :"+ pointC);
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		this.beanName = beanName;
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		// TODO Auto-generated method stub
		this.context = context;
	}
	
	public String getBeanName() {
		// TODO Auto-generated method stub
		return this.beanName;
	}
	
	public ApplicationContext getApplicationContext()
			throws BeansException {
		// TODO Auto-generated method stub
		return this.context;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Disposable bean destroy method being called for Triangle " + beanName);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initializing bean init method being called for Triangle "+beanName);
	}
	
	public void myInit(){
		System.out.println("myInit method being called for Triangle "+beanName);
	}
	
	public void cleanUp(){
		System.out.println("cleanUp method being called for Triangle " + beanName);
	}
}