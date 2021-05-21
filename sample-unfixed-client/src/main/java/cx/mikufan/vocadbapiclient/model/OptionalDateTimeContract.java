/*
 * VocaDbWeb
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cx.mikufan.vocadbapiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * OptionalDateTimeContract
 */
@JsonPropertyOrder({
  OptionalDateTimeContract.JSON_PROPERTY_DAY,
  OptionalDateTimeContract.JSON_PROPERTY_FORMATTED,
  OptionalDateTimeContract.JSON_PROPERTY_IS_EMPTY,
  OptionalDateTimeContract.JSON_PROPERTY_MONTH,
  OptionalDateTimeContract.JSON_PROPERTY_YEAR
})
@JsonTypeName("OptionalDateTimeContract")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-20T13:35:02.772911500-04:00[America/New_York]")
public class OptionalDateTimeContract {
  public static final String JSON_PROPERTY_DAY = "day";
  private Integer day;

  public static final String JSON_PROPERTY_FORMATTED = "formatted";
  private String formatted;

  public static final String JSON_PROPERTY_IS_EMPTY = "isEmpty";
  private Boolean isEmpty;

  public static final String JSON_PROPERTY_MONTH = "month";
  private Integer month;

  public static final String JSON_PROPERTY_YEAR = "year";
  private Integer year;


  public OptionalDateTimeContract day(Integer day) {
    
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDay() {
    return day;
  }


  public void setDay(Integer day) {
    this.day = day;
  }


  public OptionalDateTimeContract formatted(String formatted) {
    
    this.formatted = formatted;
    return this;
  }

   /**
   * Get formatted
   * @return formatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORMATTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormatted() {
    return formatted;
  }


  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }


  public OptionalDateTimeContract isEmpty(Boolean isEmpty) {
    
    this.isEmpty = isEmpty;
    return this;
  }

   /**
   * Get isEmpty
   * @return isEmpty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_EMPTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEmpty() {
    return isEmpty;
  }


  public void setIsEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
  }


  public OptionalDateTimeContract month(Integer month) {
    
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMonth() {
    return month;
  }


  public void setMonth(Integer month) {
    this.month = month;
  }


  public OptionalDateTimeContract year(Integer year) {
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionalDateTimeContract optionalDateTimeContract = (OptionalDateTimeContract) o;
    return Objects.equals(this.day, optionalDateTimeContract.day) &&
        Objects.equals(this.formatted, optionalDateTimeContract.formatted) &&
        Objects.equals(this.isEmpty, optionalDateTimeContract.isEmpty) &&
        Objects.equals(this.month, optionalDateTimeContract.month) &&
        Objects.equals(this.year, optionalDateTimeContract.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, formatted, isEmpty, month, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionalDateTimeContract {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    isEmpty: ").append(toIndentedString(isEmpty)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

