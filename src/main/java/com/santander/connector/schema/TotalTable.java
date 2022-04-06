package com.santander.connector.schema;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * TotalTable
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class TotalTable   {
  @JsonProperty("FeesAmount")
  private String feesAmount = null;

  @JsonProperty("FeesPercentage")
  private String feesPercentage = null;

  @JsonProperty("InsuranceAmount")
  private String insuranceAmount = null;

  @JsonProperty("InsuranceDamageAmount")
  private String insuranceDamageAmount = null;

  @JsonProperty("InsuranceEmploymentAmount")
  private String insuranceEmploymentAmount = null;

  @JsonProperty("InsuranceLifeAmount")
  private String insuranceLifeAmount = null;

  public TotalTable feesAmount(String feesAmount) {
    this.feesAmount = feesAmount;
    return this;
  }

  /**
   * Get feesAmount
   * @return feesAmount
  **/
  @ApiModelProperty(value = "")


  public String getFeesAmount() {
    return feesAmount;
  }

  public void setFeesAmount(String feesAmount) {
    this.feesAmount = feesAmount;
  }

  public TotalTable feesPercentage(String feesPercentage) {
    this.feesPercentage = feesPercentage;
    return this;
  }

  /**
   * Get feesPercentage
   * @return feesPercentage
  **/
  @ApiModelProperty(value = "")


  public String getFeesPercentage() {
    return feesPercentage;
  }

  public void setFeesPercentage(String feesPercentage) {
    this.feesPercentage = feesPercentage;
  }

  public TotalTable insuranceAmount(String insuranceAmount) {
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

  public TotalTable insuranceDamageAmount(String insuranceDamageAmount) {
    this.insuranceDamageAmount = insuranceDamageAmount;
    return this;
  }

  /**
   * Get insuranceDamageAmount
   * @return insuranceDamageAmount
  **/
  @ApiModelProperty(value = "")


  public String getInsuranceDamageAmount() {
    return insuranceDamageAmount;
  }

  public void setInsuranceDamageAmount(String insuranceDamageAmount) {
    this.insuranceDamageAmount = insuranceDamageAmount;
  }

  public TotalTable insuranceEmploymentAmount(String insuranceEmploymentAmount) {
    this.insuranceEmploymentAmount = insuranceEmploymentAmount;
    return this;
  }

  /**
   * Get insuranceEmploymentAmount
   * @return insuranceEmploymentAmount
  **/
  @ApiModelProperty(value = "")


  public String getInsuranceEmploymentAmount() {
    return insuranceEmploymentAmount;
  }

  public void setInsuranceEmploymentAmount(String insuranceEmploymentAmount) {
    this.insuranceEmploymentAmount = insuranceEmploymentAmount;
  }

  public TotalTable insuranceLifeAmount(String insuranceLifeAmount) {
    this.insuranceLifeAmount = insuranceLifeAmount;
    return this;
  }

  /**
   * Get insuranceLifeAmount
   * @return insuranceLifeAmount
  **/
  @ApiModelProperty(value = "")


  public String getInsuranceLifeAmount() {
    return insuranceLifeAmount;
  }

  public void setInsuranceLifeAmount(String insuranceLifeAmount) {
    this.insuranceLifeAmount = insuranceLifeAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalTable totalTable = (TotalTable) o;
    return Objects.equals(this.feesAmount, totalTable.feesAmount) &&
        Objects.equals(this.feesPercentage, totalTable.feesPercentage) &&
        Objects.equals(this.insuranceAmount, totalTable.insuranceAmount) &&
        Objects.equals(this.insuranceDamageAmount, totalTable.insuranceDamageAmount) &&
        Objects.equals(this.insuranceEmploymentAmount, totalTable.insuranceEmploymentAmount) &&
        Objects.equals(this.insuranceLifeAmount, totalTable.insuranceLifeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feesAmount, feesPercentage, insuranceAmount, insuranceDamageAmount, insuranceEmploymentAmount, insuranceLifeAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalTable {\n");
    
    sb.append("    feesAmount: ").append(toIndentedString(feesAmount)).append("\n");
    sb.append("    feesPercentage: ").append(toIndentedString(feesPercentage)).append("\n");
    sb.append("    insuranceAmount: ").append(toIndentedString(insuranceAmount)).append("\n");
    sb.append("    insuranceDamageAmount: ").append(toIndentedString(insuranceDamageAmount)).append("\n");
    sb.append("    insuranceEmploymentAmount: ").append(toIndentedString(insuranceEmploymentAmount)).append("\n");
    sb.append("    insuranceLifeAmount: ").append(toIndentedString(insuranceLifeAmount)).append("\n");
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

