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
 * DriverDefinition describes the resource driver.
 * 
 * Resource Drivers are code that fulfils the Humanitec Resource Driver Interface. This interface allows for certain actions to be performed on resources such as creation and destruction. Humanitec provides numerous Resource Drivers “out of the box”. It is also possible to use 3rd party Resource Drivers or write your own.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/DriverDefinitionRequest" /&gt;
 * 
 */
public class DriverDefinition {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public DriverDefinition(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Delete a Resources Driver.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDriversDriverIdResponse deleteOrgsOrgIdResourcesDriversDriverId(demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDriversDriverIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDriversDriverIdRequest.class, baseUrl, "/orgs/{orgId}/resources/drivers/{driverId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDriversDriverIdResponse res = new demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDriversDriverIdResponse(contentType, httpRes.statusCode()) {{
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
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
     * List Resource Drivers.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversResponse getOrgsOrgIdResourcesDrivers(demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversRequest.class, baseUrl, "/orgs/{orgId}/resources/drivers", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversResponse(contentType, httpRes.statusCode()) {{
            driverDefinitionResponses = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.DriverDefinitionResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.DriverDefinitionResponse[].class);
                res.driverDefinitionResponses = out;
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
     * Get a Resource Driver.
     * # Only drivers that belongs to the given organization or registered as `public` are accessible through this endpoint
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversDriverIdResponse getOrgsOrgIdResourcesDriversDriverId(demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversDriverIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversDriverIdRequest.class, baseUrl, "/orgs/{orgId}/resources/drivers/{driverId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversDriverIdResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversDriverIdResponse(contentType, httpRes.statusCode()) {{
            driverDefinitionResponse = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.DriverDefinitionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.DriverDefinitionResponse.class);
                res.driverDefinitionResponse = out;
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

    /**
     * Register a new Resource Driver.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDriversResponse postOrgsOrgIdResourcesDrivers(demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDriversRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDriversRequest.class, baseUrl, "/orgs/{orgId}/resources/drivers", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "createDriverRequestRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDriversResponse res = new demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDriversResponse(contentType, httpRes.statusCode()) {{
            driverDefinitionResponse = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.DriverDefinitionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.DriverDefinitionResponse.class);
                res.driverDefinitionResponse = out;
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

    /**
     * Update a Resource Driver.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDriversDriverIdResponse putOrgsOrgIdResourcesDriversDriverId(demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDriversDriverIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDriversDriverIdRequest.class, baseUrl, "/orgs/{orgId}/resources/drivers/{driverId}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = demo_1.test_1.utils.Utils.serializeRequestBody(request, "updateDriverRequestRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDriversDriverIdResponse res = new demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDriversDriverIdResponse(contentType, httpRes.statusCode()) {{
            driverDefinitionResponse = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.DriverDefinitionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.DriverDefinitionResponse.class);
                res.driverDefinitionResponse = out;
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
}