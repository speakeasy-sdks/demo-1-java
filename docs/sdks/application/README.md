# application

## Overview

An Application is a collection of Workloads that work together. When deployed, all Workloads in an Application are deployed to the same namespace.

Apps are the root of the configuration tree holding Environments, Deployments, Shared Values, and Secrets.
<SchemaDefinition schemaRef="#/components/schemas/ApplicationRequest" />


### Available Operations

* [deleteOrgsOrgIdAppsAppId](#deleteorgsorgidappsappid) - Delete an Application
* [getOrgsOrgIdApps](#getorgsorgidapps) - List all Applications in an Organization.
* [getOrgsOrgIdAppsAppId](#getorgsorgidappsappid) - Get an existing Application
* [postOrgsOrgIdApps](#postorgsorgidapps) - Add a new Application to an Organization

## deleteOrgsOrgIdAppsAppId

Deleting an Application will also delete everything associated with it. This includes Environments, Deployment history on those Environments, and any shared values and secrets associated.

_Deletions are currently irreversible._

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdAppsAppIdRequest req = new DeleteOrgsOrgIdAppsAppIdRequest("iure", "magnam");            

            DeleteOrgsOrgIdAppsAppIdResponse res = sdk.application.deleteOrgsOrgIdAppsAppId(req);

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

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdRequest](../../models/operations/DeleteOrgsOrgIdAppsAppIdRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdResponse](../../models/operations/DeleteOrgsOrgIdAppsAppIdResponse.md)**


## getOrgsOrgIdApps

Listing or lists of all Applications that exist within a specific Organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsRequest req = new GetOrgsOrgIdAppsRequest("debitis");            

            GetOrgsOrgIdAppsResponse res = sdk.application.getOrgsOrgIdApps(req);

            if (res.applicationResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [demo_1.test_1.models.operations.GetOrgsOrgIdAppsRequest](../../models/operations/GetOrgsOrgIdAppsRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdAppsResponse](../../models/operations/GetOrgsOrgIdAppsResponse.md)**


## getOrgsOrgIdAppsAppId

Gets a specific Application in the specified Organization by ID.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdRequest req = new GetOrgsOrgIdAppsAppIdRequest("ipsa", "delectus");            

            GetOrgsOrgIdAppsAppIdResponse res = sdk.application.getOrgsOrgIdAppsAppId(req);

            if (res.applicationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdRequest](../../models/operations/GetOrgsOrgIdAppsAppIdRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdResponse](../../models/operations/GetOrgsOrgIdAppsAppIdResponse.md)**


## postOrgsOrgIdApps

Creates a new Application, then adds it to the specified Organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsResponse;
import demo_1.test_1.models.shared.ApplicationCreationRequest;
import demo_1.test_1.models.shared.EnvironmentBaseRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsRequest req = new PostOrgsOrgIdAppsRequest(                new ApplicationCreationRequest("tempora", "suscipit") {{
                                env = new EnvironmentBaseRequest("molestiae", "minus", "placeat");;
                            }};, "voluptatum");            

            PostOrgsOrgIdAppsResponse res = sdk.application.postOrgsOrgIdApps(req);

            if (res.applicationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [demo_1.test_1.models.operations.PostOrgsOrgIdAppsRequest](../../models/operations/PostOrgsOrgIdAppsRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[demo_1.test_1.models.operations.PostOrgsOrgIdAppsResponse](../../models/operations/PostOrgsOrgIdAppsResponse.md)**

