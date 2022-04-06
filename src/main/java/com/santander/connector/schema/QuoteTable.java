package com.santander.connector.schema;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * QuoteTable
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class QuoteTable   {
  @JsonProperty("APR")
  private String APR = null;

  @JsonProperty("Capital")
  private String capital = null;

  @JsonProperty("IRR")
  private String IRR = null;

  @JsonProperty("IRR2")
  private String irR2 = null;

  @JsonProperty("InsuranceAmount")
  private String insuranceAmount = null;

  @JsonProperty("MonthInterest")
  private String monthInterest = null;

  @JsonProperty("MonthQuote")
  private String monthQuote = null;

  @JsonProperty("QuoteID")
  private String quoteID = null;

  public QuoteTable APR(String APR) {
    this.APR = APR;
    return this;
  }

  /**
   * Get APR
   * @return APR
  **/
  @ApiModelProperty(value = "")


  public String getAPR() {
    return APR;
  }

  public void setAPR(String APR) {
    this.APR = APR;
  }

  public QuoteTable capital(String capital) {
    this.capital = capital;
    return this;
  }

  /**
   * Get capital
   * @return capital
  **/
  @ApiModelProperty(value = "")


  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  public QuoteTable IRR(String IRR) {
    this.IRR = IRR;
    return this;
  }

  /**
   * Get IRR
   * @return IRR
  **/
  @ApiModelProperty(value = "")


  public String getIRR() {
    return IRR;
  }

  public void setIRR(String IRR) {
    this.IRR = IRR;
  }

  public QuoteTable irR2(String irR2) {
    this.irR2 = irR2;
    return this;
  }

  /**
   * Get irR2
   * @return irR2
  **/
  @ApiModelProperty(value = "")


  public String getIrR2() {
    return irR2;
  }

  public void setIrR2(String irR2) {
    this.irR2 = irR2;
  }

  public QuoteTable insuranceAmount(String insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
    return this;
  }

  /**
   * Get insuranceAmount
   * @return insuranceAmount
  **/
  @ApiModelProperty(value = "")


  public String getInsuranceAmount() {
    return insuranceAmount;
  }

  public void setInsuranceAmount(String insuranceAmount) {
    this.insuranceAmount = insuranceAmount;
  }

  public QuoteTable monthInterest(String monthInterest) {
    this.monthInterest = monthInterest;
    return this;
  }

  /**
   * Get monthInterest
   * @return monthInterest
  **/
  @ApiModelProperty(value = "")


  public String getMonthInterest() {
    return monthInterest;
  }

  public void setMonthInterest(String monthInterest) {
    this.monthInterest = monthInterest;
  }

  public QuoteTable monthQuote(String monthQuote) {
    this.monthQuote = monthQuote;
    return this;
  }

  /**
   * Get monthQuote
   * @return monthQuote
  **/
  @ApiModelProperty(value = "")


  public String getMonthQuote() {
    return monthQuote;
  }

  public void setMonthQuote(String monthQuote) {
    this.monthQuote = monthQuote;
  }

  public QuoteTable quoteID(String quoteID) {
    this.quoteID = quoteID;
    return this;
  }

  /**
   * Get quoteID
   * @return quoteID
  **/
  @ApiModelProperty(value = "")


  public String getQuoteID() {
    return quoteID;
  }

  public void setQuoteID(String quoteID) {
    this.quoteID = quoteID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteTable quoteTable = (QuoteTable) o;
    return Objects.equals(this.APR, quoteTable.APR) &&
        Objects.equals(this.capital, quoteTable.capital) &&
        Objects.equals(this.IRR, quoteTable.IRR) &&
        Objects.equals(this.irR2, quoteTable.irR2) &&
        Objects.equals(this.insuranceAmount, quoteTable.insuranceAmount) &&
        Objects.equals(this.monthInterest, quoteTable.monthInterest) &&
        Objects.equals(this.monthQuote, quoteTable.monthQuote) &&
        Objects.equals(this.quoteID, quoteTable.quoteID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(APR, capital, IRR, irR2, insuranceAmount, monthInterest, monthQuote, quoteID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteTable {\n");
    
    sb.append("    APR: ").append(toIndentedString(APR)).append("\n");
    sb.append("    capital: ").append(toIndentedString(capital)).append("\n");
    sb.append("    IRR: ").append(toIndentedString(IRR)).append("\n");
    sb.append("    irR2: ").append(toIndentedString(irR2)).append("\n");
    sb.append("    insuranceAmount: ").append(toIndentedString(insuranceAmount)).append("\n");
    sb.append("    monthInterest: ").append(toIndentedString(monthInterest)).append("\n");
    sb.append("    monthQuote: ").append(toIndentedString(monthQuote)).append("\n");
    sb.append("    quoteID: ").append(toIndentedString(quoteID)).append("\n");
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

