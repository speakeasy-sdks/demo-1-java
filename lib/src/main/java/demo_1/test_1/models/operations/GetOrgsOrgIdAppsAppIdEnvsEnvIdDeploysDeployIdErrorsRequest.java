/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrorsRequest {
    /**
     * The Application ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;
    public GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrorsRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    /**
     * The Deployment ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=deployId")
    public String deployId;
    public GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrorsRequest withDeployId(String deployId) {
        this.deployId = deployId;
        return this;
    }
    
    /**
     * The Environment ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=envId")
    public String envId;
    public GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrorsRequest withEnvId(String envId) {
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
    public GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrorsRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrorsRequest(@JsonProperty("appId") String appId, @JsonProperty("deployId") String deployId, @JsonProperty("envId") String envId, @JsonProperty("orgId") String orgId) {
        this.appId = appId;
        this.deployId = deployId;
        this.envId = envId;
        this.orgId = orgId;
  }
}
