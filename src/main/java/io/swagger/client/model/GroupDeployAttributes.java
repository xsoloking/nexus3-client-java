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
 * GroupDeployAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-11T23:01:25.243+08:00")
public class GroupDeployAttributes {
  @SerializedName("memberNames")
  private List<String> memberNames = null;

  @SerializedName("writableMember")
  private String writableMember = null;

  public GroupDeployAttributes memberNames(List<String> memberNames) {
    this.memberNames = memberNames;
    return this;
  }

  public GroupDeployAttributes addMemberNamesItem(String memberNamesItem) {
    if (this.memberNames == null) {
      this.memberNames = new ArrayList<String>();
    }
    this.memberNames.add(memberNamesItem);
    return this;
  }

   /**
   * Member repositories&#39; names
   * @return memberNames
  **/
  @ApiModelProperty(value = "Member repositories' names")
  public List<String> getMemberNames() {
    return memberNames;
  }

  public void setMemberNames(List<String> memberNames) {
    this.memberNames = memberNames;
  }

  public GroupDeployAttributes writableMember(String writableMember) {
    this.writableMember = writableMember;
    return this;
  }

   /**
   * Pro-only: This field is for the Group Deployment feature available in NXRM Pro.
   * @return writableMember
  **/
  @ApiModelProperty(value = "Pro-only: This field is for the Group Deployment feature available in NXRM Pro.")
  public String getWritableMember() {
    return writableMember;
  }

  public void setWritableMember(String writableMember) {
    this.writableMember = writableMember;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupDeployAttributes groupDeployAttributes = (GroupDeployAttributes) o;
    return Objects.equals(this.memberNames, groupDeployAttributes.memberNames) &&
        Objects.equals(this.writableMember, groupDeployAttributes.writableMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberNames, writableMember);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupDeployAttributes {\n");
    
    sb.append("    memberNames: ").append(toIndentedString(memberNames)).append("\n");
    sb.append("    writableMember: ").append(toIndentedString(writableMember)).append("\n");
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

