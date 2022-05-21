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
 * ProvenanceSearchValueDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class ProvenanceSearchValueDTO {
  @SerializedName("value")
  private String value = null;

  @SerializedName("inverse")
  private Boolean inverse = null;

  public ProvenanceSearchValueDTO value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The search value.
   * @return value
  **/
  @ApiModelProperty(value = "The search value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ProvenanceSearchValueDTO inverse(Boolean inverse) {
    this.inverse = inverse;
    return this;
  }

   /**
   * Query for all except for search value.
   * @return inverse
  **/
  @ApiModelProperty(value = "Query for all except for search value.")
  public Boolean isInverse() {
    return inverse;
  }

  public void setInverse(Boolean inverse) {
    this.inverse = inverse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceSearchValueDTO provenanceSearchValueDTO = (ProvenanceSearchValueDTO) o;
    return Objects.equals(this.value, provenanceSearchValueDTO.value) &&
        Objects.equals(this.inverse, provenanceSearchValueDTO.inverse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, inverse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceSearchValueDTO {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    inverse: ").append(toIndentedString(inverse)).append("\n");
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

