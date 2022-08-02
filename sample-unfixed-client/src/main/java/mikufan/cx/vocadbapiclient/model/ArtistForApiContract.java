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
import mikufan.cx.vocadbapiclient.model.ArtistContract;
import mikufan.cx.vocadbapiclient.model.ArtistForArtistForApiContract;
import mikufan.cx.vocadbapiclient.model.ArtistRelationsForApi;
import mikufan.cx.vocadbapiclient.model.ArtistType;
import mikufan.cx.vocadbapiclient.model.ContentLanguageSelection;
import mikufan.cx.vocadbapiclient.model.EntryStatus;
import mikufan.cx.vocadbapiclient.model.EntryThumbForApiContract;
import mikufan.cx.vocadbapiclient.model.LocalizedStringContract;
import mikufan.cx.vocadbapiclient.model.TagUsageForApiContract;
import mikufan.cx.vocadbapiclient.model.WebLinkForApiContract;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ArtistForApiContract
 */
@JsonPropertyOrder({
  ArtistForApiContract.JSON_PROPERTY_ADDITIONAL_NAMES,
  ArtistForApiContract.JSON_PROPERTY_ARTIST_LINKS,
  ArtistForApiContract.JSON_PROPERTY_ARTIST_LINKS_REVERSE,
  ArtistForApiContract.JSON_PROPERTY_ARTIST_TYPE,
  ArtistForApiContract.JSON_PROPERTY_BASE_VOICEBANK,
  ArtistForApiContract.JSON_PROPERTY_CREATE_DATE,
  ArtistForApiContract.JSON_PROPERTY_DEFAULT_NAME,
  ArtistForApiContract.JSON_PROPERTY_DEFAULT_NAME_LANGUAGE,
  ArtistForApiContract.JSON_PROPERTY_DELETED,
  ArtistForApiContract.JSON_PROPERTY_DESCRIPTION,
  ArtistForApiContract.JSON_PROPERTY_ID,
  ArtistForApiContract.JSON_PROPERTY_MAIN_PICTURE,
  ArtistForApiContract.JSON_PROPERTY_MERGED_TO,
  ArtistForApiContract.JSON_PROPERTY_NAME,
  ArtistForApiContract.JSON_PROPERTY_NAMES,
  ArtistForApiContract.JSON_PROPERTY_PICTURE_MIME,
  ArtistForApiContract.JSON_PROPERTY_RELATIONS,
  ArtistForApiContract.JSON_PROPERTY_RELEASE_DATE,
  ArtistForApiContract.JSON_PROPERTY_STATUS,
  ArtistForApiContract.JSON_PROPERTY_TAGS,
  ArtistForApiContract.JSON_PROPERTY_VERSION,
  ArtistForApiContract.JSON_PROPERTY_WEB_LINKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-02T20:16:06.008977Z[Etc/UTC]")
public class ArtistForApiContract {
  public static final String JSON_PROPERTY_ADDITIONAL_NAMES = "additionalNames";
  private String additionalNames;

  public static final String JSON_PROPERTY_ARTIST_LINKS = "artistLinks";
  private List<ArtistForArtistForApiContract> artistLinks = null;

  public static final String JSON_PROPERTY_ARTIST_LINKS_REVERSE = "artistLinksReverse";
  private List<ArtistForArtistForApiContract> artistLinksReverse = null;

  public static final String JSON_PROPERTY_ARTIST_TYPE = "artistType";
  private ArtistType artistType;

  public static final String JSON_PROPERTY_BASE_VOICEBANK = "baseVoicebank";
  private ArtistContract baseVoicebank;

  public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
  private LocalDateTime createDate;

  public static final String JSON_PROPERTY_DEFAULT_NAME = "defaultName";
  private String defaultName;

  public static final String JSON_PROPERTY_DEFAULT_NAME_LANGUAGE = "defaultNameLanguage";
  private ContentLanguageSelection defaultNameLanguage;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Boolean deleted;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_MAIN_PICTURE = "mainPicture";
  private EntryThumbForApiContract mainPicture;

  public static final String JSON_PROPERTY_MERGED_TO = "mergedTo";
  private Integer mergedTo;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAMES = "names";
  private List<LocalizedStringContract> names = null;

  public static final String JSON_PROPERTY_PICTURE_MIME = "pictureMime";
  private String pictureMime;

  public static final String JSON_PROPERTY_RELATIONS = "relations";
  private ArtistRelationsForApi relations;

  public static final String JSON_PROPERTY_RELEASE_DATE = "releaseDate";
  private LocalDateTime releaseDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private EntryStatus status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<TagUsageForApiContract> tags = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_WEB_LINKS = "webLinks";
  private List<WebLinkForApiContract> webLinks = null;

  public ArtistForApiContract() {
  }

  public ArtistForApiContract additionalNames(String additionalNames) {
    
    this.additionalNames = additionalNames;
    return this;
  }

   /**
   * Get additionalNames
   * @return additionalNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalNames() {
    return additionalNames;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalNames(String additionalNames) {
    this.additionalNames = additionalNames;
  }


  public ArtistForApiContract artistLinks(List<ArtistForArtistForApiContract> artistLinks) {
    
    this.artistLinks = artistLinks;
    return this;
  }

  public ArtistForApiContract addArtistLinksItem(ArtistForArtistForApiContract artistLinksItem) {
    if (this.artistLinks == null) {
      this.artistLinks = new ArrayList<>();
    }
    this.artistLinks.add(artistLinksItem);
    return this;
  }

   /**
   * Get artistLinks
   * @return artistLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ARTIST_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ArtistForArtistForApiContract> getArtistLinks() {
    return artistLinks;
  }


  @JsonProperty(JSON_PROPERTY_ARTIST_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtistLinks(List<ArtistForArtistForApiContract> artistLinks) {
    this.artistLinks = artistLinks;
  }


  public ArtistForApiContract artistLinksReverse(List<ArtistForArtistForApiContract> artistLinksReverse) {
    
    this.artistLinksReverse = artistLinksReverse;
    return this;
  }

  public ArtistForApiContract addArtistLinksReverseItem(ArtistForArtistForApiContract artistLinksReverseItem) {
    if (this.artistLinksReverse == null) {
      this.artistLinksReverse = new ArrayList<>();
    }
    this.artistLinksReverse.add(artistLinksReverseItem);
    return this;
  }

   /**
   * Get artistLinksReverse
   * @return artistLinksReverse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ARTIST_LINKS_REVERSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ArtistForArtistForApiContract> getArtistLinksReverse() {
    return artistLinksReverse;
  }


  @JsonProperty(JSON_PROPERTY_ARTIST_LINKS_REVERSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtistLinksReverse(List<ArtistForArtistForApiContract> artistLinksReverse) {
    this.artistLinksReverse = artistLinksReverse;
  }


  public ArtistForApiContract artistType(ArtistType artistType) {
    
    this.artistType = artistType;
    return this;
  }

   /**
   * Get artistType
   * @return artistType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ARTIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtistType getArtistType() {
    return artistType;
  }


  @JsonProperty(JSON_PROPERTY_ARTIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtistType(ArtistType artistType) {
    this.artistType = artistType;
  }


  public ArtistForApiContract baseVoicebank(ArtistContract baseVoicebank) {
    
    this.baseVoicebank = baseVoicebank;
    return this;
  }

   /**
   * Get baseVoicebank
   * @return baseVoicebank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BASE_VOICEBANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtistContract getBaseVoicebank() {
    return baseVoicebank;
  }


  @JsonProperty(JSON_PROPERTY_BASE_VOICEBANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseVoicebank(ArtistContract baseVoicebank) {
    this.baseVoicebank = baseVoicebank;
  }


  public ArtistForApiContract createDate(LocalDateTime createDate) {
    
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getCreateDate() {
    return createDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateDate(LocalDateTime createDate) {
    this.createDate = createDate;
  }


  public ArtistForApiContract defaultName(String defaultName) {
    
    this.defaultName = defaultName;
    return this;
  }

   /**
   * Get defaultName
   * @return defaultName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultName() {
    return defaultName;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultName(String defaultName) {
    this.defaultName = defaultName;
  }


  public ArtistForApiContract defaultNameLanguage(ContentLanguageSelection defaultNameLanguage) {
    
    this.defaultNameLanguage = defaultNameLanguage;
    return this;
  }

   /**
   * Get defaultNameLanguage
   * @return defaultNameLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContentLanguageSelection getDefaultNameLanguage() {
    return defaultNameLanguage;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_NAME_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultNameLanguage(ContentLanguageSelection defaultNameLanguage) {
    this.defaultNameLanguage = defaultNameLanguage;
  }


  public ArtistForApiContract deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public ArtistForApiContract description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ArtistForApiContract id(Integer id) {
    
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


  public ArtistForApiContract mainPicture(EntryThumbForApiContract mainPicture) {
    
    this.mainPicture = mainPicture;
    return this;
  }

   /**
   * Get mainPicture
   * @return mainPicture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAIN_PICTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntryThumbForApiContract getMainPicture() {
    return mainPicture;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_PICTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainPicture(EntryThumbForApiContract mainPicture) {
    this.mainPicture = mainPicture;
  }


  public ArtistForApiContract mergedTo(Integer mergedTo) {
    
    this.mergedTo = mergedTo;
    return this;
  }

   /**
   * Get mergedTo
   * @return mergedTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MERGED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMergedTo() {
    return mergedTo;
  }


  @JsonProperty(JSON_PROPERTY_MERGED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMergedTo(Integer mergedTo) {
    this.mergedTo = mergedTo;
  }


  public ArtistForApiContract name(String name) {
    
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


  public ArtistForApiContract names(List<LocalizedStringContract> names) {
    
    this.names = names;
    return this;
  }

  public ArtistForApiContract addNamesItem(LocalizedStringContract namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LocalizedStringContract> getNames() {
    return names;
  }


  @JsonProperty(JSON_PROPERTY_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNames(List<LocalizedStringContract> names) {
    this.names = names;
  }


  public ArtistForApiContract pictureMime(String pictureMime) {
    
    this.pictureMime = pictureMime;
    return this;
  }

   /**
   * Get pictureMime
   * @return pictureMime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PICTURE_MIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPictureMime() {
    return pictureMime;
  }


  @JsonProperty(JSON_PROPERTY_PICTURE_MIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPictureMime(String pictureMime) {
    this.pictureMime = pictureMime;
  }


  public ArtistForApiContract relations(ArtistRelationsForApi relations) {
    
    this.relations = relations;
    return this;
  }

   /**
   * Get relations
   * @return relations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtistRelationsForApi getRelations() {
    return relations;
  }


  @JsonProperty(JSON_PROPERTY_RELATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelations(ArtistRelationsForApi relations) {
    this.relations = relations;
  }


  public ArtistForApiContract releaseDate(LocalDateTime releaseDate) {
    
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDateTime getReleaseDate() {
    return releaseDate;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseDate(LocalDateTime releaseDate) {
    this.releaseDate = releaseDate;
  }


  public ArtistForApiContract status(EntryStatus status) {
    
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


  public ArtistForApiContract tags(List<TagUsageForApiContract> tags) {
    
    this.tags = tags;
    return this;
  }

  public ArtistForApiContract addTagsItem(TagUsageForApiContract tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TagUsageForApiContract> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<TagUsageForApiContract> tags) {
    this.tags = tags;
  }


  public ArtistForApiContract version(Integer version) {
    
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


  public ArtistForApiContract webLinks(List<WebLinkForApiContract> webLinks) {
    
    this.webLinks = webLinks;
    return this;
  }

  public ArtistForApiContract addWebLinksItem(WebLinkForApiContract webLinksItem) {
    if (this.webLinks == null) {
      this.webLinks = new ArrayList<>();
    }
    this.webLinks.add(webLinksItem);
    return this;
  }

   /**
   * Get webLinks
   * @return webLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEB_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WebLinkForApiContract> getWebLinks() {
    return webLinks;
  }


  @JsonProperty(JSON_PROPERTY_WEB_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebLinks(List<WebLinkForApiContract> webLinks) {
    this.webLinks = webLinks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtistForApiContract artistForApiContract = (ArtistForApiContract) o;
    return Objects.equals(this.additionalNames, artistForApiContract.additionalNames) &&
        Objects.equals(this.artistLinks, artistForApiContract.artistLinks) &&
        Objects.equals(this.artistLinksReverse, artistForApiContract.artistLinksReverse) &&
        Objects.equals(this.artistType, artistForApiContract.artistType) &&
        Objects.equals(this.baseVoicebank, artistForApiContract.baseVoicebank) &&
        Objects.equals(this.createDate, artistForApiContract.createDate) &&
        Objects.equals(this.defaultName, artistForApiContract.defaultName) &&
        Objects.equals(this.defaultNameLanguage, artistForApiContract.defaultNameLanguage) &&
        Objects.equals(this.deleted, artistForApiContract.deleted) &&
        Objects.equals(this.description, artistForApiContract.description) &&
        Objects.equals(this.id, artistForApiContract.id) &&
        Objects.equals(this.mainPicture, artistForApiContract.mainPicture) &&
        Objects.equals(this.mergedTo, artistForApiContract.mergedTo) &&
        Objects.equals(this.name, artistForApiContract.name) &&
        Objects.equals(this.names, artistForApiContract.names) &&
        Objects.equals(this.pictureMime, artistForApiContract.pictureMime) &&
        Objects.equals(this.relations, artistForApiContract.relations) &&
        Objects.equals(this.releaseDate, artistForApiContract.releaseDate) &&
        Objects.equals(this.status, artistForApiContract.status) &&
        Objects.equals(this.tags, artistForApiContract.tags) &&
        Objects.equals(this.version, artistForApiContract.version) &&
        Objects.equals(this.webLinks, artistForApiContract.webLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalNames, artistLinks, artistLinksReverse, artistType, baseVoicebank, createDate, defaultName, defaultNameLanguage, deleted, description, id, mainPicture, mergedTo, name, names, pictureMime, relations, releaseDate, status, tags, version, webLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtistForApiContract {\n");
    sb.append("    additionalNames: ").append(toIndentedString(additionalNames)).append("\n");
    sb.append("    artistLinks: ").append(toIndentedString(artistLinks)).append("\n");
    sb.append("    artistLinksReverse: ").append(toIndentedString(artistLinksReverse)).append("\n");
    sb.append("    artistType: ").append(toIndentedString(artistType)).append("\n");
    sb.append("    baseVoicebank: ").append(toIndentedString(baseVoicebank)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    defaultName: ").append(toIndentedString(defaultName)).append("\n");
    sb.append("    defaultNameLanguage: ").append(toIndentedString(defaultNameLanguage)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mainPicture: ").append(toIndentedString(mainPicture)).append("\n");
    sb.append("    mergedTo: ").append(toIndentedString(mergedTo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pictureMime: ").append(toIndentedString(pictureMime)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    webLinks: ").append(toIndentedString(webLinks)).append("\n");
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

