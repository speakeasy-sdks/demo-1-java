/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class DeleteOrgsOrgIdAppsAppIdWebhooksJobIdRequest {
    /**
     * The Application ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;
    public DeleteOrgsOrgIdAppsAppIdWebhooksJobIdRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    /**
     * The Webhook ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=jobId")
    public String jobId;
    public DeleteOrgsOrgIdAppsAppIdWebhooksJobIdRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    
    /**
     * The Organization ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;
    public DeleteOrgsOrgIdAppsAppIdWebhooksJobIdRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public DeleteOrgsOrgIdAppsAppIdWebhooksJobIdRequest(@JsonProperty("appId") String appId, @JsonProperty("jobId") String jobId, @JsonProperty("orgId") String orgId) {
        this.appId = appId;
        this.jobId = jobId;
        this.orgId = orgId;
  }
}
