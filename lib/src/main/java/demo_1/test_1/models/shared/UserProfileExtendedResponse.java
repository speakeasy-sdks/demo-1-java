/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserProfileExtendedResponse - UserProfileExtended holds the profile information of a user including properties only accessible to the user.
 */
public class UserProfileExtendedResponse {
    /**
     * The time the user was first registered with Humanitec
     */
    @JsonProperty("created_at")
    public String createdAt;
    public UserProfileExtendedResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * The email address of the user from the profile
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    public String email;
    public UserProfileExtendedResponse withEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * The User ID for this user
     */
    @JsonProperty("id")
    public String id;
    public UserProfileExtendedResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The name the user goes by
     */
    @JsonProperty("name")
    public String name;
    public UserProfileExtendedResponse withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("properties")
    public java.util.Map<String, Object> properties;
    public UserProfileExtendedResponse withProperties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }
    
    @JsonProperty("roles")
    public java.util.Map<String, String> roles;
    public UserProfileExtendedResponse withRoles(java.util.Map<String, String> roles) {
        this.roles = roles;
        return this;
    }
    
    /**
     * The type of the account. Could be user, service or system
     */
    @JsonProperty("type")
    public String type;
    public UserProfileExtendedResponse withType(String type) {
        this.type = type;
        return this;
    }
    
    public UserProfileExtendedResponse(@JsonProperty("created_at") String createdAt, @JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("properties") java.util.Map<String, Object> properties, @JsonProperty("roles") java.util.Map<String, String> roles, @JsonProperty("type") String type) {
        this.createdAt = createdAt;
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.roles = roles;
        this.type = type;
  }
}
