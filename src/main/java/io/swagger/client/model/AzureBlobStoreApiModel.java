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
import io.swagger.client.model.AzureBlobStoreApiBucketConfiguration;
import io.swagger.client.model.BlobStoreApiSoftQuota;
import java.io.IOException;

/**
 * AzureBlobStoreApiModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class AzureBlobStoreApiModel {
  @SerializedName("name")
  private String name = null;

  @SerializedName("softQuota")
  private BlobStoreApiSoftQuota softQuota = null;

  @SerializedName("bucketConfiguration")
  private AzureBlobStoreApiBucketConfiguration bucketConfiguration = null;

  public AzureBlobStoreApiModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Azure blob store.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the Azure blob store.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AzureBlobStoreApiModel softQuota(BlobStoreApiSoftQuota softQuota) {
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

  public AzureBlobStoreApiModel bucketConfiguration(AzureBlobStoreApiBucketConfiguration bucketConfiguration) {
    this.bucketConfiguration = bucketConfiguration;
    return this;
  }

   /**
   * The Azure specific configuration details for the Azure object that&#39;ll contain the blob store.
   * @return bucketConfiguration
  **/
  @ApiModelProperty(required = true, value = "The Azure specific configuration details for the Azure object that'll contain the blob store.")
  public AzureBlobStoreApiBucketConfiguration getBucketConfiguration() {
    return bucketConfiguration;
  }

  public void setBucketConfiguration(AzureBlobStoreApiBucketConfiguration bucketConfiguration) {
    this.bucketConfiguration = bucketConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureBlobStoreApiModel azureBlobStoreApiModel = (AzureBlobStoreApiModel) o;
    return Objects.equals(this.name, azureBlobStoreApiModel.name) &&
        Objects.equals(this.softQuota, azureBlobStoreApiModel.softQuota) &&
        Objects.equals(this.bucketConfiguration, azureBlobStoreApiModel.bucketConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, softQuota, bucketConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureBlobStoreApiModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    softQuota: ").append(toIndentedString(softQuota)).append("\n");
    sb.append("    bucketConfiguration: ").append(toIndentedString(bucketConfiguration)).append("\n");
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
