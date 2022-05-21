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
import com.github.akhil11101997.nifi.client.model.NodeProcessGroupStatusSnapshotDTO;
import com.github.akhil11101997.nifi.client.model.ProcessGroupStatusSnapshotDTO;
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
 * ProcessGroupStatusDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class ProcessGroupStatusDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("statsLastRefreshed")
  private String statsLastRefreshed = null;

  @SerializedName("aggregateSnapshot")
  private ProcessGroupStatusSnapshotDTO aggregateSnapshot = null;

  @SerializedName("nodeSnapshots")
  private List<NodeProcessGroupStatusSnapshotDTO> nodeSnapshots = null;

  public ProcessGroupStatusDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the Process Group
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the Process Group")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessGroupStatusDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the Process Group
   * @return name
  **/
  @ApiModelProperty(value = "The name of the Process Group")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProcessGroupStatusDTO statsLastRefreshed(String statsLastRefreshed) {
    this.statsLastRefreshed = statsLastRefreshed;
    return this;
  }

   /**
   * The time the status for the process group was last refreshed.
   * @return statsLastRefreshed
  **/
  @ApiModelProperty(value = "The time the status for the process group was last refreshed.")
  public String getStatsLastRefreshed() {
    return statsLastRefreshed;
  }

  public void setStatsLastRefreshed(String statsLastRefreshed) {
    this.statsLastRefreshed = statsLastRefreshed;
  }

  public ProcessGroupStatusDTO aggregateSnapshot(ProcessGroupStatusSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
    return this;
  }

   /**
   * The aggregate status of all nodes in the cluster
   * @return aggregateSnapshot
  **/
  @ApiModelProperty(value = "The aggregate status of all nodes in the cluster")
  public ProcessGroupStatusSnapshotDTO getAggregateSnapshot() {
    return aggregateSnapshot;
  }

  public void setAggregateSnapshot(ProcessGroupStatusSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
  }

  public ProcessGroupStatusDTO nodeSnapshots(List<NodeProcessGroupStatusSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
    return this;
  }

  public ProcessGroupStatusDTO addNodeSnapshotsItem(NodeProcessGroupStatusSnapshotDTO nodeSnapshotsItem) {
    if (this.nodeSnapshots == null) {
      this.nodeSnapshots = new ArrayList<NodeProcessGroupStatusSnapshotDTO>();
    }
    this.nodeSnapshots.add(nodeSnapshotsItem);
    return this;
  }

   /**
   * The status reported by each node in the cluster. If the NiFi instance is a standalone instance, rather than a clustered instance, this value may be null.
   * @return nodeSnapshots
  **/
  @ApiModelProperty(value = "The status reported by each node in the cluster. If the NiFi instance is a standalone instance, rather than a clustered instance, this value may be null.")
  public List<NodeProcessGroupStatusSnapshotDTO> getNodeSnapshots() {
    return nodeSnapshots;
  }

  public void setNodeSnapshots(List<NodeProcessGroupStatusSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessGroupStatusDTO processGroupStatusDTO = (ProcessGroupStatusDTO) o;
    return Objects.equals(this.id, processGroupStatusDTO.id) &&
        Objects.equals(this.name, processGroupStatusDTO.name) &&
        Objects.equals(this.statsLastRefreshed, processGroupStatusDTO.statsLastRefreshed) &&
        Objects.equals(this.aggregateSnapshot, processGroupStatusDTO.aggregateSnapshot) &&
        Objects.equals(this.nodeSnapshots, processGroupStatusDTO.nodeSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, statsLastRefreshed, aggregateSnapshot, nodeSnapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroupStatusDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statsLastRefreshed: ").append(toIndentedString(statsLastRefreshed)).append("\n");
    sb.append("    aggregateSnapshot: ").append(toIndentedString(aggregateSnapshot)).append("\n");
    sb.append("    nodeSnapshots: ").append(toIndentedString(nodeSnapshots)).append("\n");
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

