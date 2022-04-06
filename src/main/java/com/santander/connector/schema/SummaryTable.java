package com.santander.connector.schema;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SummaryTable
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class SummaryTable   {
  @JsonProperty("Amount")
  private String amount = null;

  @JsonProperty("NumItems")
  private String numItems = null;

  public SummaryTable amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public SummaryTable numItems(String numItems) {
    this.numItems = numItems;
    return this;
  }

  /**
   * Get numItems
   * @return numItems
  **/
  @ApiModelProperty(value = "")


  public String getNumItems() {
    return numItems;
  }

  public void setNumItems(String numItems) {
    this.numItems = numItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryTable summaryTable = (SummaryTable) o;
    return Objects.equals(this.amount, summaryTable.amount) &&
        Objects.equals(this.numItems, summaryTable.numItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, numItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryTable {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    numItems: ").append(toIndentedString(numItems)).append("\n");
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

