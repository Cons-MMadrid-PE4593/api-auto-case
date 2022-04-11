package com.santander.connector.schema;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import io.swagger.annotations.ApiModelProperty;

/**
 * GQSSchema
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-08T15:10:29.013+02:00")

@JsonRootName("GQS")
public class GQSSchema   {
  @JsonProperty("Dealer")
  private String dealer = null;

  @JsonProperty("Product")
  private String product = null;

  @JsonProperty("RetailPrice")
  private String retailPrice = null;

  @JsonProperty("DownPayment")
  private String downPayment = null;

  @JsonProperty("OtherLoansAmount")
  private String otherLoansAmount = null;

  @JsonProperty("Balloon")
  private String balloon = null;

  @JsonProperty("Period")
  private String period = null;

  @JsonProperty("Instalment")
  private String instalment = null;

  @JsonProperty("InterestRate")
  private String interestRate = null;

  @JsonProperty("DeferredPeriod")
  private String deferredPeriod = null;

  @JsonProperty("Mileage")
  private String mileage = null;

  @JsonProperty("InsurancePrime")
  private String insurancePrime = null;

  @JsonProperty("FirstInstalmentDate")
  private String firstInstalmentDate = null;

  @JsonProperty("InterestDate")
  private String interestDate = null;

  @JsonProperty("FeeType")
  private String feeType = null;

  @JsonProperty("AssetsCode")
  private AssetsCode assetsCode = null;

  @JsonProperty("Insurances")
  private Insurances insurances = null;

  public GQSSchema dealer(String dealer) {
    this.dealer = dealer;
    return this;
  }

  /**
   * Get dealer
   * @return dealer
  **/
  @ApiModelProperty(value = "")


  public String getDealer() {
    return dealer;
  }

  public void setDealer(String dealer) {
    this.dealer = dealer;
  }

  public GQSSchema product(String product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")


  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public GQSSchema retailPrice(String retailPrice) {
    this.retailPrice = retailPrice;
    return this;
  }

  /**
   * Get retailPrice
   * @return retailPrice
  **/
  @ApiModelProperty(value = "")


  public String getRetailPrice() {
    return retailPrice;
  }

  public void setRetailPrice(String retailPrice) {
    this.retailPrice = retailPrice;
  }

  public GQSSchema downPayment(String downPayment) {
    this.downPayment = downPayment;
    return this;
  }

  /**
   * Get downPayment
   * @return downPayment
  **/
  @ApiModelProperty(value = "")


  public String getDownPayment() {
    return downPayment;
  }

  public void setDownPayment(String downPayment) {
    this.downPayment = downPayment;
  }

  public GQSSchema otherLoansAmount(String otherLoansAmount) {
    this.otherLoansAmount = otherLoansAmount;
    return this;
  }

  /**
   * Get otherLoansAmount
   * @return otherLoansAmount
  **/
  @ApiModelProperty(value = "")


  public String getOtherLoansAmount() {
    return otherLoansAmount;
  }

  public void setOtherLoansAmount(String otherLoansAmount) {
    this.otherLoansAmount = otherLoansAmount;
  }

  public GQSSchema balloon(String balloon) {
    this.balloon = balloon;
    return this;
  }

  /**
   * Get balloon
   * @return balloon
  **/
  @ApiModelProperty(value = "")


  public String getBalloon() {
    return balloon;
  }

  public void setBalloon(String balloon) {
    this.balloon = balloon;
  }

  public GQSSchema period(String period) {
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

  public GQSSchema instalment(String instalment) {
    this.instalment = instalment;
    return this;
  }

  /**
   * Get instalment
   * @return instalment
  **/
  @ApiModelProperty(value = "")


  public String getInstalment() {
    return instalment;
  }

  public void setInstalment(String instalment) {
    this.instalment = instalment;
  }

  public GQSSchema interestRate(String interestRate) {
    this.interestRate = interestRate;
    return this;
  }

  /**
   * Get interestRate
   * @return interestRate
  **/
  @ApiModelProperty(value = "")


  public String getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(String interestRate) {
    this.interestRate = interestRate;
  }

  public GQSSchema deferredPeriod(String deferredPeriod) {
    this.deferredPeriod = deferredPeriod;
    return this;
  }

  /**
   * Get deferredPeriod
   * @return deferredPeriod
  **/
  @ApiModelProperty(value = "")


  public String getDeferredPeriod() {
    return deferredPeriod;
  }

  public void setDeferredPeriod(String deferredPeriod) {
    this.deferredPeriod = deferredPeriod;
  }

  public GQSSchema mileage(String mileage) {
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

  public GQSSchema insurancePrime(String insurancePrime) {
    this.insurancePrime = insurancePrime;
    return this;
  }

  /**
   * Get insurancePrime
   * @return insurancePrime
  **/
  @ApiModelProperty(value = "")


  public String getInsurancePrime() {
    return insurancePrime;
  }

  public void setInsurancePrime(String insurancePrime) {
    this.insurancePrime = insurancePrime;
  }

  public GQSSchema firstInstalmentDate(String firstInstalmentDate) {
    this.firstInstalmentDate = firstInstalmentDate;
    return this;
  }

  /**
   * Get firstInstalmentDate
   * @return firstInstalmentDate
  **/
  @ApiModelProperty(value = "")


  public String getFirstInstalmentDate() {
    return firstInstalmentDate;
  }

  public void setFirstInstalmentDate(String firstInstalmentDate) {
    this.firstInstalmentDate = firstInstalmentDate;
  }

  public GQSSchema interestDate(String interestDate) {
    this.interestDate = interestDate;
    return this;
  }

  /**
   * Get interestDate
   * @return interestDate
  **/
  @ApiModelProperty(value = "")


  public String getInterestDate() {
    return interestDate;
  }

  public void setInterestDate(String interestDate) {
    this.interestDate = interestDate;
  }

  public GQSSchema feeType(String feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Get feeType
   * @return feeType
  **/
  @ApiModelProperty(value = "")


  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }

  public GQSSchema assetsCode(AssetsCode assetsCode) {
    this.assetsCode = assetsCode;
    return this;
  }

  /**
   * Get assetsCode
   * @return assetsCode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AssetsCode getAssetsCode() {
    return assetsCode;
  }

  public void setAssetsCode(AssetsCode assetsCode) {
    this.assetsCode = assetsCode;
  }

  public GQSSchema insurances(Insurances insurances) {
    this.insurances = insurances;
    return this;
  }

  /**
   * Get insurances
   * @return insurances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Insurances getInsurances() {
    return insurances;
  }

  public void setInsurances(Insurances insurances) {
    this.insurances = insurances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GQSSchema gqSSchema = (GQSSchema) o;
    return Objects.equals(this.dealer, gqSSchema.dealer) &&
        Objects.equals(this.product, gqSSchema.product) &&
        Objects.equals(this.retailPrice, gqSSchema.retailPrice) &&
        Objects.equals(this.downPayment, gqSSchema.downPayment) &&
        Objects.equals(this.otherLoansAmount, gqSSchema.otherLoansAmount) &&
        Objects.equals(this.balloon, gqSSchema.balloon) &&
        Objects.equals(this.period, gqSSchema.period) &&
        Objects.equals(this.instalment, gqSSchema.instalment) &&
        Objects.equals(this.interestRate, gqSSchema.interestRate) &&
        Objects.equals(this.deferredPeriod, gqSSchema.deferredPeriod) &&
        Objects.equals(this.mileage, gqSSchema.mileage) &&
        Objects.equals(this.insurancePrime, gqSSchema.insurancePrime) &&
        Objects.equals(this.firstInstalmentDate, gqSSchema.firstInstalmentDate) &&
        Objects.equals(this.interestDate, gqSSchema.interestDate) &&
        Objects.equals(this.feeType, gqSSchema.feeType) &&
        Objects.equals(this.assetsCode, gqSSchema.assetsCode) &&
        Objects.equals(this.insurances, gqSSchema.insurances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealer, product, retailPrice, downPayment, otherLoansAmount, balloon, period, instalment, interestRate, deferredPeriod, mileage, insurancePrime, firstInstalmentDate, interestDate, feeType, assetsCode, insurances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GQSSchema {\n");
    
    sb.append("    dealer: ").append(toIndentedString(dealer)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    retailPrice: ").append(toIndentedString(retailPrice)).append("\n");
    sb.append("    downPayment: ").append(toIndentedString(downPayment)).append("\n");
    sb.append("    otherLoansAmount: ").append(toIndentedString(otherLoansAmount)).append("\n");
    sb.append("    balloon: ").append(toIndentedString(balloon)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    instalment: ").append(toIndentedString(instalment)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    deferredPeriod: ").append(toIndentedString(deferredPeriod)).append("\n");
    sb.append("    mileage: ").append(toIndentedString(mileage)).append("\n");
    sb.append("    insurancePrime: ").append(toIndentedString(insurancePrime)).append("\n");
    sb.append("    firstInstalmentDate: ").append(toIndentedString(firstInstalmentDate)).append("\n");
    sb.append("    interestDate: ").append(toIndentedString(interestDate)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    assetsCode: ").append(toIndentedString(assetsCode)).append("\n");
    sb.append("    insurances: ").append(toIndentedString(insurances)).append("\n");
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

