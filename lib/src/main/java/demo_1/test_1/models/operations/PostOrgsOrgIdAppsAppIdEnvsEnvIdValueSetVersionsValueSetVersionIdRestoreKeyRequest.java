/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKeyRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public demo_1.test_1.models.shared.ValueSetActionPayloadRequest valueSetActionPayloadRequest;

    public PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKeyRequest withValueSetActionPayloadRequest(demo_1.test_1.models.shared.ValueSetActionPayloadRequest valueSetActionPayloadRequest) {
        this.valueSetActionPayloadRequest = valueSetActionPayloadRequest;
        return this;
    }
    
    /**
     * The Application ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;

    public PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKeyRequest withAppId(String appId) {
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

    public PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKeyRequest withEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    
    /**
     * Key of the value to be restored.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=key")
    public String key;

    public PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKeyRequest withKey(String key) {
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

    public PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKeyRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    /**
     * The ValueSetVersion ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=valueSetVersionId")
    public String valueSetVersionId;

    public PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKeyRequest withValueSetVersionId(String valueSetVersionId) {
        this.valueSetVersionId = valueSetVersionId;
        return this;
    }
    
    public PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKeyRequest(@JsonProperty("ValueSetActionPayloadRequest") demo_1.test_1.models.shared.ValueSetActionPayloadRequest valueSetActionPayloadRequest, @JsonProperty("appId") String appId, @JsonProperty("envId") String envId, @JsonProperty("key") String key, @JsonProperty("orgId") String orgId, @JsonProperty("valueSetVersionId") String valueSetVersionId) {
        this.valueSetActionPayloadRequest = valueSetActionPayloadRequest;
        this.appId = appId;
        this.envId = envId;
        this.key = key;
        this.orgId = orgId;
        this.valueSetVersionId = valueSetVersionId;
  }
}
