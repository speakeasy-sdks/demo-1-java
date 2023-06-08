/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1;

import com.fasterxml.jackson.databind.ObjectMapper;
import demo_1.test_1.utils.HTTPClient;
import demo_1.test_1.utils.HTTPRequest;
import demo_1.test_1.utils.JSON;
import demo_1.test_1.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

/**
 * An Application is a collection of Workloads that work together. When deployed, all Workloads in an Application are deployed to the same namespace.
 * 
 * Apps are the root of the configuration tree holding Environments, Deployments, Shared Values, and Secrets.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/ApplicationRequest" /&gt;
 * 
 */
public class Application {
	
	private SDKConfiguration sdkConfiguration;

	public Application(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Delete an Application
     * Deleting an Application will also delete everything associated with it. This includes Environments, Deployment history on those Environments, and any shared values and secrets associated.
     * 
     * _Deletions are currently irreversible._
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdResponse deleteOrgsOrgIdAppsAppId(demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdResponse res = new demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdResponse(contentType, httpRes.statusCode()) {{
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 404) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }

        return res;
    }

    /**
     * List all Applications in an Organization.
     * Listing or lists of all Applications that exist within a specific Organization.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdAppsResponse getOrgsOrgIdApps(demo_1.test_1.models.operations.GetOrgsOrgIdAppsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdAppsRequest.class, baseUrl, "/orgs/{orgId}/apps", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdAppsResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdAppsResponse(contentType, httpRes.statusCode()) {{
            applicationResponses = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ApplicationResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ApplicationResponse[].class);
                res.applicationResponses = out;
            }
        }

        return res;
    }

    /**
     * Get an existing Application
     * Gets a specific Application in the specified Organization by ID.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdResponse getOrgsOrgIdAppsAppId(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdResponse(contentType, httpRes.statusCode()) {{
            applicationResponse = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ApplicationResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ApplicationResponse.class);
                res.applicationResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }

        return res;
    }

    /**
     * Add a new Application to an Organization
     * Creates a new Application, then adds it to the specified Organization.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.PostOrgsOrgIdAppsResponse postOrgsOrgIdApps(demo_1.test_1.models.operations.PostOrgsOrgIdAppsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PostOrgsOrgIdAppsRequest.class, baseUrl, "/orgs/{orgId}/apps", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "applicationCreationRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PostOrgsOrgIdAppsResponse res = new demo_1.test_1.models.operations.PostOrgsOrgIdAppsResponse(contentType, httpRes.statusCode()) {{
            applicationResponse = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ApplicationResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ApplicationResponse.class);
                res.applicationResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 409) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }

        return res;
    }
}