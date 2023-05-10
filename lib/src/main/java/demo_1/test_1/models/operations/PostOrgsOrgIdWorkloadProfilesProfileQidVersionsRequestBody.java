/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import demo_1.test_1.utils.SpeakeasyMetadata;

/**
 * PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequestBody - Workload profile version metadata.
 * 
 * 
 */
public class PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequestBody {
    @SpeakeasyMetadata("multipartForm:file")
    public PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequestBodyFile file;

    public PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequestBody withFile(PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequestBodyFile file) {
        this.file = file;
        return this;
    }
    
    /**
     * Each Workload Profile has one or more Versions associated with it. In order to add a version, a Workload Profile must first be created.
     */
    @SpeakeasyMetadata("multipartForm:name=metadata,json")
    public demo_1.test_1.models.shared.WorkloadProfileVersionRequest metadata;

    public PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequestBody withMetadata(demo_1.test_1.models.shared.WorkloadProfileVersionRequest metadata) {
        this.metadata = metadata;
        return this;
    }
    
    public PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequestBody(){}
}
