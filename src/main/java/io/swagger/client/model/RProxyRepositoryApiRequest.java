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
import io.swagger.client.model.CleanupPolicyAttributes;
import io.swagger.client.model.HttpClientAttributes;
import io.swagger.client.model.NegativeCacheAttributes;
import io.swagger.client.model.ProxyAttributes;
import io.swagger.client.model.ReplicationAttributes;
import io.swagger.client.model.StorageAttributes;
import java.io.IOException;

/**
 * RProxyRepositoryApiRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class RProxyRepositoryApiRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("online")
  private Boolean online = null;

  @SerializedName("storage")
  private StorageAttributes storage = null;

  @SerializedName("cleanup")
  private CleanupPolicyAttributes cleanup = null;

  @SerializedName("proxy")
  private ProxyAttributes proxy = null;

  @SerializedName("negativeCache")
  private NegativeCacheAttributes negativeCache = null;

  @SerializedName("httpClient")
  private HttpClientAttributes httpClient = null;

  @SerializedName("routingRule")
  private String routingRule = null;

  @SerializedName("replication")
  private ReplicationAttributes replication = null;

  public RProxyRepositoryApiRequest name(String name) {
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

  public RProxyRepositoryApiRequest online(Boolean online) {
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

  public RProxyRepositoryApiRequest storage(StorageAttributes storage) {
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

  public RProxyRepositoryApiRequest cleanup(CleanupPolicyAttributes cleanup) {
    this.cleanup = cleanup;
    return this;
  }

   /**
   * Get cleanup
   * @return cleanup
  **/
  @ApiModelProperty(value = "")
  public CleanupPolicyAttributes getCleanup() {
    return cleanup;
  }

  public void setCleanup(CleanupPolicyAttributes cleanup) {
    this.cleanup = cleanup;
  }

  public RProxyRepositoryApiRequest proxy(ProxyAttributes proxy) {
    this.proxy = proxy;
    return this;
  }

   /**
   * Get proxy
   * @return proxy
  **/
  @ApiModelProperty(required = true, value = "")
  public ProxyAttributes getProxy() {
    return proxy;
  }

  public void setProxy(ProxyAttributes proxy) {
    this.proxy = proxy;
  }

  public RProxyRepositoryApiRequest negativeCache(NegativeCacheAttributes negativeCache) {
    this.negativeCache = negativeCache;
    return this;
  }

   /**
   * Get negativeCache
   * @return negativeCache
  **/
  @ApiModelProperty(required = true, value = "")
  public NegativeCacheAttributes getNegativeCache() {
    return negativeCache;
  }

  public void setNegativeCache(NegativeCacheAttributes negativeCache) {
    this.negativeCache = negativeCache;
  }

  public RProxyRepositoryApiRequest httpClient(HttpClientAttributes httpClient) {
    this.httpClient = httpClient;
    return this;
  }

   /**
   * Get httpClient
   * @return httpClient
  **/
  @ApiModelProperty(required = true, value = "")
  public HttpClientAttributes getHttpClient() {
    return httpClient;
  }

  public void setHttpClient(HttpClientAttributes httpClient) {
    this.httpClient = httpClient;
  }

  public RProxyRepositoryApiRequest routingRule(String routingRule) {
    this.routingRule = routingRule;
    return this;
  }

   /**
   * Get routingRule
   * @return routingRule
  **/
  @ApiModelProperty(value = "")
  public String getRoutingRule() {
    return routingRule;
  }

  public void setRoutingRule(String routingRule) {
    this.routingRule = routingRule;
  }

  public RProxyRepositoryApiRequest replication(ReplicationAttributes replication) {
    this.replication = replication;
    return this;
  }

   /**
   * Get replication
   * @return replication
  **/
  @ApiModelProperty(value = "")
  public ReplicationAttributes getReplication() {
    return replication;
  }

  public void setReplication(ReplicationAttributes replication) {
    this.replication = replication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RProxyRepositoryApiRequest rproxyRepositoryApiRequest = (RProxyRepositoryApiRequest) o;
    return Objects.equals(this.name, rproxyRepositoryApiRequest.name) &&
        Objects.equals(this.online, rproxyRepositoryApiRequest.online) &&
        Objects.equals(this.storage, rproxyRepositoryApiRequest.storage) &&
        Objects.equals(this.cleanup, rproxyRepositoryApiRequest.cleanup) &&
        Objects.equals(this.proxy, rproxyRepositoryApiRequest.proxy) &&
        Objects.equals(this.negativeCache, rproxyRepositoryApiRequest.negativeCache) &&
        Objects.equals(this.httpClient, rproxyRepositoryApiRequest.httpClient) &&
        Objects.equals(this.routingRule, rproxyRepositoryApiRequest.routingRule) &&
        Objects.equals(this.replication, rproxyRepositoryApiRequest.replication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, online, storage, cleanup, proxy, negativeCache, httpClient, routingRule, replication);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RProxyRepositoryApiRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    cleanup: ").append(toIndentedString(cleanup)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    negativeCache: ").append(toIndentedString(negativeCache)).append("\n");
    sb.append("    httpClient: ").append(toIndentedString(httpClient)).append("\n");
    sb.append("    routingRule: ").append(toIndentedString(routingRule)).append("\n");
    sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
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
