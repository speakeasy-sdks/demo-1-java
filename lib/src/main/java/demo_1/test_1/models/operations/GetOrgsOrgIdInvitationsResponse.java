/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsOrgIdInvitationsResponse {
    
    public String contentType;

    public GetOrgsOrgIdInvitationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public GetOrgsOrgIdInvitationsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetOrgsOrgIdInvitationsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * The list of the invites issued for the organization.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.UserInviteResponse[] userInviteResponses;

    public GetOrgsOrgIdInvitationsResponse withUserInviteResponses(demo_1.test_1.models.shared.UserInviteResponse[] userInviteResponses) {
        this.userInviteResponses = userInviteResponses;
        return this;
    }
    
    public GetOrgsOrgIdInvitationsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
