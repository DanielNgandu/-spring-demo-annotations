package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	
	//private fields
	//apply dependency injection to field

	
//	//this is a constructor dependency injection
//	@Autowired
//	public AnnotationDemoApp(FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}

	
	//no-args constructor
	public AnnotationDemoApp() {
		// TODO Auto-generated constructor stub
	}

	
//	//setter dependency injection
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load config file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//retrieve bean from spring container
				Coach theCoach = context.getBean("tennisCoach", Coach.class);
				SwimCoach theCoach1 = context.getBean("swimCoach", SwimCoach.class);

				
//				System.out.println(theCoach.getDailyWorkout());
//				System.out.println(theCoach.getDailyFortune());
				
				//get swim guys
				System.out.println(theCoach1.getDailyFortune());

				System.out.println(theCoach1.getEmail());

				
				context.close();

	}

}
