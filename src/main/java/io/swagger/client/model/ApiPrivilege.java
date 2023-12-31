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
 * ApiPrivilege
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class ApiPrivilege {
  @SerializedName("type")
  private String type = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  public ApiPrivilege type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of privilege, each type covers different portions of the system. External values supplied to this will be ignored by the system.
   * @return type
  **/
  @ApiModelProperty(value = "The type of privilege, each type covers different portions of the system. External values supplied to this will be ignored by the system.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ApiPrivilege name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the privilege.  This value cannot be changed.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the privilege.  This value cannot be changed.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiPrivilege description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApiPrivilege readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Indicates whether the privilege can be changed. External values supplied to this will be ignored by the system.
   * @return readOnly
  **/
  @ApiModelProperty(value = "Indicates whether the privilege can be changed. External values supplied to this will be ignored by the system.")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiPrivilege apiPrivilege = (ApiPrivilege) o;
    return Objects.equals(this.type, apiPrivilege.type) &&
        Objects.equals(this.name, apiPrivilege.name) &&
        Objects.equals(this.description, apiPrivilege.description) &&
        Objects.equals(this.readOnly, apiPrivilege.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, description, readOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiPrivilege {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

