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
import cx.mikufan.vocadbapiclient.model.PVExtendedMetadata;
import cx.mikufan.vocadbapiclient.model.PVService;
import cx.mikufan.vocadbapiclient.model.PVType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PVContract
 */
@JsonPropertyOrder({
  PVContract.JSON_PROPERTY_AUTHOR,
  PVContract.JSON_PROPERTY_CREATED_BY,
  PVContract.JSON_PROPERTY_DISABLED,
  PVContract.JSON_PROPERTY_EXTENDED_METADATA,
  PVContract.JSON_PROPERTY_ID,
  PVContract.JSON_PROPERTY_LENGTH,
  PVContract.JSON_PROPERTY_NAME,
  PVContract.JSON_PROPERTY_PUBLISH_DATE,
  PVContract.JSON_PROPERTY_PV_ID,
  PVContract.JSON_PROPERTY_SERVICE,
  PVContract.JSON_PROPERTY_PV_TYPE,
  PVContract.JSON_PROPERTY_THUMB_URL,
  PVContract.JSON_PROPERTY_URL
})
@JsonTypeName("PVContract")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-20T13:35:02.772911500-04:00[America/New_York]")
public class PVContract {
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private String author;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private Integer createdBy;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_EXTENDED_METADATA = "extendedMetadata";
  private PVExtendedMetadata extendedMetadata;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_LENGTH = "length";
  private Integer length;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PUBLISH_DATE = "publishDate";
  private LocalDateTime publishDate;

  public static final String JSON_PROPERTY_PV_ID = "pvId";
  private String pvId;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private PVService service;

  public static final String JSON_PROPERTY_PV_TYPE = "pvType";
  private PVType pvType;

  public static final String JSON_PROPERTY_THUMB_URL = "thumbUrl";
  private String thumbUrl;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;


  public PVContract author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    this.author = author;
  }


  public PVContract createdBy(Integer createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }


  public PVContract disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public PVContract extendedMetadata(PVExtendedMetadata extendedMetadata) {
    
    this.extendedMetadata = extendedMetadata;
    return this;
  }

   /**
   * Get extendedMetadata
   * @return extendedMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTENDED_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PVExtendedMetadata getExtendedMetadata() {
    return extendedMetadata;
  }


  public void setExtendedMetadata(PVExtendedMetadata extendedMetadata) {
    this.extendedMetadata = extendedMetadata;
  }


  public PVContract id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public PVContract length(Integer length) {
    
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLength() {
    return length;
  }


  public void setLength(Integer length) {
    this.length = length;
  }


  public PVContract name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PVContract publishDate(LocalDateTime publishDate) {
    
    this.publishDate = publishDate;
    return this;
  }

   /**
   * Get publishDate
   * @return publishDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUBLISH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getPublishDate() {
    return publishDate;
  }


  public void setPublishDate(LocalDateTime publishDate) {
    this.publishDate = publishDate;
  }


  public PVContract pvId(String pvId) {
    
    this.pvId = pvId;
    return this;
  }

   /**
   * Get pvId
   * @return pvId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PV_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPvId() {
    return pvId;
  }


  public void setPvId(String pvId) {
    this.pvId = pvId;
  }


  public PVContract service(PVService service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PVService getService() {
    return service;
  }


  public void setService(PVService service) {
    this.service = service;
  }


  public PVContract pvType(PVType pvType) {
    
    this.pvType = pvType;
    return this;
  }

   /**
   * Get pvType
   * @return pvType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PV_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PVType getPvType() {
    return pvType;
  }


  public void setPvType(PVType pvType) {
    this.pvType = pvType;
  }


  public PVContract thumbUrl(String thumbUrl) {
    
    this.thumbUrl = thumbUrl;
    return this;
  }

   /**
   * Get thumbUrl
   * @return thumbUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THUMB_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThumbUrl() {
    return thumbUrl;
  }


  public void setThumbUrl(String thumbUrl) {
    this.thumbUrl = thumbUrl;
  }


  public PVContract url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PVContract pvContract = (PVContract) o;
    return Objects.equals(this.author, pvContract.author) &&
        Objects.equals(this.createdBy, pvContract.createdBy) &&
        Objects.equals(this.disabled, pvContract.disabled) &&
        Objects.equals(this.extendedMetadata, pvContract.extendedMetadata) &&
        Objects.equals(this.id, pvContract.id) &&
        Objects.equals(this.length, pvContract.length) &&
        Objects.equals(this.name, pvContract.name) &&
        Objects.equals(this.publishDate, pvContract.publishDate) &&
        Objects.equals(this.pvId, pvContract.pvId) &&
        Objects.equals(this.service, pvContract.service) &&
        Objects.equals(this.pvType, pvContract.pvType) &&
        Objects.equals(this.thumbUrl, pvContract.thumbUrl) &&
        Objects.equals(this.url, pvContract.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, createdBy, disabled, extendedMetadata, id, length, name, publishDate, pvId, service, pvType, thumbUrl, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PVContract {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    extendedMetadata: ").append(toIndentedString(extendedMetadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publishDate: ").append(toIndentedString(publishDate)).append("\n");
    sb.append("    pvId: ").append(toIndentedString(pvId)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    pvType: ").append(toIndentedString(pvType)).append("\n");
    sb.append("    thumbUrl: ").append(toIndentedString(thumbUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
