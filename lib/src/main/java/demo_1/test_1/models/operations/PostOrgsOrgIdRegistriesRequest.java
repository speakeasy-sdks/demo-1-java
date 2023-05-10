/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class PostOrgsOrgIdRegistriesRequest {
    /**
     * A new record details.
     * 
     * 
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public demo_1.test_1.models.shared.RegistryRequest registryRequest;

    public PostOrgsOrgIdRegistriesRequest withRegistryRequest(demo_1.test_1.models.shared.RegistryRequest registryRequest) {
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

    public PostOrgsOrgIdRegistriesRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public PostOrgsOrgIdRegistriesRequest(@JsonProperty("RegistryRequest") demo_1.test_1.models.shared.RegistryRequest registryRequest, @JsonProperty("orgId") String orgId) {
        this.registryRequest = registryRequest;
        this.orgId = orgId;
  }
}
