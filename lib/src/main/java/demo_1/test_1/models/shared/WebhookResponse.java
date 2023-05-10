/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookResponse - Webhook is a special type of a Job, it performs a HTTPS request to a specified URL with specified headers.
 */
public class WebhookResponse {
    /**
     * The timestamp of when this Job was created.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    public String createdAt;

    public WebhookResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * The user who created this Job
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public String createdBy;

    public WebhookResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Defines whether this job is currently disabled.
     */
    @JsonProperty("disabled")
    public Boolean disabled;

    public WebhookResponse withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    
    @JsonProperty("headers")
    public java.util.Map<String, Object> headers;

    public WebhookResponse withHeaders(java.util.Map<String, Object> headers) {
        this.headers = headers;
        return this;
    }
    
    /**
     * Job ID, unique within the Organization
     */
    @JsonProperty("id")
    public String id;

    public WebhookResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("payload")
    public java.util.Map<String, Object> payload;

    public WebhookResponse withPayload(java.util.Map<String, Object> payload) {
        this.payload = payload;
        return this;
    }
    
    /**
     * A list of Events by which the Job is triggered
     */
    @JsonProperty("triggers")
    public EventBaseResponse[] triggers;

    public WebhookResponse withTriggers(EventBaseResponse[] triggers) {
        this.triggers = triggers;
        return this;
    }
    
    /**
     * Thw webhook's URL (without protocol, only HTTPS is supported)
     */
    @JsonProperty("url")
    public String url;

    public WebhookResponse withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public WebhookResponse(@JsonProperty("disabled") Boolean disabled, @JsonProperty("headers") java.util.Map<String, Object> headers, @JsonProperty("id") String id, @JsonProperty("payload") java.util.Map<String, Object> payload, @JsonProperty("triggers") EventBaseResponse[] triggers, @JsonProperty("url") String url) {
        this.disabled = disabled;
        this.headers = headers;
        this.id = id;
        this.payload = payload;
        this.triggers = triggers;
        this.url = url;
  }
}
