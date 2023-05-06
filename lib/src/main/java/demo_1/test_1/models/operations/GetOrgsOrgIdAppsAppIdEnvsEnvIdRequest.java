/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class GetOrgsOrgIdAppsAppIdEnvsEnvIdRequest {
    /**
     * The Application ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;
    public GetOrgsOrgIdAppsAppIdEnvsEnvIdRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    /**
     * The Environment ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=envId")
    public String envId;
    public GetOrgsOrgIdAppsAppIdEnvsEnvIdRequest withEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    
    /**
     * The Organization ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;
    public GetOrgsOrgIdAppsAppIdEnvsEnvIdRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public GetOrgsOrgIdAppsAppIdEnvsEnvIdRequest(@JsonProperty("appId") String appId, @JsonProperty("envId") String envId, @JsonProperty("orgId") String orgId) {
        this.appId = appId;
        this.envId = envId;
        this.orgId = orgId;
  }
}
