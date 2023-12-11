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
 * BlobStoreApiSoftQuota
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class BlobStoreApiSoftQuota {
  /**
   * The type to use such as spaceRemainingQuota, or spaceUsedQuota
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SPACEREMAININGQUOTA("spaceRemainingQuota"),
    
    SPACEUSEDQUOTA("spaceUsedQuota");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("limit")
  private Long limit = null;

  public BlobStoreApiSoftQuota type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type to use such as spaceRemainingQuota, or spaceUsedQuota
   * @return type
  **/
  @ApiModelProperty(value = "The type to use such as spaceRemainingQuota, or spaceUsedQuota")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BlobStoreApiSoftQuota limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The limit in MB.
   * minimum: 0
   * @return limit
  **/
  @ApiModelProperty(value = "The limit in MB.")
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlobStoreApiSoftQuota blobStoreApiSoftQuota = (BlobStoreApiSoftQuota) o;
    return Objects.equals(this.type, blobStoreApiSoftQuota.type) &&
        Objects.equals(this.limit, blobStoreApiSoftQuota.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlobStoreApiSoftQuota {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
