# organization

## Overview

An Organization is the top level object in Humanitec. All other objects belong to an Organization.
<SchemaDefinition schemaRef="#/components/schemas/OrganizationRequest" />


### Available Operations

* [getOrgs](#getorgs) - List active organizations the user has access to.
* [getOrgsOrgId](#getorgsorgid) - Get the specified Organization.

## getOrgs

List active organizations the user has access to.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsResponse res = sdk.organization.getOrgs();

            if (res.organizationResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgId

Get the specified Organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdRequest req = new GetOrgsOrgIdRequest("fuga");            

            GetOrgsOrgIdResponse res = sdk.organization.getOrgsOrgId(req);

            if (res.organizationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
