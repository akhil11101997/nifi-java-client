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
import com.github.akhil11101997.nifi.client.model.VariableDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VariableEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class VariableEntity {
  @SerializedName("variable")
  private VariableDTO variable = null;

  @SerializedName("canWrite")
  private Boolean canWrite = null;

  public VariableEntity variable(VariableDTO variable) {
    this.variable = variable;
    return this;
  }

   /**
   * The variable information
   * @return variable
  **/
  @ApiModelProperty(value = "The variable information")
  public VariableDTO getVariable() {
    return variable;
  }

  public void setVariable(VariableDTO variable) {
    this.variable = variable;
  }

  public VariableEntity canWrite(Boolean canWrite) {
    this.canWrite = canWrite;
    return this;
  }

   /**
   * Indicates whether the user can write a given resource.
   * @return canWrite
  **/
  @ApiModelProperty(value = "Indicates whether the user can write a given resource.")
  public Boolean isCanWrite() {
    return canWrite;
  }

  public void setCanWrite(Boolean canWrite) {
    this.canWrite = canWrite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableEntity variableEntity = (VariableEntity) o;
    return Objects.equals(this.variable, variableEntity.variable) &&
        Objects.equals(this.canWrite, variableEntity.canWrite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variable, canWrite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableEntity {\n");
    
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
    sb.append("    canWrite: ").append(toIndentedString(canWrite)).append("\n");
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
