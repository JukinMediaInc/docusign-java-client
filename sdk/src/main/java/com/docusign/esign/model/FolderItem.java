package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.CustomFieldV2;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class FolderItem   {
  
  private String ownerName = null;
  private String envelopeId = null;
  private String envelopeUri = null;
  private String status = null;
  private String senderName = null;
  private String senderEmail = null;
  private String createdDateTime = null;
  private String sentDateTime = null;
  private String completedDateTime = null;
  private String subject = null;
  private String templateId = null;
  private String name = null;
  private String shared = null;
  private String password = null;
  private String description = null;
  private String lastModified = null;
  private Integer pageCount = null;
  private String uri = null;
  private String is21CFRPart11 = null;
  private java.util.List<CustomFieldV2> customFields = new java.util.ArrayList<CustomFieldV2>();

  
  /**
   * Name of the envelope owner.
   **/
  @ApiModelProperty(value = "Name of the envelope owner.")
  @JsonProperty("ownerName")
  public String getOwnerName() {
    return ownerName;
  }
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  
  /**
   * The envelope ID of the envelope status that failed to post.
   **/
  @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
  @JsonProperty("envelopeId")
  public String getEnvelopeId() {
    return envelopeId;
  }
  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  
  /**
   * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.
   **/
  @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
  @JsonProperty("envelopeUri")
  public String getEnvelopeUri() {
    return envelopeUri;
  }
  public void setEnvelopeUri(String envelopeUri) {
    this.envelopeUri = envelopeUri;
  }

  
  /**
   * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
   **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Name of the envelope sender.
   **/
  @ApiModelProperty(value = "Name of the envelope sender.")
  @JsonProperty("senderName")
  public String getSenderName() {
    return senderName;
  }
  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("senderEmail")
  public String getSenderEmail() {
    return senderEmail;
  }
  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  
  /**
   * Indicates the date and time the item was created.
   **/
  @ApiModelProperty(value = "Indicates the date and time the item was created.")
  @JsonProperty("createdDateTime")
  public String getCreatedDateTime() {
    return createdDateTime;
  }
  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  
  /**
   * The date and time the envelope was sent.
   **/
  @ApiModelProperty(value = "The date and time the envelope was sent.")
  @JsonProperty("sentDateTime")
  public String getSentDateTime() {
    return sentDateTime;
  }
  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }

  
  /**
   * Specifies the date and time this item was completed.
   **/
  @ApiModelProperty(value = "Specifies the date and time this item was completed.")
  @JsonProperty("completedDateTime")
  public String getCompletedDateTime() {
    return completedDateTime;
  }
  public void setCompletedDateTime(String completedDateTime) {
    this.completedDateTime = completedDateTime;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
   **/
  @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value.")
  @JsonProperty("templateId")
  public String getTemplateId() {
    return templateId;
  }
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * When set to **true**, this custom tab is shared.
   **/
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  @JsonProperty("shared")
  public String getShared() {
    return shared;
  }
  public void setShared(String shared) {
    this.shared = shared;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastModified")
  public String getLastModified() {
    return lastModified;
  }
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * When set to **true**, indicates that this module is enabled on the account.
   **/
  @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
  @JsonProperty("is21CFRPart11")
  public String getIs21CFRPart11() {
    return is21CFRPart11;
  }
  public void setIs21CFRPart11(String is21CFRPart11) {
    this.is21CFRPart11 = is21CFRPart11;
  }

  
  /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.
   **/
  @ApiModelProperty(value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  @JsonProperty("customFields")
  public java.util.List<CustomFieldV2> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(java.util.List<CustomFieldV2> customFields) {
    this.customFields = customFields;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FolderItem folderItem = (FolderItem) o;
    return Objects.equals(ownerName, folderItem.ownerName) &&
        Objects.equals(envelopeId, folderItem.envelopeId) &&
        Objects.equals(envelopeUri, folderItem.envelopeUri) &&
        Objects.equals(status, folderItem.status) &&
        Objects.equals(senderName, folderItem.senderName) &&
        Objects.equals(senderEmail, folderItem.senderEmail) &&
        Objects.equals(createdDateTime, folderItem.createdDateTime) &&
        Objects.equals(sentDateTime, folderItem.sentDateTime) &&
        Objects.equals(completedDateTime, folderItem.completedDateTime) &&
        Objects.equals(subject, folderItem.subject) &&
        Objects.equals(templateId, folderItem.templateId) &&
        Objects.equals(name, folderItem.name) &&
        Objects.equals(shared, folderItem.shared) &&
        Objects.equals(password, folderItem.password) &&
        Objects.equals(description, folderItem.description) &&
        Objects.equals(lastModified, folderItem.lastModified) &&
        Objects.equals(pageCount, folderItem.pageCount) &&
        Objects.equals(uri, folderItem.uri) &&
        Objects.equals(is21CFRPart11, folderItem.is21CFRPart11) &&
        Objects.equals(customFields, folderItem.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerName, envelopeId, envelopeUri, status, senderName, senderEmail, createdDateTime, sentDateTime, completedDateTime, subject, templateId, name, shared, password, description, lastModified, pageCount, uri, is21CFRPart11, customFields);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FolderItem {\n");
    
    sb.append("    ownerName: ").append(StringUtil.toIndentedString(ownerName)).append("\n");
    sb.append("    envelopeId: ").append(StringUtil.toIndentedString(envelopeId)).append("\n");
    sb.append("    envelopeUri: ").append(StringUtil.toIndentedString(envelopeUri)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    senderName: ").append(StringUtil.toIndentedString(senderName)).append("\n");
    sb.append("    senderEmail: ").append(StringUtil.toIndentedString(senderEmail)).append("\n");
    sb.append("    createdDateTime: ").append(StringUtil.toIndentedString(createdDateTime)).append("\n");
    sb.append("    sentDateTime: ").append(StringUtil.toIndentedString(sentDateTime)).append("\n");
    sb.append("    completedDateTime: ").append(StringUtil.toIndentedString(completedDateTime)).append("\n");
    sb.append("    subject: ").append(StringUtil.toIndentedString(subject)).append("\n");
    sb.append("    templateId: ").append(StringUtil.toIndentedString(templateId)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    shared: ").append(StringUtil.toIndentedString(shared)).append("\n");
    sb.append("    password: ").append(StringUtil.toIndentedString(password)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    lastModified: ").append(StringUtil.toIndentedString(lastModified)).append("\n");
    sb.append("    pageCount: ").append(StringUtil.toIndentedString(pageCount)).append("\n");
    sb.append("    uri: ").append(StringUtil.toIndentedString(uri)).append("\n");
    sb.append("    is21CFRPart11: ").append(StringUtil.toIndentedString(is21CFRPart11)).append("\n");
    sb.append("    customFields: ").append(StringUtil.toIndentedString(customFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
