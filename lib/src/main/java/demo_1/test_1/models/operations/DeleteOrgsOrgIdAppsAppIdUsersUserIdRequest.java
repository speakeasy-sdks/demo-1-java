/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class DeleteOrgsOrgIdAppsAppIdUsersUserIdRequest {
    /**
     * The Application ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;
    public DeleteOrgsOrgIdAppsAppIdUsersUserIdRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    /**
     * The Organization ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;
    public DeleteOrgsOrgIdAppsAppIdUsersUserIdRequest withOrgId(String orgId) {
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
    public DeleteOrgsOrgIdAppsAppIdUsersUserIdRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public DeleteOrgsOrgIdAppsAppIdUsersUserIdRequest(@JsonProperty("appId") String appId, @JsonProperty("orgId") String orgId, @JsonProperty("userId") String userId) {
        this.appId = appId;
        this.orgId = orgId;
        this.userId = userId;
  }
}
