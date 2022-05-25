package ph.edu.up.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		
		CricketCoach coach = (CricketCoach) cricketCoach;
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
		
		context.close();
	}

}
