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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AlbumOptionalFields
 */
public enum AlbumOptionalFields {
  
  NONE("None"),
  
  ADDITIONALNAMES("AdditionalNames"),
  
  ARTISTS("Artists"),
  
  DESCRIPTION("Description"),
  
  DISCS("Discs"),
  
  IDENTIFIERS("Identifiers"),
  
  MAINPICTURE("MainPicture"),
  
  NAMES("Names"),
  
  PVS("PVs"),
  
  RELEASEEVENT("ReleaseEvent"),
  
  TAGS("Tags"),
  
  TRACKS("Tracks"),
  
  WEBLINKS("WebLinks");

  private String value;

  AlbumOptionalFields(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AlbumOptionalFields fromValue(String value) {
    for (AlbumOptionalFields b : AlbumOptionalFields.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
