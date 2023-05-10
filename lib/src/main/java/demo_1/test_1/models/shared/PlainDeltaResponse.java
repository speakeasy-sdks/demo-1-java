/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PlainDeltaResponse - Similar to the delta response, except the id and metadata properties.
 * 
 * **Basic Structure**
 * 
 * ```
 *  {
 *    "modules" : {
 *      "add" : {
 *        &lt;ID of Module to add to the Deployment Set&gt; : {
 *          &lt;An entire Modules object&gt;
 *        }
 *      },
 *      "remove": [
 *        &lt;An array of Module IDs that should be removed from the Deployment Set&gt;
 *      ],
 *     "update": {
 *        &lt;ID of Module already in the Set to be updated&gt; : [
 *          &lt;An array of JSON Patch (Search Results (RFC 6902) objects scoped to the module&gt;
 *        ]
 *      }
 *    }
 *  }
 * ```
 */
public class PlainDeltaResponse {
    /**
     * ModuleDeltas groups the different operations together.
     */
    @JsonProperty("modules")
    public ModuleDeltasResponse modules;

    public PlainDeltaResponse withModules(ModuleDeltasResponse modules) {
        this.modules = modules;
        return this;
    }
    
    @JsonProperty("shared")
    public UpdateActionResponse[] shared;

    public PlainDeltaResponse withShared(UpdateActionResponse[] shared) {
        this.shared = shared;
        return this;
    }
    
    public PlainDeltaResponse(@JsonProperty("modules") ModuleDeltasResponse modules, @JsonProperty("shared") UpdateActionResponse[] shared) {
        this.modules = modules;
        this.shared = shared;
  }
}
