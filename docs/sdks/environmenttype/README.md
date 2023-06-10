# environmentType

## Overview

Environment Types are a way of grouping and managing Environments. Every Environment has exactly 1 Environment Type.

Environment Types can be used with External Resources to manage where resources such as databases are provisioned or even which cluster to deploy to.
<SchemaDefinition schemaRef="#/components/schemas/EnvironmentTypeRequest" />


### Available Operations

* [deleteOrgsOrgIdEnvTypesEnvTypeId](#deleteorgsorgidenvtypesenvtypeid) - Deletes an Environment Type
* [getOrgsOrgIdEnvTypes](#getorgsorgidenvtypes) - List all Environment Types
* [getOrgsOrgIdEnvTypesEnvTypeId](#getorgsorgidenvtypesenvtypeid) - Get an Environment Type
* [postOrgsOrgIdEnvTypes](#postorgsorgidenvtypes) - Add a new Environment Type

## deleteOrgsOrgIdEnvTypesEnvTypeId

Deletes a specific Environment Type from an Organization. If there are Environments with this Type in the Organization, the operation will fail.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdEnvTypesEnvTypeIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdEnvTypesEnvTypeIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdEnvTypesEnvTypeIdRequest req = new DeleteOrgsOrgIdEnvTypesEnvTypeIdRequest("veritatis", "vero");            

            DeleteOrgsOrgIdEnvTypesEnvTypeIdResponse res = sdk.environmentType.deleteOrgsOrgIdEnvTypesEnvTypeId(req);

            if (res.environmentTypeResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [demo_1.test_1.models.operations.DeleteOrgsOrgIdEnvTypesEnvTypeIdRequest](../../models/operations/DeleteOrgsOrgIdEnvTypesEnvTypeIdRequest.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |


### Response

**[demo_1.test_1.models.operations.DeleteOrgsOrgIdEnvTypesEnvTypeIdResponse](../../models/operations/DeleteOrgsOrgIdEnvTypesEnvTypeIdResponse.md)**


## getOrgsOrgIdEnvTypes

Lists all Environment Types in an Organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdEnvTypesRequest req = new GetOrgsOrgIdEnvTypesRequest("consectetur");            

            GetOrgsOrgIdEnvTypesResponse res = sdk.environmentType.getOrgsOrgIdEnvTypes(req);

            if (res.environmentTypeResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesRequest](../../models/operations/GetOrgsOrgIdEnvTypesRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesResponse](../../models/operations/GetOrgsOrgIdEnvTypesResponse.md)**


## getOrgsOrgIdEnvTypesEnvTypeId

Gets a specific Environment Type within an Organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesEnvTypeIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesEnvTypeIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdEnvTypesEnvTypeIdRequest req = new GetOrgsOrgIdEnvTypesEnvTypeIdRequest("vitae", "inventore");            

            GetOrgsOrgIdEnvTypesEnvTypeIdResponse res = sdk.environmentType.getOrgsOrgIdEnvTypesEnvTypeId(req);

            if (res.environmentTypeResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesEnvTypeIdRequest](../../models/operations/GetOrgsOrgIdEnvTypesEnvTypeIdRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesEnvTypeIdResponse](../../models/operations/GetOrgsOrgIdEnvTypesEnvTypeIdResponse.md)**


## postOrgsOrgIdEnvTypes

Adds a new Environment Type to an Organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdEnvTypesRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdEnvTypesResponse;
import demo_1.test_1.models.shared.EnvironmentTypeRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdEnvTypesRequest req = new PostOrgsOrgIdEnvTypesRequest(                new EnvironmentTypeRequest("dolorem") {{
                                description = "ad";
                            }};, "qui");            

            PostOrgsOrgIdEnvTypesResponse res = sdk.environmentType.postOrgsOrgIdEnvTypes(req);

            if (res.environmentTypeResponse != null) {
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
| `request`                                                                                                               | [demo_1.test_1.models.operations.PostOrgsOrgIdEnvTypesRequest](../../models/operations/PostOrgsOrgIdEnvTypesRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[demo_1.test_1.models.operations.PostOrgsOrgIdEnvTypesResponse](../../models/operations/PostOrgsOrgIdEnvTypesResponse.md)**

