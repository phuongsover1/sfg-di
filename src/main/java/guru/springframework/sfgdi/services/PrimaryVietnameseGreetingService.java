package guru.springframework.sfgdi.services;

public class PrimaryVietnameseGreetingService implements GreetingService{
	private final GreetingRepository greetingRepository;

	public PrimaryVietnameseGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getVietnameseGreeting();
	}
}