# accountType

## Overview

Resource Account Types define cloud providers or protocols to which a resource account can belong.
<SchemaDefinition schemaRef="#/components/schemas/AccountTypeRequest" />


### Available Operations

* [getOrgsOrgIdResourcesAccountTypes](#getorgsorgidresourcesaccounttypes) - List Resource Account Types available to the organization.

## getOrgsOrgIdResourcesAccountTypes

List Resource Account Types available to the organization.

### Example Usage

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

            GetOrgsOrgIdResourcesAccountTypesRequest req = new GetOrgsOrgIdResourcesAccountTypesRequest("provident");            

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
