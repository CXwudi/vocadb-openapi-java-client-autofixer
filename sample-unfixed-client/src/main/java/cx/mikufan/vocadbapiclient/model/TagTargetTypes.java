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
 * Gets or Sets TagTargetTypes
 */
public enum TagTargetTypes {
  
  NOTHING("Nothing"),
  
  ALBUM("Album"),
  
  ARTIST("Artist"),
  
  ALBUMARTIST("AlbumArtist"),
  
  EVENT("Event"),
  
  SONG("Song"),
  
  ALBUMSONG("AlbumSong"),
  
  ARTISTSONG("ArtistSong"),
  
  ALL("All");

  private String value;

  TagTargetTypes(String value) {
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
  public static TagTargetTypes fromValue(String value) {
    for (TagTargetTypes b : TagTargetTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

