package ph.edu.up.annotation;

public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Jog 5 soccer fields";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
