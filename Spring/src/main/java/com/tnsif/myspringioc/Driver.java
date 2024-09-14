package com.tnsif.myspringioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
		
public class Driver {
	
		public static void main(String[] args) {
			// TODO Auto-generaLed method stub 
			ApplicationContext c= new ClassPathXmlApplicationContext("bean.xml");
			System.out.println("config loded");
			//Jio j=new Jio();
			Sim a=c.getBean(Jio.class);
			
			a.calling();
			a.data();
	}

}
