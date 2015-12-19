package com.anand.lect2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {


	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
		
		Square square= (Square)context.getBean("square");
		
		square.draw();

	}

}
