package ph.edu.up.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach randomCoach = context.getBean("randomCoach", Coach.class);
		System.out.println(randomCoach.getDailyWorkout());
		System.out.println(randomCoach.getDailyFortune());
		context.close();
	}

}
