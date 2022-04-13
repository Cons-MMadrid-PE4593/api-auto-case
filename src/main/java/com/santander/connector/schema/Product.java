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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModelProperty;

/**
 * Product
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class Product {

	@JsonProperty("ProductId")
	private String productId = null;
	
	@JsonProperty("ProductDesc")
	private String productDesc = null;
	
	@JsonProperty("ProductTypeId")
	private String productTypeId = null;
	
	@JsonProperty("ProductTypeDesc")
	private String productTypeDesc = null;
	
	@JsonProperty("MarketIso")
	private String marketIso = null;

	@JsonProperty("DefaultCurrency")
	private String defaultCurrency = null;

	@JsonProperty("ProductOnline")
	private String productOnline = null;

	@JsonProperty("ProductStartDate")
	private String productStartDate = null;

	@JsonProperty("ProductEndDate")
	private String productEndDate = null;

	@JsonProperty("DefaultRate")
	private String defaultRate = null;

	@JsonProperty("ManufacturerDepositContribution")
	private String manufacturerDepositContribution = null;

	@JsonProperty("MaxPayment")
	private String maxPayment = null;

	@JsonProperty("ProductValidations")
	private ProductValidations productValidations = null;

	@JsonProperty("ProductFees")
	private ProductFees productFees = null;

	@JsonProperty("CapCodes")
	private CapCodes capCodes = null;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Product capCodes(CapCodes capCodes) {
		this.capCodes = capCodes;
		return this;
	}

	/**
	 * Get capCodes
	 * 
	 * @return capCodes
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public CapCodes getCapCodes() {
		return capCodes;
	}

	public void setCapCodes(CapCodes capCodes) {
		this.capCodes = capCodes;
	}

	public Product defaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
		return this;
	}

	/**
	 * Get defaultCurrency
	 * 
	 * @return defaultCurrency
	 **/
	@ApiModelProperty(value = "")

	public String getDefaultCurrency() {
		return defaultCurrency;
	}

	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}

	public Product defaultRate(String defaultRate) {
		this.defaultRate = defaultRate;
		return this;
	}

	/**
	 * Get defaultRate
	 * 
	 * @return defaultRate
	 **/
	@ApiModelProperty(value = "")

	public String getDefaultRate() {
		return defaultRate;
	}

	public void setDefaultRate(String defaultRate) {
		this.defaultRate = defaultRate;
	}

	public Product manufacturerDepositContribution(String manufacturerDepositContribution) {
		this.manufacturerDepositContribution = manufacturerDepositContribution;
		return this;
	}

	/**
	 * Get manufacturerDepositContribution
	 * 
	 * @return manufacturerDepositContribution
	 **/
	@ApiModelProperty(value = "")

	public String getManufacturerDepositContribution() {
		return manufacturerDepositContribution;
	}

	public void setManufacturerDepositContribution(String manufacturerDepositContribution) {
		this.manufacturerDepositContribution = manufacturerDepositContribution;
	}

	public Product marketIso(String marketIso) {
		this.marketIso = marketIso;
		return this;
	}

	/**
	 * Get marketIso
	 * 
	 * @return marketIso
	 **/
	@ApiModelProperty(value = "")

	public String getMarketIso() {
		return marketIso;
	}

	public void setMarketIso(String marketIso) {
		this.marketIso = marketIso;
	}

	public Product maxPayment(String maxPayment) {
		this.maxPayment = maxPayment;
		return this;
	}

	/**
	 * Get maxPayment
	 * 
	 * @return maxPayment
	 **/
	@ApiModelProperty(value = "")

	public String getMaxPayment() {
		return maxPayment;
	}

	public void setMaxPayment(String maxPayment) {
		this.maxPayment = maxPayment;
	}

	public Product productDesc(String productDesc) {
		this.productDesc = productDesc;
		return this;
	}

	/**
	 * Get productDesc
	 * 
	 * @return productDesc
	 **/
	@ApiModelProperty(value = "")

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Product productEndDate(String productEndDate) {
		this.productEndDate = productEndDate;
		return this;
	}

	/**
	 * Get productEndDate
	 * 
	 * @return productEndDate
	 **/
	@ApiModelProperty(value = "")

	public String getProductEndDate() {
		return productEndDate;
	}

	public void setProductEndDate(String productEndDate) {
		this.productEndDate = productEndDate;
	}

	public Product productFees(ProductFees productFees) {
		this.productFees = productFees;
		return this;
	}

	/**
	 * Get productFees
	 * 
	 * @return productFees
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public ProductFees getProductFees() {
		return productFees;
	}

	public void setProductFees(ProductFees productFees) {
		this.productFees = productFees;
	}

	public Product productId(String productId) {
		this.productId = productId;
		return this;
	}

	/**
	 * Get productId
	 * 
	 * @return productId
	 **/
	@ApiModelProperty(value = "")

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Product productOnline(String productOnline) {
		this.productOnline = productOnline;
		return this;
	}

	/**
	 * Get productOnline
	 * 
	 * @return productOnline
	 **/
	@ApiModelProperty(value = "")

	public String getProductOnline() {
		return productOnline;
	}

	public void setProductOnline(String productOnline) {
		this.productOnline = productOnline;
	}

	public Product productStartDate(String productStartDate) {
		this.productStartDate = productStartDate;
		return this;
	}

	/**
	 * Get productStartDate
	 * 
	 * @return productStartDate
	 **/
	@ApiModelProperty(value = "")

	public String getProductStartDate() {
		return productStartDate;
	}

	public void setProductStartDate(String productStartDate) {
		this.productStartDate = productStartDate;
	}

	public Product productTypeDesc(String productTypeDesc) {
		this.productTypeDesc = productTypeDesc;
		return this;
	}

	/**
	 * Get productTypeDesc
	 * 
	 * @return productTypeDesc
	 **/
	@ApiModelProperty(value = "")

	public String getProductTypeDesc() {
		return productTypeDesc;
	}

	public void setProductTypeDesc(String productTypeDesc) {
		this.productTypeDesc = productTypeDesc;
	}

	public Product productTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
		return this;
	}

	/**
	 * Get productTypeId
	 * 
	 * @return productTypeId
	 **/
	@ApiModelProperty(value = "")

	public String getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}

	public Product productValidations(ProductValidations productValidations) {
		this.productValidations = productValidations;
		return this;
	}

	/**
	 * Get productValidations
	 * 
	 * @return productValidations
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public ProductValidations getProductValidations() {
		return productValidations;
	}

	public void setProductValidations(ProductValidations productValidations) {
		this.productValidations = productValidations;
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
		Product product = (Product) o;
		return Objects.equals(this.capCodes, product.capCodes)
				&& Objects.equals(this.defaultCurrency, product.defaultCurrency)
				&& Objects.equals(this.defaultRate, product.defaultRate)
				&& Objects.equals(this.manufacturerDepositContribution, product.manufacturerDepositContribution)
				&& Objects.equals(this.marketIso, product.marketIso)
				&& Objects.equals(this.maxPayment, product.maxPayment)
				&& Objects.equals(this.productDesc, product.productDesc)
				&& Objects.equals(this.productEndDate, product.productEndDate)
				&& Objects.equals(this.productFees, product.productFees)
				&& Objects.equals(this.productId, product.productId)
				&& Objects.equals(this.productOnline, product.productOnline)
				&& Objects.equals(this.productStartDate, product.productStartDate)
				&& Objects.equals(this.productTypeDesc, product.productTypeDesc)
				&& Objects.equals(this.productTypeId, product.productTypeId)
				&& Objects.equals(this.productValidations, product.productValidations);
	}

	@Override
	public int hashCode() {
		return Objects.hash(capCodes, defaultCurrency, defaultRate, manufacturerDepositContribution, marketIso,
				maxPayment, productDesc, productEndDate, productFees, productId, productOnline, productStartDate,
				productTypeDesc, productTypeId, productValidations);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Product {\n");

		sb.append("    capCodes: ").append(toIndentedString(capCodes)).append("\n");
		sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
		sb.append("    defaultRate: ").append(toIndentedString(defaultRate)).append("\n");
		sb.append("    manufacturerDepositContribution: ").append(toIndentedString(manufacturerDepositContribution))
				.append("\n");
		sb.append("    marketIso: ").append(toIndentedString(marketIso)).append("\n");
		sb.append("    maxPayment: ").append(toIndentedString(maxPayment)).append("\n");
		sb.append("    productDesc: ").append(toIndentedString(productDesc)).append("\n");
		sb.append("    productEndDate: ").append(toIndentedString(productEndDate)).append("\n");
		sb.append("    productFees: ").append(toIndentedString(productFees)).append("\n");
		sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
		sb.append("    productOnline: ").append(toIndentedString(productOnline)).append("\n");
		sb.append("    productStartDate: ").append(toIndentedString(productStartDate)).append("\n");
		sb.append("    productTypeDesc: ").append(toIndentedString(productTypeDesc)).append("\n");
		sb.append("    productTypeId: ").append(toIndentedString(productTypeId)).append("\n");
		sb.append("    productValidations: ").append(toIndentedString(productValidations)).append("\n");
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
