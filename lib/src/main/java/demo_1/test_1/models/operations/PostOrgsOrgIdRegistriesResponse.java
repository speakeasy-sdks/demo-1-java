/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class PostOrgsOrgIdRegistriesResponse {
    
    public String contentType;
    public PostOrgsOrgIdRegistriesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Request parameters or payload are incomplete or invalid.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.ErrorInfoResponse errorInfoResponse;
    public PostOrgsOrgIdRegistriesResponse withErrorInfoResponse(demo_1.test_1.models.shared.ErrorInfoResponse errorInfoResponse) {
        this.errorInfoResponse = errorInfoResponse;
        return this;
    }
    
    /**
     * A newly created record details.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.RegistryResponse registryResponse;
    public PostOrgsOrgIdRegistriesResponse withRegistryResponse(demo_1.test_1.models.shared.RegistryResponse registryResponse) {
        this.registryResponse = registryResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public PostOrgsOrgIdRegistriesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public PostOrgsOrgIdRegistriesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostOrgsOrgIdRegistriesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
