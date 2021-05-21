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
import cx.mikufan.vocadbapiclient.model.ArtistCategories;
import cx.mikufan.vocadbapiclient.model.ArtistContract;
import cx.mikufan.vocadbapiclient.model.ArtistRoles;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ArtistForAlbumForApiContract
 */
@JsonPropertyOrder({
  ArtistForAlbumForApiContract.JSON_PROPERTY_ARTIST,
  ArtistForAlbumForApiContract.JSON_PROPERTY_CATEGORIES,
  ArtistForAlbumForApiContract.JSON_PROPERTY_EFFECTIVE_ROLES,
  ArtistForAlbumForApiContract.JSON_PROPERTY_IS_SUPPORT,
  ArtistForAlbumForApiContract.JSON_PROPERTY_NAME,
  ArtistForAlbumForApiContract.JSON_PROPERTY_ROLES
})
@JsonTypeName("ArtistForAlbumForApiContract")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-20T13:35:02.772911500-04:00[America/New_York]")
public class ArtistForAlbumForApiContract {
  public static final String JSON_PROPERTY_ARTIST = "artist";
  private ArtistContract artist;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private ArtistCategories categories;

  public static final String JSON_PROPERTY_EFFECTIVE_ROLES = "effectiveRoles";
  private ArtistRoles effectiveRoles;

  public static final String JSON_PROPERTY_IS_SUPPORT = "isSupport";
  private Boolean isSupport;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private ArtistRoles roles;


  public ArtistForAlbumForApiContract artist(ArtistContract artist) {
    
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


  public void setArtist(ArtistContract artist) {
    this.artist = artist;
  }


  public ArtistForAlbumForApiContract categories(ArtistCategories categories) {
    
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


  public void setCategories(ArtistCategories categories) {
    this.categories = categories;
  }


  public ArtistForAlbumForApiContract effectiveRoles(ArtistRoles effectiveRoles) {
    
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


  public void setEffectiveRoles(ArtistRoles effectiveRoles) {
    this.effectiveRoles = effectiveRoles;
  }


  public ArtistForAlbumForApiContract isSupport(Boolean isSupport) {
    
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


  public void setIsSupport(Boolean isSupport) {
    this.isSupport = isSupport;
  }


  public ArtistForAlbumForApiContract name(String name) {
    
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


  public ArtistForAlbumForApiContract roles(ArtistRoles roles) {
    
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
    ArtistForAlbumForApiContract artistForAlbumForApiContract = (ArtistForAlbumForApiContract) o;
    return Objects.equals(this.artist, artistForAlbumForApiContract.artist) &&
        Objects.equals(this.categories, artistForAlbumForApiContract.categories) &&
        Objects.equals(this.effectiveRoles, artistForAlbumForApiContract.effectiveRoles) &&
        Objects.equals(this.isSupport, artistForAlbumForApiContract.isSupport) &&
        Objects.equals(this.name, artistForAlbumForApiContract.name) &&
        Objects.equals(this.roles, artistForAlbumForApiContract.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artist, categories, effectiveRoles, isSupport, name, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtistForAlbumForApiContract {\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    effectiveRoles: ").append(toIndentedString(effectiveRoles)).append("\n");
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

