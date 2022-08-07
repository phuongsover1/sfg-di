package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectionControllerTest {
	ConstructorInjectionController controller;

	@BeforeEach
	void setUp() {
		controller = new ConstructorInjectionController(new GreetingServiceImpl());
	}

	@Test
	void sayGreeting() {
		System.out.println(controller.getGreetingService().sayGreeting());
	}
}