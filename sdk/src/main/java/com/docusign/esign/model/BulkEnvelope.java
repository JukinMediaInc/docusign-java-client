package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.ErrorDetails;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class BulkEnvelope   {
  
  private String transactionId = null;
  private String submittedDateTime = null;
  private String envelopeId = null;
  private String envelopeUri = null;
  private String bulkRecipientRow = null;
  private String name = null;
  private String email = null;
  private String bulkStatus = null;
  private ErrorDetails errorDetails = null;

  
  /**
   * Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine if an envelope status (i.e. was created or not) for cases where an internet connection was lost before the envelope status could be returned.
   **/
  @ApiModelProperty(value = "Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine if an envelope status (i.e. was created or not) for cases where an internet connection was lost before the envelope status could be returned.")
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("submittedDateTime")
  public String getSubmittedDateTime() {
    return submittedDateTime;
  }
  public void setSubmittedDateTime(String submittedDateTime) {
    this.submittedDateTime = submittedDateTime;
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
   * Reserved: TBD
   **/
  @ApiModelProperty(value = "Reserved: TBD")
  @JsonProperty("bulkRecipientRow")
  public String getBulkRecipientRow() {
    return bulkRecipientRow;
  }
  public void setBulkRecipientRow(String bulkRecipientRow) {
    this.bulkRecipientRow = bulkRecipientRow;
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
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("bulkStatus")
  public String getBulkStatus() {
    return bulkStatus;
  }
  public void setBulkStatus(String bulkStatus) {
    this.bulkStatus = bulkStatus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("errorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkEnvelope bulkEnvelope = (BulkEnvelope) o;
    return Objects.equals(transactionId, bulkEnvelope.transactionId) &&
        Objects.equals(submittedDateTime, bulkEnvelope.submittedDateTime) &&
        Objects.equals(envelopeId, bulkEnvelope.envelopeId) &&
        Objects.equals(envelopeUri, bulkEnvelope.envelopeUri) &&
        Objects.equals(bulkRecipientRow, bulkEnvelope.bulkRecipientRow) &&
        Objects.equals(name, bulkEnvelope.name) &&
        Objects.equals(email, bulkEnvelope.email) &&
        Objects.equals(bulkStatus, bulkEnvelope.bulkStatus) &&
        Objects.equals(errorDetails, bulkEnvelope.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, submittedDateTime, envelopeId, envelopeUri, bulkRecipientRow, name, email, bulkStatus, errorDetails);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkEnvelope {\n");
    
    sb.append("    transactionId: ").append(StringUtil.toIndentedString(transactionId)).append("\n");
    sb.append("    submittedDateTime: ").append(StringUtil.toIndentedString(submittedDateTime)).append("\n");
    sb.append("    envelopeId: ").append(StringUtil.toIndentedString(envelopeId)).append("\n");
    sb.append("    envelopeUri: ").append(StringUtil.toIndentedString(envelopeUri)).append("\n");
    sb.append("    bulkRecipientRow: ").append(StringUtil.toIndentedString(bulkRecipientRow)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    bulkStatus: ").append(StringUtil.toIndentedString(bulkStatus)).append("\n");
    sb.append("    errorDetails: ").append(StringUtil.toIndentedString(errorDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
