/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsResponse {
    
    public String contentType;
    public GetOrgsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A list of available organizations (based on the current user access level).
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.OrganizationResponse[] organizationResponses;
    public GetOrgsResponse withOrganizationResponses(demo_1.test_1.models.shared.OrganizationResponse[] organizationResponses) {
        this.organizationResponses = organizationResponses;
        return this;
    }
    
    
    public Integer statusCode;
    public GetOrgsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetOrgsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrgsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
