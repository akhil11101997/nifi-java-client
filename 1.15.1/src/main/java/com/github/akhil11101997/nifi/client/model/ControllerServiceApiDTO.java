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
import com.github.akhil11101997.nifi.client.model.BundleDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ControllerServiceApiDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class ControllerServiceApiDTO {
  @SerializedName("type")
  private String type = null;

  @SerializedName("bundle")
  private BundleDTO bundle = null;

  public ControllerServiceApiDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The fully qualified name of the service interface.
   * @return type
  **/
  @ApiModelProperty(value = "The fully qualified name of the service interface.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ControllerServiceApiDTO bundle(BundleDTO bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * The details of the artifact that bundled this service interface.
   * @return bundle
  **/
  @ApiModelProperty(value = "The details of the artifact that bundled this service interface.")
  public BundleDTO getBundle() {
    return bundle;
  }

  public void setBundle(BundleDTO bundle) {
    this.bundle = bundle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerServiceApiDTO controllerServiceApiDTO = (ControllerServiceApiDTO) o;
    return Objects.equals(this.type, controllerServiceApiDTO.type) &&
        Objects.equals(this.bundle, controllerServiceApiDTO.bundle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, bundle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerServiceApiDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
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

