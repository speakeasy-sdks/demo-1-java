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
 * An Automation Rule defining how and when artefacts in an environment should be updated.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/AutomationRuleRequest" /&gt;
 * 
 */
public class AutomationRule {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public AutomationRule(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Delete Automation Rule from an Environment.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse deleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId(demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/envs/{envId}/rules/{ruleId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse res = new demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * List all Automation Rules in an Environment.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse getOrgsOrgIdAppsAppIdEnvsEnvIdRules(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/envs/{envId}/rules", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse(contentType, httpRes.statusCode()) {{
            automationRuleResponses = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.AutomationRuleResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.AutomationRuleResponse[].class);
                res.automationRuleResponses = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
        }

        return res;
    }

    /**
     * Get a specific Automation Rule for an Environment.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse getOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/envs/{envId}/rules/{ruleId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse(contentType, httpRes.statusCode()) {{
            automationRuleResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.AutomationRuleResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.AutomationRuleResponse.class);
                res.automationRuleResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Create a new Automation Rule for an Environment.
     * Items marked as deprecated are still supported (however not recommended) for use and are incompatible with properties of the latest api version. In particular an error is raised if  `images_filter` (deprecated) and `artefacts_filter` are used in the same payload. The same is true for `exclude_images_filter` (deprecated) and `exclude_artefacts_filter`. `match` and `update_to` are still supported but will trigger an error if combined with `match_ref`.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse postOrgsOrgIdAppsAppIdEnvsEnvIdRules(demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/envs/{envId}/rules", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "automationRuleRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse res = new demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse(contentType, httpRes.statusCode()) {{
            automationRuleResponse = null;
            errorInfoResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.AutomationRuleResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.AutomationRuleResponse.class);
                res.automationRuleResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ErrorInfoResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ErrorInfoResponse.class);
                res.errorInfoResponse = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
        }

        return res;
    }

    /**
     * Update an existing Automation Rule for an Environment.
     * Items marked as deprecated are still supported (however not recommended) for use and are incompatible with properties of the latest api version. In particular an error is raised if  `images_filter` (deprecated) and `artefacts_filter` are used in the same payload. The same is true for `exclude_images_filter` (deprecated) and `exclude_artefacts_filter`. `match` and `update_to` are still supported but will trigger an error if combined with `match_ref`.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse putOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId(demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest.class, baseUrl, "/orgs/{orgId}/apps/{appId}/envs/{envId}/rules/{ruleId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "automationRuleRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse res = new demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse(contentType, httpRes.statusCode()) {{
            automationRuleResponse = null;
            errorInfoResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.AutomationRuleResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.AutomationRuleResponse.class);
                res.automationRuleResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.ErrorInfoResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.ErrorInfoResponse.class);
                res.errorInfoResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404 || httpRes.statusCode() == 422) {
        }

        return res;
    }
}