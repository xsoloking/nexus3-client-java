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
 * AnonymousAccessSettingsXO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class AnonymousAccessSettingsXO {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("realmName")
  private String realmName = null;

  public AnonymousAccessSettingsXO enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether or not Anonymous Access is enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "Whether or not Anonymous Access is enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AnonymousAccessSettingsXO userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The username of the anonymous account
   * @return userId
  **/
  @ApiModelProperty(value = "The username of the anonymous account")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AnonymousAccessSettingsXO realmName(String realmName) {
    this.realmName = realmName;
    return this;
  }

   /**
   * The name of the authentication realm for the anonymous account
   * @return realmName
  **/
  @ApiModelProperty(value = "The name of the authentication realm for the anonymous account")
  public String getRealmName() {
    return realmName;
  }

  public void setRealmName(String realmName) {
    this.realmName = realmName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnonymousAccessSettingsXO anonymousAccessSettingsXO = (AnonymousAccessSettingsXO) o;
    return Objects.equals(this.enabled, anonymousAccessSettingsXO.enabled) &&
        Objects.equals(this.userId, anonymousAccessSettingsXO.userId) &&
        Objects.equals(this.realmName, anonymousAccessSettingsXO.realmName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, userId, realmName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnonymousAccessSettingsXO {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    realmName: ").append(toIndentedString(realmName)).append("\n");
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
