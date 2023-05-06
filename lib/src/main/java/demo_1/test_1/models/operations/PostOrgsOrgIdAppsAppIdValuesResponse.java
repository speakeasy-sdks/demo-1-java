/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class PostOrgsOrgIdAppsAppIdValuesResponse {
    
    public String contentType;
    public PostOrgsOrgIdAppsAppIdValuesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Input not valid.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse;
    public PostOrgsOrgIdAppsAppIdValuesResponse withHumanitecErrorResponse(demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse) {
        this.humanitecErrorResponse = humanitecErrorResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public PostOrgsOrgIdAppsAppIdValuesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public PostOrgsOrgIdAppsAppIdValuesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Shared Value successfully created.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.ValueResponse valueResponse;
    public PostOrgsOrgIdAppsAppIdValuesResponse withValueResponse(demo_1.test_1.models.shared.ValueResponse valueResponse) {
        this.valueResponse = valueResponse;
        return this;
    }
    
    public PostOrgsOrgIdAppsAppIdValuesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
