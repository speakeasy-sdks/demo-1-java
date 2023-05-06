/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class GetOrgsOrgIdResourcesTypesRequest {
    /**
     * The Organization ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;
    public GetOrgsOrgIdResourcesTypesRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public GetOrgsOrgIdResourcesTypesRequest(@JsonProperty("orgId") String orgId) {
        this.orgId = orgId;
  }
}
