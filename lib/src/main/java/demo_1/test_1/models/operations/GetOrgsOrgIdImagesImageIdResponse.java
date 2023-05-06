/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsOrgIdImagesImageIdResponse {
    
    public String contentType;
    public GetOrgsOrgIdImagesImageIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * No Image with an ID of `imageId` found within the organization.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse;
    public GetOrgsOrgIdImagesImageIdResponse withHumanitecErrorResponse(demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse) {
        this.humanitecErrorResponse = humanitecErrorResponse;
        return this;
    }
    
    /**
     * The Image Object requested.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.ImageResponse imageResponse;
    public GetOrgsOrgIdImagesImageIdResponse withImageResponse(demo_1.test_1.models.shared.ImageResponse imageResponse) {
        this.imageResponse = imageResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public GetOrgsOrgIdImagesImageIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetOrgsOrgIdImagesImageIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrgsOrgIdImagesImageIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
