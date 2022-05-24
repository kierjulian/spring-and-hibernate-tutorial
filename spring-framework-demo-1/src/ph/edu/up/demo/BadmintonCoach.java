package ph.edu.up.demo;

public class BadmintonCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BadmintonCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play badminton with someone better than you";
	}

	@Override
	public String getDailyFortune() {
		return "Badminton fortune: " + fortuneService.getFortune();
	}

}
