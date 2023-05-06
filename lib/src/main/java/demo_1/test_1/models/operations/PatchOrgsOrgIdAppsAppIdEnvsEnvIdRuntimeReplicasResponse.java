/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasResponse {
    
    public String contentType;
    public PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
