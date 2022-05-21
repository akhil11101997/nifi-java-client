/*
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.15.1
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.akhil11101997.nifi.client.model;

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
 * Bundle
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class Bundle {
  @SerializedName("group")
  private String group = null;

  @SerializedName("artifact")
  private String artifact = null;

  @SerializedName("version")
  private String version = null;

  public Bundle group(String group) {
    this.group = group;
    return this;
  }

   /**
   * The group of the bundle
   * @return group
  **/
  @ApiModelProperty(value = "The group of the bundle")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public Bundle artifact(String artifact) {
    this.artifact = artifact;
    return this;
  }

   /**
   * The artifact of the bundle
   * @return artifact
  **/
  @ApiModelProperty(value = "The artifact of the bundle")
  public String getArtifact() {
    return artifact;
  }

  public void setArtifact(String artifact) {
    this.artifact = artifact;
  }

  public Bundle version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version of the bundle
   * @return version
  **/
  @ApiModelProperty(value = "The version of the bundle")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bundle bundle = (Bundle) o;
    return Objects.equals(this.group, bundle.group) &&
        Objects.equals(this.artifact, bundle.artifact) &&
        Objects.equals(this.version, bundle.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, artifact, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bundle {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

