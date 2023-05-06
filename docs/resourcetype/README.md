# resourceType

## Overview

Resources Types define the technology that Applications can have dependencies on.

Each Resource Type also defines a set of input parameters (`inputs_schema`), and a set of output data (`outputs_schema`). When provisioning a resource, these are treated as inputs and outputs respectively.
<SchemaDefinition schemaRef="#/components/schemas/ResourceTypeRequest" />


### Available Operations

* [getOrgsOrgIdResourcesTypes](#getorgsorgidresourcestypes) - List Resource Types.

## getOrgsOrgIdResourcesTypes

List Resource Types.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesTypesRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesTypesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdResourcesTypesRequest req = new GetOrgsOrgIdResourcesTypesRequest("dignissimos");            

            GetOrgsOrgIdResourcesTypesResponse res = sdk.resourceType.getOrgsOrgIdResourcesTypes(req);

            if (res.resourceTypeResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
