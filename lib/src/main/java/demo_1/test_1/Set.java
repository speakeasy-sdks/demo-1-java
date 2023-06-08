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
import org.apache.http.NameValuePair;

/**
 * A Deployment Set (or just "Set") defines all of the non-Environment specific configuration for Modules and External Resources. Each of these Modules or External Resources has a unique name.
 * 
 * Deployment Sets are immutable and their ID is a cryptographic hash of their content. This means that a Deployment Set can be globally identified based on its ID. It also means that referencing a Deployment Set by ID will always return the same Deployment Set.
 * 
 * Deployment Sets cannot be created directly, instead they are created by applying a Deployment Delta to an existing Deployment Set.
 * 
 * **Basic Structure**
 * 
 * ```
 *  {
 *    "id": &lt;ID of the Deployment Set&gt;,
 *    "modules" : {
 *      &lt;ID of Module&gt; : {
 *        "profile": &lt;Defines how the optional "spec" property is interpreted&gt;
 *        "spec": {
 *          &lt;Properties that depend on the "profile" property.&gt;
 *        }
 *        "externals": {
 *          &lt;External Resource Name&gt; : {
 *            "type": &lt;Resource Type&gt;,
 *            "params": {
 *              &lt;Properties which parametrize the resource depending on the Resource Type.&gt;
 *            }
 *          }
 *        }
 *      }
 *    }
 *  }
 * ```
 * 
 * For details about how the Humanitec provided profiles work, see (Deployment Set Profiles)[].
 * &lt;SchemaDefinition schemaRef="#/components/schemas/SetRequest" /&gt;
 * 
 */
public class Set {
	
	private SDKConfiguration sdkConfiguration;

	public Set(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get all Deployment Sets
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetSetsResponse getSets(demo_1.test_1.models.operations.GetSetsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetSetsRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/sets", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetSetsResponse res = new demo_1.test_1.models.operations.GetSetsResponse(contentType, httpRes.statusCode()) {{
            setResponses = null;
            getSets404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.SetResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.SetResponse[].class);
                res.setResponses = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getSets404ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * Get a Deployment Set
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdResponse getOrgsOrgIdAppsAppIdSetsSetId(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/sets/{setId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = demo_1.test_1.utils.Utils.getQueryParams(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdResponse(contentType, httpRes.statusCode()) {{
            getOrgsOrgIdAppsAppIdSetsSetId200ApplicationJSONOneOf = null;
            getOrgsOrgIdAppsAppIdSetsSetId404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.getOrgsOrgIdAppsAppIdSetsSetId200ApplicationJSONOneOf = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getOrgsOrgIdAppsAppIdSetsSetId404ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * Get the difference between 2 Deployment Sets
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdResponse getOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetId(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/sets/{setId}/diff/{sourceSetId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdResponse(contentType, httpRes.statusCode()) {{
            plainDeltaResponse = null;
            getOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetId404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.PlainDeltaResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.PlainDeltaResponse.class);
                res.plainDeltaResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetId404ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * Apply a Deployment Delta to a Deployment Set
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdSetsSetIdResponse postOrgsOrgIdAppsAppIdSetsSetId(demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdSetsSetIdRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdSetsSetIdRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/sets/{setId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "deltaRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.7, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdSetsSetIdResponse res = new demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdSetsSetIdResponse(contentType, httpRes.statusCode()) {{
            postOrgsOrgIdAppsAppIdSetsSetId200ApplicationJSONString = null;
            humanitecErrorResponse = null;
            postOrgsOrgIdAppsAppIdSetsSetId404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.postOrgsOrgIdAppsAppIdSetsSetId200ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.postOrgsOrgIdAppsAppIdSetsSetId404ApplicationJSONString = out;
            }
        }

        return res;
    }
}