package org.javabrains.spring.shape.src;

import org.javabrains.spring.src.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;

public class Circle implements Shape{
	Point center;
	private MessageSource messageSource;
	

	public Point getCenter() {
		return center;
	}

	@Required
	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public void draw() {
		System.out.println("Circle is being drawn");
		System.out.println(center);
		System.out.println(this.messageSource.getMessage("drawing.point", new Object [] {center.getX(),center.getY()}, "Default Message", null));
	}
}
