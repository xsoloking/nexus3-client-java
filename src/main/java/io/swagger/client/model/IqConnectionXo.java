/*
 * Nexus Repository Manager REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.63.0-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IqConnectionXo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class IqConnectionXo {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("showLink")
  private Boolean showLink = null;

  @SerializedName("url")
  private String url = null;

  /**
   * Authentication method
   */
  @JsonAdapter(AuthenticationTypeEnum.Adapter.class)
  public enum AuthenticationTypeEnum {
    USER("USER"),
    
    PKI("PKI");

    private String value;

    AuthenticationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthenticationTypeEnum fromValue(String text) {
      for (AuthenticationTypeEnum b : AuthenticationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthenticationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthenticationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("authenticationType")
  private AuthenticationTypeEnum authenticationType = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("useTrustStoreForUrl")
  private Boolean useTrustStoreForUrl = null;

  @SerializedName("timeoutSeconds")
  private Integer timeoutSeconds = null;

  @SerializedName("properties")
  private String properties = null;

  @SerializedName("failOpenModeEnabled")
  private Boolean failOpenModeEnabled = null;

  public IqConnectionXo enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether to use Sonatype Repository Firewall
   * @return enabled
  **/
  @ApiModelProperty(value = "Whether to use Sonatype Repository Firewall")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public IqConnectionXo showLink(Boolean showLink) {
    this.showLink = showLink;
    return this;
  }

   /**
   * Show Sonatype Repository Firewall link in Browse menu when server is enabled
   * @return showLink
  **/
  @ApiModelProperty(value = "Show Sonatype Repository Firewall link in Browse menu when server is enabled")
  public Boolean isShowLink() {
    return showLink;
  }

  public void setShowLink(Boolean showLink) {
    this.showLink = showLink;
  }

  public IqConnectionXo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The address of your Sonatype Repository Firewall
   * @return url
  **/
  @ApiModelProperty(value = "The address of your Sonatype Repository Firewall")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public IqConnectionXo authenticationType(AuthenticationTypeEnum authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * Authentication method
   * @return authenticationType
  **/
  @ApiModelProperty(required = true, value = "Authentication method")
  public AuthenticationTypeEnum getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(AuthenticationTypeEnum authenticationType) {
    this.authenticationType = authenticationType;
  }

  public IqConnectionXo username(String username) {
    this.username = username;
    return this;
  }

   /**
   * User with access to Sonatype Repository Firewall
   * @return username
  **/
  @ApiModelProperty(value = "User with access to Sonatype Repository Firewall")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public IqConnectionXo password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Credentials for the Sonatype Repository Firewall User
   * @return password
  **/
  @ApiModelProperty(value = "Credentials for the Sonatype Repository Firewall User")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public IqConnectionXo useTrustStoreForUrl(Boolean useTrustStoreForUrl) {
    this.useTrustStoreForUrl = useTrustStoreForUrl;
    return this;
  }

   /**
   * Use certificates stored in the Nexus Repository Manager truststore to connect to Sonatype Repository Firewall
   * @return useTrustStoreForUrl
  **/
  @ApiModelProperty(value = "Use certificates stored in the Nexus Repository Manager truststore to connect to Sonatype Repository Firewall")
  public Boolean isUseTrustStoreForUrl() {
    return useTrustStoreForUrl;
  }

  public void setUseTrustStoreForUrl(Boolean useTrustStoreForUrl) {
    this.useTrustStoreForUrl = useTrustStoreForUrl;
  }

  public IqConnectionXo timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Seconds to wait for activity before stopping and retrying the connection. Leave blank to use the globally defined HTTP timeout.
   * minimum: 1
   * maximum: 3600
   * @return timeoutSeconds
  **/
  @ApiModelProperty(value = "Seconds to wait for activity before stopping and retrying the connection. Leave blank to use the globally defined HTTP timeout.")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }

  public IqConnectionXo properties(String properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Additional properties to configure for Sonatype Repository Firewall
   * @return properties
  **/
  @ApiModelProperty(value = "Additional properties to configure for Sonatype Repository Firewall")
  public String getProperties() {
    return properties;
  }

  public void setProperties(String properties) {
    this.properties = properties;
  }

  public IqConnectionXo failOpenModeEnabled(Boolean failOpenModeEnabled) {
    this.failOpenModeEnabled = failOpenModeEnabled;
    return this;
  }

   /**
   * Allow by default when quarantine is enabled and the IQ connection fails
   * @return failOpenModeEnabled
  **/
  @ApiModelProperty(value = "Allow by default when quarantine is enabled and the IQ connection fails")
  public Boolean isFailOpenModeEnabled() {
    return failOpenModeEnabled;
  }

  public void setFailOpenModeEnabled(Boolean failOpenModeEnabled) {
    this.failOpenModeEnabled = failOpenModeEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IqConnectionXo iqConnectionXo = (IqConnectionXo) o;
    return Objects.equals(this.enabled, iqConnectionXo.enabled) &&
        Objects.equals(this.showLink, iqConnectionXo.showLink) &&
        Objects.equals(this.url, iqConnectionXo.url) &&
        Objects.equals(this.authenticationType, iqConnectionXo.authenticationType) &&
        Objects.equals(this.username, iqConnectionXo.username) &&
        Objects.equals(this.password, iqConnectionXo.password) &&
        Objects.equals(this.useTrustStoreForUrl, iqConnectionXo.useTrustStoreForUrl) &&
        Objects.equals(this.timeoutSeconds, iqConnectionXo.timeoutSeconds) &&
        Objects.equals(this.properties, iqConnectionXo.properties) &&
        Objects.equals(this.failOpenModeEnabled, iqConnectionXo.failOpenModeEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, showLink, url, authenticationType, username, password, useTrustStoreForUrl, timeoutSeconds, properties, failOpenModeEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IqConnectionXo {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    showLink: ").append(toIndentedString(showLink)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    useTrustStoreForUrl: ").append(toIndentedString(useTrustStoreForUrl)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    failOpenModeEnabled: ").append(toIndentedString(failOpenModeEnabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

