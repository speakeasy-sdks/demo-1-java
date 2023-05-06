/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class DeleteOrgsOrgIdRegistriesRegIdResponse {
    
    public String contentType;
    public DeleteOrgsOrgIdRegistriesRegIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Request parameters are incomplete or invalid.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.ErrorInfoResponse errorInfoResponse;
    public DeleteOrgsOrgIdRegistriesRegIdResponse withErrorInfoResponse(demo_1.test_1.models.shared.ErrorInfoResponse errorInfoResponse) {
        this.errorInfoResponse = errorInfoResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public DeleteOrgsOrgIdRegistriesRegIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public DeleteOrgsOrgIdRegistriesRegIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public DeleteOrgsOrgIdRegistriesRegIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
