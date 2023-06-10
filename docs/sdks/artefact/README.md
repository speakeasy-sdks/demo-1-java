# artefact

## Overview

Artefacts can be registered with Humanitec. Continuous Integration (CI) pipelines notify Humanitec when a new version of an Artefact becomes available. Humanitec tracks the Artefact along with metadata about how it was built.
<SchemaDefinition schemaRef="#/components/schemas/ArtefactRequest" />


### Available Operations

* [deleteOrgsOrgIdArtefactsArtefactId](#deleteorgsorgidartefactsartefactid) - Delete Artefact and all related Artefact Versions
* [getOrgsOrgIdArtefacts](#getorgsorgidartefacts) - List all Artefacts.

## deleteOrgsOrgIdArtefactsArtefactId

The specified Artefact and its Artefact Versions will be permanently deleted. Only Administrators can delete an Artefact.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdArtefactsArtefactIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdArtefactsArtefactIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdArtefactsArtefactIdRequest req = new DeleteOrgsOrgIdArtefactsArtefactIdRequest("iusto", "excepturi");            

            DeleteOrgsOrgIdArtefactsArtefactIdResponse res = sdk.artefact.deleteOrgsOrgIdArtefactsArtefactId(req);

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

| Parameter                                                                                                                                         | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                         | [demo_1.test_1.models.operations.DeleteOrgsOrgIdArtefactsArtefactIdRequest](../../models/operations/DeleteOrgsOrgIdArtefactsArtefactIdRequest.md) | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |


### Response

**[demo_1.test_1.models.operations.DeleteOrgsOrgIdArtefactsArtefactIdResponse](../../models/operations/DeleteOrgsOrgIdArtefactsArtefactIdResponse.md)**


## getOrgsOrgIdArtefacts

Returns the Artefacts registered with your organization. If no elements are found, an empty list is returned.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdArtefactsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdArtefactsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdArtefactsRequest req = new GetOrgsOrgIdArtefactsRequest("nisi") {{
                name = "Jake Bernier MD";
                type = "perferendis";
            }};            

            GetOrgsOrgIdArtefactsResponse res = sdk.artefact.getOrgsOrgIdArtefacts(req);

            if (res.artefactResponses != null) {
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
| `request`                                                                                                               | [demo_1.test_1.models.operations.GetOrgsOrgIdArtefactsRequest](../../models/operations/GetOrgsOrgIdArtefactsRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdArtefactsResponse](../../models/operations/GetOrgsOrgIdArtefactsResponse.md)**

