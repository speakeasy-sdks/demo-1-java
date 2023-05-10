/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetOrgsOrgIdEventsResponse {
    
    public String contentType;

    public GetOrgsOrgIdEventsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * A list of Events.
     * 
     * 
     */
    
    public demo_1.test_1.models.shared.EventResponse[] eventResponses;

    public GetOrgsOrgIdEventsResponse withEventResponses(demo_1.test_1.models.shared.EventResponse[] eventResponses) {
        this.eventResponses = eventResponses;
        return this;
    }
    
    
    public Integer statusCode;

    public GetOrgsOrgIdEventsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetOrgsOrgIdEventsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrgsOrgIdEventsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
