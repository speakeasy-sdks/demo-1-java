/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class DeleteOrgsOrgIdResourcesDefsDefIdResponse {
    
    public String contentType;

    public DeleteOrgsOrgIdResourcesDefsDefIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A Resource Driver with the 'driverId' ID is not found or is not accessible by the organization.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse;

    public DeleteOrgsOrgIdResourcesDefsDefIdResponse withHumanitecErrorResponse(demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse) {
        this.humanitecErrorResponse = humanitecErrorResponse;
        return this;
    }
    
    /**
     * List of Active Resources that still reference this Resource Definition.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.ResourceDefinitionChangeResponse[] resourceDefinitionChangeResponses;

    public DeleteOrgsOrgIdResourcesDefsDefIdResponse withResourceDefinitionChangeResponses(demo_1.test_1.models.shared.ResourceDefinitionChangeResponse[] resourceDefinitionChangeResponses) {
        this.resourceDefinitionChangeResponses = resourceDefinitionChangeResponses;
        return this;
    }
    
    
    public Integer statusCode;

    public DeleteOrgsOrgIdResourcesDefsDefIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteOrgsOrgIdResourcesDefsDefIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public DeleteOrgsOrgIdResourcesDefsDefIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
