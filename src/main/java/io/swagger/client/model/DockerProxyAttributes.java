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
import java.util.ArrayList;
import java.util.List;

/**
 * DockerProxyAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class DockerProxyAttributes {
  /**
   * Type of Docker Index
   */
  @JsonAdapter(IndexTypeEnum.Adapter.class)
  public enum IndexTypeEnum {
    HUB("HUB"),
    
    REGISTRY("REGISTRY"),
    
    CUSTOM("CUSTOM");

    private String value;

    IndexTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IndexTypeEnum fromValue(String text) {
      for (IndexTypeEnum b : IndexTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IndexTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IndexTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IndexTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IndexTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("indexType")
  private IndexTypeEnum indexType = null;

  @SerializedName("indexUrl")
  private String indexUrl = null;

  @SerializedName("cacheForeignLayers")
  private Boolean cacheForeignLayers = null;

  @SerializedName("foreignLayerUrlWhitelist")
  private List<String> foreignLayerUrlWhitelist = null;

  public DockerProxyAttributes indexType(IndexTypeEnum indexType) {
    this.indexType = indexType;
    return this;
  }

   /**
   * Type of Docker Index
   * @return indexType
  **/
  @ApiModelProperty(example = "HUB", value = "Type of Docker Index")
  public IndexTypeEnum getIndexType() {
    return indexType;
  }

  public void setIndexType(IndexTypeEnum indexType) {
    this.indexType = indexType;
  }

  public DockerProxyAttributes indexUrl(String indexUrl) {
    this.indexUrl = indexUrl;
    return this;
  }

   /**
   * Url of Docker Index to use
   * @return indexUrl
  **/
  @ApiModelProperty(value = "Url of Docker Index to use")
  public String getIndexUrl() {
    return indexUrl;
  }

  public void setIndexUrl(String indexUrl) {
    this.indexUrl = indexUrl;
  }

  public DockerProxyAttributes cacheForeignLayers(Boolean cacheForeignLayers) {
    this.cacheForeignLayers = cacheForeignLayers;
    return this;
  }

   /**
   * Allow Nexus Repository Manager to download and cache foreign layers
   * @return cacheForeignLayers
  **/
  @ApiModelProperty(value = "Allow Nexus Repository Manager to download and cache foreign layers")
  public Boolean isCacheForeignLayers() {
    return cacheForeignLayers;
  }

  public void setCacheForeignLayers(Boolean cacheForeignLayers) {
    this.cacheForeignLayers = cacheForeignLayers;
  }

  public DockerProxyAttributes foreignLayerUrlWhitelist(List<String> foreignLayerUrlWhitelist) {
    this.foreignLayerUrlWhitelist = foreignLayerUrlWhitelist;
    return this;
  }

  public DockerProxyAttributes addForeignLayerUrlWhitelistItem(String foreignLayerUrlWhitelistItem) {
    if (this.foreignLayerUrlWhitelist == null) {
      this.foreignLayerUrlWhitelist = new ArrayList<String>();
    }
    this.foreignLayerUrlWhitelist.add(foreignLayerUrlWhitelistItem);
    return this;
  }

   /**
   * Regular expressions used to identify URLs that are allowed for foreign layer requests
   * @return foreignLayerUrlWhitelist
  **/
  @ApiModelProperty(value = "Regular expressions used to identify URLs that are allowed for foreign layer requests")
  public List<String> getForeignLayerUrlWhitelist() {
    return foreignLayerUrlWhitelist;
  }

  public void setForeignLayerUrlWhitelist(List<String> foreignLayerUrlWhitelist) {
    this.foreignLayerUrlWhitelist = foreignLayerUrlWhitelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DockerProxyAttributes dockerProxyAttributes = (DockerProxyAttributes) o;
    return Objects.equals(this.indexType, dockerProxyAttributes.indexType) &&
        Objects.equals(this.indexUrl, dockerProxyAttributes.indexUrl) &&
        Objects.equals(this.cacheForeignLayers, dockerProxyAttributes.cacheForeignLayers) &&
        Objects.equals(this.foreignLayerUrlWhitelist, dockerProxyAttributes.foreignLayerUrlWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexType, indexUrl, cacheForeignLayers, foreignLayerUrlWhitelist);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DockerProxyAttributes {\n");
    
    sb.append("    indexType: ").append(toIndentedString(indexType)).append("\n");
    sb.append("    indexUrl: ").append(toIndentedString(indexUrl)).append("\n");
    sb.append("    cacheForeignLayers: ").append(toIndentedString(cacheForeignLayers)).append("\n");
    sb.append("    foreignLayerUrlWhitelist: ").append(toIndentedString(foreignLayerUrlWhitelist)).append("\n");
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
