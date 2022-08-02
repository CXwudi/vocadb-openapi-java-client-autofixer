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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import mikufan.cx.vocadbapiclient.model.EntryStatus;
import mikufan.cx.vocadbapiclient.model.UserForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ArchivedObjectVersionForApiContract
 */
@JsonPropertyOrder({
  ArchivedObjectVersionForApiContract.JSON_PROPERTY_AGENT_NAME,
  ArchivedObjectVersionForApiContract.JSON_PROPERTY_ANYTHING_CHANGED,
  ArchivedObjectVersionForApiContract.JSON_PROPERTY_AUTHOR,
  ArchivedObjectVersionForApiContract.JSON_PROPERTY_CHANGED_FIELDS,
  ArchivedObjectVersionForApiContract.JSON_PROPERTY_CREATED,
  ArchivedObjectVersionForApiContract.JSON_PROPERTY_HIDDEN,
  ArchivedObjectVersionForApiContract.JSON_PROPERTY_ID,
  ArchivedObjectVersionForApiContract.JSON_PROPERTY_NOTES,
  ArchivedObjectVersionForApiContract.JSON_PROPERTY_REASON,
  ArchivedObjectVersionForApiContract.JSON_PROPERTY_STATUS,
  ArchivedObjectVersionForApiContract.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-02T20:16:06.008977Z[Etc/UTC]")
public class ArchivedObjectVersionForApiContract {
  public static final String JSON_PROPERTY_AGENT_NAME = "agentName";
  private String agentName;

  public static final String JSON_PROPERTY_ANYTHING_CHANGED = "anythingChanged";
  private Boolean anythingChanged;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  private UserForApiContract author;

  public static final String JSON_PROPERTY_CHANGED_FIELDS = "changedFields";
  private List<String> changedFields = null;

  public static final String JSON_PROPERTY_CREATED = "created";
  private LocalDateTime created;

  public static final String JSON_PROPERTY_HIDDEN = "hidden";
  private Boolean hidden;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_STATUS = "status";
  private EntryStatus status;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public ArchivedObjectVersionForApiContract() {
  }

  public ArchivedObjectVersionForApiContract agentName(String agentName) {
    
    this.agentName = agentName;
    return this;
  }

   /**
   * Get agentName
   * @return agentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentName() {
    return agentName;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public ArchivedObjectVersionForApiContract anythingChanged(Boolean anythingChanged) {
    
    this.anythingChanged = anythingChanged;
    return this;
  }

   /**
   * Get anythingChanged
   * @return anythingChanged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANYTHING_CHANGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAnythingChanged() {
    return anythingChanged;
  }


  @JsonProperty(JSON_PROPERTY_ANYTHING_CHANGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnythingChanged(Boolean anythingChanged) {
    this.anythingChanged = anythingChanged;
  }


  public ArchivedObjectVersionForApiContract author(UserForApiContract author) {
    
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

  public UserForApiContract getAuthor() {
    return author;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthor(UserForApiContract author) {
    this.author = author;
  }


  public ArchivedObjectVersionForApiContract changedFields(List<String> changedFields) {
    
    this.changedFields = changedFields;
    return this;
  }

  public ArchivedObjectVersionForApiContract addChangedFieldsItem(String changedFieldsItem) {
    if (this.changedFields == null) {
      this.changedFields = new ArrayList<>();
    }
    this.changedFields.add(changedFieldsItem);
    return this;
  }

   /**
   * Get changedFields
   * @return changedFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANGED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getChangedFields() {
    return changedFields;
  }


  @JsonProperty(JSON_PROPERTY_CHANGED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChangedFields(List<String> changedFields) {
    this.changedFields = changedFields;
  }


  public ArchivedObjectVersionForApiContract created(LocalDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(LocalDateTime created) {
    this.created = created;
  }


  public ArchivedObjectVersionForApiContract hidden(Boolean hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Get hidden
   * @return hidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHidden() {
    return hidden;
  }


  @JsonProperty(JSON_PROPERTY_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  public ArchivedObjectVersionForApiContract id(Integer id) {
    
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


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Integer id) {
    this.id = id;
  }


  public ArchivedObjectVersionForApiContract notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotes() {
    return notes;
  }


  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotes(String notes) {
    this.notes = notes;
  }


  public ArchivedObjectVersionForApiContract reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  public ArchivedObjectVersionForApiContract status(EntryStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntryStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(EntryStatus status) {
    this.status = status;
  }


  public ArchivedObjectVersionForApiContract version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchivedObjectVersionForApiContract archivedObjectVersionForApiContract = (ArchivedObjectVersionForApiContract) o;
    return Objects.equals(this.agentName, archivedObjectVersionForApiContract.agentName) &&
        Objects.equals(this.anythingChanged, archivedObjectVersionForApiContract.anythingChanged) &&
        Objects.equals(this.author, archivedObjectVersionForApiContract.author) &&
        Objects.equals(this.changedFields, archivedObjectVersionForApiContract.changedFields) &&
        Objects.equals(this.created, archivedObjectVersionForApiContract.created) &&
        Objects.equals(this.hidden, archivedObjectVersionForApiContract.hidden) &&
        Objects.equals(this.id, archivedObjectVersionForApiContract.id) &&
        Objects.equals(this.notes, archivedObjectVersionForApiContract.notes) &&
        Objects.equals(this.reason, archivedObjectVersionForApiContract.reason) &&
        Objects.equals(this.status, archivedObjectVersionForApiContract.status) &&
        Objects.equals(this.version, archivedObjectVersionForApiContract.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentName, anythingChanged, author, changedFields, created, hidden, id, notes, reason, status, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchivedObjectVersionForApiContract {\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    anythingChanged: ").append(toIndentedString(anythingChanged)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    changedFields: ").append(toIndentedString(changedFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

