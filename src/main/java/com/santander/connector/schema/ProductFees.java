package com.santander.connector.schema;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductFees
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class ProductFees   {
  @JsonProperty("Fees")
  private Fees fees = null;
  
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public ProductFees fees(Fees fees) {
    this.fees = fees;
    return this;
  }

  /**
   * Get fees
   * @return fees
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Fees getFees() {
    return fees;
  }

  public void setFees(Fees fees) {
    this.fees = fees;
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
    ProductFees productFees = (ProductFees) o;
    return Objects.equals(this.fees, productFees.fees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductFees {\n");
    
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
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

