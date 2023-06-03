/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import demo_1.test_1.utils.HTTPClient;
import demo_1.test_1.utils.HTTPRequest;
import demo_1.test_1.utils.JSON;
import demo_1.test_1.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

/**
 * Environment Types are a way of grouping and managing Environments. Every Environment has exactly 1 Environment Type.
 * 
 * Environment Types can be used with External Resources to manage where resources such as databases are provisioned or even which cluster to deploy to.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/EnvironmentTypeRequest" /&gt;
 * 
 */
public class EnvironmentType {
	
	private SDKConfiguration sdkConfiguration;

	public EnvironmentType(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Deletes an Environment Type
     * Deletes a specific Environment Type from an Organization. If there are Environments with this Type in the Organization, the operation will fail.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.DeleteOrgsOrgIdEnvTypesEnvTypeIdResponse deleteOrgsOrgIdEnvTypesEnvTypeId(demo_1.test_1.models.operations.DeleteOrgsOrgIdEnvTypesEnvTypeIdRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.DeleteOrgsOrgIdEnvTypesEnvTypeIdRequest.class, baseUrl, "/orgs/{orgId}/env-types/{envTypeId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.7, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.DeleteOrgsOrgIdEnvTypesEnvTypeIdResponse res = new demo_1.test_1.models.operations.DeleteOrgsOrgIdEnvTypesEnvTypeIdResponse(contentType, httpRes.statusCode()) {{
            environmentTypeResponse = null;
            humanitecErrorResponse = null;
            deleteOrgsOrgIdEnvTypesEnvTypeId409ApplicationJSONObjects = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.EnvironmentTypeResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.EnvironmentTypeResponse.class);
                res.environmentTypeResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 404) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.HumanitecErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.HumanitecErrorResponse.class);
                res.humanitecErrorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 409) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, String>[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, String>[]>() {});
                res.deleteOrgsOrgIdEnvTypesEnvTypeId409ApplicationJSONObjects = out;
            }
        }

        return res;
    }

    /**
     * List all Environment Types
     * Lists all Environment Types in an Organization.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesResponse getOrgsOrgIdEnvTypes(demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesRequest.class, baseUrl, "/orgs/{orgId}/env-types", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesResponse(contentType, httpRes.statusCode()) {{
            environmentTypeResponses = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.EnvironmentTypeResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.EnvironmentTypeResponse[].class);
                res.environmentTypeResponses = out;
            }
        }

        return res;
    }

    /**
     * Get an Environment Type
     * Gets a specific Environment Type within an Organization.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesEnvTypeIdResponse getOrgsOrgIdEnvTypesEnvTypeId(demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesEnvTypeIdRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesEnvTypeIdRequest.class, baseUrl, "/orgs/{orgId}/env-types/{envTypeId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesEnvTypeIdResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesEnvTypeIdResponse(contentType, httpRes.statusCode()) {{
            environmentTypeResponse = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.EnvironmentTypeResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.EnvironmentTypeResponse.class);
                res.environmentTypeResponse = out;
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
     * Add a new Environment Type
     * Adds a new Environment Type to an Organization.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.PostOrgsOrgIdEnvTypesResponse postOrgsOrgIdEnvTypes(demo_1.test_1.models.operations.PostOrgsOrgIdEnvTypesRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PostOrgsOrgIdEnvTypesRequest.class, baseUrl, "/orgs/{orgId}/env-types", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "environmentTypeRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PostOrgsOrgIdEnvTypesResponse res = new demo_1.test_1.models.operations.PostOrgsOrgIdEnvTypesResponse(contentType, httpRes.statusCode()) {{
            environmentTypeResponse = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.EnvironmentTypeResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.EnvironmentTypeResponse.class);
                res.environmentTypeResponse = out;
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