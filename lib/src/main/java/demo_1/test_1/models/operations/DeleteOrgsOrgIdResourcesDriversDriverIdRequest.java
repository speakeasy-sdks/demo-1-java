/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class DeleteOrgsOrgIdResourcesDriversDriverIdRequest {
    /**
     * The Resources Driver ID to delete.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=driverId")
    public String driverId;

    public DeleteOrgsOrgIdResourcesDriversDriverIdRequest withDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }
    
    /**
     * The Organization ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;

    public DeleteOrgsOrgIdResourcesDriversDriverIdRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public DeleteOrgsOrgIdResourcesDriversDriverIdRequest(@JsonProperty("driverId") String driverId, @JsonProperty("orgId") String orgId) {
        this.driverId = driverId;
        this.orgId = orgId;
  }
}
