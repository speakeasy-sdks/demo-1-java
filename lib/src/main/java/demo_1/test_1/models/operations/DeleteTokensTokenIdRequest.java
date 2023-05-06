/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import demo_1.test_1.utils.SpeakeasyMetadata;

public class DeleteTokensTokenIdRequest {
    /**
     * The token ID
     * 
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=tokenId")
    public String tokenId;
    public DeleteTokensTokenIdRequest withTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }
    
    public DeleteTokensTokenIdRequest(@JsonProperty("tokenId") String tokenId) {
        this.tokenId = tokenId;
  }
}
