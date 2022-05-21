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
import com.github.akhil11101997.nifi.client.model.FlowBreadcrumbEntity;
import com.github.akhil11101997.nifi.client.model.FlowDTO;
import com.github.akhil11101997.nifi.client.model.ParameterContextReferenceEntity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProcessGroupFlowDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class ProcessGroupFlowDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("parentGroupId")
  private String parentGroupId = null;

  @SerializedName("parameterContext")
  private ParameterContextReferenceEntity parameterContext = null;

  @SerializedName("breadcrumb")
  private FlowBreadcrumbEntity breadcrumb = null;

  @SerializedName("flow")
  private FlowDTO flow = null;

  @SerializedName("lastRefreshed")
  private String lastRefreshed = null;

  public ProcessGroupFlowDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the component.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessGroupFlowDTO uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI for futures requests to the component.
   * @return uri
  **/
  @ApiModelProperty(value = "The URI for futures requests to the component.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ProcessGroupFlowDTO parentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * The id of parent process group of this component if applicable.
   * @return parentGroupId
  **/
  @ApiModelProperty(value = "The id of parent process group of this component if applicable.")
  public String getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public ProcessGroupFlowDTO parameterContext(ParameterContextReferenceEntity parameterContext) {
    this.parameterContext = parameterContext;
    return this;
  }

   /**
   * The Parameter Context, or null if no Parameter Context has been bound to the Process Group
   * @return parameterContext
  **/
  @ApiModelProperty(value = "The Parameter Context, or null if no Parameter Context has been bound to the Process Group")
  public ParameterContextReferenceEntity getParameterContext() {
    return parameterContext;
  }

  public void setParameterContext(ParameterContextReferenceEntity parameterContext) {
    this.parameterContext = parameterContext;
  }

  public ProcessGroupFlowDTO breadcrumb(FlowBreadcrumbEntity breadcrumb) {
    this.breadcrumb = breadcrumb;
    return this;
  }

   /**
   * The breadcrumb of the process group.
   * @return breadcrumb
  **/
  @ApiModelProperty(value = "The breadcrumb of the process group.")
  public FlowBreadcrumbEntity getBreadcrumb() {
    return breadcrumb;
  }

  public void setBreadcrumb(FlowBreadcrumbEntity breadcrumb) {
    this.breadcrumb = breadcrumb;
  }

  public ProcessGroupFlowDTO flow(FlowDTO flow) {
    this.flow = flow;
    return this;
  }

   /**
   * The flow structure starting at this Process Group.
   * @return flow
  **/
  @ApiModelProperty(value = "The flow structure starting at this Process Group.")
  public FlowDTO getFlow() {
    return flow;
  }

  public void setFlow(FlowDTO flow) {
    this.flow = flow;
  }

  public ProcessGroupFlowDTO lastRefreshed(String lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
    return this;
  }

   /**
   * The time the flow for the process group was last refreshed.
   * @return lastRefreshed
  **/
  @ApiModelProperty(value = "The time the flow for the process group was last refreshed.")
  public String getLastRefreshed() {
    return lastRefreshed;
  }

  public void setLastRefreshed(String lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessGroupFlowDTO processGroupFlowDTO = (ProcessGroupFlowDTO) o;
    return Objects.equals(this.id, processGroupFlowDTO.id) &&
        Objects.equals(this.uri, processGroupFlowDTO.uri) &&
        Objects.equals(this.parentGroupId, processGroupFlowDTO.parentGroupId) &&
        Objects.equals(this.parameterContext, processGroupFlowDTO.parameterContext) &&
        Objects.equals(this.breadcrumb, processGroupFlowDTO.breadcrumb) &&
        Objects.equals(this.flow, processGroupFlowDTO.flow) &&
        Objects.equals(this.lastRefreshed, processGroupFlowDTO.lastRefreshed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, parentGroupId, parameterContext, breadcrumb, flow, lastRefreshed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroupFlowDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    parameterContext: ").append(toIndentedString(parameterContext)).append("\n");
    sb.append("    breadcrumb: ").append(toIndentedString(breadcrumb)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    lastRefreshed: ").append(toIndentedString(lastRefreshed)).append("\n");
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
