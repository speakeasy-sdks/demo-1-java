/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeploymentResponse - Deployments represent updates to the running state of an Environment.
 * 
 * Deployments are made by applying _Deltas_ to a state defined by an existing Deployment. The Environment’s from_deploy property defines the Deployment. This Deployment is usually but not always in the current Environment. If the Deployment is from another Environment, the state of that Environment will be "cloned" into the current Environment with the option to apply a Delta.
 */
public class DeploymentResponse {
    /**
     * An optional comment to help communicate the purpose of the Deployment.
     */
    @JsonProperty("comment")
    public String comment;

    public DeploymentResponse withComment(String comment) {
        this.comment = comment;
        return this;
    }
    
    /**
     * The Timestamp of when the Deployment was initiated.
     */
    @JsonProperty("created_at")
    public String createdAt;

    public DeploymentResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * The user who initiated the Deployment.
     */
    @JsonProperty("created_by")
    public String createdBy;

    public DeploymentResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * ID of the Deployment Delta describing the changes to the current Environment for this Deployment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("delta_id")
    public String deltaId;

    public DeploymentResponse withDeltaId(String deltaId) {
        this.deltaId = deltaId;
        return this;
    }
    
    /**
     * The Environment where the Deployment occurred.
     */
    @JsonProperty("env_id")
    public String envId;

    public DeploymentResponse withEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    
    @JsonProperty("export_file")
    public String exportFile;

    public DeploymentResponse withExportFile(String exportFile) {
        this.exportFile = exportFile;
        return this;
    }
    
    @JsonProperty("export_status")
    public String exportStatus;

    public DeploymentResponse withExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }
    
    /**
     * The ID of the Deployment that this Deployment was based on.
     */
    @JsonProperty("from_id")
    public String fromId;

    public DeploymentResponse withFromId(String fromId) {
        this.fromId = fromId;
        return this;
    }
    
    /**
     * The ID of the Deployment.
     */
    @JsonProperty("id")
    public String id;

    public DeploymentResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * ID of the Deployment Set describing the state of the Environment after Deployment.
     */
    @JsonProperty("set_id")
    public String setId;

    public DeploymentResponse withSetId(String setId) {
        this.setId = setId;
        return this;
    }
    
    /**
     * The current status of the Deployment. Can be `pending`, `in progress`, `succeeded`, or `failed`.
     */
    @JsonProperty("status")
    public String status;

    public DeploymentResponse withStatus(String status) {
        this.status = status;
        return this;
    }
    
    /**
     * The timestamp of the last `status` change. If `status` is `succeeded` or `failed` it it will indicate when the Deployment finished.
     */
    @JsonProperty("status_changed_at")
    public String statusChangedAt;

    public DeploymentResponse withStatusChangedAt(String statusChangedAt) {
        this.statusChangedAt = statusChangedAt;
        return this;
    }
    
    /**
     * ID of the Value Set Version describe the values to be used for this Deployment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value_set_version_id")
    public String valueSetVersionId;

    public DeploymentResponse withValueSetVersionId(String valueSetVersionId) {
        this.valueSetVersionId = valueSetVersionId;
        return this;
    }
    
    public DeploymentResponse(@JsonProperty("comment") String comment, @JsonProperty("created_at") String createdAt, @JsonProperty("created_by") String createdBy, @JsonProperty("env_id") String envId, @JsonProperty("export_file") String exportFile, @JsonProperty("export_status") String exportStatus, @JsonProperty("from_id") String fromId, @JsonProperty("id") String id, @JsonProperty("set_id") String setId, @JsonProperty("status") String status, @JsonProperty("status_changed_at") String statusChangedAt) {
        this.comment = comment;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.envId = envId;
        this.exportFile = exportFile;
        this.exportStatus = exportStatus;
        this.fromId = fromId;
        this.id = id;
        this.setId = setId;
        this.status = status;
        this.statusChangedAt = statusChangedAt;
  }
}
