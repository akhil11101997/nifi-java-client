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
 * ProvenanceSearchableFieldDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class ProvenanceSearchableFieldDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("field")
  private String field = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("type")
  private String type = null;

  public ProvenanceSearchableFieldDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the searchable field.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the searchable field.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProvenanceSearchableFieldDTO field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The searchable field.
   * @return field
  **/
  @ApiModelProperty(value = "The searchable field.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ProvenanceSearchableFieldDTO label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label for the searchable field.
   * @return label
  **/
  @ApiModelProperty(value = "The label for the searchable field.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ProvenanceSearchableFieldDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the searchable field.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the searchable field.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceSearchableFieldDTO provenanceSearchableFieldDTO = (ProvenanceSearchableFieldDTO) o;
    return Objects.equals(this.id, provenanceSearchableFieldDTO.id) &&
        Objects.equals(this.field, provenanceSearchableFieldDTO.field) &&
        Objects.equals(this.label, provenanceSearchableFieldDTO.label) &&
        Objects.equals(this.type, provenanceSearchableFieldDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, field, label, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceSearchableFieldDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

