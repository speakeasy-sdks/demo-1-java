/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorkloadProfileRequest - Workload Profiles provide the baseline configuration for Workloads in Applications in Humanitec. Developers can configure various features of a workload profile to suit their needs. Examples of features might be `schedules` used in Kubernetes CronJobs or `ingress` which might be used to expose Pods controlled by a Kubernetes Deployment.
 * 
 * Workloads in Humanitec are implemented as Helm Charts which must implement a specific schema.
 */
public class WorkloadProfileRequest {
    /**
     * Workload Profile ID
     */
    @JsonProperty("id")
    public String id;

    public WorkloadProfileRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public WorkloadProfileRequest(@JsonProperty("id") String id) {
        this.id = id;
  }
}
