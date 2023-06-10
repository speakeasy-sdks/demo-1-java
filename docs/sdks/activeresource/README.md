# activeResource

## Overview

Active Resources represent the concrete resources provisioned for an Environment. They are provisioned on the first deployment after a dependency on a particular resource type is introduced into an Environment. In general, Active Resources are only deleted when their introductory Environment is deleted.

Active Resources are provisioned based on a Resource Definition. The Resource Definition describes how to provision a concrete resource based on a Resource Type and metadata about the Environment (for example the Environment Type or the Application ID). The criteria for how to choose a Resource Definition is known as a Matching Criteria. If the Matching Criteria changes or the Resource Definition is deleted, the concrete resource represented by an Active Resource might be deleted and reprovisioned when a deployment occurs in the Environment.
<SchemaDefinition schemaRef="#/components/schemas/ActiveResourceRequest" />


### Available Operations

* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResId](#deleteorgsorgidappsappidenvsenvidresourcestyperesid) - Delete Active Resources.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdResources](#getorgsorgidappsappidenvsenvidresources) - List Active Resources provisioned in an environment.
* [getOrgsOrgIdResourcesDefsDefIdResources](#getorgsorgidresourcesdefsdefidresources) - List Active Resources provisioned via a specific Resource Definition.

## deleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResId

Delete Active Resources.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdRequest req = new DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdRequest("distinctio", "quibusdam", "unde", "nulla", "corrupti");            

            DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdResponse res = sdk.activeResource.deleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResId(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                           | Type                                                                                                                                                                                | Required                                                                                                                                                                            | Description                                                                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                           | [demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdRequest](../../models/operations/DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdRequest.md) | :heavy_check_mark:                                                                                                                                                                  | The request object to use for the request.                                                                                                                                          |


### Response

**[demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdResponse](../../models/operations/DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResIdResponse.md)**


## getOrgsOrgIdAppsAppIdEnvsEnvIdResources

List Active Resources provisioned in an environment.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesRequest req = new GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesRequest("illum", "vel", "error");            

            GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesResponse res = sdk.activeResource.getOrgsOrgIdAppsAppIdEnvsEnvIdResources(req);

            if (res.activeResourceResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                   | Type                                                                                                                                                        | Required                                                                                                                                                    | Description                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                   | [demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesRequest](../../models/operations/GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesRequest.md) | :heavy_check_mark:                                                                                                                                          | The request object to use for the request.                                                                                                                  |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesResponse](../../models/operations/GetOrgsOrgIdAppsAppIdEnvsEnvIdResourcesResponse.md)**


## getOrgsOrgIdResourcesDefsDefIdResources

List Active Resources provisioned via a specific Resource Definition.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResourcesRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResourcesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdResourcesDefsDefIdResourcesRequest req = new GetOrgsOrgIdResourcesDefsDefIdResourcesRequest("deserunt", "suscipit");            

            GetOrgsOrgIdResourcesDefsDefIdResourcesResponse res = sdk.activeResource.getOrgsOrgIdResourcesDefsDefIdResources(req);

            if (res.activeResourceResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                   | Type                                                                                                                                                        | Required                                                                                                                                                    | Description                                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                   | [demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResourcesRequest](../../models/operations/GetOrgsOrgIdResourcesDefsDefIdResourcesRequest.md) | :heavy_check_mark:                                                                                                                                          | The request object to use for the request.                                                                                                                  |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResourcesResponse](../../models/operations/GetOrgsOrgIdResourcesDefsDefIdResourcesResponse.md)**

