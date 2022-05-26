package ph.edu.up.annotation;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do 20 pool laps";
	}

}
