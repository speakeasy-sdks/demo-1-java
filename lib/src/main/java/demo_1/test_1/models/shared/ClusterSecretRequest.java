/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClusterSecretRequest - ClusterSecret represents Kubernetes secret reference.
 */
public class ClusterSecretRequest {
    /**
     * Namespace to look for the Kubernetes secret definition in.
     */
    @JsonProperty("namespace")
    public String namespace;

    public ClusterSecretRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    
    /**
     * Name that identifies the Kubernetes secret.
     */
    @JsonProperty("secret")
    public String secret;

    public ClusterSecretRequest withSecret(String secret) {
        this.secret = secret;
        return this;
    }
    
    public ClusterSecretRequest(@JsonProperty("namespace") String namespace, @JsonProperty("secret") String secret) {
        this.namespace = namespace;
        this.secret = secret;
  }
}
