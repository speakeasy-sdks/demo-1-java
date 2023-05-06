/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class PostOrgsOrgIdAppsAppIdWebhooksRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public demo_1.test_1.models.shared.WebhookRequest webhookRequest;
    public PostOrgsOrgIdAppsAppIdWebhooksRequest withWebhookRequest(demo_1.test_1.models.shared.WebhookRequest webhookRequest) {
        this.webhookRequest = webhookRequest;
        return this;
    }
    
    /**
     * The Application ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=appId")
    public String appId;
    public PostOrgsOrgIdAppsAppIdWebhooksRequest withAppId(String appId) {
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
    public PostOrgsOrgIdAppsAppIdWebhooksRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public PostOrgsOrgIdAppsAppIdWebhooksRequest(@JsonProperty("WebhookRequest") demo_1.test_1.models.shared.WebhookRequest webhookRequest, @JsonProperty("appId") String appId, @JsonProperty("orgId") String orgId) {
        this.webhookRequest = webhookRequest;
        this.appId = appId;
        this.orgId = orgId;
  }
}
