package com.santander.connector.schema;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import io.swagger.annotations.ApiModelProperty;

/**
 * TextFormat
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class TextFormat   {
  @JsonProperty("bold")
  private String bold = null;

  @JsonProperty("size")
  private String size = null;

  @JsonProperty("underline")
  private String underline = null;
  
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();


  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
  	return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
  	if (name.equals("")) {
  		this.additionalProperties.put("text", value);
  	}
  	else {
  		this.additionalProperties.put(name, value);    		
  	}
  }

  public TextFormat bold(String bold) {
    this.bold = bold;
    return this;
  }

  /**
   * Get bold
   * @return bold
  **/
  @ApiModelProperty(value = "")


  public String getBold() {
    return bold;
  }

  public void setBold(String bold) {
    this.bold = bold;
  }

  public TextFormat size(String size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")


  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public TextFormat underline(String underline) {
    this.underline = underline;
    return this;
  }

  /**
   * Get underline
   * @return underline
  **/
  @ApiModelProperty(value = "")


  public String getUnderline() {
    return underline;
  }

  public void setUnderline(String underline) {
    this.underline = underline;
  }
  

@Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextFormat textFormat = (TextFormat) o;
    return Objects.equals(this.bold, textFormat.bold) &&
        Objects.equals(this.size, textFormat.size) &&
        Objects.equals(this.underline, textFormat.underline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bold, size, underline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextFormat {\n");
    
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
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

