package ph.edu.up.annotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private final String[] randomArray = {"You will be lucky today!", 
			"THIS WILL BE YOUR WORST DAY", 
			"Meh"};

	@Override
	public String getFortune() {
		Random random = new Random();
		int index = random.nextInt(randomArray.length);
		return randomArray[index];
	}

}
