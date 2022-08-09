package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework"})
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = context.getBean("myController", MyController.class);

		I18NController i18NController = context.getBean("i18NController", I18NController.class);
		System.out.println("----- I18N Greeting");
		System.out.println(i18NController.sayHello());

		System.out.println("----- Primary ");
		System.out.println(myController.sayHello());

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