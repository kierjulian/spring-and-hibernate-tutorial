package ph.edu.up.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		// Load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve bean
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		Coach newTrackCoach = context.getBean("trackCoach", Coach.class);
		System.out.println(trackCoach == (newTrackCoach));
		
		context.close();
	}

}
