package ph.edu.up.demo;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService {
	
	private final String[] randomFortunes = {"You will have a great day", "You will fail today", "You will do okay today"};

	@Override
	public String getFortune() {
		int randomInt = ThreadLocalRandom.current().nextInt(0, 3);
		return randomFortunes[randomInt];
	}

}
