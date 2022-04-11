package com.santander.connector.schema;

import java.util.ArrayList;
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

import io.swagger.annotations.ApiModelProperty;

/**
 * CapCodes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class CapCodes   {
  @JsonProperty("CapCode")
  @Valid
  private List<String> capCode = null;
  
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public CapCodes capCode(List<String> capCode) {
    this.capCode = capCode;
    return this;
  }

  public CapCodes addCapCodeItem(String capCodeItem) {
    if (this.capCode == null) {
      this.capCode = new ArrayList<String>();
    }
    this.capCode.add(capCodeItem);
    return this;
  }

  /**
   * Get capCode
   * @return capCode
  **/
  @ApiModelProperty(value = "")


  public List<String> getCapCode() {
    return capCode;
  }

  public void setCapCode(List<String> capCode) {
    this.capCode = capCode;
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
    CapCodes capCodes = (CapCodes) o;
    return Objects.equals(this.capCode, capCodes.capCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapCodes {\n");
    
    sb.append("    capCode: ").append(toIndentedString(capCode)).append("\n");
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

