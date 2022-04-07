package com.santander.connector.schema;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * InputParamsSchema
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class InputParams   {
  @JsonProperty("DealerCode")
  private String dealerCode = null;

  @JsonProperty("User")
  private String user = null;

  @JsonProperty("Password")
  private String password = null;

  @JsonProperty("CapCode")
  private String capCode = null;

  @JsonProperty("VIN")
  private String VIN = null;

  @JsonProperty("LicensePlate")
  private String licensePlate = null;

  public InputParams dealerCode(String dealerCode) {
    this.dealerCode = dealerCode;
    return this;
  }

  /**
   * Get dealerCode
   * @return dealerCode
  **/
  @ApiModelProperty(value = "")


  public String getDealerCode() {
    return dealerCode;
  }

  public void setDealerCode(String dealerCode) {
    this.dealerCode = dealerCode;
  }

  public InputParams user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")


  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public InputParams password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public InputParams capCode(String capCode) {
    this.capCode = capCode;
    return this;
  }

  /**
   * Get capCode
   * @return capCode
  **/
  @ApiModelProperty(value = "")


  public String getCapCode() {
    return capCode;
  }

  public void setCapCode(String capCode) {
    this.capCode = capCode;
  }

  public InputParams VIN(String VIN) {
    this.VIN = VIN;
    return this;
  }

  /**
   * Get VIN
   * @return VIN
  **/
  @ApiModelProperty(value = "")


  public String getVIN() {
    return VIN;
  }

  public void setVIN(String VIN) {
    this.VIN = VIN;
  }

  public InputParams licensePlate(String licensePlate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputParams inputParamsSchema = (InputParams) o;
    return Objects.equals(this.dealerCode, inputParamsSchema.dealerCode) &&
        Objects.equals(this.user, inputParamsSchema.user) &&
        Objects.equals(this.password, inputParamsSchema.password) &&
        Objects.equals(this.capCode, inputParamsSchema.capCode) &&
        Objects.equals(this.VIN, inputParamsSchema.VIN) &&
        Objects.equals(this.licensePlate, inputParamsSchema.licensePlate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealerCode, user, password, capCode, VIN, licensePlate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputParamsSchema {\n");
    
    sb.append("    dealerCode: ").append(toIndentedString(dealerCode)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    capCode: ").append(toIndentedString(capCode)).append("\n");
    sb.append("    VIN: ").append(toIndentedString(VIN)).append("\n");
    sb.append("    licensePlate: ").append(toIndentedString(licensePlate)).append("\n");
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

