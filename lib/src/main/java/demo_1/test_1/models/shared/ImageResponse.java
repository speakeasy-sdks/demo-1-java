/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImageResponse - DEPRECATED: This type exists for historical compatibility and should not be used. Please use the [Artefact API](https://api-docs.humanitec.com/#tag/Artefact) instead.
 * 
 * Container Images (known simply as Images) can be registered with Humanitec. Continuous Integration (CI) pipelines can then notify Humanitec when a new build of a Container Image becomes available. Humanitec tracks the Image along with metadata about how it was built.
 */
public class ImageResponse {
    /**
     * The time the first build of this Image was added to the organization
     */
    @JsonProperty("added_at")
    public String addedAt;
    public ImageResponse withAddedAt(String addedAt) {
        this.addedAt = addedAt;
        return this;
    }
    
    /**
     * A list of Image Builds ordered by addition date.
     */
    @JsonProperty("builds")
    public ImageBuildResponse[] builds;
    public ImageResponse withBuilds(ImageBuildResponse[] builds) {
        this.builds = builds;
        return this;
    }
    
    /**
     * The ID used to group different builds of the same Image together.
     */
    @JsonProperty("id")
    public String id;
    public ImageResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The Image Source that this Image is added via
     */
    @JsonProperty("source")
    public String source;
    public ImageResponse withSource(String source) {
        this.source = source;
        return this;
    }
    
    public ImageResponse(@JsonProperty("added_at") String addedAt, @JsonProperty("builds") ImageBuildResponse[] builds, @JsonProperty("id") String id, @JsonProperty("source") String source) {
        this.addedAt = addedAt;
        this.builds = builds;
        this.id = id;
        this.source = source;
  }
}
