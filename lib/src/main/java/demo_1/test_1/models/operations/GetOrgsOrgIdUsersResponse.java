/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsOrgIdUsersResponse {
    
    public String contentType;
    public GetOrgsOrgIdUsersResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public GetOrgsOrgIdUsersResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetOrgsOrgIdUsersResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * A list of Users and the roles they hold.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.UserRoleResponse[] userRoleResponses;
    public GetOrgsOrgIdUsersResponse withUserRoleResponses(demo_1.test_1.models.shared.UserRoleResponse[] userRoleResponses) {
        this.userRoleResponses = userRoleResponses;
        return this;
    }
    
    public GetOrgsOrgIdUsersResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
