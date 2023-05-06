/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AddArtefactVersionPayloadRequest - AddArtefactVersionPayload describes the payload for a new ArtefactVersion request.
 */
public class AddArtefactVersionPayloadRequest {
    /**
     * (Optional) The commit ID the Artefact Version was built on.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("commit")
    public String commit;
    public AddArtefactVersionPayloadRequest withCommit(String commit) {
        this.commit = commit;
        return this;
    }
    
    /**
     * (Optional) The Artefact Version digest.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("digest")
    public String digest;
    public AddArtefactVersionPayloadRequest withDigest(String digest) {
        this.digest = digest;
        return this;
    }
    
    /**
     * The Artefact name.
     */
    @JsonProperty("name")
    public String name;
    public AddArtefactVersionPayloadRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * (Optional) The ref the Artefact Version was built from.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ref")
    public String ref;
    public AddArtefactVersionPayloadRequest withRef(String ref) {
        this.ref = ref;
        return this;
    }
    
    /**
     * The Artefact Version type.
     */
    @JsonProperty("type")
    public String type;
    public AddArtefactVersionPayloadRequest withType(String type) {
        this.type = type;
        return this;
    }
    
    /**
     * (Optional) The Artefact Version.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    public String version;
    public AddArtefactVersionPayloadRequest withVersion(String version) {
        this.version = version;
        return this;
    }
    
    public AddArtefactVersionPayloadRequest(@JsonProperty("name") String name, @JsonProperty("type") String type) {
        this.name = name;
        this.type = type;
  }
}
