package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
	private final GreetingService greetingService;

	public ConstructorInjectionController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public GreetingService getGreetingService() {
		return greetingService;
	}

	public String sayGreeting() {
		return greetingService.sayGreeting();
	}
}