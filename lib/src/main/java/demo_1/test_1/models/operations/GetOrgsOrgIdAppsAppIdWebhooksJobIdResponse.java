/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsOrgIdAppsAppIdWebhooksJobIdResponse {
    
    public String contentType;

    public GetOrgsOrgIdAppsAppIdWebhooksJobIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetOrgsOrgIdAppsAppIdWebhooksJobIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetOrgsOrgIdAppsAppIdWebhooksJobIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * The requested webhook.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.WebhookResponse webhookResponse;

    public GetOrgsOrgIdAppsAppIdWebhooksJobIdResponse withWebhookResponse(demo_1.test_1.models.shared.WebhookResponse webhookResponse) {
        this.webhookResponse = webhookResponse;
        return this;
    }
    
    public GetOrgsOrgIdAppsAppIdWebhooksJobIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
