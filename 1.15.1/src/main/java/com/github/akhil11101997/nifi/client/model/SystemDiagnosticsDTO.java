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
import com.github.akhil11101997.nifi.client.model.NodeSystemDiagnosticsSnapshotDTO;
import com.github.akhil11101997.nifi.client.model.SystemDiagnosticsSnapshotDTO;
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
 * SystemDiagnosticsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class SystemDiagnosticsDTO {
  @SerializedName("aggregateSnapshot")
  private SystemDiagnosticsSnapshotDTO aggregateSnapshot = null;

  @SerializedName("nodeSnapshots")
  private List<NodeSystemDiagnosticsSnapshotDTO> nodeSnapshots = null;

  public SystemDiagnosticsDTO aggregateSnapshot(SystemDiagnosticsSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
    return this;
  }

   /**
   * A systems diagnostic snapshot that represents the aggregate values of all nodes in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this represents the stats of the single instance.
   * @return aggregateSnapshot
  **/
  @ApiModelProperty(value = "A systems diagnostic snapshot that represents the aggregate values of all nodes in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this represents the stats of the single instance.")
  public SystemDiagnosticsSnapshotDTO getAggregateSnapshot() {
    return aggregateSnapshot;
  }

  public void setAggregateSnapshot(SystemDiagnosticsSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
  }

  public SystemDiagnosticsDTO nodeSnapshots(List<NodeSystemDiagnosticsSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
    return this;
  }

  public SystemDiagnosticsDTO addNodeSnapshotsItem(NodeSystemDiagnosticsSnapshotDTO nodeSnapshotsItem) {
    if (this.nodeSnapshots == null) {
      this.nodeSnapshots = new ArrayList<NodeSystemDiagnosticsSnapshotDTO>();
    }
    this.nodeSnapshots.add(nodeSnapshotsItem);
    return this;
  }

   /**
   * A systems diagnostics snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.
   * @return nodeSnapshots
  **/
  @ApiModelProperty(value = "A systems diagnostics snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.")
  public List<NodeSystemDiagnosticsSnapshotDTO> getNodeSnapshots() {
    return nodeSnapshots;
  }

  public void setNodeSnapshots(List<NodeSystemDiagnosticsSnapshotDTO> nodeSnapshots) {
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
    SystemDiagnosticsDTO systemDiagnosticsDTO = (SystemDiagnosticsDTO) o;
    return Objects.equals(this.aggregateSnapshot, systemDiagnosticsDTO.aggregateSnapshot) &&
        Objects.equals(this.nodeSnapshots, systemDiagnosticsDTO.nodeSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregateSnapshot, nodeSnapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemDiagnosticsDTO {\n");
    
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

