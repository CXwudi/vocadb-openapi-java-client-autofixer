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
import mikufan.cx.vocadbapiclient.model.ArtistForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ArtistForUserForApiContract
 */
@JsonPropertyOrder({
  ArtistForUserForApiContract.JSON_PROPERTY_ARTIST,
  ArtistForUserForApiContract.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-26T07:29:58.607748373Z[Etc/UTC]")
public class ArtistForUserForApiContract {
  public static final String JSON_PROPERTY_ARTIST = "artist";
  private ArtistForApiContract artist;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public ArtistForUserForApiContract() {
  }

  public ArtistForUserForApiContract artist(ArtistForApiContract artist) {
    
    this.artist = artist;
    return this;
  }

   /**
   * Get artist
   * @return artist
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARTIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtistForApiContract getArtist() {
    return artist;
  }


  @JsonProperty(JSON_PROPERTY_ARTIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtist(ArtistForApiContract artist) {
    this.artist = artist;
  }


  public ArtistForUserForApiContract id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtistForUserForApiContract artistForUserForApiContract = (ArtistForUserForApiContract) o;
    return Objects.equals(this.artist, artistForUserForApiContract.artist) &&
        Objects.equals(this.id, artistForUserForApiContract.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artist, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtistForUserForApiContract {\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

