/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class DeleteOrgsOrgIdWorkloadProfilesProfileQidRequest {
    /**
     * The Organization ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;
    public DeleteOrgsOrgIdWorkloadProfilesProfileQidRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    /**
     * The Workload profile ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=profileQid")
    public String profileQid;
    public DeleteOrgsOrgIdWorkloadProfilesProfileQidRequest withProfileQid(String profileQid) {
        this.profileQid = profileQid;
        return this;
    }
    
    public DeleteOrgsOrgIdWorkloadProfilesProfileQidRequest(@JsonProperty("orgId") String orgId, @JsonProperty("profileQid") String profileQid) {
        this.orgId = orgId;
        this.profileQid = profileQid;
  }
}
