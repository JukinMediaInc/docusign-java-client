package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.RecipientSignatureInformation;
import com.docusign.esign.model.IdCheckInformationInput;
import com.docusign.esign.model.UserInfo;
import com.docusign.esign.model.Attachment;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.OfflineAttributes;
import com.docusign.esign.model.AuthenticationStatus;
import com.docusign.esign.model.RecipientSMSAuthentication;
import com.docusign.esign.model.RecipientSAMLAuthentication;
import com.docusign.esign.model.RecipientPhoneAuthentication;
import com.docusign.esign.model.SocialAuthentication;
import com.docusign.esign.model.Tabs;
import com.docusign.esign.model.RecipientEmailNotification;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class InPersonSigner   {
  
  private String hostName = null;
  private String hostEmail = null;
  private String signerName = null;
  private String signerEmail = null;
  private RecipientSignatureInformation signatureInfo = null;
  private String defaultRecipient = null;
  private OfflineAttributes offlineAttributes = null;
  private Tabs tabs = null;
  private String signInEachLocation = null;
  private String requireSignerCertificate = null;
  private String requireSignOnPaper = null;
  private String canSignOffline = null;
  private String recipientSuppliesTabs = null;
  private String signingGroupId = null;
  private String signingGroupName = null;
  private java.util.List<UserInfo> signingGroupUsers = new java.util.ArrayList<UserInfo>();
  private String recipientId = null;
  private String recipientIdGuid = null;
  private String accessCode = null;
  private String addAccessCodeToEmail = null;
  private String requireIdLookup = null;
  private String idCheckConfigurationName = null;
  private java.util.List<SocialAuthentication> socialAuthentications = new java.util.ArrayList<SocialAuthentication>();
  private RecipientPhoneAuthentication phoneAuthentication = null;
  private RecipientSAMLAuthentication samlAuthentication = null;
  private RecipientSMSAuthentication smsAuthentication = null;
  private String userId = null;
  private String clientUserId = null;
  private String embeddedRecipientStartURL = null;
  private java.util.List<String> customFields = new java.util.ArrayList<String>();
  private String routingOrder = null;
  private IdCheckInformationInput idCheckInformationInput = null;
  private java.util.List<Attachment> recipientAttachments = new java.util.ArrayList<Attachment>();
  private String note = null;
  private String roleName = null;
  private String status = null;
  private String signedDateTime = null;
  private String deliveredDateTime = null;
  private String declinedDateTime = null;
  private String sentDateTime = null;
  private String declinedReason = null;
  private String deliveryMethod = null;
  private String faxNumber = null;
  private String templateLocked = null;
  private String templateRequired = null;
  private RecipientEmailNotification emailNotification = null;
  private String inheritEmailNotificationConfiguration = null;
  private ErrorDetails errorDetails = null;
  private AuthenticationStatus recipientAuthenticationStatus = null;
  private String totalTabCount = null;

  
  /**
   * Specifies the name of the signing host. It is a required element for In Person Signers recipient Type. \nMaximum Length: 100 characters.
   **/
  @ApiModelProperty(value = "Specifies the name of the signing host. It is a required element for In Person Signers recipient Type. \nMaximum Length: 100 characters.")
  @JsonProperty("hostName")
  public String getHostName() {
    return hostName;
  }
  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hostEmail")
  public String getHostEmail() {
    return hostEmail;
  }
  public void setHostEmail(String hostEmail) {
    this.hostEmail = hostEmail;
  }

  
  /**
   * Required. The full legal name of a signer for the envelope. \n\nMaximum Length: 100 characters.
   **/
  @ApiModelProperty(value = "Required. The full legal name of a signer for the envelope. \n\nMaximum Length: 100 characters.")
  @JsonProperty("signerName")
  public String getSignerName() {
    return signerName;
  }
  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }

  
  /**
   * The email address for an InPersonSigner recipient Type. \n\nMaximum Length: 100 characters.
   **/
  @ApiModelProperty(value = "The email address for an InPersonSigner recipient Type. \n\nMaximum Length: 100 characters.")
  @JsonProperty("signerEmail")
  public String getSignerEmail() {
    return signerEmail;
  }
  public void setSignerEmail(String signerEmail) {
    this.signerEmail = signerEmail;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signatureInfo")
  public RecipientSignatureInformation getSignatureInfo() {
    return signatureInfo;
  }
  public void setSignatureInfo(RecipientSignatureInformation signatureInfo) {
    this.signatureInfo = signatureInfo;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("defaultRecipient")
  public String getDefaultRecipient() {
    return defaultRecipient;
  }
  public void setDefaultRecipient(String defaultRecipient) {
    this.defaultRecipient = defaultRecipient;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("offlineAttributes")
  public OfflineAttributes getOfflineAttributes() {
    return offlineAttributes;
  }
  public void setOfflineAttributes(OfflineAttributes offlineAttributes) {
    this.offlineAttributes = offlineAttributes;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tabs")
  public Tabs getTabs() {
    return tabs;
  }
  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
  }

  
  /**
   * When set to **true**, specifies that the signer must sign in all locations.
   **/
  @ApiModelProperty(value = "When set to **true**, specifies that the signer must sign in all locations.")
  @JsonProperty("signInEachLocation")
  public String getSignInEachLocation() {
    return signInEachLocation;
  }
  public void setSignInEachLocation(String signInEachLocation) {
    this.signInEachLocation = signInEachLocation;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("requireSignerCertificate")
  public String getRequireSignerCertificate() {
    return requireSignerCertificate;
  }
  public void setRequireSignerCertificate(String requireSignerCertificate) {
    this.requireSignerCertificate = requireSignerCertificate;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("requireSignOnPaper")
  public String getRequireSignOnPaper() {
    return requireSignOnPaper;
  }
  public void setRequireSignOnPaper(String requireSignOnPaper) {
    this.requireSignOnPaper = requireSignOnPaper;
  }

  
  /**
   * When set to **true**, specifies that the signer can perform the signing ceremony offline.
   **/
  @ApiModelProperty(value = "When set to **true**, specifies that the signer can perform the signing ceremony offline.")
  @JsonProperty("canSignOffline")
  public String getCanSignOffline() {
    return canSignOffline;
  }
  public void setCanSignOffline(String canSignOffline) {
    this.canSignOffline = canSignOffline;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("recipientSuppliesTabs")
  public String getRecipientSuppliesTabs() {
    return recipientSuppliesTabs;
  }
  public void setRecipientSuppliesTabs(String recipientSuppliesTabs) {
    this.recipientSuppliesTabs = recipientSuppliesTabs;
  }

  
  /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
   **/
  @ApiModelProperty(value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  @JsonProperty("signingGroupId")
  public String getSigningGroupId() {
    return signingGroupId;
  }
  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }

  
  /**
   * The display name for the signing group. \n\nMaximum Length: 100 characters.
   **/
  @ApiModelProperty(value = "The display name for the signing group. \n\nMaximum Length: 100 characters.")
  @JsonProperty("signingGroupName")
  public String getSigningGroupName() {
    return signingGroupName;
  }
  public void setSigningGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
  }

  
  /**
   * A complex type that contains information about users in the signing group.
   **/
  @ApiModelProperty(value = "A complex type that contains information about users in the signing group.")
  @JsonProperty("signingGroupUsers")
  public java.util.List<UserInfo> getSigningGroupUsers() {
    return signingGroupUsers;
  }
  public void setSigningGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
  }

  
  /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   **/
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  @JsonProperty("recipientId")
  public String getRecipientId() {
    return recipientId;
  }
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("recipientIdGuid")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }
  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }

  
  /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and must conform to account’s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then access code is not required.
   **/
  @ApiModelProperty(value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and must conform to account’s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then access code is not required.")
  @JsonProperty("accessCode")
  public String getAccessCode() {
    return accessCode;
  }
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  
  /**
   * This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.
   **/
  @ApiModelProperty(value = "This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.")
  @JsonProperty("addAccessCodeToEmail")
  public String getAddAccessCodeToEmail() {
    return addAccessCodeToEmail;
  }
  public void setAddAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
  }

  
  /**
   * When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity.
   **/
  @ApiModelProperty(value = "When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity.")
  @JsonProperty("requireIdLookup")
  public String getRequireIdLookup() {
    return requireIdLookup;
  }
  public void setRequireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
  }

  
  /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.\n\n*Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.
   **/
  @ApiModelProperty(value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.\n\n*Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
  @JsonProperty("idCheckConfigurationName")
  public String getIdCheckConfigurationName() {
    return idCheckConfigurationName;
  }
  public void setIdCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
  }

  
  /**
   * Lists the social ID type that can be used for recipient authentication.
   **/
  @ApiModelProperty(value = "Lists the social ID type that can be used for recipient authentication.")
  @JsonProperty("socialAuthentications")
  public java.util.List<SocialAuthentication> getSocialAuthentications() {
    return socialAuthentications;
  }
  public void setSocialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("phoneAuthentication")
  public RecipientPhoneAuthentication getPhoneAuthentication() {
    return phoneAuthentication;
  }
  public void setPhoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("samlAuthentication")
  public RecipientSAMLAuthentication getSamlAuthentication() {
    return samlAuthentication;
  }
  public void setSamlAuthentication(RecipientSAMLAuthentication samlAuthentication) {
    this.samlAuthentication = samlAuthentication;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("smsAuthentication")
  public RecipientSMSAuthentication getSmsAuthentication() {
    return smsAuthentication;
  }
  public void setSmsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * Specifies whether the recipient is embedded or remote. \n\nIf the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng. \n\nMaximum length: 100 characters.
   **/
  @ApiModelProperty(value = "Specifies whether the recipient is embedded or remote. \n\nIf the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng. \n\nMaximum length: 100 characters.")
  @JsonProperty("clientUserId")
  public String getClientUserId() {
    return clientUserId;
  }
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  
  /**
   * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender’s system (the server responding to the URL) must request a recipient token to launch a signing session. \n\nIf set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.\n\nIt is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient’s identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.\n\nIf the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets. \n\n*Example*: \n\n`http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]`
   **/
  @ApiModelProperty(value = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender’s system (the server responding to the URL) must request a recipient token to launch a signing session. \n\nIf set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.\n\nIt is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient’s identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.\n\nIf the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets. \n\n*Example*: \n\n`http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]`")
  @JsonProperty("embeddedRecipientStartURL")
  public String getEmbeddedRecipientStartURL() {
    return embeddedRecipientStartURL;
  }
  public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
  }

  
  /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.
   **/
  @ApiModelProperty(value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  @JsonProperty("customFields")
  public java.util.List<String> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(java.util.List<String> customFields) {
    this.customFields = customFields;
  }

  
  /**
   * Specifies the routing order of the recipient in the envelope.
   **/
  @ApiModelProperty(value = "Specifies the routing order of the recipient in the envelope.")
  @JsonProperty("routingOrder")
  public String getRoutingOrder() {
    return routingOrder;
  }
  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("idCheckInformationInput")
  public IdCheckInformationInput getIdCheckInformationInput() {
    return idCheckInformationInput;
  }
  public void setIdCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
  }

  
  /**
   * Reserved:
   **/
  @ApiModelProperty(value = "Reserved:")
  @JsonProperty("recipientAttachments")
  public java.util.List<Attachment> getRecipientAttachments() {
    return recipientAttachments;
  }
  public void setRecipientAttachments(java.util.List<Attachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
  }

  
  /**
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.\n\nMaximum Length: 1000 characters.
   **/
  @ApiModelProperty(value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.\n\nMaximum Length: 1000 characters.")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  
  /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
   **/
  @ApiModelProperty(value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  @JsonProperty("roleName")
  public String getRoleName() {
    return roleName;
  }
  public void setRoleName(String roleName) {
    this.roleName = roleName;
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
   * Reserved: For DocuSign use only.
   **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  @JsonProperty("signedDateTime")
  public String getSignedDateTime() {
    return signedDateTime;
  }
  public void setSignedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
  }

  
  /**
   * Reserved: For DocuSign use only.
   **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  @JsonProperty("deliveredDateTime")
  public String getDeliveredDateTime() {
    return deliveredDateTime;
  }
  public void setDeliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
  }

  
  /**
   * The date and time the recipient declined the document.
   **/
  @ApiModelProperty(value = "The date and time the recipient declined the document.")
  @JsonProperty("declinedDateTime")
  public String getDeclinedDateTime() {
    return declinedDateTime;
  }
  public void setDeclinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
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
   * The reason the recipient declined the document.
   **/
  @ApiModelProperty(value = "The reason the recipient declined the document.")
  @JsonProperty("declinedReason")
  public String getDeclinedReason() {
    return declinedReason;
  }
  public void setDeclinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
  }

  
  /**
   * Reserved: For DocuSign use only.
   **/
  @ApiModelProperty(value = "Reserved: For DocuSign use only.")
  @JsonProperty("deliveryMethod")
  public String getDeliveryMethod() {
    return deliveryMethod;
  }
  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  
  /**
   * Reserved:
   **/
  @ApiModelProperty(value = "Reserved:")
  @JsonProperty("faxNumber")
  public String getFaxNumber() {
    return faxNumber;
  }
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  
  /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
   **/
  @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.")
  @JsonProperty("templateLocked")
  public String getTemplateLocked() {
    return templateLocked;
  }
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  
  /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   **/
  @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  @JsonProperty("templateRequired")
  public String getTemplateRequired() {
    return templateRequired;
  }
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("emailNotification")
  public RecipientEmailNotification getEmailNotification() {
    return emailNotification;
  }
  public void setEmailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
  }

  
  /**
   * When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account.
   **/
  @ApiModelProperty(value = "When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account.")
  @JsonProperty("inheritEmailNotificationConfiguration")
  public String getInheritEmailNotificationConfiguration() {
    return inheritEmailNotificationConfiguration;
  }
  public void setInheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("recipientAuthenticationStatus")
  public AuthenticationStatus getRecipientAuthenticationStatus() {
    return recipientAuthenticationStatus;
  }
  public void setRecipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("totalTabCount")
  public String getTotalTabCount() {
    return totalTabCount;
  }
  public void setTotalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InPersonSigner inPersonSigner = (InPersonSigner) o;
    return Objects.equals(hostName, inPersonSigner.hostName) &&
        Objects.equals(hostEmail, inPersonSigner.hostEmail) &&
        Objects.equals(signerName, inPersonSigner.signerName) &&
        Objects.equals(signerEmail, inPersonSigner.signerEmail) &&
        Objects.equals(signatureInfo, inPersonSigner.signatureInfo) &&
        Objects.equals(defaultRecipient, inPersonSigner.defaultRecipient) &&
        Objects.equals(offlineAttributes, inPersonSigner.offlineAttributes) &&
        Objects.equals(tabs, inPersonSigner.tabs) &&
        Objects.equals(signInEachLocation, inPersonSigner.signInEachLocation) &&
        Objects.equals(requireSignerCertificate, inPersonSigner.requireSignerCertificate) &&
        Objects.equals(requireSignOnPaper, inPersonSigner.requireSignOnPaper) &&
        Objects.equals(canSignOffline, inPersonSigner.canSignOffline) &&
        Objects.equals(recipientSuppliesTabs, inPersonSigner.recipientSuppliesTabs) &&
        Objects.equals(signingGroupId, inPersonSigner.signingGroupId) &&
        Objects.equals(signingGroupName, inPersonSigner.signingGroupName) &&
        Objects.equals(signingGroupUsers, inPersonSigner.signingGroupUsers) &&
        Objects.equals(recipientId, inPersonSigner.recipientId) &&
        Objects.equals(recipientIdGuid, inPersonSigner.recipientIdGuid) &&
        Objects.equals(accessCode, inPersonSigner.accessCode) &&
        Objects.equals(addAccessCodeToEmail, inPersonSigner.addAccessCodeToEmail) &&
        Objects.equals(requireIdLookup, inPersonSigner.requireIdLookup) &&
        Objects.equals(idCheckConfigurationName, inPersonSigner.idCheckConfigurationName) &&
        Objects.equals(socialAuthentications, inPersonSigner.socialAuthentications) &&
        Objects.equals(phoneAuthentication, inPersonSigner.phoneAuthentication) &&
        Objects.equals(samlAuthentication, inPersonSigner.samlAuthentication) &&
        Objects.equals(smsAuthentication, inPersonSigner.smsAuthentication) &&
        Objects.equals(userId, inPersonSigner.userId) &&
        Objects.equals(clientUserId, inPersonSigner.clientUserId) &&
        Objects.equals(embeddedRecipientStartURL, inPersonSigner.embeddedRecipientStartURL) &&
        Objects.equals(customFields, inPersonSigner.customFields) &&
        Objects.equals(routingOrder, inPersonSigner.routingOrder) &&
        Objects.equals(idCheckInformationInput, inPersonSigner.idCheckInformationInput) &&
        Objects.equals(recipientAttachments, inPersonSigner.recipientAttachments) &&
        Objects.equals(note, inPersonSigner.note) &&
        Objects.equals(roleName, inPersonSigner.roleName) &&
        Objects.equals(status, inPersonSigner.status) &&
        Objects.equals(signedDateTime, inPersonSigner.signedDateTime) &&
        Objects.equals(deliveredDateTime, inPersonSigner.deliveredDateTime) &&
        Objects.equals(declinedDateTime, inPersonSigner.declinedDateTime) &&
        Objects.equals(sentDateTime, inPersonSigner.sentDateTime) &&
        Objects.equals(declinedReason, inPersonSigner.declinedReason) &&
        Objects.equals(deliveryMethod, inPersonSigner.deliveryMethod) &&
        Objects.equals(faxNumber, inPersonSigner.faxNumber) &&
        Objects.equals(templateLocked, inPersonSigner.templateLocked) &&
        Objects.equals(templateRequired, inPersonSigner.templateRequired) &&
        Objects.equals(emailNotification, inPersonSigner.emailNotification) &&
        Objects.equals(inheritEmailNotificationConfiguration, inPersonSigner.inheritEmailNotificationConfiguration) &&
        Objects.equals(errorDetails, inPersonSigner.errorDetails) &&
        Objects.equals(recipientAuthenticationStatus, inPersonSigner.recipientAuthenticationStatus) &&
        Objects.equals(totalTabCount, inPersonSigner.totalTabCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostName, hostEmail, signerName, signerEmail, signatureInfo, defaultRecipient, offlineAttributes, tabs, signInEachLocation, requireSignerCertificate, requireSignOnPaper, canSignOffline, recipientSuppliesTabs, signingGroupId, signingGroupName, signingGroupUsers, recipientId, recipientIdGuid, accessCode, addAccessCodeToEmail, requireIdLookup, idCheckConfigurationName, socialAuthentications, phoneAuthentication, samlAuthentication, smsAuthentication, userId, clientUserId, embeddedRecipientStartURL, customFields, routingOrder, idCheckInformationInput, recipientAttachments, note, roleName, status, signedDateTime, deliveredDateTime, declinedDateTime, sentDateTime, declinedReason, deliveryMethod, faxNumber, templateLocked, templateRequired, emailNotification, inheritEmailNotificationConfiguration, errorDetails, recipientAuthenticationStatus, totalTabCount);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InPersonSigner {\n");
    
    sb.append("    hostName: ").append(StringUtil.toIndentedString(hostName)).append("\n");
    sb.append("    hostEmail: ").append(StringUtil.toIndentedString(hostEmail)).append("\n");
    sb.append("    signerName: ").append(StringUtil.toIndentedString(signerName)).append("\n");
    sb.append("    signerEmail: ").append(StringUtil.toIndentedString(signerEmail)).append("\n");
    sb.append("    signatureInfo: ").append(StringUtil.toIndentedString(signatureInfo)).append("\n");
    sb.append("    defaultRecipient: ").append(StringUtil.toIndentedString(defaultRecipient)).append("\n");
    sb.append("    offlineAttributes: ").append(StringUtil.toIndentedString(offlineAttributes)).append("\n");
    sb.append("    tabs: ").append(StringUtil.toIndentedString(tabs)).append("\n");
    sb.append("    signInEachLocation: ").append(StringUtil.toIndentedString(signInEachLocation)).append("\n");
    sb.append("    requireSignerCertificate: ").append(StringUtil.toIndentedString(requireSignerCertificate)).append("\n");
    sb.append("    requireSignOnPaper: ").append(StringUtil.toIndentedString(requireSignOnPaper)).append("\n");
    sb.append("    canSignOffline: ").append(StringUtil.toIndentedString(canSignOffline)).append("\n");
    sb.append("    recipientSuppliesTabs: ").append(StringUtil.toIndentedString(recipientSuppliesTabs)).append("\n");
    sb.append("    signingGroupId: ").append(StringUtil.toIndentedString(signingGroupId)).append("\n");
    sb.append("    signingGroupName: ").append(StringUtil.toIndentedString(signingGroupName)).append("\n");
    sb.append("    signingGroupUsers: ").append(StringUtil.toIndentedString(signingGroupUsers)).append("\n");
    sb.append("    recipientId: ").append(StringUtil.toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(StringUtil.toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    accessCode: ").append(StringUtil.toIndentedString(accessCode)).append("\n");
    sb.append("    addAccessCodeToEmail: ").append(StringUtil.toIndentedString(addAccessCodeToEmail)).append("\n");
    sb.append("    requireIdLookup: ").append(StringUtil.toIndentedString(requireIdLookup)).append("\n");
    sb.append("    idCheckConfigurationName: ").append(StringUtil.toIndentedString(idCheckConfigurationName)).append("\n");
    sb.append("    socialAuthentications: ").append(StringUtil.toIndentedString(socialAuthentications)).append("\n");
    sb.append("    phoneAuthentication: ").append(StringUtil.toIndentedString(phoneAuthentication)).append("\n");
    sb.append("    samlAuthentication: ").append(StringUtil.toIndentedString(samlAuthentication)).append("\n");
    sb.append("    smsAuthentication: ").append(StringUtil.toIndentedString(smsAuthentication)).append("\n");
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("    clientUserId: ").append(StringUtil.toIndentedString(clientUserId)).append("\n");
    sb.append("    embeddedRecipientStartURL: ").append(StringUtil.toIndentedString(embeddedRecipientStartURL)).append("\n");
    sb.append("    customFields: ").append(StringUtil.toIndentedString(customFields)).append("\n");
    sb.append("    routingOrder: ").append(StringUtil.toIndentedString(routingOrder)).append("\n");
    sb.append("    idCheckInformationInput: ").append(StringUtil.toIndentedString(idCheckInformationInput)).append("\n");
    sb.append("    recipientAttachments: ").append(StringUtil.toIndentedString(recipientAttachments)).append("\n");
    sb.append("    note: ").append(StringUtil.toIndentedString(note)).append("\n");
    sb.append("    roleName: ").append(StringUtil.toIndentedString(roleName)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    signedDateTime: ").append(StringUtil.toIndentedString(signedDateTime)).append("\n");
    sb.append("    deliveredDateTime: ").append(StringUtil.toIndentedString(deliveredDateTime)).append("\n");
    sb.append("    declinedDateTime: ").append(StringUtil.toIndentedString(declinedDateTime)).append("\n");
    sb.append("    sentDateTime: ").append(StringUtil.toIndentedString(sentDateTime)).append("\n");
    sb.append("    declinedReason: ").append(StringUtil.toIndentedString(declinedReason)).append("\n");
    sb.append("    deliveryMethod: ").append(StringUtil.toIndentedString(deliveryMethod)).append("\n");
    sb.append("    faxNumber: ").append(StringUtil.toIndentedString(faxNumber)).append("\n");
    sb.append("    templateLocked: ").append(StringUtil.toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(StringUtil.toIndentedString(templateRequired)).append("\n");
    sb.append("    emailNotification: ").append(StringUtil.toIndentedString(emailNotification)).append("\n");
    sb.append("    inheritEmailNotificationConfiguration: ").append(StringUtil.toIndentedString(inheritEmailNotificationConfiguration)).append("\n");
    sb.append("    errorDetails: ").append(StringUtil.toIndentedString(errorDetails)).append("\n");
    sb.append("    recipientAuthenticationStatus: ").append(StringUtil.toIndentedString(recipientAuthenticationStatus)).append("\n");
    sb.append("    totalTabCount: ").append(StringUtil.toIndentedString(totalTabCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
