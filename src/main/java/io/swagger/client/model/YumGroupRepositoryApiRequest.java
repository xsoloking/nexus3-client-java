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
import io.swagger.client.model.GroupAttributes;
import io.swagger.client.model.StorageAttributes;
import io.swagger.client.model.YumSigningRepositoriesAttributes;
import java.io.IOException;

/**
 * YumGroupRepositoryApiRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class YumGroupRepositoryApiRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("online")
  private Boolean online = null;

  @SerializedName("storage")
  private StorageAttributes storage = null;

  @SerializedName("group")
  private GroupAttributes group = null;

  @SerializedName("yumSigning")
  private YumSigningRepositoriesAttributes yumSigning = null;

  public YumGroupRepositoryApiRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A unique identifier for this repository
   * @return name
  **/
  @ApiModelProperty(example = "internal", required = true, value = "A unique identifier for this repository")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public YumGroupRepositoryApiRequest online(Boolean online) {
    this.online = online;
    return this;
  }

   /**
   * Whether this repository accepts incoming requests
   * @return online
  **/
  @ApiModelProperty(example = "true", required = true, value = "Whether this repository accepts incoming requests")
  public Boolean isOnline() {
    return online;
  }

  public void setOnline(Boolean online) {
    this.online = online;
  }

  public YumGroupRepositoryApiRequest storage(StorageAttributes storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @ApiModelProperty(required = true, value = "")
  public StorageAttributes getStorage() {
    return storage;
  }

  public void setStorage(StorageAttributes storage) {
    this.storage = storage;
  }

  public YumGroupRepositoryApiRequest group(GroupAttributes group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(required = true, value = "")
  public GroupAttributes getGroup() {
    return group;
  }

  public void setGroup(GroupAttributes group) {
    this.group = group;
  }

  public YumGroupRepositoryApiRequest yumSigning(YumSigningRepositoriesAttributes yumSigning) {
    this.yumSigning = yumSigning;
    return this;
  }

   /**
   * Get yumSigning
   * @return yumSigning
  **/
  @ApiModelProperty(value = "")
  public YumSigningRepositoriesAttributes getYumSigning() {
    return yumSigning;
  }

  public void setYumSigning(YumSigningRepositoriesAttributes yumSigning) {
    this.yumSigning = yumSigning;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    YumGroupRepositoryApiRequest yumGroupRepositoryApiRequest = (YumGroupRepositoryApiRequest) o;
    return Objects.equals(this.name, yumGroupRepositoryApiRequest.name) &&
        Objects.equals(this.online, yumGroupRepositoryApiRequest.online) &&
        Objects.equals(this.storage, yumGroupRepositoryApiRequest.storage) &&
        Objects.equals(this.group, yumGroupRepositoryApiRequest.group) &&
        Objects.equals(this.yumSigning, yumGroupRepositoryApiRequest.yumSigning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, online, storage, group, yumSigning);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class YumGroupRepositoryApiRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    yumSigning: ").append(toIndentedString(yumSigning)).append("\n");
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

