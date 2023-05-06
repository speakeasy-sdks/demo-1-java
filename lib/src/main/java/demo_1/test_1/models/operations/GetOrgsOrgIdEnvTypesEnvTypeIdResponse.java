/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsOrgIdEnvTypesEnvTypeIdResponse {
    
    public String contentType;
    public GetOrgsOrgIdEnvTypesEnvTypeIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * The Environment Type requested.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.EnvironmentTypeResponse environmentTypeResponse;
    public GetOrgsOrgIdEnvTypesEnvTypeIdResponse withEnvironmentTypeResponse(demo_1.test_1.models.shared.EnvironmentTypeResponse environmentTypeResponse) {
        this.environmentTypeResponse = environmentTypeResponse;
        return this;
    }
    
    /**
     * No Environment Type with `id` in Organization.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse;
    public GetOrgsOrgIdEnvTypesEnvTypeIdResponse withHumanitecErrorResponse(demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse) {
        this.humanitecErrorResponse = humanitecErrorResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public GetOrgsOrgIdEnvTypesEnvTypeIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetOrgsOrgIdEnvTypesEnvTypeIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrgsOrgIdEnvTypesEnvTypeIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
