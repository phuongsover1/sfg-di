package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectionController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = context.getBean("myController", MyController.class);
		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("----- Property");
		PropertyInjectedController propertyInjectedController = context.getBean("propertyInjectedController", PropertyInjectedController.class);
		System.out.println(propertyInjectedController.greetingService.sayGreeting());


		System.out.println("----- Setter");
		SetterInjectionController setterInjectionController = context.getBean("setterInjectionController", SetterInjectionController.class);
		System.out.println(setterInjectionController.sayGreeting());


		System.out.println("----- Constructor");
		ConstructorInjectionController constructorInjectionController = context.getBean("constructorInjectionController", ConstructorInjectionController.class);
		System.out.println(constructorInjectionController.sayGreeting());
	}


}