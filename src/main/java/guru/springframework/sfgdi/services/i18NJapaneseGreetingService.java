package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("JP")
@Service("i18NService")
public class i18NJapaneseGreetingService implements GreetingService{
	@Override
	public String sayGreeting() {
		return "こんにちは！ - JP";
	}
}