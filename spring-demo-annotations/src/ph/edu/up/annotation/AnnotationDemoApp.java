package ph.edu.up.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		
		Coach swimmingCoach = context.getBean("swimmingCoach", Coach.class);
		System.out.println(swimmingCoach.getDailyWorkout());
		
		Coach bowlingCoach = context.getBean("bowlingCoach", Coach.class);
		System.out.println(bowlingCoach.getDailyWorkout());
		System.out.println(bowlingCoach.getDailyFortune());
		
		context.close();
	}

}
