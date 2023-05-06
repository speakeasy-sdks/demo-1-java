/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MatchingCriteriaRequest - Matching Criteria are a set of rules used to choose which Resource Definition to use to provision a particular Resource Type.
 * 
 * Matching criteria are made up in order of specificity with least specific first:
 * 
 * - Environment Type (`env_type`)
 * 
 * - Application (`app_id`)
 * 
 * - Environment (`env_id`)
 * 
 * - Resource (`res_id`)
 * 
 * When selecting matching criteria, the most specific one is selected. In general, this means of all the Matching Criteria fully matching the context, the Matching Criteria Rule with the most specific element filled is chosen. If there is a tie, the next most specific elements are compared and so on until one is chosen.
 * 
 * **NOTE:**
 * 
 * Humanitec will reject the registration of matching criteria rules that duplicate rules already present for a Resource Type.
 */
public class MatchingCriteriaRequest {
    /**
     * (Optional) The ID of the Application that the Resources should belong to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app_id")
    public String appId;
    public MatchingCriteriaRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    /**
     * (Optional) The ID of the Environment that the Resources should belong to. If `env_type` is also set, it must match the Type of the Environment for the Criteria to match.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("env_id")
    public String envId;
    public MatchingCriteriaRequest withEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    
    /**
     * (Optional) The Type of the Environment that the Resources should belong to. If `env_id` is also set, it must have an Environment Type that matches this parameter for the Criteria to match.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("env_type")
    public String envType;
    public MatchingCriteriaRequest withEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    
    /**
     * Matching Criteria ID
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public MatchingCriteriaRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * (Optional) The ID of the Resource in the Deployment Set. The ID is normally a `.` separated path to the definition in the set, e.g. `modules.my-module.externals.my-database`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("res_id")
    public String resId;
    public MatchingCriteriaRequest withResId(String resId) {
        this.resId = resId;
        return this;
    }
    
    public MatchingCriteriaRequest(){}
}
