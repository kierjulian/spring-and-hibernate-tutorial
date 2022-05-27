package ph.edu.up.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BowlingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public BowlingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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
