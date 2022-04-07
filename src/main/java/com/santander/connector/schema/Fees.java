package com.santander.connector.schema;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Fees
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class Fees   {
  @JsonProperty("fee_type_id")
  private String feeTypeId = null;

  @JsonProperty("fixed_fee")
  private String fixedFee = null;

  @JsonProperty("max_amount")
  private String maxAmount = null;

  @JsonProperty("min_amount")
  private String minAmount = null;

  @JsonProperty("payment_id")
  private String paymentId = null;

  @JsonProperty("pct_max_fee")
  private String pctMaxFee = null;

  public Fees feeTypeId(String feeTypeId) {
    this.feeTypeId = feeTypeId;
    return this;
  }

  /**
   * Get feeTypeId
   * @return feeTypeId
  **/
  @ApiModelProperty(value = "")


  public String getFeeTypeId() {
    return feeTypeId;
  }

  public void setFeeTypeId(String feeTypeId) {
    this.feeTypeId = feeTypeId;
  }

  public Fees fixedFee(String fixedFee) {
    this.fixedFee = fixedFee;
    return this;
  }

  /**
   * Get fixedFee
   * @return fixedFee
  **/
  @ApiModelProperty(value = "")


  public String getFixedFee() {
    return fixedFee;
  }

  public void setFixedFee(String fixedFee) {
    this.fixedFee = fixedFee;
  }

  public Fees maxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

  /**
   * Get maxAmount
   * @return maxAmount
  **/
  @ApiModelProperty(value = "")


  public String getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
  }

  public Fees minAmount(String minAmount) {
    this.minAmount = minAmount;
    return this;
  }

  /**
   * Get minAmount
   * @return minAmount
  **/
  @ApiModelProperty(value = "")


  public String getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(String minAmount) {
    this.minAmount = minAmount;
  }

  public Fees paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Get paymentId
   * @return paymentId
  **/
  @ApiModelProperty(value = "")


  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public Fees pctMaxFee(String pctMaxFee) {
    this.pctMaxFee = pctMaxFee;
    return this;
  }

  /**
   * Get pctMaxFee
   * @return pctMaxFee
  **/
  @ApiModelProperty(value = "")


  public String getPctMaxFee() {
    return pctMaxFee;
  }

  public void setPctMaxFee(String pctMaxFee) {
    this.pctMaxFee = pctMaxFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fees fees = (Fees) o;
    return Objects.equals(this.feeTypeId, fees.feeTypeId) &&
        Objects.equals(this.fixedFee, fees.fixedFee) &&
        Objects.equals(this.maxAmount, fees.maxAmount) &&
        Objects.equals(this.minAmount, fees.minAmount) &&
        Objects.equals(this.paymentId, fees.paymentId) &&
        Objects.equals(this.pctMaxFee, fees.pctMaxFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeTypeId, fixedFee, maxAmount, minAmount, paymentId, pctMaxFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fees {\n");
    
    sb.append("    feeTypeId: ").append(toIndentedString(feeTypeId)).append("\n");
    sb.append("    fixedFee: ").append(toIndentedString(fixedFee)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    pctMaxFee: ").append(toIndentedString(pctMaxFee)).append("\n");
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

