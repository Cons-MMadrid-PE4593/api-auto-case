package com.santander.connector.schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * QuotingScheme
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-06T11:45:16.492+02:00")

public class QuotingScheme   {
  @JsonProperty("QuoteTable")
  @Valid
  private List<QuoteTable> quoteTable = null;

  @JsonProperty("SummaryTable")
  @Valid
  private List<SummaryTable> summaryTable = null;

  @JsonProperty("TotalTable")
  private TotalTable totalTable = null;

  @JsonProperty("text_format")
  @Valid
  private List<TextFormat> textFormat = null;
  
  @JsonProperty("html_text")
  private String htmlText = null;

  public QuotingScheme htmlText(String htmlText) {
    this.htmlText = htmlText;
    return this;
  }

  /**
   * Get html_text
   * @return html_text
  **/
  @ApiModelProperty(value = "")


  public String getHtmlText() {
    return htmlText;
  }

  public void setHtmlText(String htmlText) {
    this.htmlText = htmlText;
  }

  

  public QuotingScheme quoteTable(List<QuoteTable> quoteTable) {
    this.quoteTable = quoteTable;
    return this;
  }

  public QuotingScheme addQuoteTableItem(QuoteTable quoteTableItem) {
    if (this.quoteTable == null) {
      this.quoteTable = new ArrayList<QuoteTable>();
    }
    this.quoteTable.add(quoteTableItem);
    return this;
  }

  /**
   * Get quoteTable
   * @return quoteTable
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<QuoteTable> getQuoteTable() {
    return quoteTable;
  }

  public void setQuoteTable(List<QuoteTable> quoteTable) {
    this.quoteTable = quoteTable;
  }
  

  public QuotingScheme summaryTable(List<SummaryTable> summaryTable) {
    this.summaryTable = summaryTable;
    return this;
  }

  public QuotingScheme addSummaryTableItem(SummaryTable summaryTableItem) {
    if (this.summaryTable == null) {
      this.summaryTable = new ArrayList<SummaryTable>();
    }
    this.summaryTable.add(summaryTableItem);
    return this;
  }

  /**
   * Get summaryTable
   * @return summaryTable
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SummaryTable> getSummaryTable() {
    return summaryTable;
  }

  public void setSummaryTable(List<SummaryTable> summaryTable) {
    this.summaryTable = summaryTable;
  }
  

  public QuotingScheme totalTable(TotalTable totalTable) {
    this.totalTable = totalTable;
    return this;
  }

  /**
   * Get totalTable
   * @return totalTable
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TotalTable getTotalTable() {
    return totalTable;
  }

  public void setTotalTable(TotalTable totalTable) {
    this.totalTable = totalTable;
  }
  

  public QuotingScheme textFormat(List<TextFormat> textFormat) {
    this.textFormat = textFormat;
    return this;
  }

  public QuotingScheme addTextFormatItem(TextFormat textFormatItem) {
    if (this.textFormat == null) {
      this.textFormat = new ArrayList<TextFormat>();
    }
    this.textFormat.add(textFormatItem);
    return this;
  }

  /**
   * Get textFormat
   * @return textFormat
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TextFormat> getTextFormat() {
    return textFormat;
  }

  public void setTextFormat(List<TextFormat> textFormat) {
    this.textFormat = textFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotingScheme quotingScheme = (QuotingScheme) o;
    return Objects.equals(this.quoteTable, quotingScheme.quoteTable) &&
        Objects.equals(this.summaryTable, quotingScheme.summaryTable) &&
        Objects.equals(this.totalTable, quotingScheme.totalTable) &&
        Objects.equals(this.textFormat, quotingScheme.textFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteTable, summaryTable, totalTable, textFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotingScheme {\n");
    
    sb.append("    quoteTable: ").append(toIndentedString(quoteTable)).append("\n");
    sb.append("    summaryTable: ").append(toIndentedString(summaryTable)).append("\n");
    sb.append("    totalTable: ").append(toIndentedString(totalTable)).append("\n");
    sb.append("    textFormat: ").append(toIndentedString(textFormat)).append("\n");
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

