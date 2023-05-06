/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class PatchOrgsOrgIdRegistriesRegIdRequest {
    /**
     * Record details to update.
     * 
     * 
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public demo_1.test_1.models.shared.RegistryRequest registryRequest;
    public PatchOrgsOrgIdRegistriesRegIdRequest withRegistryRequest(demo_1.test_1.models.shared.RegistryRequest registryRequest) {
        this.registryRequest = registryRequest;
        return this;
    }
    
    /**
     * Unique (alpha-numerical) organization identifier.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;
    public PatchOrgsOrgIdRegistriesRegIdRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    /**
     * Unique (alpha-numerical) registry identifier.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=regId")
    public String regId;
    public PatchOrgsOrgIdRegistriesRegIdRequest withRegId(String regId) {
        this.regId = regId;
        return this;
    }
    
    public PatchOrgsOrgIdRegistriesRegIdRequest(@JsonProperty("RegistryRequest") demo_1.test_1.models.shared.RegistryRequest registryRequest, @JsonProperty("orgId") String orgId, @JsonProperty("regId") String regId) {
        this.registryRequest = registryRequest;
        this.orgId = orgId;
        this.regId = regId;
  }
}
