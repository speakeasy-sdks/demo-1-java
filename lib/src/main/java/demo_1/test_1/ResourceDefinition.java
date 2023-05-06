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
 * A Resource Definitions describes how and when a resource should be provisioned. It links a driver (the how) along with a Matching Criteria (the when) to a Resource Type. This allows Humanitec to invoke a particular driver for the required Resource Type in the context of a particular Application and Environment.
 * 
 * The schema for the `driver_inputs` is defined by the `input_schema` property on the DriverDefinition identified by the `driver_type` property.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/ResourceDefinitionRequest" /&gt;
 * 
 */
public class ResourceDefinition {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public ResourceDefinition(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    public demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdResponse deleteOrgsOrgIdResourcesDefsDefId(demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdRequest.class, baseUrl, "/orgs/{orgId}/resources/defs/{defId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = demo_1.test_1.utils.Utils.getQueryParams(demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdResponse res = new demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdResponse(contentType, httpRes.statusCode()) {{
            humanitecErrorResponse = null;
            resourceDefinitionChangeResponses = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 409) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ResourceDefinitionChangeResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ResourceDefinitionChangeResponse[].class);
                res.resourceDefinitionChangeResponses = out;
            }
        }

        return res;
    }

    public demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdResponse deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId(demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest.class, baseUrl, "/orgs/{orgId}/resources/defs/{defId}/criteria/{criteriaId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = demo_1.test_1.utils.Utils.getQueryParams(demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdResponse res = new demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdResponse(contentType, httpRes.statusCode()) {{
            deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId404ApplicationJSONString = null;
            resourceDefinitionChangeResponses = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 404) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId404ApplicationJSONString = out;
            }
        }
        else if (httpRes.statusCode() == 409) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ResourceDefinitionChangeResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ResourceDefinitionChangeResponse[].class);
                res.resourceDefinitionChangeResponses = out;
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

    public demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsResponse getOrgsOrgIdResourcesDefs(demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsRequest.class, baseUrl, "/orgs/{orgId}/resources/defs", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = demo_1.test_1.utils.Utils.getQueryParams(demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsResponse(contentType, httpRes.statusCode()) {{
            resourceDefinitionResponses = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ResourceDefinitionResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ResourceDefinitionResponse[].class);
                res.resourceDefinitionResponses = out;
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

    public demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResponse getOrgsOrgIdResourcesDefsDefId(demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdRequest.class, baseUrl, "/orgs/{orgId}/resources/defs/{defId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResponse(contentType, httpRes.statusCode()) {{
            resourceDefinitionResponse = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ResourceDefinitionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ResourceDefinitionResponse.class);
                res.resourceDefinitionResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }

        return res;
    }

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

    public demo_1.test_1.models.operations.PatchOrgsOrgIdResourcesDefsDefIdResponse patchOrgsOrgIdResourcesDefsDefId(demo_1.test_1.models.operations.PatchOrgsOrgIdResourcesDefsDefIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PatchOrgsOrgIdResourcesDefsDefIdRequest.class, baseUrl, "/orgs/{orgId}/resources/defs/{defId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "patchResourceDefinitionRequestRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PatchOrgsOrgIdResourcesDefsDefIdResponse res = new demo_1.test_1.models.operations.PatchOrgsOrgIdResourcesDefsDefIdResponse(contentType, httpRes.statusCode()) {{
            resourceDefinitionResponse = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ResourceDefinitionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ResourceDefinitionResponse.class);
                res.resourceDefinitionResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 404 || httpRes.statusCode() == 422 || httpRes.statusCode() == 500) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }

        return res;
    }

    public demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsResponse postOrgsOrgIdResourcesDefs(demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsRequest.class, baseUrl, "/orgs/{orgId}/resources/defs", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "createResourceDefinitionRequestRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsResponse res = new demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsResponse(contentType, httpRes.statusCode()) {{
            resourceDefinitionResponse = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ResourceDefinitionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ResourceDefinitionResponse.class);
                res.resourceDefinitionResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 409 || httpRes.statusCode() == 500) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }

        return res;
    }

    public demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsDefIdCriteriaResponse postOrgsOrgIdResourcesDefsDefIdCriteria(demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsDefIdCriteriaRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsDefIdCriteriaRequest.class, baseUrl, "/orgs/{orgId}/resources/defs/{defId}/criteria", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "matchingCriteriaRuleRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsDefIdCriteriaResponse res = new demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsDefIdCriteriaResponse(contentType, httpRes.statusCode()) {{
            matchingCriteriaResponse = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.MatchingCriteriaResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.MatchingCriteriaResponse.class);
                res.matchingCriteriaResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 409 || httpRes.statusCode() == 422 || httpRes.statusCode() == 500) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }

        return res;
    }

    public demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDefsDefIdResponse putOrgsOrgIdResourcesDefsDefId(demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDefsDefIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDefsDefIdRequest.class, baseUrl, "/orgs/{orgId}/resources/defs/{defId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "updateResourceDefinitionRequestRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDefsDefIdResponse res = new demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDefsDefIdResponse(contentType, httpRes.statusCode()) {{
            resourceDefinitionResponse = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ResourceDefinitionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ResourceDefinitionResponse.class);
                res.resourceDefinitionResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }

        return res;
    }
}