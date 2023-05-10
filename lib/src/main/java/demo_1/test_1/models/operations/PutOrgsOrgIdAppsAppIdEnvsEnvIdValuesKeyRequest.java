/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class PutOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest {
    /**
     * Both `value` and `description` must be supplied. All other fields will be ignored.
     * 
     * 
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public demo_1.test_1.models.shared.ValueEditPayloadRequest valueEditPayloadRequest;

    public PutOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest withValueEditPayloadRequest(demo_1.test_1.models.shared.ValueEditPayloadRequest valueEditPayloadRequest) {
        this.valueEditPayloadRequest = valueEditPayloadRequest;
        return this;
    }
    
    /**
     * The Application ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public PutOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest withAppId(String appId) {
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

    public PutOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest withEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    
    /**
     * The key to update.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=key")
    public String key;

    public PutOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest withKey(String key) {
        this.key = key;
        return this;
    }
    
    /**
     * The Organization ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;

    public PutOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public PutOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest(@JsonProperty("ValueEditPayloadRequest") demo_1.test_1.models.shared.ValueEditPayloadRequest valueEditPayloadRequest, @JsonProperty("appId") String appId, @JsonProperty("envId") String envId, @JsonProperty("key") String key, @JsonProperty("orgId") String orgId) {
        this.valueEditPayloadRequest = valueEditPayloadRequest;
        this.appId = appId;
        this.envId = envId;
        this.key = key;
        this.orgId = orgId;
  }
}
