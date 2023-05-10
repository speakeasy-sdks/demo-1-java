/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserInviteRequestRequest - UserInviteRequest describes a new user invitation.
 */
public class UserInviteRequestRequest {
    /**
     * The email address of the user from the profile.
     */
    @JsonProperty("email")
    public String email;

    public UserInviteRequestRequest withEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * The role that this user would hold.
     */
    @JsonProperty("role")
    public String role;

    public UserInviteRequestRequest withRole(String role) {
        this.role = role;
        return this;
    }
    
    public UserInviteRequestRequest(@JsonProperty("email") String email, @JsonProperty("role") String role) {
        this.email = email;
        this.role = role;
  }
}
