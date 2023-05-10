/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class PatchOrgsOrgIdResourcesAccountsAccIdRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public demo_1.test_1.models.shared.UpdateResourceAccountRequestRequest updateResourceAccountRequestRequest;

    public PatchOrgsOrgIdResourcesAccountsAccIdRequest withUpdateResourceAccountRequestRequest(demo_1.test_1.models.shared.UpdateResourceAccountRequestRequest updateResourceAccountRequestRequest) {
        this.updateResourceAccountRequestRequest = updateResourceAccountRequestRequest;
        return this;
    }
    
    /**
     * The Resource Account ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accId")
    public String accId;

    public PatchOrgsOrgIdResourcesAccountsAccIdRequest withAccId(String accId) {
        this.accId = accId;
        return this;
    }
    
    /**
     * The Organization ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;

    public PatchOrgsOrgIdResourcesAccountsAccIdRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public PatchOrgsOrgIdResourcesAccountsAccIdRequest(@JsonProperty("UpdateResourceAccountRequestRequest") demo_1.test_1.models.shared.UpdateResourceAccountRequestRequest updateResourceAccountRequestRequest, @JsonProperty("accId") String accId, @JsonProperty("orgId") String orgId) {
        this.updateResourceAccountRequestRequest = updateResourceAccountRequestRequest;
        this.accId = accId;
        this.orgId = orgId;
  }
}
