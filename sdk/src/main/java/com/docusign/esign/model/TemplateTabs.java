package com.docusign.esign.model;

import com.docusign.esign.client.StringUtil;
import com.docusign.esign.model.Zip;
import com.docusign.esign.model.DateSigned;
import com.docusign.esign.model.Company;
import com.docusign.esign.model.Email;
import com.docusign.esign.model.SignerAttachment;
import com.docusign.esign.model.EnvelopeId;
import com.docusign.esign.model.RadioGroup;
import com.docusign.esign.model.FirstName;
import com.docusign.esign.model.Title;
import com.docusign.esign.model.Text;
import com.docusign.esign.model.SignHere;
import java.math.BigDecimal;
import com.docusign.esign.model.Date;
import com.docusign.esign.model.EmailAddress;
import com.docusign.esign.model.Ssn;
import com.docusign.esign.model.Decline;
import com.docusign.esign.model.Checkbox;
import com.docusign.esign.model.FullName;
import com.docusign.esign.model.Note;
import com.docusign.esign.model.List;
import com.docusign.esign.model.LastName;
import com.docusign.esign.model.FormulaTab;
import com.docusign.esign.model.InitialHere;
import com.docusign.esign.model.Approve;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-14T16:41:01.888-08:00")
public class TemplateTabs   {
  
  private java.util.List<SignHere> signHereTabs = new java.util.ArrayList<SignHere>();
  private java.util.List<InitialHere> initialHereTabs = new java.util.ArrayList<InitialHere>();
  private java.util.List<SignerAttachment> signerAttachmentTabs = new java.util.ArrayList<SignerAttachment>();
  private java.util.List<Approve> approveTabs = new java.util.ArrayList<Approve>();
  private java.util.List<Decline> declineTabs = new java.util.ArrayList<Decline>();
  private java.util.List<FullName> fullNameTabs = new java.util.ArrayList<FullName>();
  private java.util.List<DateSigned> dateSignedTabs = new java.util.ArrayList<DateSigned>();
  private java.util.List<EnvelopeId> envelopeIdTabs = new java.util.ArrayList<EnvelopeId>();
  private java.util.List<Company> companyTabs = new java.util.ArrayList<Company>();
  private java.util.List<Title> titleTabs = new java.util.ArrayList<Title>();
  private java.util.List<Text> textTabs = new java.util.ArrayList<Text>();
  private java.util.List<BigDecimal> numberTabs = new java.util.ArrayList<BigDecimal>();
  private java.util.List<Ssn> ssnTabs = new java.util.ArrayList<Ssn>();
  private java.util.List<Date> dateTabs = new java.util.ArrayList<Date>();
  private java.util.List<Zip> zipTabs = new java.util.ArrayList<Zip>();
  private java.util.List<Email> emailTabs = new java.util.ArrayList<Email>();
  private java.util.List<Note> noteTabs = new java.util.ArrayList<Note>();
  private java.util.List<Checkbox> checkboxTabs = new java.util.ArrayList<Checkbox>();
  private java.util.List<RadioGroup> radioGroupTabs = new java.util.ArrayList<RadioGroup>();
  private java.util.List<List> listTabs = new java.util.ArrayList<List>();
  private java.util.List<FirstName> firstNameTabs = new java.util.ArrayList<FirstName>();
  private java.util.List<LastName> lastNameTabs = new java.util.ArrayList<LastName>();
  private java.util.List<EmailAddress> emailAddressTabs = new java.util.ArrayList<EmailAddress>();
  private java.util.List<FormulaTab> formulaTabs = new java.util.ArrayList<FormulaTab>();

  
  /**
   * A complex type the contains information about the tag that specifies where the recipient places their signature in the document. The \"optional\" parameter sets if the signature is required or optional.
   **/
  @ApiModelProperty(value = "A complex type the contains information about the tag that specifies where the recipient places their signature in the document. The \"optional\" parameter sets if the signature is required or optional.")
  @JsonProperty("signHereTabs")
  public java.util.List<SignHere> getSignHereTabs() {
    return signHereTabs;
  }
  public void setSignHereTabs(java.util.List<SignHere> signHereTabs) {
    this.signHereTabs = signHereTabs;
  }

  
  /**
   * Specifies a tag to have a recipient place their initials in the document. The \"optional\" parameter sets if the initials are required or optional.
   **/
  @ApiModelProperty(value = "Specifies a tag to have a recipient place their initials in the document. The \"optional\" parameter sets if the initials are required or optional.")
  @JsonProperty("initialHereTabs")
  public java.util.List<InitialHere> getInitialHereTabs() {
    return initialHereTabs;
  }
  public void setInitialHereTabs(java.util.List<InitialHere> initialHereTabs) {
    this.initialHereTabs = initialHereTabs;
  }

  
  /**
   * Specifies a tag on the document when you want the recipient to add supporting documents to an envelope.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document when you want the recipient to add supporting documents to an envelope.")
  @JsonProperty("signerAttachmentTabs")
  public java.util.List<SignerAttachment> getSignerAttachmentTabs() {
    return signerAttachmentTabs;
  }
  public void setSignerAttachmentTabs(java.util.List<SignerAttachment> signerAttachmentTabs) {
    this.signerAttachmentTabs = signerAttachmentTabs;
  }

  
  /**
   * Specifies a tag on the document where you want the recipient to approve documents in an envelope without placing a signature or initials on the document. If the recipient clicks the Approve tag during the signing process, the recipient is considered to have signed the document. No information is shown on the document for the approval, but it is recorded as a signature in the envelope history.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to approve documents in an envelope without placing a signature or initials on the document. If the recipient clicks the Approve tag during the signing process, the recipient is considered to have signed the document. No information is shown on the document for the approval, but it is recorded as a signature in the envelope history.")
  @JsonProperty("approveTabs")
  public java.util.List<Approve> getApproveTabs() {
    return approveTabs;
  }
  public void setApproveTabs(java.util.List<Approve> approveTabs) {
    this.approveTabs = approveTabs;
  }

  
  /**
   * Specifies a tag on the document where you want to give the recipient the option of declining an envelope. If the recipient clicks the Decline tag during the signing process, the envelope is voided.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want to give the recipient the option of declining an envelope. If the recipient clicks the Decline tag during the signing process, the envelope is voided.")
  @JsonProperty("declineTabs")
  public java.util.List<Decline> getDeclineTabs() {
    return declineTabs;
  }
  public void setDeclineTabs(java.util.List<Decline> declineTabs) {
    this.declineTabs = declineTabs;
  }

  
  /**
   * Specifies a tag on the document where you want the recipient's name to appear.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient's name to appear.")
  @JsonProperty("fullNameTabs")
  public java.util.List<FullName> getFullNameTabs() {
    return fullNameTabs;
  }
  public void setFullNameTabs(java.util.List<FullName> fullNameTabs) {
    this.fullNameTabs = fullNameTabs;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dateSignedTabs")
  public java.util.List<DateSigned> getDateSignedTabs() {
    return dateSignedTabs;
  }
  public void setDateSignedTabs(java.util.List<DateSigned> dateSignedTabs) {
    this.dateSignedTabs = dateSignedTabs;
  }

  
  /**
   * Specifies a tag on the document where you want the envelope ID for to appear. Recipients cannot enter or change the information in this tab, it is for informational purposes only.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the envelope ID for to appear. Recipients cannot enter or change the information in this tab, it is for informational purposes only.")
  @JsonProperty("envelopeIdTabs")
  public java.util.List<EnvelopeId> getEnvelopeIdTabs() {
    return envelopeIdTabs;
  }
  public void setEnvelopeIdTabs(java.util.List<EnvelopeId> envelopeIdTabs) {
    this.envelopeIdTabs = envelopeIdTabs;
  }

  
  /**
   * Specifies a tag on the document where you want the recipient's company name to appear.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient's company name to appear.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  @JsonProperty("companyTabs")
  public java.util.List<Company> getCompanyTabs() {
    return companyTabs;
  }
  public void setCompanyTabs(java.util.List<Company> companyTabs) {
    this.companyTabs = companyTabs;
  }

  
  /**
   * Specifies a tag on the document where you want the recipient's title to appear.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient's title to appear.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  @JsonProperty("titleTabs")
  public java.util.List<Title> getTitleTabs() {
    return titleTabs;
  }
  public void setTitleTabs(java.util.List<Title> titleTabs) {
    this.titleTabs = titleTabs;
  }

  
  /**
   * Specifies a that that is an adaptable field that allows the recipient to enter different text information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   **/
  @ApiModelProperty(value = "Specifies a that that is an adaptable field that allows the recipient to enter different text information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  @JsonProperty("textTabs")
  public java.util.List<Text> getTextTabs() {
    return textTabs;
  }
  public void setTextTabs(java.util.List<Text> textTabs) {
    this.textTabs = textTabs;
  }

  
  /**
   * Specifies a tag on the document where you want the recipient to enter a number. It uses the same parameters as a Text tab, with the validation message and pattern set for number information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter a number. It uses the same parameters as a Text tab, with the validation message and pattern set for number information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  @JsonProperty("numberTabs")
  public java.util.List<BigDecimal> getNumberTabs() {
    return numberTabs;
  }
  public void setNumberTabs(java.util.List<BigDecimal> numberTabs) {
    this.numberTabs = numberTabs;
  }

  
  /**
   * Specifies a tag on the document where you want the recipient to enter a Social Security Number (SSN). A SSN can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for SSN information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter a Social Security Number (SSN). A SSN can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for SSN information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  @JsonProperty("ssnTabs")
  public java.util.List<Ssn> getSsnTabs() {
    return ssnTabs;
  }
  public void setSsnTabs(java.util.List<Ssn> ssnTabs) {
    this.ssnTabs = ssnTabs;
  }

  
  /**
   * Specifies a tab on the document where you want the recipient to enter a date. Date tabs are single-line fields that allow date information to be entered in any format. The tooltip for this tab recommends entering the date as MM/DD/YYYY, but this is not enforced. The format entered by the signer is retained. \n\nIf you need a particular date format enforced, DocuSign recommends using a Text tab with a Validation Pattern and Validation Message to enforce the format.
   **/
  @ApiModelProperty(value = "Specifies a tab on the document where you want the recipient to enter a date. Date tabs are single-line fields that allow date information to be entered in any format. The tooltip for this tab recommends entering the date as MM/DD/YYYY, but this is not enforced. The format entered by the signer is retained. \n\nIf you need a particular date format enforced, DocuSign recommends using a Text tab with a Validation Pattern and Validation Message to enforce the format.")
  @JsonProperty("dateTabs")
  public java.util.List<Date> getDateTabs() {
    return dateTabs;
  }
  public void setDateTabs(java.util.List<Date> dateTabs) {
    this.dateTabs = dateTabs;
  }

  
  /**
   * Specifies a tag on the document where you want the recipient to enter a ZIP code. The ZIP code can be a five numbers or the ZIP+4 format with nine numbers. The zip code can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for ZIP code information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter a ZIP code. The ZIP code can be a five numbers or the ZIP+4 format with nine numbers. The zip code can be typed with or without dashes. It uses the same parameters as a Text tab, with the validation message and pattern set for ZIP code information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  @JsonProperty("zipTabs")
  public java.util.List<Zip> getZipTabs() {
    return zipTabs;
  }
  public void setZipTabs(java.util.List<Zip> zipTabs) {
    this.zipTabs = zipTabs;
  }

  
  /**
   * Specifies a tag on the document where you want the recipient to enter an email. Email tags are single-line fields that accept any characters. The system checks that a valid email format (i.e. xxx@yyy.zzz) is entered in the tag. It uses the same parameters as a Text tab, with the validation message and pattern set for email information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want the recipient to enter an email. Email tags are single-line fields that accept any characters. The system checks that a valid email format (i.e. xxx@yyy.zzz) is entered in the tag. It uses the same parameters as a Text tab, with the validation message and pattern set for email information.\n\nWhen getting information that includes this tab type, the original value of the tab when the associated envelope was sent is included in the response.")
  @JsonProperty("emailTabs")
  public java.util.List<Email> getEmailTabs() {
    return emailTabs;
  }
  public void setEmailTabs(java.util.List<Email> emailTabs) {
    this.emailTabs = emailTabs;
  }

  
  /**
   * Specifies a tag on the document where you want to place additional information, in the form of a note, on a document for a recipient.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document where you want to place additional information, in the form of a note, on a document for a recipient.")
  @JsonProperty("noteTabs")
  public java.util.List<Note> getNoteTabs() {
    return noteTabs;
  }
  public void setNoteTabs(java.util.List<Note> noteTabs) {
    this.noteTabs = noteTabs;
  }

  
  /**
   * Specifies a tag on the document in a location where the recipient can select an option.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document in a location where the recipient can select an option.")
  @JsonProperty("checkboxTabs")
  public java.util.List<Checkbox> getCheckboxTabs() {
    return checkboxTabs;
  }
  public void setCheckboxTabs(java.util.List<Checkbox> checkboxTabs) {
    this.checkboxTabs = checkboxTabs;
  }

  
  /**
   * Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document.
   **/
  @ApiModelProperty(value = "Specifies a tag on the document in a location where the recipient can select one option from a group of options using a radio button. The radio buttons do not have to be on the same page in a document.")
  @JsonProperty("radioGroupTabs")
  public java.util.List<RadioGroup> getRadioGroupTabs() {
    return radioGroupTabs;
  }
  public void setRadioGroupTabs(java.util.List<RadioGroup> radioGroupTabs) {
    this.radioGroupTabs = radioGroupTabs;
  }

  
  /**
   * Specify this tag to give your recipient a list of options, presented as a drop-down list, from which they can select.
   **/
  @ApiModelProperty(value = "Specify this tag to give your recipient a list of options, presented as a drop-down list, from which they can select.")
  @JsonProperty("listTabs")
  public java.util.List<List> getListTabs() {
    return listTabs;
  }
  public void setListTabs(java.util.List<List> listTabs) {
    this.listTabs = listTabs;
  }

  
  /**
   * Specifies tag on a document where you want the recipient's first name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the first section as the first name.
   **/
  @ApiModelProperty(value = "Specifies tag on a document where you want the recipient's first name to appear. This tag takes the recipient's name, as entered in the recipient information, splits it into sections based on spaces and uses the first section as the first name.")
  @JsonProperty("firstNameTabs")
  public java.util.List<FirstName> getFirstNameTabs() {
    return firstNameTabs;
  }
  public void setFirstNameTabs(java.util.List<FirstName> firstNameTabs) {
    this.firstNameTabs = firstNameTabs;
  }

  
  /**
   * Specifies a tag on a document where you want the recipient’s last name to appear. This tag takes the recipient’s name, as entered in the recipient information, splits it into sections based on spaces and uses the last section as the last name.
   **/
  @ApiModelProperty(value = "Specifies a tag on a document where you want the recipient’s last name to appear. This tag takes the recipient’s name, as entered in the recipient information, splits it into sections based on spaces and uses the last section as the last name.")
  @JsonProperty("lastNameTabs")
  public java.util.List<LastName> getLastNameTabs() {
    return lastNameTabs;
  }
  public void setLastNameTabs(java.util.List<LastName> lastNameTabs) {
    this.lastNameTabs = lastNameTabs;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("emailAddressTabs")
  public java.util.List<EmailAddress> getEmailAddressTabs() {
    return emailAddressTabs;
  }
  public void setEmailAddressTabs(java.util.List<EmailAddress> emailAddressTabs) {
    this.emailAddressTabs = emailAddressTabs;
  }

  
  /**
   * Specifies a tag that is used to add a calculated field to a document. Envelope recipients cannot directly enter information into the tag; the formula tab calculates and displays a new value when changes are made to the reference tag values. The reference tag information and calculation operations are entered in the \"formula\" element. See the [ML:Using the Calculated Fields Feature] quick start guide or [ML:DocuSign Service User Guide] for more information about formulas.
   **/
  @ApiModelProperty(value = "Specifies a tag that is used to add a calculated field to a document. Envelope recipients cannot directly enter information into the tag; the formula tab calculates and displays a new value when changes are made to the reference tag values. The reference tag information and calculation operations are entered in the \"formula\" element. See the [ML:Using the Calculated Fields Feature] quick start guide or [ML:DocuSign Service User Guide] for more information about formulas.")
  @JsonProperty("formulaTabs")
  public java.util.List<FormulaTab> getFormulaTabs() {
    return formulaTabs;
  }
  public void setFormulaTabs(java.util.List<FormulaTab> formulaTabs) {
    this.formulaTabs = formulaTabs;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateTabs templateTabs = (TemplateTabs) o;
    return Objects.equals(signHereTabs, templateTabs.signHereTabs) &&
        Objects.equals(initialHereTabs, templateTabs.initialHereTabs) &&
        Objects.equals(signerAttachmentTabs, templateTabs.signerAttachmentTabs) &&
        Objects.equals(approveTabs, templateTabs.approveTabs) &&
        Objects.equals(declineTabs, templateTabs.declineTabs) &&
        Objects.equals(fullNameTabs, templateTabs.fullNameTabs) &&
        Objects.equals(dateSignedTabs, templateTabs.dateSignedTabs) &&
        Objects.equals(envelopeIdTabs, templateTabs.envelopeIdTabs) &&
        Objects.equals(companyTabs, templateTabs.companyTabs) &&
        Objects.equals(titleTabs, templateTabs.titleTabs) &&
        Objects.equals(textTabs, templateTabs.textTabs) &&
        Objects.equals(numberTabs, templateTabs.numberTabs) &&
        Objects.equals(ssnTabs, templateTabs.ssnTabs) &&
        Objects.equals(dateTabs, templateTabs.dateTabs) &&
        Objects.equals(zipTabs, templateTabs.zipTabs) &&
        Objects.equals(emailTabs, templateTabs.emailTabs) &&
        Objects.equals(noteTabs, templateTabs.noteTabs) &&
        Objects.equals(checkboxTabs, templateTabs.checkboxTabs) &&
        Objects.equals(radioGroupTabs, templateTabs.radioGroupTabs) &&
        Objects.equals(listTabs, templateTabs.listTabs) &&
        Objects.equals(firstNameTabs, templateTabs.firstNameTabs) &&
        Objects.equals(lastNameTabs, templateTabs.lastNameTabs) &&
        Objects.equals(emailAddressTabs, templateTabs.emailAddressTabs) &&
        Objects.equals(formulaTabs, templateTabs.formulaTabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signHereTabs, initialHereTabs, signerAttachmentTabs, approveTabs, declineTabs, fullNameTabs, dateSignedTabs, envelopeIdTabs, companyTabs, titleTabs, textTabs, numberTabs, ssnTabs, dateTabs, zipTabs, emailTabs, noteTabs, checkboxTabs, radioGroupTabs, listTabs, firstNameTabs, lastNameTabs, emailAddressTabs, formulaTabs);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateTabs {\n");
    
    sb.append("    signHereTabs: ").append(StringUtil.toIndentedString(signHereTabs)).append("\n");
    sb.append("    initialHereTabs: ").append(StringUtil.toIndentedString(initialHereTabs)).append("\n");
    sb.append("    signerAttachmentTabs: ").append(StringUtil.toIndentedString(signerAttachmentTabs)).append("\n");
    sb.append("    approveTabs: ").append(StringUtil.toIndentedString(approveTabs)).append("\n");
    sb.append("    declineTabs: ").append(StringUtil.toIndentedString(declineTabs)).append("\n");
    sb.append("    fullNameTabs: ").append(StringUtil.toIndentedString(fullNameTabs)).append("\n");
    sb.append("    dateSignedTabs: ").append(StringUtil.toIndentedString(dateSignedTabs)).append("\n");
    sb.append("    envelopeIdTabs: ").append(StringUtil.toIndentedString(envelopeIdTabs)).append("\n");
    sb.append("    companyTabs: ").append(StringUtil.toIndentedString(companyTabs)).append("\n");
    sb.append("    titleTabs: ").append(StringUtil.toIndentedString(titleTabs)).append("\n");
    sb.append("    textTabs: ").append(StringUtil.toIndentedString(textTabs)).append("\n");
    sb.append("    numberTabs: ").append(StringUtil.toIndentedString(numberTabs)).append("\n");
    sb.append("    ssnTabs: ").append(StringUtil.toIndentedString(ssnTabs)).append("\n");
    sb.append("    dateTabs: ").append(StringUtil.toIndentedString(dateTabs)).append("\n");
    sb.append("    zipTabs: ").append(StringUtil.toIndentedString(zipTabs)).append("\n");
    sb.append("    emailTabs: ").append(StringUtil.toIndentedString(emailTabs)).append("\n");
    sb.append("    noteTabs: ").append(StringUtil.toIndentedString(noteTabs)).append("\n");
    sb.append("    checkboxTabs: ").append(StringUtil.toIndentedString(checkboxTabs)).append("\n");
    sb.append("    radioGroupTabs: ").append(StringUtil.toIndentedString(radioGroupTabs)).append("\n");
    sb.append("    listTabs: ").append(StringUtil.toIndentedString(listTabs)).append("\n");
    sb.append("    firstNameTabs: ").append(StringUtil.toIndentedString(firstNameTabs)).append("\n");
    sb.append("    lastNameTabs: ").append(StringUtil.toIndentedString(lastNameTabs)).append("\n");
    sb.append("    emailAddressTabs: ").append(StringUtil.toIndentedString(emailAddressTabs)).append("\n");
    sb.append("    formulaTabs: ").append(StringUtil.toIndentedString(formulaTabs)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
