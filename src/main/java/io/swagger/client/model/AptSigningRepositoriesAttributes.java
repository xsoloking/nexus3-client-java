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
 * AptSigningRepositoriesAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class AptSigningRepositoriesAttributes {
  @SerializedName("keypair")
  private String keypair = null;

  @SerializedName("passphrase")
  private String passphrase = null;

  public AptSigningRepositoriesAttributes keypair(String keypair) {
    this.keypair = keypair;
    return this;
  }

   /**
   * PGP signing key pair (armored private key e.g. gpg --export-secret-key --armor)
   * @return keypair
  **/
  @ApiModelProperty(value = "PGP signing key pair (armored private key e.g. gpg --export-secret-key --armor)")
  public String getKeypair() {
    return keypair;
  }

  public void setKeypair(String keypair) {
    this.keypair = keypair;
  }

  public AptSigningRepositoriesAttributes passphrase(String passphrase) {
    this.passphrase = passphrase;
    return this;
  }

   /**
   * Passphrase to access PGP signing key
   * @return passphrase
  **/
  @ApiModelProperty(value = "Passphrase to access PGP signing key")
  public String getPassphrase() {
    return passphrase;
  }

  public void setPassphrase(String passphrase) {
    this.passphrase = passphrase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AptSigningRepositoriesAttributes aptSigningRepositoriesAttributes = (AptSigningRepositoriesAttributes) o;
    return Objects.equals(this.keypair, aptSigningRepositoriesAttributes.keypair) &&
        Objects.equals(this.passphrase, aptSigningRepositoriesAttributes.passphrase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keypair, passphrase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AptSigningRepositoriesAttributes {\n");
    
    sb.append("    keypair: ").append(toIndentedString(keypair)).append("\n");
    sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
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

