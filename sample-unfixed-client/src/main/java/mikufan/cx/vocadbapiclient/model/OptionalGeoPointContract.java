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


package mikufan.cx.vocadbapiclient.model;

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
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OptionalGeoPointContract
 */
@JsonPropertyOrder({
  OptionalGeoPointContract.JSON_PROPERTY_FORMATTED,
  OptionalGeoPointContract.JSON_PROPERTY_HAS_VALUE,
  OptionalGeoPointContract.JSON_PROPERTY_LATITUDE,
  OptionalGeoPointContract.JSON_PROPERTY_LONGITUDE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-02T20:16:06.008977Z[Etc/UTC]")
public class OptionalGeoPointContract {
  public static final String JSON_PROPERTY_FORMATTED = "formatted";
  private String formatted;

  public static final String JSON_PROPERTY_HAS_VALUE = "hasValue";
  private Boolean hasValue;

  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  public OptionalGeoPointContract() {
  }

  public OptionalGeoPointContract formatted(String formatted) {
    
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


  @JsonProperty(JSON_PROPERTY_FORMATTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }


  public OptionalGeoPointContract hasValue(Boolean hasValue) {
    
    this.hasValue = hasValue;
    return this;
  }

   /**
   * Get hasValue
   * @return hasValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasValue() {
    return hasValue;
  }


  @JsonProperty(JSON_PROPERTY_HAS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasValue(Boolean hasValue) {
    this.hasValue = hasValue;
  }


  public OptionalGeoPointContract latitude(Double latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public OptionalGeoPointContract longitude(Double longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionalGeoPointContract optionalGeoPointContract = (OptionalGeoPointContract) o;
    return Objects.equals(this.formatted, optionalGeoPointContract.formatted) &&
        Objects.equals(this.hasValue, optionalGeoPointContract.hasValue) &&
        Objects.equals(this.latitude, optionalGeoPointContract.latitude) &&
        Objects.equals(this.longitude, optionalGeoPointContract.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatted, hasValue, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionalGeoPointContract {\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    hasValue: ").append(toIndentedString(hasValue)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

