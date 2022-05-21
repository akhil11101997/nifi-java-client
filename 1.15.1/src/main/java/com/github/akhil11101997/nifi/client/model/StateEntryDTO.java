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
 * StateEntryDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class StateEntryDTO {
  @SerializedName("key")
  private String key = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("clusterNodeId")
  private String clusterNodeId = null;

  @SerializedName("clusterNodeAddress")
  private String clusterNodeAddress = null;

  public StateEntryDTO key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key for this state.
   * @return key
  **/
  @ApiModelProperty(value = "The key for this state.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public StateEntryDTO value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value for this state.
   * @return value
  **/
  @ApiModelProperty(value = "The value for this state.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public StateEntryDTO clusterNodeId(String clusterNodeId) {
    this.clusterNodeId = clusterNodeId;
    return this;
  }

   /**
   * The identifier for the node where the state originated.
   * @return clusterNodeId
  **/
  @ApiModelProperty(value = "The identifier for the node where the state originated.")
  public String getClusterNodeId() {
    return clusterNodeId;
  }

  public void setClusterNodeId(String clusterNodeId) {
    this.clusterNodeId = clusterNodeId;
  }

  public StateEntryDTO clusterNodeAddress(String clusterNodeAddress) {
    this.clusterNodeAddress = clusterNodeAddress;
    return this;
  }

   /**
   * The label for the node where the state originated.
   * @return clusterNodeAddress
  **/
  @ApiModelProperty(value = "The label for the node where the state originated.")
  public String getClusterNodeAddress() {
    return clusterNodeAddress;
  }

  public void setClusterNodeAddress(String clusterNodeAddress) {
    this.clusterNodeAddress = clusterNodeAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateEntryDTO stateEntryDTO = (StateEntryDTO) o;
    return Objects.equals(this.key, stateEntryDTO.key) &&
        Objects.equals(this.value, stateEntryDTO.value) &&
        Objects.equals(this.clusterNodeId, stateEntryDTO.clusterNodeId) &&
        Objects.equals(this.clusterNodeAddress, stateEntryDTO.clusterNodeAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, clusterNodeId, clusterNodeAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateEntryDTO {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    clusterNodeId: ").append(toIndentedString(clusterNodeId)).append("\n");
    sb.append("    clusterNodeAddress: ").append(toIndentedString(clusterNodeAddress)).append("\n");
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

