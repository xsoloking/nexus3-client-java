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
import io.swagger.client.model.GroupDeployAttributes;
import io.swagger.client.model.StorageAttributes;
import java.io.IOException;

/**
 * SimpleApiGroupDeployRepository
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class SimpleApiGroupDeployRepository {
  @SerializedName("name")
  private String name = null;

  @SerializedName("online")
  private Boolean online = null;

  @SerializedName("storage")
  private StorageAttributes storage = null;

  @SerializedName("group")
  private GroupDeployAttributes group = null;

   /**
   * A unique identifier for this repository
   * @return name
  **/
  @ApiModelProperty(example = "internal", value = "A unique identifier for this repository")
  public String getName() {
    return name;
  }

   /**
   * Whether this repository accepts incoming requests
   * @return online
  **/
  @ApiModelProperty(example = "true", required = true, value = "Whether this repository accepts incoming requests")
  public Boolean isOnline() {
    return online;
  }

   /**
   * Get storage
   * @return storage
  **/
  @ApiModelProperty(required = true, value = "")
  public StorageAttributes getStorage() {
    return storage;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(required = true, value = "")
  public GroupDeployAttributes getGroup() {
    return group;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleApiGroupDeployRepository simpleApiGroupDeployRepository = (SimpleApiGroupDeployRepository) o;
    return Objects.equals(this.name, simpleApiGroupDeployRepository.name) &&
        Objects.equals(this.online, simpleApiGroupDeployRepository.online) &&
        Objects.equals(this.storage, simpleApiGroupDeployRepository.storage) &&
        Objects.equals(this.group, simpleApiGroupDeployRepository.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, online, storage, group);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleApiGroupDeployRepository {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

