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
 * A Deployment Delta (or just "Delta") describes the changes that must be applied to one Deployment Set to generate another Deployment Set. Deployment Deltas are the only way to create new Deployment Sets.
 * 
 * Deployment Deltas can be created fully formed or combined together via PATCHing. They can also be generated from the difference between two Deployment Sets.
 * 
 * **Basic Structure**
 * 
 * ```
 *  {
 *    "id": &lt;ID of the Deployment Delta.&gt;,
 *    "metadata": {
 *      &lt;Properties such as who created the Delta, which Environment it is associated to and a Human-friendly name&gt;
 *    }
 *    "modules" : {
 *      "add" : {
 *        &lt;ID of Module to add to the Deployment Set&gt; : {
 *          &lt;An entire Modules object&gt;
 *        }
 *      },
 *      "remove": [
 *        &lt;An array of Module IDs that should be removed from the Deployment Set&gt;
 *      ],
 *     "update": {
 *        &lt;ID of Module already in the Set to be updated&gt; : [
 *          &lt;An array of JSON Patch (Search Results (RFC 6902) objects scoped to the module&gt;
 *        ]
 *      }
 *    }
 *  }
 * ```
 * &lt;SchemaDefinition schemaRef="#/components/schemas/DeltaRequest" /&gt;
 * 
 */
public class Delta {
	
	private SDKConfiguration sdkConfiguration;

	public Delta(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Fetch an existing Delta
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetDeltaResponse getDelta(demo_1.test_1.models.operations.GetDeltaRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetDeltaRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/deltas/{deltaId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetDeltaResponse res = new demo_1.test_1.models.operations.GetDeltaResponse(contentType, httpRes.statusCode()) {{
            deltaResponse = null;
            getDelta404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.DeltaResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.DeltaResponse.class);
                res.deltaResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.getDelta404ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * List Deltas in an Application
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdDeltasResponse getOrgsOrgIdAppsAppIdDeltas(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdDeltasRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdDeltasRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/deltas", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = demo_1.test_1.utils.Utils.getQueryParams(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdDeltasRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdDeltasResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdDeltasResponse(contentType, httpRes.statusCode()) {{
            deltaResponses = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.DeltaResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.DeltaResponse[].class);
                res.deltaResponses = out;
            }
        }

        return res;
    }

    /**
     * Update an existing Delta
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdDeltasDeltaIdResponse patchOrgsOrgIdAppsAppIdDeltasDeltaId(demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdDeltasDeltaIdRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdDeltasDeltaIdRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/deltas/{deltaId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.7, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdDeltasDeltaIdResponse res = new demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdDeltasDeltaIdResponse(contentType, httpRes.statusCode()) {{
            deltaResponse = null;
            humanitecErrorResponse = null;
            patchOrgsOrgIdAppsAppIdDeltasDeltaId404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.DeltaResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.DeltaResponse.class);
                res.deltaResponse = out;
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
                res.patchOrgsOrgIdAppsAppIdDeltasDeltaId404ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * Create a new Delta
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdDeltasResponse postOrgsOrgIdAppsAppIdDeltas(demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdDeltasRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdDeltasRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/deltas", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "deltaRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdDeltasResponse res = new demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdDeltasResponse(contentType, httpRes.statusCode()) {{
            postOrgsOrgIdAppsAppIdDeltas200ApplicationJSONOneOf = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.postOrgsOrgIdAppsAppIdDeltas200ApplicationJSONOneOf = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }

        return res;
    }

    /**
     * Update an existing Delta
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.PutDeltaResponse putDelta(demo_1.test_1.models.operations.PutDeltaRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PutDeltaRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/deltas/{deltaId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "deltaRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PutDeltaResponse res = new demo_1.test_1.models.operations.PutDeltaResponse(contentType, httpRes.statusCode()) {{
            humanitecErrorResponse = null;
            putDelta404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
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
                res.putDelta404ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * Mark a Delta as "archived"
     * Archived Deltas are still accessible but can no longer be updated.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchivedResponse putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchived(demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchivedRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchivedRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/deltas/{deltaId}/metadata/archived", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchivedResponse res = new demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchivedResponse(contentType, httpRes.statusCode()) {{
            humanitecErrorResponse = null;
            putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchived404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
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
                res.putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchived404ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * Change the Environment of a Delta
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvIdResponse putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvId(demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvIdRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvIdRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/deltas/{deltaId}/metadata/env_id", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "requestBody", "string");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvIdResponse res = new demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvIdResponse(contentType, httpRes.statusCode()) {{
            humanitecErrorResponse = null;
            putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvId404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
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
                res.putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvId404ApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * Change the name of a Delta
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataNameResponse putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataName(demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataNameRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataNameRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/deltas/{deltaId}/metadata/name", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "requestBody", "string");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataNameResponse res = new demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataNameResponse(contentType, httpRes.statusCode()) {{
            humanitecErrorResponse = null;
            putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataName404ApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
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
                res.putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataName404ApplicationJSONString = out;
            }
        }

        return res;
    }
}