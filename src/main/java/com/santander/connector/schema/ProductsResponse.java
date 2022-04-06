package com.santander.connector.schema;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProductsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class ProductsResponse   {
  @JsonProperty("FinanceProduct")
  private FinanceProduct financeProduct = null;

  @JsonProperty("XmlData")
  private String xmlData = null;

  public ProductsResponse financeProduct(FinanceProduct financeProduct) {
    this.financeProduct = financeProduct;
    return this;
  }

  /**
   * Get financeProduct
   * @return financeProduct
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FinanceProduct getFinanceProduct() {
    return financeProduct;
  }

  public void setFinanceProduct(FinanceProduct financeProduct) {
    this.financeProduct = financeProduct;
  }

  public ProductsResponse xmlData(String xmlData) {
    this.xmlData = xmlData;
    return this;
  }

  /**
   * Get xmlData
   * @return xmlData
  **/
  @ApiModelProperty(value = "")


  public String getXmlData() {
    return xmlData;
  }

  public void setXmlData(String xmlData) {
    this.xmlData = xmlData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductsResponse productsResponse = (ProductsResponse) o;
    return Objects.equals(this.financeProduct, productsResponse.financeProduct) &&
        Objects.equals(this.xmlData, productsResponse.xmlData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financeProduct, xmlData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductsResponse {\n");
    
    sb.append("    financeProduct: ").append(toIndentedString(financeProduct)).append("\n");
    sb.append("    xmlData: ").append(toIndentedString(xmlData)).append("\n");
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

