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
		
		// Retrieve a bean from the container
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call bean method
		System.out.println(baseballCoach.getDailyWorkout());
		
		// Retrieve a bean from the container
		Coach badmintonCoach = context.getBean("badmintonCoach", Coach.class);
		
		// Call bean method
		System.out.println(badmintonCoach.getDailyWorkout());
		
		// Close the context
		context.close();
	}

}
