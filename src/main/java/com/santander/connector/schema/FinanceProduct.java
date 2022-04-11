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
 * FinanceProduct
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class FinanceProduct   {
  @JsonProperty("Product")
  @Valid

  private List<Product> product = null;
  
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();


  public FinanceProduct product(List<Product> product) {
    this.product = product;
    return this;
  }

  public FinanceProduct addProductItem(Product productItem) {
    if (this.product == null) {
      this.product = new ArrayList<Product>();
    }
    this.product.add(productItem);
    return this;
  }

  /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Product> getProduct() {
    return product;
  }

  public void setProduct(List<Product> product) {
    this.product = product;
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
    FinanceProduct financeProduct = (FinanceProduct) o;
    return Objects.equals(this.product, financeProduct.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinanceProduct {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

