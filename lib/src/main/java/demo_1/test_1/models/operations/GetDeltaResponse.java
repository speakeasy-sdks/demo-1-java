/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetDeltaResponse {
    
    public String contentType;

    public GetDeltaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * The requested Deployment Delta.
     */
    
    public demo_1.test_1.models.shared.DeltaResponse deltaResponse;

    public GetDeltaResponse withDeltaResponse(demo_1.test_1.models.shared.DeltaResponse deltaResponse) {
        this.deltaResponse = deltaResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public GetDeltaResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetDeltaResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * No Deployment Delta with ID `deltaId` found in Application.
     * 
     * 
     */
    
    public String getDelta404ApplicationJSONString;

    public GetDeltaResponse withGetDelta404ApplicationJSONString(String getDelta404ApplicationJSONString) {
        this.getDelta404ApplicationJSONString = getDelta404ApplicationJSONString;
        return this;
    }
    
    public GetDeltaResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
