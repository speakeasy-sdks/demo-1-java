/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class DeleteOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest {
    /**
     * The Environment Type.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=envType")
    public String envType;

    public DeleteOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest withEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    
    /**
     * The Organization ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;

    public DeleteOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    /**
     * The User ID
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=userId")
    public String userId;

    public DeleteOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public DeleteOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest(@JsonProperty("envType") String envType, @JsonProperty("orgId") String orgId, @JsonProperty("userId") String userId) {
        this.envType = envType;
        this.orgId = orgId;
        this.userId = userId;
  }
}
