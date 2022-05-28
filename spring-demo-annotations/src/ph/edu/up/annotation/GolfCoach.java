package ph.edu.up.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public GolfCoach() {
		System.out.println("Default constructor called");
	}

	@Override
	public String getDailyWorkout() {
		return "Hit hole in one at least once.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("doSomeCrazyStuff: Fortune service setter.");
		this.fortuneService = fortuneService;
	}

}
