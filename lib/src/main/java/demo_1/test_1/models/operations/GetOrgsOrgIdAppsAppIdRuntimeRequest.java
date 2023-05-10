/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class GetOrgsOrgIdAppsAppIdRuntimeRequest {
    /**
     * The Application ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public GetOrgsOrgIdAppsAppIdRuntimeRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    /**
     * Filter environments by ID (required). Up to 5 ids can be supplied per request.
     * 
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=id")
    public String id;

    public GetOrgsOrgIdAppsAppIdRuntimeRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The Organization ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;

    public GetOrgsOrgIdAppsAppIdRuntimeRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public GetOrgsOrgIdAppsAppIdRuntimeRequest(@JsonProperty("appId") String appId, @JsonProperty("orgId") String orgId) {
        this.appId = appId;
        this.orgId = orgId;
  }
}
