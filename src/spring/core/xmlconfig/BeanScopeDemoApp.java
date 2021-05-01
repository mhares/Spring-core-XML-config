package spring.core.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring configuration file
        ClassPathXmlApplicationContext context =
                                      	new	ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");		
		
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
        
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		context.close();
		

	}

}
