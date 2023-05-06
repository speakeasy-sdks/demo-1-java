/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdResponse {
    /**
     * The updated Artefact Version.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.ArtefactVersionResponse artefactVersionResponse;
    public PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdResponse withArtefactVersionResponse(demo_1.test_1.models.shared.ArtefactVersionResponse artefactVersionResponse) {
        this.artefactVersionResponse = artefactVersionResponse;
        return this;
    }
    
    
    public String contentType;
    public PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * One or more request parameters are missing or invalid, or the requested payload is not provided or malformed.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse;
    public PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdResponse withHumanitecErrorResponse(demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse) {
        this.humanitecErrorResponse = humanitecErrorResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
