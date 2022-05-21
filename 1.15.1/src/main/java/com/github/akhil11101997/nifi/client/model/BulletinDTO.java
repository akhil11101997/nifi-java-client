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
 * BulletinDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class BulletinDTO {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("nodeAddress")
  private String nodeAddress = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("sourceId")
  private String sourceId = null;

  @SerializedName("sourceName")
  private String sourceName = null;

  @SerializedName("level")
  private String level = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("timestamp")
  private String timestamp = null;

  public BulletinDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the bulletin.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the bulletin.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BulletinDTO nodeAddress(String nodeAddress) {
    this.nodeAddress = nodeAddress;
    return this;
  }

   /**
   * If clustered, the address of the node from which the bulletin originated.
   * @return nodeAddress
  **/
  @ApiModelProperty(value = "If clustered, the address of the node from which the bulletin originated.")
  public String getNodeAddress() {
    return nodeAddress;
  }

  public void setNodeAddress(String nodeAddress) {
    this.nodeAddress = nodeAddress;
  }

  public BulletinDTO category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The category of this bulletin.
   * @return category
  **/
  @ApiModelProperty(value = "The category of this bulletin.")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public BulletinDTO groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The group id of the source component.
   * @return groupId
  **/
  @ApiModelProperty(value = "The group id of the source component.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public BulletinDTO sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The id of the source component.
   * @return sourceId
  **/
  @ApiModelProperty(value = "The id of the source component.")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public BulletinDTO sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }

   /**
   * The name of the source component.
   * @return sourceName
  **/
  @ApiModelProperty(value = "The name of the source component.")
  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }

  public BulletinDTO level(String level) {
    this.level = level;
    return this;
  }

   /**
   * The level of the bulletin.
   * @return level
  **/
  @ApiModelProperty(value = "The level of the bulletin.")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public BulletinDTO message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The bulletin message.
   * @return message
  **/
  @ApiModelProperty(value = "The bulletin message.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BulletinDTO timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * When this bulletin was generated.
   * @return timestamp
  **/
  @ApiModelProperty(value = "When this bulletin was generated.")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulletinDTO bulletinDTO = (BulletinDTO) o;
    return Objects.equals(this.id, bulletinDTO.id) &&
        Objects.equals(this.nodeAddress, bulletinDTO.nodeAddress) &&
        Objects.equals(this.category, bulletinDTO.category) &&
        Objects.equals(this.groupId, bulletinDTO.groupId) &&
        Objects.equals(this.sourceId, bulletinDTO.sourceId) &&
        Objects.equals(this.sourceName, bulletinDTO.sourceName) &&
        Objects.equals(this.level, bulletinDTO.level) &&
        Objects.equals(this.message, bulletinDTO.message) &&
        Objects.equals(this.timestamp, bulletinDTO.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nodeAddress, category, groupId, sourceId, sourceName, level, message, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulletinDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeAddress: ").append(toIndentedString(nodeAddress)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

