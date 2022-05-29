package ph.edu.up.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BowlingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public BowlingCoach(@Qualifier("RESTFortuneService") FortuneService fortuneService) {
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
