package com.santander.connector.schema;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductValidations
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class ProductValidations   {
  @JsonProperty("Validation")

  private List<Validation> validation = null;
  
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public ProductValidations validation(List<Validation> validation) {
    this.validation = validation;
    return this;
  }

  /**
   * Get validation
   * @return validation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Validation> getValidation() {
    return validation;
  }

  public void setValidation(List<Validation> validation) {
    this.validation = validation;
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
    ProductValidations productValidations = (ProductValidations) o;
    return Objects.equals(this.validation, productValidations.validation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductValidations {\n");
    
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
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

