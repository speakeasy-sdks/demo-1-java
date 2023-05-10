/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdRequest {
    /**
     * The Application ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    /**
     * The Organization ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;

    public GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    /**
     * ID of the Deployment Set.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=setId")
    public String setId;

    public GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdRequest withSetId(String setId) {
        this.setId = setId;
        return this;
    }
    
    /**
     * ID of the Deployment Set to diff against.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sourceSetId")
    public String sourceSetId;

    public GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdRequest withSourceSetId(String sourceSetId) {
        this.sourceSetId = sourceSetId;
        return this;
    }
    
    public GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdRequest(@JsonProperty("appId") String appId, @JsonProperty("orgId") String orgId, @JsonProperty("setId") String setId, @JsonProperty("sourceSetId") String sourceSetId) {
        this.appId = appId;
        this.orgId = orgId;
        this.setId = setId;
        this.sourceSetId = sourceSetId;
  }
}
