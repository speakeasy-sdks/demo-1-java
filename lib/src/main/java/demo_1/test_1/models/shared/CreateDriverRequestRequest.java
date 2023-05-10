/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateDriverRequestRequest - CreateDriverRequest describes the new resource driver registration request.
 */
public class CreateDriverRequestRequest {
    /**
     * List of resources accounts types supported by the driver
     */
    @JsonProperty("account_types")
    public String[] accountTypes;

    public CreateDriverRequestRequest withAccountTypes(String[] accountTypes) {
        this.accountTypes = accountTypes;
        return this;
    }
    
    /**
     * The ID for this driver. Is used as `driver_type`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public CreateDriverRequestRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * A JSON Schema specifying the driver-specific input parameters.
     */
    @JsonProperty("inputs_schema")
    public java.util.Map<String, Object> inputsSchema;

    public CreateDriverRequestRequest withInputsSchema(java.util.Map<String, Object> inputsSchema) {
        this.inputsSchema = inputsSchema;
        return this;
    }
    
    /**
     * Defines whether this driver is accessible to all Organizations.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_public")
    public Boolean isPublic;

    public CreateDriverRequestRequest withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }
    
    /**
     * The prefix where the driver resides or, if the driver is a virtual driver, the reference to an existing driver using the `driver://` schema of the format `driver://{orgId}/{driverId}`. Only members of the organization the driver belongs to can see 'target'.
     */
    @JsonProperty("target")
    public String target;

    public CreateDriverRequestRequest withTarget(String target) {
        this.target = target;
        return this;
    }
    
    /**
     * If the driver is a virtual driver, template defines a Go template that converts the driver inputs supplied in the resource definition into the driver inputs for the target driver.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("template")
    public Object template;

    public CreateDriverRequestRequest withTemplate(Object template) {
        this.template = template;
        return this;
    }
    
    /**
     * The type of resource produced by this driver
     */
    @JsonProperty("type")
    public String type;

    public CreateDriverRequestRequest withType(String type) {
        this.type = type;
        return this;
    }
    
    public CreateDriverRequestRequest(@JsonProperty("account_types") String[] accountTypes, @JsonProperty("inputs_schema") java.util.Map<String, Object> inputsSchema, @JsonProperty("target") String target, @JsonProperty("type") String type) {
        this.accountTypes = accountTypes;
        this.inputsSchema = inputsSchema;
        this.target = target;
        this.type = type;
  }
}
