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
import io.swagger.client.model.BlobStoreApiSoftQuota;
import io.swagger.client.model.S3BlobStoreApiBucketConfiguration;
import java.io.IOException;

/**
 * S3BlobStoreApiModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class S3BlobStoreApiModel {
  @SerializedName("name")
  private String name = null;

  @SerializedName("softQuota")
  private BlobStoreApiSoftQuota softQuota = null;

  @SerializedName("bucketConfiguration")
  private S3BlobStoreApiBucketConfiguration bucketConfiguration = null;

  @SerializedName("type")
  private String type = null;

  public S3BlobStoreApiModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the S3 blob store.
   * @return name
  **/
  @ApiModelProperty(example = "s3", required = true, value = "The name of the S3 blob store.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public S3BlobStoreApiModel softQuota(BlobStoreApiSoftQuota softQuota) {
    this.softQuota = softQuota;
    return this;
  }

   /**
   * Settings to control the soft quota.
   * @return softQuota
  **/
  @ApiModelProperty(value = "Settings to control the soft quota.")
  public BlobStoreApiSoftQuota getSoftQuota() {
    return softQuota;
  }

  public void setSoftQuota(BlobStoreApiSoftQuota softQuota) {
    this.softQuota = softQuota;
  }

  public S3BlobStoreApiModel bucketConfiguration(S3BlobStoreApiBucketConfiguration bucketConfiguration) {
    this.bucketConfiguration = bucketConfiguration;
    return this;
  }

   /**
   * The S3 specific configuration details for the S3 object that&#39;ll contain the blob store.
   * @return bucketConfiguration
  **/
  @ApiModelProperty(required = true, value = "The S3 specific configuration details for the S3 object that'll contain the blob store.")
  public S3BlobStoreApiBucketConfiguration getBucketConfiguration() {
    return bucketConfiguration;
  }

  public void setBucketConfiguration(S3BlobStoreApiBucketConfiguration bucketConfiguration) {
    this.bucketConfiguration = bucketConfiguration;
  }

   /**
   * The blob store type.
   * @return type
  **/
  @ApiModelProperty(example = "S3", value = "The blob store type.")
  public String getType() {
    return type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3BlobStoreApiModel s3BlobStoreApiModel = (S3BlobStoreApiModel) o;
    return Objects.equals(this.name, s3BlobStoreApiModel.name) &&
        Objects.equals(this.softQuota, s3BlobStoreApiModel.softQuota) &&
        Objects.equals(this.bucketConfiguration, s3BlobStoreApiModel.bucketConfiguration) &&
        Objects.equals(this.type, s3BlobStoreApiModel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, softQuota, bucketConfiguration, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3BlobStoreApiModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    softQuota: ").append(toIndentedString(softQuota)).append("\n");
    sb.append("    bucketConfiguration: ").append(toIndentedString(bucketConfiguration)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
