/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsOrgIdResourcesDefsDefIdResourcesResponse {
    /**
     * A possibly empty list of Active Resources.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.ActiveResourceResponse[] activeResourceResponses;
    public GetOrgsOrgIdResourcesDefsDefIdResourcesResponse withActiveResourceResponses(demo_1.test_1.models.shared.ActiveResourceResponse[] activeResourceResponses) {
        this.activeResourceResponses = activeResourceResponses;
        return this;
    }
    
    
    public String contentType;
    public GetOrgsOrgIdResourcesDefsDefIdResourcesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Internal application error.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse;
    public GetOrgsOrgIdResourcesDefsDefIdResourcesResponse withHumanitecErrorResponse(demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse) {
        this.humanitecErrorResponse = humanitecErrorResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public GetOrgsOrgIdResourcesDefsDefIdResourcesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetOrgsOrgIdResourcesDefsDefIdResourcesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrgsOrgIdResourcesDefsDefIdResourcesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
