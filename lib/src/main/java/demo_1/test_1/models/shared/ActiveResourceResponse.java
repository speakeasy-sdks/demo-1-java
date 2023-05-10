/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ActiveResourceResponse - Active Resources represent the concrete resources provisioned for an Environment. They are provisioned on the first deployment after a dependency on a particular resource type is introduced into an Environment. In general, Active Resources are only deleted when their introductory Environment is deleted.
 * 
 * Active Resources are provisioned based on a Resource Definition. The Resource Definition describes how to provision a concrete resource based on a Resource Type and metadata about the Environment (for example the Environment Type or the Application ID). The criteria for how to choose a Resource Definition is known as a Matching Criteria. If the Matching Criteria changes or the Resource Definition is deleted, the concrete resource represented by an Active Resource might be deleted and reprovisioned when a deployment occurs in the Environment.
 */
public class ActiveResourceResponse {
    /**
     * The ID of the App the resource is associated with.
     */
    @JsonProperty("app_id")
    public String appId;

    public ActiveResourceResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    /**
     * The Resource Definition that this resource was provisioned from.
     */
    @JsonProperty("def_id")
    public String defId;

    public ActiveResourceResponse withDefId(String defId) {
        this.defId = defId;
        return this;
    }
    
    /**
     * The deployment that the resource was last provisioned in.
     */
    @JsonProperty("deploy_id")
    public String deployId;

    public ActiveResourceResponse withDeployId(String deployId) {
        this.deployId = deployId;
        return this;
    }
    
    /**
     * The ID of the Environment the resource is associated with.
     */
    @JsonProperty("env_id")
    public String envId;

    public ActiveResourceResponse withEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    
    /**
     * The Environment Type of the Environment specified by env_id.
     */
    @JsonProperty("env_type")
    public String envType;

    public ActiveResourceResponse withEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    
    /**
     * the ID of the Organization the Active Resource is associated with.
     */
    @JsonProperty("org_id")
    public String orgId;

    public ActiveResourceResponse withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    /**
     * The ID of the resource
     */
    @JsonProperty("res_id")
    public String resId;

    public ActiveResourceResponse withResId(String resId) {
        this.resId = resId;
        return this;
    }
    
    /**
     * The data that the resource passes into the deployment ('values' only).
     */
    @JsonProperty("resource")
    public java.util.Map<String, Object> resource;

    public ActiveResourceResponse withResource(java.util.Map<String, Object> resource) {
        this.resource = resource;
        return this;
    }
    
    /**
     * Current resource status: 'pending', 'active', or 'deleting'.
     */
    @JsonProperty("status")
    public String status;

    public ActiveResourceResponse withStatus(String status) {
        this.status = status;
        return this;
    }
    
    /**
     * The Resource Type of the resource
     */
    @JsonProperty("type")
    public String type;

    public ActiveResourceResponse withType(String type) {
        this.type = type;
        return this;
    }
    
    /**
     * The time the resource was last provisioned as part of a deployment.
     */
    @JsonProperty("updated_at")
    public String updatedAt;

    public ActiveResourceResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public ActiveResourceResponse(@JsonProperty("app_id") String appId, @JsonProperty("def_id") String defId, @JsonProperty("deploy_id") String deployId, @JsonProperty("env_id") String envId, @JsonProperty("env_type") String envType, @JsonProperty("org_id") String orgId, @JsonProperty("res_id") String resId, @JsonProperty("resource") java.util.Map<String, Object> resource, @JsonProperty("status") String status, @JsonProperty("type") String type, @JsonProperty("updated_at") String updatedAt) {
        this.appId = appId;
        this.defId = defId;
        this.deployId = deployId;
        this.envId = envId;
        this.envType = envType;
        this.orgId = orgId;
        this.resId = resId;
        this.resource = resource;
        this.status = status;
        this.type = type;
        this.updatedAt = updatedAt;
  }
}
