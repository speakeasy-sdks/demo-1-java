/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ErrorInfoResponse - ErrorInfo is returned by a handler in case of an error.
 */
public class ErrorInfoResponse {
    /**
     * An error details
     */
    @JsonProperty("error")
    public String error;

    public ErrorInfoResponse withError(String error) {
        this.error = error;
        return this;
    }
    
    public ErrorInfoResponse(@JsonProperty("error") String error) {
        this.error = error;
  }
}
