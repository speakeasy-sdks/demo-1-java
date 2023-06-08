/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1;

import com.fasterxml.jackson.databind.ObjectMapper;
import demo_1.test_1.utils.HTTPClient;
import demo_1.test_1.utils.HTTPRequest;
import demo_1.test_1.utils.JSON;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class UserInvite {
	
	private SDKConfiguration sdkConfiguration;

	public UserInvite(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * List the invites issued for the organization.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdInvitationsResponse getOrgsOrgIdInvitations(demo_1.test_1.models.operations.GetOrgsOrgIdInvitationsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdInvitationsRequest.class, baseUrl, "/orgs/{orgId}/invitations", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdInvitationsResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdInvitationsResponse(contentType, httpRes.statusCode()) {{
            userInviteResponses = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.UserInviteResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.UserInviteResponse[].class);
                res.userInviteResponses = out;
            }
        }

        return res;
    }
}