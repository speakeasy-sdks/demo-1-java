<!-- Start SDK Example Usage -->
```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesAccountTypesRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesAccountTypesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdResourcesAccountTypesRequest req = new GetOrgsOrgIdResourcesAccountTypesRequest("corrupti");            

            GetOrgsOrgIdResourcesAccountTypesResponse res = sdk.accountType.getOrgsOrgIdResourcesAccountTypes(req);

            if (res.accountTypeResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->