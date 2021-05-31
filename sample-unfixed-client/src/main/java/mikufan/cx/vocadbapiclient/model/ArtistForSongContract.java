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
import mikufan.cx.vocadbapiclient.model.ArtistCategories;
import mikufan.cx.vocadbapiclient.model.ArtistContract;
import mikufan.cx.vocadbapiclient.model.ArtistRoles;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ArtistForSongContract
 */
@JsonPropertyOrder({
  ArtistForSongContract.JSON_PROPERTY_ARTIST,
  ArtistForSongContract.JSON_PROPERTY_CATEGORIES,
  ArtistForSongContract.JSON_PROPERTY_EFFECTIVE_ROLES,
  ArtistForSongContract.JSON_PROPERTY_ID,
  ArtistForSongContract.JSON_PROPERTY_IS_CUSTOM_NAME,
  ArtistForSongContract.JSON_PROPERTY_IS_SUPPORT,
  ArtistForSongContract.JSON_PROPERTY_NAME,
  ArtistForSongContract.JSON_PROPERTY_ROLES
})
@JsonTypeName("ArtistForSongContract")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-23T13:02:48.301797700-04:00[America/New_York]")
public class ArtistForSongContract {
  public static final String JSON_PROPERTY_ARTIST = "artist";
  private ArtistContract artist;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private ArtistCategories categories;

  public static final String JSON_PROPERTY_EFFECTIVE_ROLES = "effectiveRoles";
  private ArtistRoles effectiveRoles;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_IS_CUSTOM_NAME = "isCustomName";
  private Boolean isCustomName;

  public static final String JSON_PROPERTY_IS_SUPPORT = "isSupport";
  private Boolean isSupport;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private ArtistRoles roles;


  public ArtistForSongContract artist(ArtistContract artist) {
    
    this.artist = artist;
    return this;
  }

   /**
   * Get artist
   * @return artist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ARTIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtistContract getArtist() {
    return artist;
  }


  @JsonProperty(JSON_PROPERTY_ARTIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtist(ArtistContract artist) {
    this.artist = artist;
  }


  public ArtistForSongContract categories(ArtistCategories categories) {
    
    this.categories = categories;
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtistCategories getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(ArtistCategories categories) {
    this.categories = categories;
  }


  public ArtistForSongContract effectiveRoles(ArtistRoles effectiveRoles) {
    
    this.effectiveRoles = effectiveRoles;
    return this;
  }

   /**
   * Get effectiveRoles
   * @return effectiveRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtistRoles getEffectiveRoles() {
    return effectiveRoles;
  }


  @JsonProperty(JSON_PROPERTY_EFFECTIVE_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEffectiveRoles(ArtistRoles effectiveRoles) {
    this.effectiveRoles = effectiveRoles;
  }


  public ArtistForSongContract id(Integer id) {
    
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


  public ArtistForSongContract isCustomName(Boolean isCustomName) {
    
    this.isCustomName = isCustomName;
    return this;
  }

   /**
   * Get isCustomName
   * @return isCustomName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_CUSTOM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCustomName() {
    return isCustomName;
  }


  @JsonProperty(JSON_PROPERTY_IS_CUSTOM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCustomName(Boolean isCustomName) {
    this.isCustomName = isCustomName;
  }


  public ArtistForSongContract isSupport(Boolean isSupport) {
    
    this.isSupport = isSupport;
    return this;
  }

   /**
   * Get isSupport
   * @return isSupport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSupport() {
    return isSupport;
  }


  @JsonProperty(JSON_PROPERTY_IS_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSupport(Boolean isSupport) {
    this.isSupport = isSupport;
  }


  public ArtistForSongContract name(String name) {
    
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


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ArtistForSongContract roles(ArtistRoles roles) {
    
    this.roles = roles;
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtistRoles getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(ArtistRoles roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtistForSongContract artistForSongContract = (ArtistForSongContract) o;
    return Objects.equals(this.artist, artistForSongContract.artist) &&
        Objects.equals(this.categories, artistForSongContract.categories) &&
        Objects.equals(this.effectiveRoles, artistForSongContract.effectiveRoles) &&
        Objects.equals(this.id, artistForSongContract.id) &&
        Objects.equals(this.isCustomName, artistForSongContract.isCustomName) &&
        Objects.equals(this.isSupport, artistForSongContract.isSupport) &&
        Objects.equals(this.name, artistForSongContract.name) &&
        Objects.equals(this.roles, artistForSongContract.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artist, categories, effectiveRoles, id, isCustomName, isSupport, name, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtistForSongContract {\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    effectiveRoles: ").append(toIndentedString(effectiveRoles)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCustomName: ").append(toIndentedString(isCustomName)).append("\n");
    sb.append("    isSupport: ").append(toIndentedString(isSupport)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
