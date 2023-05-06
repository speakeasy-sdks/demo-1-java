/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsOrgIdAppsAppIdDeltasResponse {
    
    public String contentType;
    public GetOrgsOrgIdAppsAppIdDeltasResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A possibly empty list of Deployment Deltas.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.DeltaResponse[] deltaResponses;
    public GetOrgsOrgIdAppsAppIdDeltasResponse withDeltaResponses(demo_1.test_1.models.shared.DeltaResponse[] deltaResponses) {
        this.deltaResponses = deltaResponses;
        return this;
    }
    
    
    public Integer statusCode;
    public GetOrgsOrgIdAppsAppIdDeltasResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetOrgsOrgIdAppsAppIdDeltasResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrgsOrgIdAppsAppIdDeltasResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
