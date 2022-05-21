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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * StatusSnapshotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class StatusSnapshotDTO {
  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("statusMetrics")
  private Map<String, Long> statusMetrics = null;

  public StatusSnapshotDTO timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the snapshot.
   * @return timestamp
  **/
  @ApiModelProperty(value = "The timestamp of the snapshot.")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public StatusSnapshotDTO statusMetrics(Map<String, Long> statusMetrics) {
    this.statusMetrics = statusMetrics;
    return this;
  }

  public StatusSnapshotDTO putStatusMetricsItem(String key, Long statusMetricsItem) {
    if (this.statusMetrics == null) {
      this.statusMetrics = new HashMap<String, Long>();
    }
    this.statusMetrics.put(key, statusMetricsItem);
    return this;
  }

   /**
   * The status metrics.
   * @return statusMetrics
  **/
  @ApiModelProperty(value = "The status metrics.")
  public Map<String, Long> getStatusMetrics() {
    return statusMetrics;
  }

  public void setStatusMetrics(Map<String, Long> statusMetrics) {
    this.statusMetrics = statusMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusSnapshotDTO statusSnapshotDTO = (StatusSnapshotDTO) o;
    return Objects.equals(this.timestamp, statusSnapshotDTO.timestamp) &&
        Objects.equals(this.statusMetrics, statusSnapshotDTO.statusMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, statusMetrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusSnapshotDTO {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    statusMetrics: ").append(toIndentedString(statusMetrics)).append("\n");
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
