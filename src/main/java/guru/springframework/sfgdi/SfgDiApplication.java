package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import guru.springframework.sfgdi.config.ConfigProperties;
import guru.springframework.sfgdi.config.PropertyConfig;
import guru.springframework.sfgdi.controllers.ConstructorInjectionController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectionController;
import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJMSBroker;

@SpringBootApplication
@ComponentScan(basePackages = { "guru.springframework" })
@ConfigurationPropertiesScan("guru.springframework.sfgdi")
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = context.getBean("myController", MyController.class);

		/*
		 * I18NController i18NController = context.getBean("i18NController",
		 * I18NController.class);
		 * System.out.println("----- I18N Greeting");
		 * System.out.println(i18NController.sayHello());
		 */
		System.out.println("----- Primary ");
		System.out.println(myController.sayHello());

		System.out.println("----- Property");
		PropertyInjectedController propertyInjectedController = context.getBean("propertyInjectedController",
				PropertyInjectedController.class);
		System.out.println(propertyInjectedController.greetingService.sayGreeting());

		System.out.println("----- Setter");
		SetterInjectionController setterInjectionController = context.getBean("setterInjectionController",
				SetterInjectionController.class);
		System.out.println(setterInjectionController.sayGreeting());

		System.out.println("----- Constructor");
		ConstructorInjectionController constructorInjectionController = context
				.getBean("constructorInjectionController", ConstructorInjectionController.class);
		System.out.println(constructorInjectionController.sayGreeting());

		PropertyConfig propertyConfig = context.getBean("propertyConfig", PropertyConfig.class);

		System.out.println("propertyConfig ----");
		System.out.println(propertyConfig);
		FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);
		System.out.println("Fake Data Source ----");
		System.out.println("username: " + fakeDataSource.getUsername());
		System.out.println("password: " + fakeDataSource.getPassword());
		System.out.println("dbUrl: " + fakeDataSource.getDbUrl());

		FakeJMSBroker fakeJMSBroker = (FakeJMSBroker) context.getBean(FakeJMSBroker.class);
		System.out.println("Fake JMS Broker ----");
		System.out.println("username: " + fakeJMSBroker.getUsername());
		System.out.println("password: " + fakeJMSBroker.getPassword());
		System.out.println("dbUrl: " + fakeJMSBroker.getDbUrl());

		System.out.println("--- NESTED PROPERTIES ---");
		ConfigProperties configProperties = context.getBean("configProperties", ConfigProperties.class);
		System.out.println(configProperties);
	}

}
