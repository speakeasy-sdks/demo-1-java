/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnvironmentBaseResponse {
    /**
     * The ID the Environment is referenced as.
     */
    @JsonProperty("id")
    public String id;
    public EnvironmentBaseResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The Human-friendly name for the Environment.
     */
    @JsonProperty("name")
    public String name;
    public EnvironmentBaseResponse withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The Environment Type. This is used for organizing and managing Environments.
     */
    @JsonProperty("type")
    public String type;
    public EnvironmentBaseResponse withType(String type) {
        this.type = type;
        return this;
    }
    
    public EnvironmentBaseResponse(@JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("type") String type) {
        this.id = id;
        this.name = name;
        this.type = type;
  }
}
