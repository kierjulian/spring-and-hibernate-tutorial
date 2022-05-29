package ph.edu.up.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach bowlingCoach = context.getBean("bowlingCoach", Coach.class);
		Coach anotherBowlingCoach = context.getBean("bowlingCoach", Coach.class);
		System.out.println(bowlingCoach == anotherBowlingCoach);
	}

}
