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
import com.github.akhil11101997.nifi.client.model.BulletinEntity;
import com.github.akhil11101997.nifi.client.model.PermissionsDTO;
import com.github.akhil11101997.nifi.client.model.PortDTO;
import com.github.akhil11101997.nifi.client.model.PortStatusDTO;
import com.github.akhil11101997.nifi.client.model.PositionDTO;
import com.github.akhil11101997.nifi.client.model.RevisionDTO;
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
 * PortEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-21T16:50:44.408+05:30")
public class PortEntity {
  @SerializedName("revision")
  private RevisionDTO revision = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("permissions")
  private PermissionsDTO permissions = null;

  @SerializedName("bulletins")
  private List<BulletinEntity> bulletins = null;

  @SerializedName("disconnectedNodeAcknowledged")
  private Boolean disconnectedNodeAcknowledged = null;

  @SerializedName("component")
  private PortDTO component = null;

  @SerializedName("status")
  private PortStatusDTO status = null;

  @SerializedName("portType")
  private String portType = null;

  @SerializedName("operatePermissions")
  private PermissionsDTO operatePermissions = null;

  @SerializedName("allowRemoteAccess")
  private Boolean allowRemoteAccess = null;

  public PortEntity revision(RevisionDTO revision) {
    this.revision = revision;
    return this;
  }

   /**
   * The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.
   * @return revision
  **/
  @ApiModelProperty(value = "The revision for this request/response. The revision is required for any mutable flow requests and is included in all responses.")
  public RevisionDTO getRevision() {
    return revision;
  }

  public void setRevision(RevisionDTO revision) {
    this.revision = revision;
  }

  public PortEntity id(String id) {
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

  public PortEntity uri(String uri) {
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

  public PortEntity position(PositionDTO position) {
    this.position = position;
    return this;
  }

   /**
   * The position of this component in the UI if applicable.
   * @return position
  **/
  @ApiModelProperty(value = "The position of this component in the UI if applicable.")
  public PositionDTO getPosition() {
    return position;
  }

  public void setPosition(PositionDTO position) {
    this.position = position;
  }

  public PortEntity permissions(PermissionsDTO permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * The permissions for this component.
   * @return permissions
  **/
  @ApiModelProperty(value = "The permissions for this component.")
  public PermissionsDTO getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsDTO permissions) {
    this.permissions = permissions;
  }

  public PortEntity bulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
    return this;
  }

  public PortEntity addBulletinsItem(BulletinEntity bulletinsItem) {
    if (this.bulletins == null) {
      this.bulletins = new ArrayList<BulletinEntity>();
    }
    this.bulletins.add(bulletinsItem);
    return this;
  }

   /**
   * The bulletins for this component.
   * @return bulletins
  **/
  @ApiModelProperty(value = "The bulletins for this component.")
  public List<BulletinEntity> getBulletins() {
    return bulletins;
  }

  public void setBulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
  }

  public PortEntity disconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
    return this;
  }

   /**
   * Acknowledges that this node is disconnected to allow for mutable requests to proceed.
   * @return disconnectedNodeAcknowledged
  **/
  @ApiModelProperty(value = "Acknowledges that this node is disconnected to allow for mutable requests to proceed.")
  public Boolean isDisconnectedNodeAcknowledged() {
    return disconnectedNodeAcknowledged;
  }

  public void setDisconnectedNodeAcknowledged(Boolean disconnectedNodeAcknowledged) {
    this.disconnectedNodeAcknowledged = disconnectedNodeAcknowledged;
  }

  public PortEntity component(PortDTO component) {
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @ApiModelProperty(value = "")
  public PortDTO getComponent() {
    return component;
  }

  public void setComponent(PortDTO component) {
    this.component = component;
  }

  public PortEntity status(PortStatusDTO status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the port.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the port.")
  public PortStatusDTO getStatus() {
    return status;
  }

  public void setStatus(PortStatusDTO status) {
    this.status = status;
  }

  public PortEntity portType(String portType) {
    this.portType = portType;
    return this;
  }

   /**
   * Get portType
   * @return portType
  **/
  @ApiModelProperty(value = "")
  public String getPortType() {
    return portType;
  }

  public void setPortType(String portType) {
    this.portType = portType;
  }

  public PortEntity operatePermissions(PermissionsDTO operatePermissions) {
    this.operatePermissions = operatePermissions;
    return this;
  }

   /**
   * The permissions for this component operations.
   * @return operatePermissions
  **/
  @ApiModelProperty(value = "The permissions for this component operations.")
  public PermissionsDTO getOperatePermissions() {
    return operatePermissions;
  }

  public void setOperatePermissions(PermissionsDTO operatePermissions) {
    this.operatePermissions = operatePermissions;
  }

  public PortEntity allowRemoteAccess(Boolean allowRemoteAccess) {
    this.allowRemoteAccess = allowRemoteAccess;
    return this;
  }

   /**
   * Whether this port can be accessed remotely via Site-to-Site protocol.
   * @return allowRemoteAccess
  **/
  @ApiModelProperty(value = "Whether this port can be accessed remotely via Site-to-Site protocol.")
  public Boolean isAllowRemoteAccess() {
    return allowRemoteAccess;
  }

  public void setAllowRemoteAccess(Boolean allowRemoteAccess) {
    this.allowRemoteAccess = allowRemoteAccess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortEntity portEntity = (PortEntity) o;
    return Objects.equals(this.revision, portEntity.revision) &&
        Objects.equals(this.id, portEntity.id) &&
        Objects.equals(this.uri, portEntity.uri) &&
        Objects.equals(this.position, portEntity.position) &&
        Objects.equals(this.permissions, portEntity.permissions) &&
        Objects.equals(this.bulletins, portEntity.bulletins) &&
        Objects.equals(this.disconnectedNodeAcknowledged, portEntity.disconnectedNodeAcknowledged) &&
        Objects.equals(this.component, portEntity.component) &&
        Objects.equals(this.status, portEntity.status) &&
        Objects.equals(this.portType, portEntity.portType) &&
        Objects.equals(this.operatePermissions, portEntity.operatePermissions) &&
        Objects.equals(this.allowRemoteAccess, portEntity.allowRemoteAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, id, uri, position, permissions, bulletins, disconnectedNodeAcknowledged, component, status, portType, operatePermissions, allowRemoteAccess);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortEntity {\n");
    
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    bulletins: ").append(toIndentedString(bulletins)).append("\n");
    sb.append("    disconnectedNodeAcknowledged: ").append(toIndentedString(disconnectedNodeAcknowledged)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
    sb.append("    operatePermissions: ").append(toIndentedString(operatePermissions)).append("\n");
    sb.append("    allowRemoteAccess: ").append(toIndentedString(allowRemoteAccess)).append("\n");
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

