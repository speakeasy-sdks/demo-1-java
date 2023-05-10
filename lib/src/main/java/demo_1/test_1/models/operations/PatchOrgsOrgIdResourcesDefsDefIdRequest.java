/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class PatchOrgsOrgIdResourcesDefsDefIdRequest {
    /**
     * The Resource Definition record details.
     * 
     * The PATCH operation would change the value of the property if it is included in the request payload JSON, and not `null`. Missing and `null` properties are ignored.
     * 
     * For the map properties, such as PatchResourceDefinitionRequest.DriverInputs, the merge operation is applied.
     * 
     * Merge rules are as follows:
     * 
     * - If a map property has a value, it is replaced (or added).
     * 
     * - If a map property is set to `null`, it is removed.
     * 
     * - If a map property is not included (missing in JSON), it remains unchanged.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public demo_1.test_1.models.shared.PatchResourceDefinitionRequestRequest patchResourceDefinitionRequestRequest;

    public PatchOrgsOrgIdResourcesDefsDefIdRequest withPatchResourceDefinitionRequestRequest(demo_1.test_1.models.shared.PatchResourceDefinitionRequestRequest patchResourceDefinitionRequestRequest) {
        this.patchResourceDefinitionRequestRequest = patchResourceDefinitionRequestRequest;
        return this;
    }
    
    /**
     * The Resource Definition ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=defId")
    public String defId;

    public PatchOrgsOrgIdResourcesDefsDefIdRequest withDefId(String defId) {
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

    public PatchOrgsOrgIdResourcesDefsDefIdRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public PatchOrgsOrgIdResourcesDefsDefIdRequest(@JsonProperty("PatchResourceDefinitionRequestRequest") demo_1.test_1.models.shared.PatchResourceDefinitionRequestRequest patchResourceDefinitionRequestRequest, @JsonProperty("defId") String defId, @JsonProperty("orgId") String orgId) {
        this.patchResourceDefinitionRequestRequest = patchResourceDefinitionRequestRequest;
        this.defId = defId;
        this.orgId = orgId;
  }
}
