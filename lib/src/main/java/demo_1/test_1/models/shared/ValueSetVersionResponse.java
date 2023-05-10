/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import demo_1.test_1.utils.DateTimeDeserializer;
import demo_1.test_1.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * ValueSetVersionResponse - A Value Set Version can be used as a track record of Shared Values changes, to restore a previous version of a Shared Value or Value Set, or to purge a Shared Value if it shouldn't be accessible anymore.
 */
public class ValueSetVersionResponse {
    @JsonProperty("change")
    public JSONPatchResponse[] change;

    public ValueSetVersionResponse withChange(JSONPatchResponse[] change) {
        this.change = change;
        return this;
    }
    
    @JsonProperty("comment")
    public String comment;

    public ValueSetVersionResponse withComment(String comment) {
        this.comment = comment;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public ValueSetVersionResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("created_by")
    public String createdBy;

    public ValueSetVersionResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public ValueSetVersionResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("result_of")
    public ValueSetVersionResultOfEnum resultOf;

    public ValueSetVersionResponse withResultOf(ValueSetVersionResultOfEnum resultOf) {
        this.resultOf = resultOf;
        return this;
    }
    
    @JsonProperty("source_value_set_version_id")
    public String sourceValueSetVersionId;

    public ValueSetVersionResponse withSourceValueSetVersionId(String sourceValueSetVersionId) {
        this.sourceValueSetVersionId = sourceValueSetVersionId;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;

    public ValueSetVersionResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonProperty("values")
    public java.util.Map<String, ValueResponse> values;

    public ValueSetVersionResponse withValues(java.util.Map<String, ValueResponse> values) {
        this.values = values;
        return this;
    }
    
    public ValueSetVersionResponse(@JsonProperty("change") JSONPatchResponse[] change, @JsonProperty("comment") String comment, @JsonProperty("created_at") OffsetDateTime createdAt, @JsonProperty("created_by") String createdBy, @JsonProperty("id") String id, @JsonProperty("result_of") ValueSetVersionResultOfEnum resultOf, @JsonProperty("source_value_set_version_id") String sourceValueSetVersionId, @JsonProperty("updated_at") OffsetDateTime updatedAt, @JsonProperty("values") java.util.Map<String, ValueResponse> values) {
        this.change = change;
        this.comment = comment;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.id = id;
        this.resultOf = resultOf;
        this.sourceValueSetVersionId = sourceValueSetVersionId;
        this.updatedAt = updatedAt;
        this.values = values;
  }
}
