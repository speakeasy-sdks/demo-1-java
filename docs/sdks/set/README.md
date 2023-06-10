# set

## Overview

A Deployment Set (or just "Set") defines all of the non-Environment specific configuration for Modules and External Resources. Each of these Modules or External Resources has a unique name.

Deployment Sets are immutable and their ID is a cryptographic hash of their content. This means that a Deployment Set can be globally identified based on its ID. It also means that referencing a Deployment Set by ID will always return the same Deployment Set.

Deployment Sets cannot be created directly, instead they are created by applying a Deployment Delta to an existing Deployment Set.

**Basic Structure**

```
 {
   "id": <ID of the Deployment Set>,
   "modules" : {
     <ID of Module> : {
       "profile": <Defines how the optional "spec" property is interpreted>
       "spec": {
         <Properties that depend on the "profile" property.>
       }
       "externals": {
         <External Resource Name> : {
           "type": <Resource Type>,
           "params": {
             <Properties which parametrize the resource depending on the Resource Type.>
           }
         }
       }
     }
   }
 }
```

For details about how the Humanitec provided profiles work, see (Deployment Set Profiles)[].
<SchemaDefinition schemaRef="#/components/schemas/SetRequest" />


### Available Operations

* [getSets](#getsets) - Get all Deployment Sets
* [getOrgsOrgIdAppsAppIdSetsSetId](#getorgsorgidappsappidsetssetid) - Get a Deployment Set
* [getOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetId](#getorgsorgidappsappidsetssetiddiffsourcesetid) - Get the difference between 2 Deployment Sets
* [postOrgsOrgIdAppsAppIdSetsSetId](#postorgsorgidappsappidsetssetid) - Apply a Deployment Delta to a Deployment Set

## getSets

Get all Deployment Sets

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetSetsRequest;
import demo_1.test_1.models.operations.GetSetsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetSetsRequest req = new GetSetsRequest("odit", "deleniti");            

            GetSetsResponse res = sdk.set.getSets(req);

            if (res.setResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [demo_1.test_1.models.operations.GetSetsRequest](../../models/operations/GetSetsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |


### Response

**[demo_1.test_1.models.operations.GetSetsResponse](../../models/operations/GetSetsResponse.md)**


## getOrgsOrgIdAppsAppIdSetsSetId

Get a Deployment Set

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdSetsSetIdRequest req = new GetOrgsOrgIdAppsAppIdSetsSetIdRequest("enim", "voluptate", "similique") {{
                diff = "minima";
            }};            

            GetOrgsOrgIdAppsAppIdSetsSetIdResponse res = sdk.set.getOrgsOrgIdAppsAppIdSetsSetId(req);

            if (res.getOrgsOrgIdAppsAppIdSetsSetId200ApplicationJSONOneOf != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                 | [demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdRequest](../../models/operations/GetOrgsOrgIdAppsAppIdSetsSetIdRequest.md) | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdResponse](../../models/operations/GetOrgsOrgIdAppsAppIdSetsSetIdResponse.md)**


## getOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetId

Get the difference between 2 Deployment Sets

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdRequest req = new GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdRequest("libero", "magnam", "sit", "modi");            

            GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdResponse res = sdk.set.getOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetId(req);

            if (res.plainDeltaResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                               | [demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdRequest](../../models/operations/GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdRequest.md) | :heavy_check_mark:                                                                                                                                                      | The request object to use for the request.                                                                                                                              |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdResponse](../../models/operations/GetOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetIdResponse.md)**


## postOrgsOrgIdAppsAppIdSetsSetId

Apply a Deployment Delta to a Deployment Set

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdSetsSetIdRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdSetsSetIdResponse;
import demo_1.test_1.models.shared.ControllerRequest;
import demo_1.test_1.models.shared.DeltaMetadataRequest;
import demo_1.test_1.models.shared.DeltaRequest;
import demo_1.test_1.models.shared.ModuleDeltasRequest;
import demo_1.test_1.models.shared.PodStateRequest;
import demo_1.test_1.models.shared.UpdateActionRequest;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdSetsSetIdRequest req = new PostOrgsOrgIdAppsAppIdSetsSetIdRequest(                new DeltaRequest() {{
                                id = "63a7d575-f140-40e7-a4ad-7334ec1b781b";
                                metadata = new DeltaMetadataRequest() {{
                                    archived = false;
                                    contributers = new String[]{{
                                        add("autem"),
                                    }};
                                    createdAt = OffsetDateTime.parse("2020-06-22T09:37:23.523Z");
                                    createdBy = "fuga";
                                    envId = "alias";
                                    lastModifiedAt = OffsetDateTime.parse("2020-06-22T09:37:23.523Z");
                                    name = "David Lubowitz";
                                    shared = false;
                                }};;
                                modules = new ModuleDeltasRequest() {{
                                    add = new java.util.HashMap<String, java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>>() {{
                                        put("quae", new java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>() {{
                                            put("saepe", new ControllerRequest() {{
                                                kind = "delectus";
                                                message = "mollitia";
                                                pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("voluptatem", "alias");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("hic", "voluptatem");
                                                                put("incidunt", "qui");
                                                                put("qui", "necessitatibus");
                                                                put("harum", "explicabo");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("aliquid", "modi");
                                                            }}),
                                                        }};
                                                        phase = "optio";
                                                        podName = "voluptatibus";
                                                        revision = 562948L;
                                                        status = "officia";
                                                    }}),
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("sequi", "aliquid");
                                                                put("ea", "impedit");
                                                                put("ducimus", "odit");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("reiciendis", "repellat");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("laborum", "natus");
                                                                put("accusamus", "doloremque");
                                                                put("nisi", "rerum");
                                                                put("recusandae", "voluptates");
                                                            }}),
                                                        }};
                                                        phase = "non";
                                                        podName = "rem";
                                                        revision = 157884L;
                                                        status = "ullam";
                                                    }}),
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("voluptatibus", "eligendi");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("officiis", "architecto");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("enim", "optio");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("perferendis", "facilis");
                                                                put("reiciendis", "a");
                                                                put("iste", "dicta");
                                                            }}),
                                                        }};
                                                        phase = "quos";
                                                        podName = "ullam";
                                                        revision = 295950L;
                                                        status = "modi";
                                                    }}),
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("modi", "consequuntur");
                                                                put("assumenda", "vero");
                                                                put("doloribus", "impedit");
                                                                put("porro", "accusamus");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("reiciendis", "ab");
                                                                put("sint", "nihil");
                                                                put("esse", "iure");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("nesciunt", "debitis");
                                                                put("vel", "neque");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("voluptas", "consequuntur");
                                                                put("officia", "reprehenderit");
                                                            }}),
                                                        }};
                                                        phase = "distinctio";
                                                        podName = "eius";
                                                        revision = 56372L;
                                                        status = "rem";
                                                    }}),
                                                }};
                                                replicas = 978154L;
                                                revision = 35160L;
                                                status = "veniam";
                                            }});
                                        }});
                                    }};
                                    remove = new String[]{{
                                        add("neque"),
                                        add("facere"),
                                        add("aliquam"),
                                        add("quos"),
                                    }};
                                    update = new java.util.HashMap<String, demo_1.test_1.models.shared.UpdateActionRequest[]>() {{
                                        put("fugiat", new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                            add(new UpdateActionRequest() {{
                                                from = "delectus";
                                                op = "velit";
                                                path = "vitae";
                                                value = "nesciunt";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "similique";
                                                op = "illo";
                                                path = "repellat";
                                                value = "nemo";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "doloribus";
                                                op = "possimus";
                                                path = "unde";
                                                value = "incidunt";
                                            }}),
                                        }});
                                        put("explicabo", new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                            add(new UpdateActionRequest() {{
                                                from = "cupiditate";
                                                op = "optio";
                                                path = "alias";
                                                value = "quidem";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "nesciunt";
                                                op = "commodi";
                                                path = "sapiente";
                                                value = "consequuntur";
                                            }}),
                                        }});
                                        put("veniam", new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                            add(new UpdateActionRequest() {{
                                                from = "officia";
                                                op = "sint";
                                                path = "ut";
                                                value = "numquam";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "tenetur";
                                                op = "adipisci";
                                                path = "libero";
                                                value = "in";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "minima";
                                                op = "ex";
                                                path = "minus";
                                                value = "ab";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "beatae";
                                                op = "hic";
                                                path = "nisi";
                                                value = "quisquam";
                                            }}),
                                        }});
                                        put("dolor", new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                            add(new UpdateActionRequest() {{
                                                from = "fuga";
                                                op = "minima";
                                                path = "architecto";
                                                value = "qui";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "aliquid";
                                                op = "magni";
                                                path = "incidunt";
                                                value = "adipisci";
                                            }}),
                                        }});
                                    }};
                                }};;
                                shared = new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                    add(new UpdateActionRequest() {{
                                        from = "dolor";
                                        op = "exercitationem";
                                        path = "expedita";
                                        value = "facilis";
                                    }}),
                                    add(new UpdateActionRequest() {{
                                        from = "impedit";
                                        op = "sit";
                                        path = "nemo";
                                        value = "culpa";
                                    }}),
                                    add(new UpdateActionRequest() {{
                                        from = "consequuntur";
                                        op = "amet";
                                        path = "deserunt";
                                        value = "modi";
                                    }}),
                                }};
                            }};, "veniam", "quod", "itaque");            

            PostOrgsOrgIdAppsAppIdSetsSetIdResponse res = sdk.set.postOrgsOrgIdAppsAppIdSetsSetId(req);

            if (res.postOrgsOrgIdAppsAppIdSetsSetId200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdSetsSetIdRequest](../../models/operations/PostOrgsOrgIdAppsAppIdSetsSetIdRequest.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |


### Response

**[demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdSetsSetIdResponse](../../models/operations/PostOrgsOrgIdAppsAppIdSetsSetIdResponse.md)**

