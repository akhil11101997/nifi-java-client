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
import com.github.akhil11101997.nifi.client.model.Bucket;
import com.github.akhil11101997.nifi.client.model.ExternalControllerServiceReference;
import com.github.akhil11101997.nifi.client.model.VersionedFlow;
import com.github.akhil11101997.nifi.client.model.VersionedFlowSnapshotMetadata;
import com.github.akhil11101997.nifi.client.model.VersionedParameterContext;
import com.github.akhil11101997.nifi.client.model.VersionedProcessGroup;
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

/**
 * VersionedFlowSnapshot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class VersionedFlowSnapshot {
  @SerializedName("snapshotMetadata")
  private VersionedFlowSnapshotMetadata snapshotMetadata = null;

  @SerializedName("flowContents")
  private VersionedProcessGroup flowContents = null;

  @SerializedName("externalControllerServices")
  private Map<String, ExternalControllerServiceReference> externalControllerServices = null;

  @SerializedName("parameterContexts")
  private Map<String, VersionedParameterContext> parameterContexts = null;

  @SerializedName("flowEncodingVersion")
  private String flowEncodingVersion = null;

  @SerializedName("flow")
  private VersionedFlow flow = null;

  @SerializedName("bucket")
  private Bucket bucket = null;

  @SerializedName("latest")
  private Boolean latest = null;

  public VersionedFlowSnapshot snapshotMetadata(VersionedFlowSnapshotMetadata snapshotMetadata) {
    this.snapshotMetadata = snapshotMetadata;
    return this;
  }

   /**
   * The metadata for this snapshot
   * @return snapshotMetadata
  **/
  @ApiModelProperty(required = true, value = "The metadata for this snapshot")
  public VersionedFlowSnapshotMetadata getSnapshotMetadata() {
    return snapshotMetadata;
  }

  public void setSnapshotMetadata(VersionedFlowSnapshotMetadata snapshotMetadata) {
    this.snapshotMetadata = snapshotMetadata;
  }

  public VersionedFlowSnapshot flowContents(VersionedProcessGroup flowContents) {
    this.flowContents = flowContents;
    return this;
  }

   /**
   * The contents of the versioned flow
   * @return flowContents
  **/
  @ApiModelProperty(required = true, value = "The contents of the versioned flow")
  public VersionedProcessGroup getFlowContents() {
    return flowContents;
  }

  public void setFlowContents(VersionedProcessGroup flowContents) {
    this.flowContents = flowContents;
  }

  public VersionedFlowSnapshot externalControllerServices(Map<String, ExternalControllerServiceReference> externalControllerServices) {
    this.externalControllerServices = externalControllerServices;
    return this;
  }

  public VersionedFlowSnapshot putExternalControllerServicesItem(String key, ExternalControllerServiceReference externalControllerServicesItem) {
    if (this.externalControllerServices == null) {
      this.externalControllerServices = new HashMap<String, ExternalControllerServiceReference>();
    }
    this.externalControllerServices.put(key, externalControllerServicesItem);
    return this;
  }

   /**
   * The information about controller services that exist outside this versioned flow, but are referenced by components within the versioned flow.
   * @return externalControllerServices
  **/
  @ApiModelProperty(value = "The information about controller services that exist outside this versioned flow, but are referenced by components within the versioned flow.")
  public Map<String, ExternalControllerServiceReference> getExternalControllerServices() {
    return externalControllerServices;
  }

  public void setExternalControllerServices(Map<String, ExternalControllerServiceReference> externalControllerServices) {
    this.externalControllerServices = externalControllerServices;
  }

  public VersionedFlowSnapshot parameterContexts(Map<String, VersionedParameterContext> parameterContexts) {
    this.parameterContexts = parameterContexts;
    return this;
  }

  public VersionedFlowSnapshot putParameterContextsItem(String key, VersionedParameterContext parameterContextsItem) {
    if (this.parameterContexts == null) {
      this.parameterContexts = new HashMap<String, VersionedParameterContext>();
    }
    this.parameterContexts.put(key, parameterContextsItem);
    return this;
  }

   /**
   * The parameter contexts referenced by process groups in the flow contents. The mapping is from the name of the context to the context instance, and it is expected that any context in this map is referenced by at least one process group in this flow.
   * @return parameterContexts
  **/
  @ApiModelProperty(value = "The parameter contexts referenced by process groups in the flow contents. The mapping is from the name of the context to the context instance, and it is expected that any context in this map is referenced by at least one process group in this flow.")
  public Map<String, VersionedParameterContext> getParameterContexts() {
    return parameterContexts;
  }

  public void setParameterContexts(Map<String, VersionedParameterContext> parameterContexts) {
    this.parameterContexts = parameterContexts;
  }

  public VersionedFlowSnapshot flowEncodingVersion(String flowEncodingVersion) {
    this.flowEncodingVersion = flowEncodingVersion;
    return this;
  }

   /**
   * The optional encoding version of the flow contents.
   * @return flowEncodingVersion
  **/
  @ApiModelProperty(value = "The optional encoding version of the flow contents.")
  public String getFlowEncodingVersion() {
    return flowEncodingVersion;
  }

  public void setFlowEncodingVersion(String flowEncodingVersion) {
    this.flowEncodingVersion = flowEncodingVersion;
  }

   /**
   * The flow this snapshot is for
   * @return flow
  **/
  @ApiModelProperty(value = "The flow this snapshot is for")
  public VersionedFlow getFlow() {
    return flow;
  }

   /**
   * The bucket where the flow is located
   * @return bucket
  **/
  @ApiModelProperty(value = "The bucket where the flow is located")
  public Bucket getBucket() {
    return bucket;
  }

  public VersionedFlowSnapshot latest(Boolean latest) {
    this.latest = latest;
    return this;
  }

   /**
   * Get latest
   * @return latest
  **/
  @ApiModelProperty(value = "")
  public Boolean isLatest() {
    return latest;
  }

  public void setLatest(Boolean latest) {
    this.latest = latest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedFlowSnapshot versionedFlowSnapshot = (VersionedFlowSnapshot) o;
    return Objects.equals(this.snapshotMetadata, versionedFlowSnapshot.snapshotMetadata) &&
        Objects.equals(this.flowContents, versionedFlowSnapshot.flowContents) &&
        Objects.equals(this.externalControllerServices, versionedFlowSnapshot.externalControllerServices) &&
        Objects.equals(this.parameterContexts, versionedFlowSnapshot.parameterContexts) &&
        Objects.equals(this.flowEncodingVersion, versionedFlowSnapshot.flowEncodingVersion) &&
        Objects.equals(this.flow, versionedFlowSnapshot.flow) &&
        Objects.equals(this.bucket, versionedFlowSnapshot.bucket) &&
        Objects.equals(this.latest, versionedFlowSnapshot.latest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotMetadata, flowContents, externalControllerServices, parameterContexts, flowEncodingVersion, flow, bucket, latest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedFlowSnapshot {\n");
    
    sb.append("    snapshotMetadata: ").append(toIndentedString(snapshotMetadata)).append("\n");
    sb.append("    flowContents: ").append(toIndentedString(flowContents)).append("\n");
    sb.append("    externalControllerServices: ").append(toIndentedString(externalControllerServices)).append("\n");
    sb.append("    parameterContexts: ").append(toIndentedString(parameterContexts)).append("\n");
    sb.append("    flowEncodingVersion: ").append(toIndentedString(flowEncodingVersion)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
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

