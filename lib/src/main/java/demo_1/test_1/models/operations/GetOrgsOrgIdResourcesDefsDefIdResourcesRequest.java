/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class GetOrgsOrgIdResourcesDefsDefIdResourcesRequest {
    /**
     * The Resource Definition ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=defId")
    public String defId;
    public GetOrgsOrgIdResourcesDefsDefIdResourcesRequest withDefId(String defId) {
        this.defId = defId;
        return this;
    }
    
    /**
     * The Organization ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;
    public GetOrgsOrgIdResourcesDefsDefIdResourcesRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public GetOrgsOrgIdResourcesDefsDefIdResourcesRequest(@JsonProperty("defId") String defId, @JsonProperty("orgId") String orgId) {
        this.defId = defId;
        this.orgId = orgId;
  }
}
