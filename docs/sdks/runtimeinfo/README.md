# runtimeInfo

## Overview

RuntimeInfo object returned by the runtime endpoint. Represents a list post statuses grouped by modules and controllers (deployments and stateful sets).
<SchemaDefinition schemaRef="#/components/schemas/RuntimeInfoRequest" />


### Available Operations

* [getOrgsOrgIdAppsAppIdEnvsEnvIdRuntime](#getorgsorgidappsappidenvsenvidruntime) - Get Runtime information about the environment.
* [getOrgsOrgIdAppsAppIdRuntime](#getorgsorgidappsappidruntime) - Get Runtime information about specific environments.
* [patchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicas](#patchorgsorgidappsappidenvsenvidruntimereplicas) - Set number of replicas for an environment's modules.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePaused](#putorgsorgidappsappidenvsenvidruntimepaused) - Pause / Resume an environment.

## getOrgsOrgIdAppsAppIdEnvsEnvIdRuntime

Get Runtime information about the environment.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeRequest req = new GetOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeRequest("repellat", "velit", "porro");            

            GetOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeResponse res = sdk.runtimeInfo.getOrgsOrgIdAppsAppIdEnvsEnvIdRuntime(req);

            if (res.runtimeInfoResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                               | [demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeRequest](../../models/operations/GetOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeRequest.md) | :heavy_check_mark:                                                                                                                                      | The request object to use for the request.                                                                                                              |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeResponse](../../models/operations/GetOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeResponse.md)**


## getOrgsOrgIdAppsAppIdRuntime

Get Runtime information about specific environments.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdRuntimeRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdRuntimeResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdRuntimeRequest req = new GetOrgsOrgIdAppsAppIdRuntimeRequest("provident", "consectetur") {{
                id = "c73b9da3-f2ce-4da7-a23f-2257411faf4b";
            }};            

            GetOrgsOrgIdAppsAppIdRuntimeResponse res = sdk.runtimeInfo.getOrgsOrgIdAppsAppIdRuntime(req);

            if (res.environmentRuntimeInfoResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdRuntimeRequest](../../models/operations/GetOrgsOrgIdAppsAppIdRuntimeRequest.md) | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdRuntimeResponse](../../models/operations/GetOrgsOrgIdAppsAppIdRuntimeResponse.md)**


## patchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicas

Set number of replicas for an environment's modules.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasRequest;
import demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasRequest req = new PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasRequest(                new java.util.HashMap<String, Long>() {{
                                put("exercitationem", 288300L);
                                put("numquam", 921193L);
                            }}, "modi", "in", "explicabo");            

            PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasResponse res = sdk.runtimeInfo.patchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicas(req);

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

| Parameter                                                                                                                                                                   | Type                                                                                                                                                                        | Required                                                                                                                                                                    | Description                                                                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                   | [demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasRequest](../../models/operations/PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasRequest.md) | :heavy_check_mark:                                                                                                                                                          | The request object to use for the request.                                                                                                                                  |


### Response

**[demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasResponse](../../models/operations/PatchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicasResponse.md)**


## putOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePaused

On pause requests, all the Kubernetes Deployment resources are scaled down to 0 replicas.

On resume requests, all the Kubernetes Deployment resources are scaled up to the number of replicas running before the environment was paused.

When an environment is paused, it is not possible to:

```
  - Deploy the environment within Humanitec.
  - Scale the number of replicas running of any workload.
```

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePausedRequest;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePausedResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PutOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePausedRequest req = new PutOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePausedRequest(false, "accusamus", "rem", "aperiam");            

            PutOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePausedResponse res = sdk.runtimeInfo.putOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePaused(req);

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

| Parameter                                                                                                                                                           | Type                                                                                                                                                                | Required                                                                                                                                                            | Description                                                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                           | [demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePausedRequest](../../models/operations/PutOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePausedRequest.md) | :heavy_check_mark:                                                                                                                                                  | The request object to use for the request.                                                                                                                          |


### Response

**[demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePausedResponse](../../models/operations/PutOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePausedResponse.md)**

