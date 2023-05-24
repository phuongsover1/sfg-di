package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJMSBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ConfigurationProperties(prefix = "guru")
@Configuration
@PropertySource({ "classpath:datasource.properties", "classpath:application.properties" })
public class PropertyConfig {
	String username;

	String password;

	String dbUrl;

	@Value("${user.name}")
	String name;
	@Value("${user.lastName}")
	String lastName;

	@Value("${guru.jms.username}")
	String jmsUsername;

	@Value("${guru.jms.password}")
	String jmsPassword;

	@Value("${guru.jms.dbUrl}")
	String jmsDbUrl;

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource(username, password, dbUrl);
		return fakeDataSource;
	}

	@Override
	public String toString() {
		return "PropertyConfig [username=" + username + ", password=" + password + ", dbUrl=" + dbUrl + ", name=" + name
				+ ", lastName=" + lastName + ", jmsUsername=" + jmsUsername + ", jmsPassword=" + jmsPassword + ", jmsDbUrl="
				+ jmsDbUrl + "]";
	}

	@Bean
	public FakeJMSBroker fakeJMSBroker() {
		FakeJMSBroker fakeJMSBroker = new FakeJMSBroker(jmsUsername, jmsPassword, jmsDbUrl);
		return fakeJMSBroker;
	}
}