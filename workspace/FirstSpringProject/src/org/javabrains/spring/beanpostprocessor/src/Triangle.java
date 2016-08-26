package org.javabrains.spring.beanpostprocessor.src;

import org.javabrains.spring.src.Point;

public class Triangle {
	private int area;
	private String type;
	
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
	
	public void draw(){
		System.out.println("Drawing the "+ type +" triangle");
		System.out.println("Area is :"+ area );
		System.out.println("pointA is :"+ pointA);
		System.out.println("pointB is :"+ pointB);
		System.out.println("pointC is :"+ pointC);
	}
}
