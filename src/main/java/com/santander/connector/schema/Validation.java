package com.santander.connector.schema;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Validation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class Validation   {
  @JsonProperty("MaxAmountFinanced")
  private String maxAmountFinanced = null;

  @JsonProperty("MaxDeposit")
  private String maxDeposit = null;

  @JsonProperty("MaxPeriod")
  private String maxPeriod = null;

  @JsonProperty("MaxVehicleAgeAtEnd")
  private String maxVehicleAgeAtEnd = null;

  @JsonProperty("MaxVehicleAgeAtStart")
  private String maxVehicleAgeAtStart = null;

  @JsonProperty("MinAmountFinanced")
  private String minAmountFinanced = null;

  @JsonProperty("MinDeposit")
  private String minDeposit = null;

  @JsonProperty("MinPeriod")
  private String minPeriod = null;

  @JsonProperty("MinVehicleAgeAtStart")
  private String minVehicleAgeAtStart = null;

  @JsonProperty("Period")
  private String period = null;

  @JsonProperty("Rate")
  private String rate = null;
  
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public Validation maxAmountFinanced(String maxAmountFinanced) {
    this.maxAmountFinanced = maxAmountFinanced;
    return this;
  }

  /**
   * Get maxAmountFinanced
   * @return maxAmountFinanced
  **/
  @ApiModelProperty(value = "")


  public String getMaxAmountFinanced() {
    return maxAmountFinanced;
  }

  public void setMaxAmountFinanced(String maxAmountFinanced) {
    this.maxAmountFinanced = maxAmountFinanced;
  }

  public Validation maxDeposit(String maxDeposit) {
    this.maxDeposit = maxDeposit;
    return this;
  }

  /**
   * Get maxDeposit
   * @return maxDeposit
  **/
  @ApiModelProperty(value = "")


  public String getMaxDeposit() {
    return maxDeposit;
  }

  public void setMaxDeposit(String maxDeposit) {
    this.maxDeposit = maxDeposit;
  }

  public Validation maxPeriod(String maxPeriod) {
    this.maxPeriod = maxPeriod;
    return this;
  }

  /**
   * Get maxPeriod
   * @return maxPeriod
  **/
  @ApiModelProperty(value = "")


  public String getMaxPeriod() {
    return maxPeriod;
  }

  public void setMaxPeriod(String maxPeriod) {
    this.maxPeriod = maxPeriod;
  }

  public Validation maxVehicleAgeAtEnd(String maxVehicleAgeAtEnd) {
    this.maxVehicleAgeAtEnd = maxVehicleAgeAtEnd;
    return this;
  }

  /**
   * Get maxVehicleAgeAtEnd
   * @return maxVehicleAgeAtEnd
  **/
  @ApiModelProperty(value = "")


  public String getMaxVehicleAgeAtEnd() {
    return maxVehicleAgeAtEnd;
  }

  public void setMaxVehicleAgeAtEnd(String maxVehicleAgeAtEnd) {
    this.maxVehicleAgeAtEnd = maxVehicleAgeAtEnd;
  }

  public Validation maxVehicleAgeAtStart(String maxVehicleAgeAtStart) {
    this.maxVehicleAgeAtStart = maxVehicleAgeAtStart;
    return this;
  }

  /**
   * Get maxVehicleAgeAtStart
   * @return maxVehicleAgeAtStart
  **/
  @ApiModelProperty(value = "")


  public String getMaxVehicleAgeAtStart() {
    return maxVehicleAgeAtStart;
  }

  public void setMaxVehicleAgeAtStart(String maxVehicleAgeAtStart) {
    this.maxVehicleAgeAtStart = maxVehicleAgeAtStart;
  }

  public Validation minAmountFinanced(String minAmountFinanced) {
    this.minAmountFinanced = minAmountFinanced;
    return this;
  }

  /**
   * Get minAmountFinanced
   * @return minAmountFinanced
  **/
  @ApiModelProperty(value = "")


  public String getMinAmountFinanced() {
    return minAmountFinanced;
  }

  public void setMinAmountFinanced(String minAmountFinanced) {
    this.minAmountFinanced = minAmountFinanced;
  }

  public Validation minDeposit(String minDeposit) {
    this.minDeposit = minDeposit;
    return this;
  }

  /**
   * Get minDeposit
   * @return minDeposit
  **/
  @ApiModelProperty(value = "")


  public String getMinDeposit() {
    return minDeposit;
  }

  public void setMinDeposit(String minDeposit) {
    this.minDeposit = minDeposit;
  }

  public Validation minPeriod(String minPeriod) {
    this.minPeriod = minPeriod;
    return this;
  }

  /**
   * Get minPeriod
   * @return minPeriod
  **/
  @ApiModelProperty(value = "")


  public String getMinPeriod() {
    return minPeriod;
  }

  public void setMinPeriod(String minPeriod) {
    this.minPeriod = minPeriod;
  }

  public Validation minVehicleAgeAtStart(String minVehicleAgeAtStart) {
    this.minVehicleAgeAtStart = minVehicleAgeAtStart;
    return this;
  }

  /**
   * Get minVehicleAgeAtStart
   * @return minVehicleAgeAtStart
  **/
  @ApiModelProperty(value = "")


  public String getMinVehicleAgeAtStart() {
    return minVehicleAgeAtStart;
  }

  public void setMinVehicleAgeAtStart(String minVehicleAgeAtStart) {
    this.minVehicleAgeAtStart = minVehicleAgeAtStart;
  }

  public Validation period(String period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(value = "")


  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public Validation rate(String rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(value = "")


  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }
  
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
	return additionalProperties;
  }
  
  @JsonAnySetter
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
	this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Validation validation = (Validation) o;
    return Objects.equals(this.maxAmountFinanced, validation.maxAmountFinanced) &&
        Objects.equals(this.maxDeposit, validation.maxDeposit) &&
        Objects.equals(this.maxPeriod, validation.maxPeriod) &&
        Objects.equals(this.maxVehicleAgeAtEnd, validation.maxVehicleAgeAtEnd) &&
        Objects.equals(this.maxVehicleAgeAtStart, validation.maxVehicleAgeAtStart) &&
        Objects.equals(this.minAmountFinanced, validation.minAmountFinanced) &&
        Objects.equals(this.minDeposit, validation.minDeposit) &&
        Objects.equals(this.minPeriod, validation.minPeriod) &&
        Objects.equals(this.minVehicleAgeAtStart, validation.minVehicleAgeAtStart) &&
        Objects.equals(this.period, validation.period) &&
        Objects.equals(this.rate, validation.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxAmountFinanced, maxDeposit, maxPeriod, maxVehicleAgeAtEnd, maxVehicleAgeAtStart, minAmountFinanced, minDeposit, minPeriod, minVehicleAgeAtStart, period, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Validation {\n");
    
    sb.append("    maxAmountFinanced: ").append(toIndentedString(maxAmountFinanced)).append("\n");
    sb.append("    maxDeposit: ").append(toIndentedString(maxDeposit)).append("\n");
    sb.append("    maxPeriod: ").append(toIndentedString(maxPeriod)).append("\n");
    sb.append("    maxVehicleAgeAtEnd: ").append(toIndentedString(maxVehicleAgeAtEnd)).append("\n");
    sb.append("    maxVehicleAgeAtStart: ").append(toIndentedString(maxVehicleAgeAtStart)).append("\n");
    sb.append("    minAmountFinanced: ").append(toIndentedString(minAmountFinanced)).append("\n");
    sb.append("    minDeposit: ").append(toIndentedString(minDeposit)).append("\n");
    sb.append("    minPeriod: ").append(toIndentedString(minPeriod)).append("\n");
    sb.append("    minVehicleAgeAtStart: ").append(toIndentedString(minVehicleAgeAtStart)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

