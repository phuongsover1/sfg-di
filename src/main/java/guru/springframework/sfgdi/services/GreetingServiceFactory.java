package guru.springframework.sfgdi.services;

public class GreetingServiceFactory {
	private final GreetingRepository greetingRepository;

	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	public GreetingService createGreetingService(String lang) {
		switch (lang) {
			case "en":
				return new PrimaryGreetingService(greetingRepository);
			case "vn":
				return new PrimaryVietnameseGreetingService(greetingRepository);
			case "jp":
				return new PrimaryJapaneseGreetingService(greetingRepository);
			default:
				return new PrimaryVietnameseGreetingService(greetingRepository);
		}
	}
}