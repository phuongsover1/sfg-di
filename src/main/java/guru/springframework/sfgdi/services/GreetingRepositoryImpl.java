package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {
	@Override
	public String getEnglishGreeting() {
		return "Hello!";
	}

	@Override
	public String getVietnameseGreeting() {
		return "Xin chao!";
	}

	@Override
	public String getJapaneseGreeting() {
		return "こんにちは！";
	}
}