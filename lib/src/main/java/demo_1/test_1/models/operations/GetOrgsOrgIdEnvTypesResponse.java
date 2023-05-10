/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsOrgIdEnvTypesResponse {
    
    public String contentType;

    public GetOrgsOrgIdEnvTypesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A list of Environment Types.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.EnvironmentTypeResponse[] environmentTypeResponses;

    public GetOrgsOrgIdEnvTypesResponse withEnvironmentTypeResponses(demo_1.test_1.models.shared.EnvironmentTypeResponse[] environmentTypeResponses) {
        this.environmentTypeResponses = environmentTypeResponses;
        return this;
    }
    
    
    public Integer statusCode;

    public GetOrgsOrgIdEnvTypesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetOrgsOrgIdEnvTypesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrgsOrgIdEnvTypesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
