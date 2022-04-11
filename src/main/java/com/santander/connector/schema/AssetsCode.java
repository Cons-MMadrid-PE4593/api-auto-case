package com.santander.connector.schema;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * AssetsCode
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-08T15:10:29.013+02:00")

@XmlAccessorType(XmlAccessType.FIELD)
public class AssetsCode   {

  @JsonProperty("Mileage")
  private String mileage = null;

  @JsonProperty("EstimatedAnnualMileage")
  private String estimatedAnnualMileage = null;

  @JsonProperty("RegisterDate")
  private String registerDate = null;

  @JsonProperty("LicensePlate")
  private String licensePlate = null;

  @JsonProperty("Vin")
  private String vin = null;

  @JacksonXmlText
  private String text = null;

  public AssetsCode mileage(String mileage) {
    this.mileage = mileage;
    return this;
  }

  /**
   * Get mileage
   * @return mileage
  **/
  @ApiModelProperty(value = "")


  public String getMileage() {
    return mileage;
  }

  public void setMileage(String mileage) {
    this.mileage = mileage;
  }

  public AssetsCode estimatedAnnualMileage(String estimatedAnnualMileage) {
    this.estimatedAnnualMileage = estimatedAnnualMileage;
    return this;
  }

  /**
   * Get estimatedAnnualMileage
   * @return estimatedAnnualMileage
  **/
  @ApiModelProperty(value = "")


  public String getEstimatedAnnualMileage() {
    return estimatedAnnualMileage;
  }

  public void setEstimatedAnnualMileage(String estimatedAnnualMileage) {
    this.estimatedAnnualMileage = estimatedAnnualMileage;
  }

  public AssetsCode registerDate(String registerDate) {
    this.registerDate = registerDate;
    return this;
  }

  /**
   * Get registerDate
   * @return registerDate
  **/
  @ApiModelProperty(value = "")


  public String getRegisterDate() {
    return registerDate;
  }

  public void setRegisterDate(String registerDate) {
    this.registerDate = registerDate;
  }

  public AssetsCode licensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
    return this;
  }

  /**
   * Get licensePlate
   * @return licensePlate
  **/
  @ApiModelProperty(value = "")


  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public AssetsCode vin(String vin) {
    this.vin = vin;
    return this;
  }

  /**
   * Get vin
   * @return vin
  **/
  @ApiModelProperty(value = "")


  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public AssetsCode text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsCode assetsCode = (AssetsCode) o;
    return Objects.equals(this.mileage, assetsCode.mileage) &&
        Objects.equals(this.estimatedAnnualMileage, assetsCode.estimatedAnnualMileage) &&
        Objects.equals(this.registerDate, assetsCode.registerDate) &&
        Objects.equals(this.licensePlate, assetsCode.licensePlate) &&
        Objects.equals(this.vin, assetsCode.vin) &&
        Objects.equals(this.text, assetsCode.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mileage, estimatedAnnualMileage, registerDate, licensePlate, vin, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsCode {\n");
    
    sb.append("    mileage: ").append(toIndentedString(mileage)).append("\n");
    sb.append("    estimatedAnnualMileage: ").append(toIndentedString(estimatedAnnualMileage)).append("\n");
    sb.append("    registerDate: ").append(toIndentedString(registerDate)).append("\n");
    sb.append("    licensePlate: ").append(toIndentedString(licensePlate)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

