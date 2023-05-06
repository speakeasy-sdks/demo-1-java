/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasRequest {
    /**
     * map of replicas by modules.
     * 
     * 
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Long> requestBody;
    public PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasRequest withRequestBody(java.util.Map<String, Long> requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * The Application ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;
    public PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasRequest withAppId(String appId) {
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
    public PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasRequest withEnvId(String envId) {
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
    public PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasRequest(@JsonProperty("RequestBody") java.util.Map<String, Long> requestBody, @JsonProperty("appId") String appId, @JsonProperty("envId") String envId, @JsonProperty("orgId") String orgId) {
        this.requestBody = requestBody;
        this.appId = appId;
        this.envId = envId;
        this.orgId = orgId;
  }
}
