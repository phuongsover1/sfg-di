package guru.springframework.sfgdi.examplebeans;

public class FakeJMSBroker {
	private String username;
	private String password;
	private String dbUrl;

	public FakeJMSBroker(String username, String password, String dbUrl) {
		this.username = username;
		this.password = password;
		this.dbUrl = dbUrl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}
}