/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest {
    /**
     * The Matching Criteria ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=criteriaId")
    public String criteriaId;

    public DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest withCriteriaId(String criteriaId) {
        this.criteriaId = criteriaId;
        return this;
    }
    
    /**
     * The Resource Definition ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=defId")
    public String defId;

    public DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest withDefId(String defId) {
        this.defId = defId;
        return this;
    }
    
    /**
     * If set to `true`, the Matching Criteria is deleted immediately, even if this action affects existing Active Resources.
     * 
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=force")
    public Boolean force;

    public DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest withForce(Boolean force) {
        this.force = force;
        return this;
    }
    
    /**
     * The Organization ID.
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=orgId")
    public String orgId;

    public DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    
    public DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest(@JsonProperty("criteriaId") String criteriaId, @JsonProperty("defId") String defId, @JsonProperty("orgId") String orgId) {
        this.criteriaId = criteriaId;
        this.defId = defId;
        this.orgId = orgId;
  }
}
