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
 * ProxyAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class ProxyAttributes {
  @SerializedName("remoteUrl")
  private String remoteUrl = null;

  @SerializedName("contentMaxAge")
  private Integer contentMaxAge = null;

  @SerializedName("metadataMaxAge")
  private Integer metadataMaxAge = null;

  public ProxyAttributes remoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
    return this;
  }

   /**
   * Location of the remote repository being proxied
   * @return remoteUrl
  **/
  @ApiModelProperty(example = "https://remote.repository.com", value = "Location of the remote repository being proxied")
  public String getRemoteUrl() {
    return remoteUrl;
  }

  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
  }

  public ProxyAttributes contentMaxAge(Integer contentMaxAge) {
    this.contentMaxAge = contentMaxAge;
    return this;
  }

   /**
   * How long to cache artifacts before rechecking the remote repository (in minutes)
   * @return contentMaxAge
  **/
  @ApiModelProperty(example = "1440", required = true, value = "How long to cache artifacts before rechecking the remote repository (in minutes)")
  public Integer getContentMaxAge() {
    return contentMaxAge;
  }

  public void setContentMaxAge(Integer contentMaxAge) {
    this.contentMaxAge = contentMaxAge;
  }

  public ProxyAttributes metadataMaxAge(Integer metadataMaxAge) {
    this.metadataMaxAge = metadataMaxAge;
    return this;
  }

   /**
   * How long to cache metadata before rechecking the remote repository (in minutes)
   * @return metadataMaxAge
  **/
  @ApiModelProperty(example = "1440", required = true, value = "How long to cache metadata before rechecking the remote repository (in minutes)")
  public Integer getMetadataMaxAge() {
    return metadataMaxAge;
  }

  public void setMetadataMaxAge(Integer metadataMaxAge) {
    this.metadataMaxAge = metadataMaxAge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProxyAttributes proxyAttributes = (ProxyAttributes) o;
    return Objects.equals(this.remoteUrl, proxyAttributes.remoteUrl) &&
        Objects.equals(this.contentMaxAge, proxyAttributes.contentMaxAge) &&
        Objects.equals(this.metadataMaxAge, proxyAttributes.metadataMaxAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteUrl, contentMaxAge, metadataMaxAge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProxyAttributes {\n");
    
    sb.append("    remoteUrl: ").append(toIndentedString(remoteUrl)).append("\n");
    sb.append("    contentMaxAge: ").append(toIndentedString(contentMaxAge)).append("\n");
    sb.append("    metadataMaxAge: ").append(toIndentedString(metadataMaxAge)).append("\n");
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

