/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsOrgIdImagesResponse {
    
    public String contentType;

    public GetOrgsOrgIdImagesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Possibly empty list of Container Images.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.ImageResponse[] imageResponses;

    public GetOrgsOrgIdImagesResponse withImageResponses(demo_1.test_1.models.shared.ImageResponse[] imageResponses) {
        this.imageResponses = imageResponses;
        return this;
    }
    
    
    public Integer statusCode;

    public GetOrgsOrgIdImagesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetOrgsOrgIdImagesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrgsOrgIdImagesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
