package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.GreetingRepository;
import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.GreetingServiceFactory;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
		return new GreetingServiceFactory(greetingRepository);
	}


	@Bean
	@Primary
	@Profile("en")
	GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("en");
	}

	@Bean
	@Primary
	@Profile({"vn", "default"})
	GreetingService primaryVietnameseGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("vn");
	}

	@Bean
	@Primary
	@Profile("jp")
	GreetingService primaryJapaneseGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("jp");
	}
}