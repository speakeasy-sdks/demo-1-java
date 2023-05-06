/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrganizationResponse - An Organization is the top level object in Humanitec. All other objects belong to an Organization.
 */
public class OrganizationResponse {
    /**
     * Timestamp when the Organization was created.
     */
    @JsonProperty("created_at")
    public String createdAt;
    public OrganizationResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * User ID that created the Organization.
     */
    @JsonProperty("created_by")
    public String createdBy;
    public OrganizationResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * Unique ID for the Organization.
     */
    @JsonProperty("id")
    public String id;
    public OrganizationResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Human friendly name for the Organization.
     */
    @JsonProperty("name")
    public String name;
    public OrganizationResponse withName(String name) {
        this.name = name;
        return this;
    }
    
    public OrganizationResponse(@JsonProperty("created_at") String createdAt, @JsonProperty("created_by") String createdBy, @JsonProperty("id") String id, @JsonProperty("name") String name) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.id = id;
        this.name = name;
  }
}
