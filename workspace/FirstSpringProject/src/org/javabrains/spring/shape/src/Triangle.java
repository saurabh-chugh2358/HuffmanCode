package org.javabrains.spring.shape.src;

import org.javabrains.spring.src.Point;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangle implements Shape{
	Point pointA;
	Point pointB;
	Point pointC;

	public Point getPointA() {
		return pointA;
	}
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	
	@Autowired
	@Qualifier("triangleRelated")
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	
	@Resource(name="point2")
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public void draw() {
		System.out.println("Triangle is being drawn");
		System.out.println(pointA);
		System.out.println(pointB);
		System.out.println(pointC);
	}
	
	@PostConstruct
	public void myInit(){
		System.out.println("Initializing method for Triangle");
	}
	
	@PreDestroy
	public void myDestroy(){
		System.out.println("Destroy method for Triangle");
	}
}
