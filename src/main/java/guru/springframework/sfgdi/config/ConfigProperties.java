package guru.springframework.sfgdi.config;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Validated
@Configuration
@ConfigurationProperties(prefix = "mail")
public class ConfigProperties {
  private String hostname;
  private int port;
  private String from;
  private List<String> defaultRecipients;
  private Map<String, String> additionalHeaders;
  private Credentials credentials;

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public List<String> getDefaultRecipients() {
    return defaultRecipients;
  }

  public void setDefaultRecipients(List<String> defaultRecipients) {
    this.defaultRecipients = defaultRecipients;
  }

  public Map<String, String> getAdditionalHeaders() {
    return additionalHeaders;
  }

  public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
    this.additionalHeaders = additionalHeaders;
  }

  public Credentials getCredentials() {
    return credentials;
  }

  public void setCredentials(Credentials credentials) {
    this.credentials = credentials;
  }

  @Override
  public String toString() {
    return "ConfigProperties [hostname=" + hostname + ", port=" + port + ", from=" + from + ", defaultRecipients="
        + defaultRecipients + ", additionalHeaders=" + additionalHeaders + ", credentials=" + credentials + "]";
  }

}
