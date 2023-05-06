/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsOrgIdUsersUserIdResponse {
    
    public String contentType;
    public GetOrgsOrgIdUsersUserIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * The request was invalid or the payload malformed.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse;
    public GetOrgsOrgIdUsersUserIdResponse withHumanitecErrorResponse(demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse) {
        this.humanitecErrorResponse = humanitecErrorResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public GetOrgsOrgIdUsersUserIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetOrgsOrgIdUsersUserIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * The information on the user.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.UserRoleResponse userRoleResponse;
    public GetOrgsOrgIdUsersUserIdResponse withUserRoleResponse(demo_1.test_1.models.shared.UserRoleResponse userRoleResponse) {
        this.userRoleResponse = userRoleResponse;
        return this;
    }
    
    public GetOrgsOrgIdUsersUserIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
