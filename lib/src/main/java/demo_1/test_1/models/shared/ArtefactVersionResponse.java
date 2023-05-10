/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ArtefactVersionResponse - An Artefact Version represents a particular version of an Artefact that can be added to an Application.
 */
public class ArtefactVersionResponse {
    /**
     * If the Artefact Version is archived.
     */
    @JsonProperty("archived")
    public Boolean archived;

    public ArtefactVersionResponse withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }
    
    /**
     * The UUID of the Artefact.
     */
    @JsonProperty("artefact_id")
    public String artefactId;

    public ArtefactVersionResponse withArtefactId(String artefactId) {
        this.artefactId = artefactId;
        return this;
    }
    
    /**
     * (Optional) The commit ID the Artefact Version was built on.
     */
    @JsonProperty("commit")
    public String commit;

    public ArtefactVersionResponse withCommit(String commit) {
        this.commit = commit;
        return this;
    }
    
    /**
     * The time when the Artefact Version was added to Humanitec.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_at")
    public String createdAt;

    public ArtefactVersionResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * The user ID of the user who added the Artefact Version to Humanitec.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created_by")
    public String createdBy;

    public ArtefactVersionResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    /**
     * (Optional) The Artefact Version digest.
     */
    @JsonProperty("digest")
    public String digest;

    public ArtefactVersionResponse withDigest(String digest) {
        this.digest = digest;
        return this;
    }
    
    /**
     * The UUID of the Artefact Version.
     */
    @JsonProperty("id")
    public String id;

    public ArtefactVersionResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The name of the Artefact.
     */
    @JsonProperty("name")
    public String name;

    public ArtefactVersionResponse withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * (Optional) The ref the Artefact Version was built from.
     */
    @JsonProperty("ref")
    public String ref;

    public ArtefactVersionResponse withRef(String ref) {
        this.ref = ref;
        return this;
    }
    
    /**
     * The time when the Artefact Version was updated for the last time.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_at")
    public String updatedAt;

    public ArtefactVersionResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    /**
     * The user ID of the user who performed the last updated on the Artefact Version.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated_by")
    public String updatedBy;

    public ArtefactVersionResponse withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    
    /**
     * (Optional) The version of the Artefact Version.
     */
    @JsonProperty("version")
    public String version;

    public ArtefactVersionResponse withVersion(String version) {
        this.version = version;
        return this;
    }
    
    public ArtefactVersionResponse(@JsonProperty("archived") Boolean archived, @JsonProperty("artefact_id") String artefactId, @JsonProperty("commit") String commit, @JsonProperty("digest") String digest, @JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("ref") String ref, @JsonProperty("version") String version) {
        this.archived = archived;
        this.artefactId = artefactId;
        this.commit = commit;
        this.digest = digest;
        this.id = id;
        this.name = name;
        this.ref = ref;
        this.version = version;
  }
}
