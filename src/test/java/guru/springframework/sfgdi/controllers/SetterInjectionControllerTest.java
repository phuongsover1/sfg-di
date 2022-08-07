package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionControllerTest {
	SetterInjectionController controller;

	@BeforeEach
	void setUp() {
		controller = new SetterInjectionController();
		controller.setGreetingService(new ConstructorInjectedGreetingService());
	}

	@Test
	void setGreetingService() {
		System.out.println(controller.sayGreeting());
	}
}