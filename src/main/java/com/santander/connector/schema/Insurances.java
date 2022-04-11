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

/**
 * Insurances
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-08T15:10:29.013+02:00")

public class Insurances   {
  @JsonProperty("LifeInsurance")
  private String lifeInsurance = null;

  @JsonProperty("DamageInsurance")
  private String damageInsurance = null;

  @JsonProperty("EmploymentInsurance")
  private String employmentInsurance = null;

  @JsonProperty("PaymentMethod")
  private String paymentMethod = null;

  @JacksonXmlText
  private String text = null;

  public Insurances lifeInsurance(String lifeInsurance) {
    this.lifeInsurance = lifeInsurance;
    return this;
  }

  /**
   * Get lifeInsurance
   * @return lifeInsurance
  **/
  @ApiModelProperty(value = "")


  public String getLifeInsurance() {
    return lifeInsurance;
  }

  public void setLifeInsurance(String lifeInsurance) {
    this.lifeInsurance = lifeInsurance;
  }

  public Insurances damageInsurance(String damageInsurance) {
    this.damageInsurance = damageInsurance;
    return this;
  }

  /**
   * Get damageInsurance
   * @return damageInsurance
  **/
  @ApiModelProperty(value = "")


  public String getDamageInsurance() {
    return damageInsurance;
  }

  public void setDamageInsurance(String damageInsurance) {
    this.damageInsurance = damageInsurance;
  }

  public Insurances employmentInsurance(String employmentInsurance) {
    this.employmentInsurance = employmentInsurance;
    return this;
  }

  /**
   * Get employmentInsurance
   * @return employmentInsurance
  **/
  @ApiModelProperty(value = "")


  public String getEmploymentInsurance() {
    return employmentInsurance;
  }

  public void setEmploymentInsurance(String employmentInsurance) {
    this.employmentInsurance = employmentInsurance;
  }

  public Insurances paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")


  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Insurances text(String text) {
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
    Insurances insurances = (Insurances) o;
    return Objects.equals(this.lifeInsurance, insurances.lifeInsurance) &&
        Objects.equals(this.damageInsurance, insurances.damageInsurance) &&
        Objects.equals(this.employmentInsurance, insurances.employmentInsurance) &&
        Objects.equals(this.paymentMethod, insurances.paymentMethod) &&
        Objects.equals(this.text, insurances.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifeInsurance, damageInsurance, employmentInsurance, paymentMethod, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Insurances {\n");
    
    sb.append("    lifeInsurance: ").append(toIndentedString(lifeInsurance)).append("\n");
    sb.append("    damageInsurance: ").append(toIndentedString(damageInsurance)).append("\n");
    sb.append("    employmentInsurance: ").append(toIndentedString(employmentInsurance)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

