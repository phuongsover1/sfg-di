package guru.springframework.sfgdi.config;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Credentials {
  private String authMethod;
  private String username;
  private String password;

  @NotBlank
  @NotNull
  private String myName;

  public String getAuthMethod() {
    return authMethod;
  }

  public void setAuthMethod(String authMethod) {
    this.authMethod = authMethod;
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

  @Override
  public String toString() {
    return "Credentials [authMethod=" + authMethod + ", username=" + username + ", password=" + password + ", myName="
        + myName + "]";
  }

  public String getMyName() {
    return myName;
  }

  public void setMyName(String myName) {
    this.myName = myName;
  }

}
