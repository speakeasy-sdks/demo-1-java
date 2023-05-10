/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsOrgIdRegistriesRegIdCredsResponse {
    
    public String contentType;

    public GetOrgsOrgIdRegistriesRegIdCredsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Request parameters are incomplete or invalid.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.ErrorInfoResponse errorInfoResponse;

    public GetOrgsOrgIdRegistriesRegIdCredsResponse withErrorInfoResponse(demo_1.test_1.models.shared.ErrorInfoResponse errorInfoResponse) {
        this.errorInfoResponse = errorInfoResponse;
        return this;
    }
    
    /**
     * Current account credentials or secret details for the registry.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.RegistryCredsResponse registryCredsResponse;

    public GetOrgsOrgIdRegistriesRegIdCredsResponse withRegistryCredsResponse(demo_1.test_1.models.shared.RegistryCredsResponse registryCredsResponse) {
        this.registryCredsResponse = registryCredsResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public GetOrgsOrgIdRegistriesRegIdCredsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetOrgsOrgIdRegistriesRegIdCredsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrgsOrgIdRegistriesRegIdCredsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
