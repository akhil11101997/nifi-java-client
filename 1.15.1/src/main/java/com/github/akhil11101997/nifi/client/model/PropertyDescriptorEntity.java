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
import com.github.akhil11101997.nifi.client.model.PropertyDescriptorDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PropertyDescriptorEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class PropertyDescriptorEntity {
  @SerializedName("propertyDescriptor")
  private PropertyDescriptorDTO propertyDescriptor = null;

  public PropertyDescriptorEntity propertyDescriptor(PropertyDescriptorDTO propertyDescriptor) {
    this.propertyDescriptor = propertyDescriptor;
    return this;
  }

   /**
   * Get propertyDescriptor
   * @return propertyDescriptor
  **/
  @ApiModelProperty(value = "")
  public PropertyDescriptorDTO getPropertyDescriptor() {
    return propertyDescriptor;
  }

  public void setPropertyDescriptor(PropertyDescriptorDTO propertyDescriptor) {
    this.propertyDescriptor = propertyDescriptor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyDescriptorEntity propertyDescriptorEntity = (PropertyDescriptorEntity) o;
    return Objects.equals(this.propertyDescriptor, propertyDescriptorEntity.propertyDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyDescriptor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyDescriptorEntity {\n");
    
    sb.append("    propertyDescriptor: ").append(toIndentedString(propertyDescriptor)).append("\n");
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

