package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl();

	}

	@Test
	void getGreeting() {
		System.out.println(controller.greetingService.sayGreeting());
	}
}