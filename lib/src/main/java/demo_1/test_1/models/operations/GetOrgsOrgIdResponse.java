/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsOrgIdResponse {
    
    public String contentType;
    public GetOrgsOrgIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Invalid request parameters or payload. E.g. invalid `orgId` format.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.ErrorInfoResponse errorInfoResponse;
    public GetOrgsOrgIdResponse withErrorInfoResponse(demo_1.test_1.models.shared.ErrorInfoResponse errorInfoResponse) {
        this.errorInfoResponse = errorInfoResponse;
        return this;
    }
    
    /**
     * Returns organization details.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.OrganizationResponse organizationResponse;
    public GetOrgsOrgIdResponse withOrganizationResponse(demo_1.test_1.models.shared.OrganizationResponse organizationResponse) {
        this.organizationResponse = organizationResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public GetOrgsOrgIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetOrgsOrgIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrgsOrgIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
