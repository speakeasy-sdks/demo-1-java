# artefactVersion

## Overview

An Artefact Version represents a particular version of an Artefact that can be added to an Application.
<SchemaDefinition schemaRef="#/components/schemas/ArtefactVersionRequest" />


### Available Operations

* [getOrgsOrgIdArtefactVersions](#getorgsorgidartefactversions) - List all Artefacts Versions.
* [getOrgsOrgIdArtefactVersionsArtefactVersionId](#getorgsorgidartefactversionsartefactversionid) - Get an Artefacts Versions.
* [getOrgsOrgIdArtefactsArtefactIdVersions](#getorgsorgidartefactsartefactidversions) - List all Artefact Versions of an Artefact.
* [patchOrgsOrgIdArtefactsArtefactIdVersionsVersionId](#patchorgsorgidartefactsartefactidversionsversionid) - Update Version of an Artefact.
* [postOrgsOrgIdArtefactVersions](#postorgsorgidartefactversions) - Register a new Artefact Version with your organization.

## getOrgsOrgIdArtefactVersions

Returns the Artefact Versions registered with your organization. If no elements are found, an empty list is returned.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdArtefactVersionsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdArtefactVersionsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdArtefactVersionsRequest req = new GetOrgsOrgIdArtefactVersionsRequest("ipsam") {{
                archived = "repellendus";
                name = "Cedric Connelly";
                reference = "maiores";
            }};            

            GetOrgsOrgIdArtefactVersionsResponse res = sdk.artefactVersion.getOrgsOrgIdArtefactVersions(req);

            if (res.artefactVersionResponses != null) {
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
| `request`                                                                                                                             | [demo_1.test_1.models.operations.GetOrgsOrgIdArtefactVersionsRequest](../../models/operations/GetOrgsOrgIdArtefactVersionsRequest.md) | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdArtefactVersionsResponse](../../models/operations/GetOrgsOrgIdArtefactVersionsResponse.md)**


## getOrgsOrgIdArtefactVersionsArtefactVersionId

Returns a specific Artefact Version.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdArtefactVersionsArtefactVersionIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdArtefactVersionsArtefactVersionIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdArtefactVersionsArtefactVersionIdRequest req = new GetOrgsOrgIdArtefactVersionsArtefactVersionIdRequest("molestiae", "quod");            

            GetOrgsOrgIdArtefactVersionsArtefactVersionIdResponse res = sdk.artefactVersion.getOrgsOrgIdArtefactVersionsArtefactVersionId(req);

            if (res.artefactVersionResponse != null) {
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
| `request`                                                                                                                                                               | [demo_1.test_1.models.operations.GetOrgsOrgIdArtefactVersionsArtefactVersionIdRequest](../../models/operations/GetOrgsOrgIdArtefactVersionsArtefactVersionIdRequest.md) | :heavy_check_mark:                                                                                                                                                      | The request object to use for the request.                                                                                                                              |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdArtefactVersionsArtefactVersionIdResponse](../../models/operations/GetOrgsOrgIdArtefactVersionsArtefactVersionIdResponse.md)**


## getOrgsOrgIdArtefactsArtefactIdVersions

Returns the Artefact Versions of a specified Artefact registered with your organization. If no elements are found, an empty list is returned.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdArtefactsArtefactIdVersionsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdArtefactsArtefactIdVersionsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdArtefactsArtefactIdVersionsRequest req = new GetOrgsOrgIdArtefactsArtefactIdVersionsRequest("quod", "esse") {{
                archived = "totam";
                limit = "porro";
                reference = "dolorum";
            }};            

            GetOrgsOrgIdArtefactsArtefactIdVersionsResponse res = sdk.artefactVersion.getOrgsOrgIdArtefactsArtefactIdVersions(req);

            if (res.artefactVersionResponses != null) {
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
| `request`                                                                                                                                                   | [demo_1.test_1.models.operations.GetOrgsOrgIdArtefactsArtefactIdVersionsRequest](../../models/operations/GetOrgsOrgIdArtefactsArtefactIdVersionsRequest.md) | :heavy_check_mark:                                                                                                                                          | The request object to use for the request.                                                                                                                  |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdArtefactsArtefactIdVersionsResponse](../../models/operations/GetOrgsOrgIdArtefactsArtefactIdVersionsResponse.md)**


## patchOrgsOrgIdArtefactsArtefactIdVersionsVersionId

Update the version of a specified Artefact registered with your organization".

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdRequest;
import demo_1.test_1.models.operations.PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdResponse;
import demo_1.test_1.models.shared.UpdateArtefactVersionPayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdRequest req = new PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdRequest(                new UpdateArtefactVersionPayloadRequest(false);, "dicta", "nam", "officia");            

            PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdResponse res = sdk.artefactVersion.patchOrgsOrgIdArtefactsArtefactIdVersionsVersionId(req);

            if (res.artefactVersionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                         | Type                                                                                                                                                                              | Required                                                                                                                                                                          | Description                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                         | [demo_1.test_1.models.operations.PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdRequest](../../models/operations/PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdRequest.md) | :heavy_check_mark:                                                                                                                                                                | The request object to use for the request.                                                                                                                                        |


### Response

**[demo_1.test_1.models.operations.PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdResponse](../../models/operations/PatchOrgsOrgIdArtefactsArtefactIdVersionsVersionIdResponse.md)**


## postOrgsOrgIdArtefactVersions

Register a new Artefact Version with your organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdArtefactVersionsRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdArtefactVersionsResponse;
import demo_1.test_1.models.shared.AddArtefactVersionPayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdArtefactVersionsRequest req = new PostOrgsOrgIdArtefactVersionsRequest(                new AddArtefactVersionPayloadRequest("occaecati", "fugit") {{
                                commit = "deleniti";
                                digest = "hic";
                                ref = "optio";
                                version = "totam";
                            }};, "beatae") {{
                vcs = "commodi";
            }};            

            PostOrgsOrgIdArtefactVersionsResponse res = sdk.artefactVersion.postOrgsOrgIdArtefactVersions(req);

            if (res.artefactVersionResponse != null) {
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
| `request`                                                                                                                               | [demo_1.test_1.models.operations.PostOrgsOrgIdArtefactVersionsRequest](../../models/operations/PostOrgsOrgIdArtefactVersionsRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[demo_1.test_1.models.operations.PostOrgsOrgIdArtefactVersionsResponse](../../models/operations/PostOrgsOrgIdArtefactVersionsResponse.md)**

