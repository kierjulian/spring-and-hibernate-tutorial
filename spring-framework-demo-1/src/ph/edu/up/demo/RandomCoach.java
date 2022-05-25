package ph.edu.up.demo;

public class RandomCoach implements Coach {
	
	private FortuneService fortuneService;

	public RandomCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do whatever you want for 30 minutes as long as it is not the same for anything you've done this week.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
