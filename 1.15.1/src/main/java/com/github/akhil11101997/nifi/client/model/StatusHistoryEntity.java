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
import com.github.akhil11101997.nifi.client.model.StatusHistoryDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StatusHistoryEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class StatusHistoryEntity {
  @SerializedName("statusHistory")
  private StatusHistoryDTO statusHistory = null;

  @SerializedName("canRead")
  private Boolean canRead = null;

  public StatusHistoryEntity statusHistory(StatusHistoryDTO statusHistory) {
    this.statusHistory = statusHistory;
    return this;
  }

   /**
   * Get statusHistory
   * @return statusHistory
  **/
  @ApiModelProperty(value = "")
  public StatusHistoryDTO getStatusHistory() {
    return statusHistory;
  }

  public void setStatusHistory(StatusHistoryDTO statusHistory) {
    this.statusHistory = statusHistory;
  }

  public StatusHistoryEntity canRead(Boolean canRead) {
    this.canRead = canRead;
    return this;
  }

   /**
   * Indicates whether the user can read a given resource.
   * @return canRead
  **/
  @ApiModelProperty(value = "Indicates whether the user can read a given resource.")
  public Boolean isCanRead() {
    return canRead;
  }

  public void setCanRead(Boolean canRead) {
    this.canRead = canRead;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusHistoryEntity statusHistoryEntity = (StatusHistoryEntity) o;
    return Objects.equals(this.statusHistory, statusHistoryEntity.statusHistory) &&
        Objects.equals(this.canRead, statusHistoryEntity.canRead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusHistory, canRead);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusHistoryEntity {\n");
    
    sb.append("    statusHistory: ").append(toIndentedString(statusHistory)).append("\n");
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
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

