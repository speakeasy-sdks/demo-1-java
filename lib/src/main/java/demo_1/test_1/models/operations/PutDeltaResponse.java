/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class PutDeltaResponse {
    
    public String contentType;
    public PutDeltaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * The request was invalid.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse;
    public PutDeltaResponse withHumanitecErrorResponse(demo_1.test_1.models.shared.HumanitecErrorResponse humanitecErrorResponse) {
        this.humanitecErrorResponse = humanitecErrorResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public PutDeltaResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public PutDeltaResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * No Deployment Delta with ID `deltaId` found in Application.
     * 
     * 
     */
    
    public String putDelta404ApplicationJSONString;
    public PutDeltaResponse withPutDelta404ApplicationJSONString(String putDelta404ApplicationJSONString) {
        this.putDelta404ApplicationJSONString = putDelta404ApplicationJSONString;
        return this;
    }
    
    public PutDeltaResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
