package guru.springframework.sfgdi.services;

public class PrimaryJapaneseGreetingService implements GreetingService{
	private final GreetingRepository greetingRepository;

	public PrimaryJapaneseGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getJapaneseGreeting();
	}
}