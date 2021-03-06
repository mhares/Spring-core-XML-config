package spring.core.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load spring configuration file
        ClassPathXmlApplicationContext context =
                                      	new	ClassPathXmlApplicationContext("applicationContext.xml");		
		
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
        
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// lets call our new method
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
		

	}

}
