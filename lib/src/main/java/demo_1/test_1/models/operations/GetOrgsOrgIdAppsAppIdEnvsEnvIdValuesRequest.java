/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class GetOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest {
    /**
     * The Application ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;
    public GetOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest withAppId(String appId) {
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
    public GetOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest withEnvId(String envId) {
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
    public GetOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public GetOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest(@JsonProperty("appId") String appId, @JsonProperty("envId") String envId, @JsonProperty("orgId") String orgId) {
        this.appId = appId;
        this.envId = envId;
        this.orgId = orgId;
  }
}
