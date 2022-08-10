package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJMSBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources(
		{
				@PropertySource("classpath:datasource.properties"),
				@PropertySource("classpath:jms.properties")
		}
)
public class PropertyConfig {
	@Value("${guru.username}")
	String username;

	@Value("${guru.password}")
	String password;

	@Value("${guru.dbUrl}")
	String dbUrl;

	@Value("${guru.jms.username}")
	String jmsUsername;

	@Value("${guru.jms.password}")
	String jmsPassword;

	@Value("${guru.jms.dbUrl}")
	String jmsDbUrl;

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
				new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource(username, password, dbUrl);
		return fakeDataSource;
	}

	@Bean
	public FakeJMSBroker fakeJMSBroker() {
		FakeJMSBroker fakeJMSBroker = new FakeJMSBroker(jmsUsername, jmsPassword, jmsDbUrl);
		return fakeJMSBroker;
	}
}