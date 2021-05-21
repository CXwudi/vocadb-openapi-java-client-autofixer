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


package cx.mikufan.vocadbapiclient.api;

import cx.mikufan.vocadbapiclient.model.ActivityEntryForApiContractPartialFindResult;
import cx.mikufan.vocadbapiclient.model.ActivityEntryOptionalFields;
import cx.mikufan.vocadbapiclient.model.ActivityEntrySortRule;
import cx.mikufan.vocadbapiclient.model.ContentLanguagePreference;
import cx.mikufan.vocadbapiclient.model.EntryEditEvent;
import cx.mikufan.vocadbapiclient.model.EntryOptionalFields;
import cx.mikufan.vocadbapiclient.model.EntryType;
import java.time.LocalDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivityEntryApiApi
 */
@Ignore
public class ActivityEntryApiApiTest {

    private final ActivityEntryApiApi api = new ActivityEntryApiApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiActivityEntriesGetTest() {
        LocalDateTime before = null;
        LocalDateTime since = null;
        Integer userId = null;
        EntryEditEvent editEvent = null;
        EntryType entryType = null;
        Integer maxResults = null;
        Boolean getTotalCount = null;
        ActivityEntryOptionalFields fields = null;
        EntryOptionalFields entryFields = null;
        ContentLanguagePreference lang = null;
        ActivityEntrySortRule sortRule = null;
        ActivityEntryForApiContractPartialFindResult response = api.apiActivityEntriesGet(before, since, userId, editEvent, entryType, maxResults, getTotalCount, fields, entryFields, lang, sortRule);

        // TODO: test validations
    }
    
}