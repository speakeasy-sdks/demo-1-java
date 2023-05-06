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
 * Resource Account Types define cloud providers or protocols to which a resource account can belong.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/AccountTypeRequest" /&gt;
 * 
 */
public class AccountType {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public AccountType(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    public demo_1.test_1.models.operations.GetOrgsOrgIdResourcesAccountTypesResponse getOrgsOrgIdResourcesAccountTypes(demo_1.test_1.models.operations.GetOrgsOrgIdResourcesAccountTypesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = demo_1.test_1.utils.Utils.generateURL(demo_1.test_1.models.operations.GetOrgsOrgIdResourcesAccountTypesRequest.class, baseUrl, "/orgs/{orgId}/resources/account-types", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        demo_1.test_1.models.operations.GetOrgsOrgIdResourcesAccountTypesResponse res = new demo_1.test_1.models.operations.GetOrgsOrgIdResourcesAccountTypesResponse(contentType, httpRes.statusCode()) {{
            accountTypeResponses = null;
            humanitecErrorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (demo_1.test_1.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                demo_1.test_1.models.shared.AccountTypeResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), demo_1.test_1.models.shared.AccountTypeResponse[].class);
                res.accountTypeResponses = out;
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