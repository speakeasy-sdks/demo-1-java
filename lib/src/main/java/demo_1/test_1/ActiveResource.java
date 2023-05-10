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

/**
 * Active Resources represent the concrete resources provisioned for an Environment. They are provisioned on the first deployment after a dependency on a particular resource type is introduced into an Environment. In general, Active Resources are only deleted when their introductory Environment is deleted.
 * 
 * Active Resources are provisioned based on a Resource Definition. The Resource Definition describes how to provision a concrete resource based on a Resource Type and metadata about the Environment (for example the Environment Type or the Application ID). The criteria for how to choose a Resource Definition is known as a Matching Criteria. If the Matching Criteria changes or the Resource Definition is deleted, the concrete resource represented by an Active Resource might be deleted and reprovisioned when a deployment occurs in the Environment.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/ActiveResourceRequest" /&gt;
 * 
 */
public class ActiveResource {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public ActiveResource(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Delete Active Resources.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdResponse deleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResId(demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/envs/{envId}/resources/{type}/{resId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdResponse res = new demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 202 || httpRes.statusCode() == 204 || httpRes.statusCode() == 404 || httpRes.statusCode() == 409) {
        }

        return res;
    }

    /**
     * List Active Resources provisioned in an environment.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesResponse getOrgsOrgIdAppsAppIdEnvsEnvIdResources(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/envs/{envId}/resources", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesResponse(contentType, httpRes.statusCode()) {{
            activeResourceResponses = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ActiveResourceResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ActiveResourceResponse[].class);
                res.activeResourceResponses = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }

        return res;
    }

    /**
     * List Active Resources provisioned via a specific Resource Definition.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResourcesResponse getOrgsOrgIdResourcesDefsDefIdResources(demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResourcesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResourcesRequest.class, baseUrl, "/orgs/{orgId}/resources/defs/{defId}/resources", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResourcesResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResourcesResponse(contentType, httpRes.statusCode()) {{
            activeResourceResponses = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ActiveResourceResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ActiveResourceResponse[].class);
                res.activeResourceResponses = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }

        return res;
    }
}