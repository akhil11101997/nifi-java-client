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
 * ConnectionStatisticsSnapshotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class ConnectionStatisticsSnapshotDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("predictedMillisUntilCountBackpressure")
  private Long predictedMillisUntilCountBackpressure = null;

  @SerializedName("predictedMillisUntilBytesBackpressure")
  private Long predictedMillisUntilBytesBackpressure = null;

  @SerializedName("predictedCountAtNextInterval")
  private Integer predictedCountAtNextInterval = null;

  @SerializedName("predictedBytesAtNextInterval")
  private Long predictedBytesAtNextInterval = null;

  @SerializedName("predictedPercentCount")
  private Integer predictedPercentCount = null;

  @SerializedName("predictedPercentBytes")
  private Integer predictedPercentBytes = null;

  @SerializedName("predictionIntervalMillis")
  private Long predictionIntervalMillis = null;

  public ConnectionStatisticsSnapshotDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the connection.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the connection.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConnectionStatisticsSnapshotDTO predictedMillisUntilCountBackpressure(Long predictedMillisUntilCountBackpressure) {
    this.predictedMillisUntilCountBackpressure = predictedMillisUntilCountBackpressure;
    return this;
  }

   /**
   * The predicted number of milliseconds before the connection will have backpressure applied, based on the queued count.
   * @return predictedMillisUntilCountBackpressure
  **/
  @ApiModelProperty(value = "The predicted number of milliseconds before the connection will have backpressure applied, based on the queued count.")
  public Long getPredictedMillisUntilCountBackpressure() {
    return predictedMillisUntilCountBackpressure;
  }

  public void setPredictedMillisUntilCountBackpressure(Long predictedMillisUntilCountBackpressure) {
    this.predictedMillisUntilCountBackpressure = predictedMillisUntilCountBackpressure;
  }

  public ConnectionStatisticsSnapshotDTO predictedMillisUntilBytesBackpressure(Long predictedMillisUntilBytesBackpressure) {
    this.predictedMillisUntilBytesBackpressure = predictedMillisUntilBytesBackpressure;
    return this;
  }

   /**
   * The predicted number of milliseconds before the connection will have backpressure applied, based on the total number of bytes in the queue.
   * @return predictedMillisUntilBytesBackpressure
  **/
  @ApiModelProperty(value = "The predicted number of milliseconds before the connection will have backpressure applied, based on the total number of bytes in the queue.")
  public Long getPredictedMillisUntilBytesBackpressure() {
    return predictedMillisUntilBytesBackpressure;
  }

  public void setPredictedMillisUntilBytesBackpressure(Long predictedMillisUntilBytesBackpressure) {
    this.predictedMillisUntilBytesBackpressure = predictedMillisUntilBytesBackpressure;
  }

  public ConnectionStatisticsSnapshotDTO predictedCountAtNextInterval(Integer predictedCountAtNextInterval) {
    this.predictedCountAtNextInterval = predictedCountAtNextInterval;
    return this;
  }

   /**
   * The predicted number of queued objects at the next configured interval.
   * @return predictedCountAtNextInterval
  **/
  @ApiModelProperty(value = "The predicted number of queued objects at the next configured interval.")
  public Integer getPredictedCountAtNextInterval() {
    return predictedCountAtNextInterval;
  }

  public void setPredictedCountAtNextInterval(Integer predictedCountAtNextInterval) {
    this.predictedCountAtNextInterval = predictedCountAtNextInterval;
  }

  public ConnectionStatisticsSnapshotDTO predictedBytesAtNextInterval(Long predictedBytesAtNextInterval) {
    this.predictedBytesAtNextInterval = predictedBytesAtNextInterval;
    return this;
  }

   /**
   * The predicted total number of bytes in the queue at the next configured interval.
   * @return predictedBytesAtNextInterval
  **/
  @ApiModelProperty(value = "The predicted total number of bytes in the queue at the next configured interval.")
  public Long getPredictedBytesAtNextInterval() {
    return predictedBytesAtNextInterval;
  }

  public void setPredictedBytesAtNextInterval(Long predictedBytesAtNextInterval) {
    this.predictedBytesAtNextInterval = predictedBytesAtNextInterval;
  }

  public ConnectionStatisticsSnapshotDTO predictedPercentCount(Integer predictedPercentCount) {
    this.predictedPercentCount = predictedPercentCount;
    return this;
  }

   /**
   * The predicted percentage of queued objects at the next configured interval.
   * @return predictedPercentCount
  **/
  @ApiModelProperty(value = "The predicted percentage of queued objects at the next configured interval.")
  public Integer getPredictedPercentCount() {
    return predictedPercentCount;
  }

  public void setPredictedPercentCount(Integer predictedPercentCount) {
    this.predictedPercentCount = predictedPercentCount;
  }

  public ConnectionStatisticsSnapshotDTO predictedPercentBytes(Integer predictedPercentBytes) {
    this.predictedPercentBytes = predictedPercentBytes;
    return this;
  }

   /**
   * The predicted percentage of bytes in the queue against current threshold at the next configured interval.
   * @return predictedPercentBytes
  **/
  @ApiModelProperty(value = "The predicted percentage of bytes in the queue against current threshold at the next configured interval.")
  public Integer getPredictedPercentBytes() {
    return predictedPercentBytes;
  }

  public void setPredictedPercentBytes(Integer predictedPercentBytes) {
    this.predictedPercentBytes = predictedPercentBytes;
  }

  public ConnectionStatisticsSnapshotDTO predictionIntervalMillis(Long predictionIntervalMillis) {
    this.predictionIntervalMillis = predictionIntervalMillis;
    return this;
  }

   /**
   * The prediction interval in seconds
   * @return predictionIntervalMillis
  **/
  @ApiModelProperty(value = "The prediction interval in seconds")
  public Long getPredictionIntervalMillis() {
    return predictionIntervalMillis;
  }

  public void setPredictionIntervalMillis(Long predictionIntervalMillis) {
    this.predictionIntervalMillis = predictionIntervalMillis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionStatisticsSnapshotDTO connectionStatisticsSnapshotDTO = (ConnectionStatisticsSnapshotDTO) o;
    return Objects.equals(this.id, connectionStatisticsSnapshotDTO.id) &&
        Objects.equals(this.predictedMillisUntilCountBackpressure, connectionStatisticsSnapshotDTO.predictedMillisUntilCountBackpressure) &&
        Objects.equals(this.predictedMillisUntilBytesBackpressure, connectionStatisticsSnapshotDTO.predictedMillisUntilBytesBackpressure) &&
        Objects.equals(this.predictedCountAtNextInterval, connectionStatisticsSnapshotDTO.predictedCountAtNextInterval) &&
        Objects.equals(this.predictedBytesAtNextInterval, connectionStatisticsSnapshotDTO.predictedBytesAtNextInterval) &&
        Objects.equals(this.predictedPercentCount, connectionStatisticsSnapshotDTO.predictedPercentCount) &&
        Objects.equals(this.predictedPercentBytes, connectionStatisticsSnapshotDTO.predictedPercentBytes) &&
        Objects.equals(this.predictionIntervalMillis, connectionStatisticsSnapshotDTO.predictionIntervalMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, predictedMillisUntilCountBackpressure, predictedMillisUntilBytesBackpressure, predictedCountAtNextInterval, predictedBytesAtNextInterval, predictedPercentCount, predictedPercentBytes, predictionIntervalMillis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionStatisticsSnapshotDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    predictedMillisUntilCountBackpressure: ").append(toIndentedString(predictedMillisUntilCountBackpressure)).append("\n");
    sb.append("    predictedMillisUntilBytesBackpressure: ").append(toIndentedString(predictedMillisUntilBytesBackpressure)).append("\n");
    sb.append("    predictedCountAtNextInterval: ").append(toIndentedString(predictedCountAtNextInterval)).append("\n");
    sb.append("    predictedBytesAtNextInterval: ").append(toIndentedString(predictedBytesAtNextInterval)).append("\n");
    sb.append("    predictedPercentCount: ").append(toIndentedString(predictedPercentCount)).append("\n");
    sb.append("    predictedPercentBytes: ").append(toIndentedString(predictedPercentBytes)).append("\n");
    sb.append("    predictionIntervalMillis: ").append(toIndentedString(predictionIntervalMillis)).append("\n");
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

