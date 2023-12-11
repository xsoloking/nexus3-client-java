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
 * RawAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class RawAttributes {
  /**
   * Content Disposition
   */
  @JsonAdapter(ContentDispositionEnum.Adapter.class)
  public enum ContentDispositionEnum {
    INLINE("INLINE"),
    
    ATTACHMENT("ATTACHMENT");

    private String value;

    ContentDispositionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContentDispositionEnum fromValue(String text) {
      for (ContentDispositionEnum b : ContentDispositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ContentDispositionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContentDispositionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContentDispositionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContentDispositionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("contentDisposition")
  private ContentDispositionEnum contentDisposition = null;

  public RawAttributes contentDisposition(ContentDispositionEnum contentDisposition) {
    this.contentDisposition = contentDisposition;
    return this;
  }

   /**
   * Content Disposition
   * @return contentDisposition
  **/
  @ApiModelProperty(example = "ATTACHMENT", value = "Content Disposition")
  public ContentDispositionEnum getContentDisposition() {
    return contentDisposition;
  }

  public void setContentDisposition(ContentDispositionEnum contentDisposition) {
    this.contentDisposition = contentDisposition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawAttributes rawAttributes = (RawAttributes) o;
    return Objects.equals(this.contentDisposition, rawAttributes.contentDisposition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentDisposition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawAttributes {\n");
    
    sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
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

