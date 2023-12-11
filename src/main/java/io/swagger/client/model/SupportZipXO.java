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
 * SupportZipXO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class SupportZipXO {
  @SerializedName("file")
  private String file = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("size")
  private String size = null;

  @SerializedName("truncated")
  private Boolean truncated = null;

  public SupportZipXO file(String file) {
    this.file = file;
    return this;
  }

   /**
   * Get file
   * @return file
  **/
  @ApiModelProperty(value = "")
  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public SupportZipXO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SupportZipXO size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public SupportZipXO truncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

   /**
   * Get truncated
   * @return truncated
  **/
  @ApiModelProperty(value = "")
  public Boolean isTruncated() {
    return truncated;
  }

  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportZipXO supportZipXO = (SupportZipXO) o;
    return Objects.equals(this.file, supportZipXO.file) &&
        Objects.equals(this.name, supportZipXO.name) &&
        Objects.equals(this.size, supportZipXO.size) &&
        Objects.equals(this.truncated, supportZipXO.truncated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, name, size, truncated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportZipXO {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
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

