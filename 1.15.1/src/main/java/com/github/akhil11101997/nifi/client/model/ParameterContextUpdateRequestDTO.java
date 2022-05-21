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
import com.github.akhil11101997.nifi.client.model.AffectedComponentEntity;
import com.github.akhil11101997.nifi.client.model.ParameterContextDTO;
import com.github.akhil11101997.nifi.client.model.ParameterContextUpdateStepDTO;
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
import org.threeten.bp.OffsetDateTime;

/**
 * ParameterContextUpdateRequestDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class ParameterContextUpdateRequestDTO {
  @SerializedName("requestId")
  private String requestId = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("submissionTime")
  private OffsetDateTime submissionTime = null;

  @SerializedName("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("complete")
  private Boolean complete = null;

  @SerializedName("failureReason")
  private String failureReason = null;

  @SerializedName("percentCompleted")
  private Integer percentCompleted = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("updateSteps")
  private List<ParameterContextUpdateStepDTO> updateSteps = null;

  @SerializedName("parameterContext")
  private ParameterContextDTO parameterContext = null;

  @SerializedName("referencingComponents")
  private List<AffectedComponentEntity> referencingComponents = null;

  public ParameterContextUpdateRequestDTO requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The ID of the request
   * @return requestId
  **/
  @ApiModelProperty(value = "The ID of the request")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ParameterContextUpdateRequestDTO uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The URI for the request
   * @return uri
  **/
  @ApiModelProperty(value = "The URI for the request")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ParameterContextUpdateRequestDTO submissionTime(OffsetDateTime submissionTime) {
    this.submissionTime = submissionTime;
    return this;
  }

   /**
   * The timestamp of when the request was submitted
   * @return submissionTime
  **/
  @ApiModelProperty(value = "The timestamp of when the request was submitted")
  public OffsetDateTime getSubmissionTime() {
    return submissionTime;
  }

  public void setSubmissionTime(OffsetDateTime submissionTime) {
    this.submissionTime = submissionTime;
  }

  public ParameterContextUpdateRequestDTO lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The timestamp of when the request was last updated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "The timestamp of when the request was last updated")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public ParameterContextUpdateRequestDTO complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Whether or not the request is completed
   * @return complete
  **/
  @ApiModelProperty(value = "Whether or not the request is completed")
  public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public ParameterContextUpdateRequestDTO failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

   /**
   * The reason for the request failing, or null if the request has not failed
   * @return failureReason
  **/
  @ApiModelProperty(value = "The reason for the request failing, or null if the request has not failed")
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }

  public ParameterContextUpdateRequestDTO percentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
    return this;
  }

   /**
   * A value between 0 and 100 (inclusive) indicating how close the request is to completion
   * @return percentCompleted
  **/
  @ApiModelProperty(value = "A value between 0 and 100 (inclusive) indicating how close the request is to completion")
  public Integer getPercentCompleted() {
    return percentCompleted;
  }

  public void setPercentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
  }

  public ParameterContextUpdateRequestDTO state(String state) {
    this.state = state;
    return this;
  }

   /**
   * A description of the current state of the request
   * @return state
  **/
  @ApiModelProperty(value = "A description of the current state of the request")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ParameterContextUpdateRequestDTO updateSteps(List<ParameterContextUpdateStepDTO> updateSteps) {
    this.updateSteps = updateSteps;
    return this;
  }

  public ParameterContextUpdateRequestDTO addUpdateStepsItem(ParameterContextUpdateStepDTO updateStepsItem) {
    if (this.updateSteps == null) {
      this.updateSteps = new ArrayList<ParameterContextUpdateStepDTO>();
    }
    this.updateSteps.add(updateStepsItem);
    return this;
  }

   /**
   * The steps that are required in order to complete the request, along with the status of each
   * @return updateSteps
  **/
  @ApiModelProperty(value = "The steps that are required in order to complete the request, along with the status of each")
  public List<ParameterContextUpdateStepDTO> getUpdateSteps() {
    return updateSteps;
  }

  public void setUpdateSteps(List<ParameterContextUpdateStepDTO> updateSteps) {
    this.updateSteps = updateSteps;
  }

  public ParameterContextUpdateRequestDTO parameterContext(ParameterContextDTO parameterContext) {
    this.parameterContext = parameterContext;
    return this;
  }

   /**
   * The Parameter Context that is being operated on. This may not be populated until the request has successfully completed.
   * @return parameterContext
  **/
  @ApiModelProperty(value = "The Parameter Context that is being operated on. This may not be populated until the request has successfully completed.")
  public ParameterContextDTO getParameterContext() {
    return parameterContext;
  }

  public void setParameterContext(ParameterContextDTO parameterContext) {
    this.parameterContext = parameterContext;
  }

  public ParameterContextUpdateRequestDTO referencingComponents(List<AffectedComponentEntity> referencingComponents) {
    this.referencingComponents = referencingComponents;
    return this;
  }

  public ParameterContextUpdateRequestDTO addReferencingComponentsItem(AffectedComponentEntity referencingComponentsItem) {
    if (this.referencingComponents == null) {
      this.referencingComponents = new ArrayList<AffectedComponentEntity>();
    }
    this.referencingComponents.add(referencingComponentsItem);
    return this;
  }

   /**
   * The components that are referenced by the update.
   * @return referencingComponents
  **/
  @ApiModelProperty(value = "The components that are referenced by the update.")
  public List<AffectedComponentEntity> getReferencingComponents() {
    return referencingComponents;
  }

  public void setReferencingComponents(List<AffectedComponentEntity> referencingComponents) {
    this.referencingComponents = referencingComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterContextUpdateRequestDTO parameterContextUpdateRequestDTO = (ParameterContextUpdateRequestDTO) o;
    return Objects.equals(this.requestId, parameterContextUpdateRequestDTO.requestId) &&
        Objects.equals(this.uri, parameterContextUpdateRequestDTO.uri) &&
        Objects.equals(this.submissionTime, parameterContextUpdateRequestDTO.submissionTime) &&
        Objects.equals(this.lastUpdated, parameterContextUpdateRequestDTO.lastUpdated) &&
        Objects.equals(this.complete, parameterContextUpdateRequestDTO.complete) &&
        Objects.equals(this.failureReason, parameterContextUpdateRequestDTO.failureReason) &&
        Objects.equals(this.percentCompleted, parameterContextUpdateRequestDTO.percentCompleted) &&
        Objects.equals(this.state, parameterContextUpdateRequestDTO.state) &&
        Objects.equals(this.updateSteps, parameterContextUpdateRequestDTO.updateSteps) &&
        Objects.equals(this.parameterContext, parameterContextUpdateRequestDTO.parameterContext) &&
        Objects.equals(this.referencingComponents, parameterContextUpdateRequestDTO.referencingComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, uri, submissionTime, lastUpdated, complete, failureReason, percentCompleted, state, updateSteps, parameterContext, referencingComponents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterContextUpdateRequestDTO {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    percentCompleted: ").append(toIndentedString(percentCompleted)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updateSteps: ").append(toIndentedString(updateSteps)).append("\n");
    sb.append("    parameterContext: ").append(toIndentedString(parameterContext)).append("\n");
    sb.append("    referencingComponents: ").append(toIndentedString(referencingComponents)).append("\n");
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

