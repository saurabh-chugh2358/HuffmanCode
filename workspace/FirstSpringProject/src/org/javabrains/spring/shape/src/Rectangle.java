package org.javabrains.spring.shape.src;

import javax.annotation.Resource;

import org.javabrains.spring.src.Point;
import org.springframework.stereotype.Component;

@Component("rectangle")
public class Rectangle implements Shape{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	
	public Point getPointA() {
		return pointA;
	}
	@Resource(name="zeroPt")
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	@Resource(name="point1")
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	@Resource(name="center")
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public Point getPointD() {
		return pointD;
	}
	@Resource(name="point2")
	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}
	@Override
	public void draw() {
		System.out.println("Rectangle is drawn");
		System.out.println(pointA);
		System.out.println(pointB);
		System.out.println(pointC);
		System.out.println(pointD);
		
		Shape s = new Shape(){

			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("It is from anonymour inner class of " );
				System.out.println("A".compareTo("B"));
				System.out.println("A".compareTo("Z"));
				System.out.println("A".compareTo("A"));
			}
		};
		System.out.println(this.getClass().getName());
		System.out.println(s.getClass().getName());
		s.draw();
	}
	

}
