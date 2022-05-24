package ph.edu.up.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	
	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve a bean from the container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		
		// Call bean method
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());
		
		// Retrieve a bean from the container
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		
		// Call bean method
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyFortune());
		
		// Retrieve a bean from the container
		Coach badmintonCoach = context.getBean("badmintonCoach", Coach.class);
		
		// Call bean method
		System.out.println(badmintonCoach.getDailyWorkout());
		System.out.println(badmintonCoach.getDailyFortune());
		
		// Close the context
		context.close();
	}

}
