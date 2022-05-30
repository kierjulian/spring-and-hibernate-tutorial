package ph.edu.up.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BowlingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public BowlingCoach(@Qualifier("RESTFortuneService") FortuneService fortuneService) {
		System.out.println("BowlingCoach: Inside the constructor");
		this.fortuneService = fortuneService;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("BowlingCoach: Initializing");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("BowlingCoach: Destruction");
	}

	@Override
	public String getDailyWorkout() {
		return "Score 10 strikes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
