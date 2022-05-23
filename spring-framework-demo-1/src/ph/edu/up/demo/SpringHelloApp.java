package ph.edu.up.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	
	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve a bean from the container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		// Call bean method
		System.out.println(myCoach.getDailyWorkout());
		
		// Close the context
		context.close();
	}

}
