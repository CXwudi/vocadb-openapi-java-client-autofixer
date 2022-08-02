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
import mikufan.cx.vocadbapiclient.model.SongForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SongInListEditContract
 */
@JsonPropertyOrder({
  SongInListEditContract.JSON_PROPERTY_SONG_IN_LIST_ID,
  SongInListEditContract.JSON_PROPERTY_NOTES,
  SongInListEditContract.JSON_PROPERTY_ORDER,
  SongInListEditContract.JSON_PROPERTY_SONG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-02T20:16:06.008977Z[Etc/UTC]")
public class SongInListEditContract {
  public static final String JSON_PROPERTY_SONG_IN_LIST_ID = "songInListId";
  private Integer songInListId;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_ORDER = "order";
  private Integer order;

  public static final String JSON_PROPERTY_SONG = "song";
  private SongForApiContract song;

  public SongInListEditContract() {
  }

  public SongInListEditContract songInListId(Integer songInListId) {
    
    this.songInListId = songInListId;
    return this;
  }

   /**
   * Get songInListId
   * @return songInListId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SONG_IN_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSongInListId() {
    return songInListId;
  }


  @JsonProperty(JSON_PROPERTY_SONG_IN_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSongInListId(Integer songInListId) {
    this.songInListId = songInListId;
  }


  public SongInListEditContract notes(String notes) {
    
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


  public SongInListEditContract order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(Integer order) {
    this.order = order;
  }


  public SongInListEditContract song(SongForApiContract song) {
    
    this.song = song;
    return this;
  }

   /**
   * Get song
   * @return song
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SongForApiContract getSong() {
    return song;
  }


  @JsonProperty(JSON_PROPERTY_SONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSong(SongForApiContract song) {
    this.song = song;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SongInListEditContract songInListEditContract = (SongInListEditContract) o;
    return Objects.equals(this.songInListId, songInListEditContract.songInListId) &&
        Objects.equals(this.notes, songInListEditContract.notes) &&
        Objects.equals(this.order, songInListEditContract.order) &&
        Objects.equals(this.song, songInListEditContract.song);
  }

  @Override
  public int hashCode() {
    return Objects.hash(songInListId, notes, order, song);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SongInListEditContract {\n");
    sb.append("    songInListId: ").append(toIndentedString(songInListId)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    song: ").append(toIndentedString(song)).append("\n");
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

