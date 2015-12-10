package com.anand.myclasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {
	
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      Setter_getter obj = (Setter_getter) context.getBean("helloWorld");

      obj.getmessage();
   }
}