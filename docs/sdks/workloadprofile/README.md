# workloadProfile

## Overview

Workload Profiles provide the baseline configuration for Workloads in Applications in Humanitec. Developers can configure various features of a workload profile to suit their needs. Examples of features might be `schedules` used in Kubernetes CronJobs or `ingress` which might be used to expose Pods controlled by a Kubernetes Deployment.

Workloads in Humanitec are implemented as Helm Charts which must implement a specific schema.
<SchemaDefinition schemaRef="#/components/schemas/WorkloadProfileRequest" />


### Available Operations

* [deleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersion](#deleteorgsorgidworkloadprofilesprofileidversionsversion) - Delete a Workload Profile Version
* [deleteOrgsOrgIdWorkloadProfilesProfileQid](#deleteorgsorgidworkloadprofilesprofileqid) - Delete a Workload Profile
* [getOrgsOrgIdWorkloadProfiles](#getorgsorgidworkloadprofiles) - List workload profiles available to the organization.
* [getOrgsOrgIdWorkloadProfilesProfileQid](#getorgsorgidworkloadprofilesprofileqid) - Get a Workload Profile
* [getOrgsOrgIdWorkloadProfilesProfileQidVersions](#getorgsorgidworkloadprofilesprofileqidversions) - List versions of the given workload profile with optional constraint.
* [postOrgsOrgIdWorkloadProfiles](#postorgsorgidworkloadprofiles) - Create new Workload Profile
* [postOrgsOrgIdWorkloadProfilesProfileQidVersions](#postorgsorgidworkloadprofilesprofileqidversions) - Add new Version of the Workload Profile

## deleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersion

Delete a Workload Profile Version

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersionRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersionResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersionRequest req = new DeleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersionRequest("aperiam", "aspernatur", "nulla");            

            DeleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersionResponse res = sdk.workloadProfile.deleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersion(req);

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

| Parameter                                                                                                                                                                                   | Type                                                                                                                                                                                        | Required                                                                                                                                                                                    | Description                                                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                                   | [demo_1.test_1.models.operations.DeleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersionRequest](../../models/operations/DeleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersionRequest.md) | :heavy_check_mark:                                                                                                                                                                          | The request object to use for the request.                                                                                                                                                  |


### Response

**[demo_1.test_1.models.operations.DeleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersionResponse](../../models/operations/DeleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersionResponse.md)**


## deleteOrgsOrgIdWorkloadProfilesProfileQid

This will also delete all versions of a workload profile.

It is not possible to delete profiles of other organizations.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdWorkloadProfilesProfileQidRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdWorkloadProfilesProfileQidResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdWorkloadProfilesProfileQidRequest req = new DeleteOrgsOrgIdWorkloadProfilesProfileQidRequest("enim", "illo");            

            DeleteOrgsOrgIdWorkloadProfilesProfileQidResponse res = sdk.workloadProfile.deleteOrgsOrgIdWorkloadProfilesProfileQid(req);

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

| Parameter                                                                                                                                                       | Type                                                                                                                                                            | Required                                                                                                                                                        | Description                                                                                                                                                     |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                       | [demo_1.test_1.models.operations.DeleteOrgsOrgIdWorkloadProfilesProfileQidRequest](../../models/operations/DeleteOrgsOrgIdWorkloadProfilesProfileQidRequest.md) | :heavy_check_mark:                                                                                                                                              | The request object to use for the request.                                                                                                                      |


### Response

**[demo_1.test_1.models.operations.DeleteOrgsOrgIdWorkloadProfilesProfileQidResponse](../../models/operations/DeleteOrgsOrgIdWorkloadProfilesProfileQidResponse.md)**


## getOrgsOrgIdWorkloadProfiles

List workload profiles available to the organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdWorkloadProfilesRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdWorkloadProfilesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdWorkloadProfilesRequest req = new GetOrgsOrgIdWorkloadProfilesRequest("magnam");            

            GetOrgsOrgIdWorkloadProfilesResponse res = sdk.workloadProfile.getOrgsOrgIdWorkloadProfiles(req);

            if (res.workloadProfileResponses != null) {
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
| `request`                                                                                                                             | [demo_1.test_1.models.operations.GetOrgsOrgIdWorkloadProfilesRequest](../../models/operations/GetOrgsOrgIdWorkloadProfilesRequest.md) | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdWorkloadProfilesResponse](../../models/operations/GetOrgsOrgIdWorkloadProfilesResponse.md)**


## getOrgsOrgIdWorkloadProfilesProfileQid

Get a Workload Profile

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdWorkloadProfilesProfileQidRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdWorkloadProfilesProfileQidResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdWorkloadProfilesProfileQidRequest req = new GetOrgsOrgIdWorkloadProfilesProfileQidRequest("delectus", "numquam");            

            GetOrgsOrgIdWorkloadProfilesProfileQidResponse res = sdk.workloadProfile.getOrgsOrgIdWorkloadProfilesProfileQid(req);

            if (res.workloadProfileResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                 | Type                                                                                                                                                      | Required                                                                                                                                                  | Description                                                                                                                                               |
| --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                 | [demo_1.test_1.models.operations.GetOrgsOrgIdWorkloadProfilesProfileQidRequest](../../models/operations/GetOrgsOrgIdWorkloadProfilesProfileQidRequest.md) | :heavy_check_mark:                                                                                                                                        | The request object to use for the request.                                                                                                                |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdWorkloadProfilesProfileQidResponse](../../models/operations/GetOrgsOrgIdWorkloadProfilesProfileQidResponse.md)**


## getOrgsOrgIdWorkloadProfilesProfileQidVersions

List versions of the given workload profile with optional constraint.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdWorkloadProfilesProfileQidVersionsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdWorkloadProfilesProfileQidVersionsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdWorkloadProfilesProfileQidVersionsRequest req = new GetOrgsOrgIdWorkloadProfilesProfileQidVersionsRequest("optio", "nobis") {{
                version = "ex";
            }};            

            GetOrgsOrgIdWorkloadProfilesProfileQidVersionsResponse res = sdk.workloadProfile.getOrgsOrgIdWorkloadProfilesProfileQidVersions(req);

            if (res.workloadProfileVersionResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                 | Type                                                                                                                                                                      | Required                                                                                                                                                                  | Description                                                                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                 | [demo_1.test_1.models.operations.GetOrgsOrgIdWorkloadProfilesProfileQidVersionsRequest](../../models/operations/GetOrgsOrgIdWorkloadProfilesProfileQidVersionsRequest.md) | :heavy_check_mark:                                                                                                                                                        | The request object to use for the request.                                                                                                                                |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdWorkloadProfilesProfileQidVersionsResponse](../../models/operations/GetOrgsOrgIdWorkloadProfilesProfileQidVersionsResponse.md)**


## postOrgsOrgIdWorkloadProfiles

Create new Workload Profile

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdWorkloadProfilesRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdWorkloadProfilesResponse;
import demo_1.test_1.models.shared.WorkloadProfileRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdWorkloadProfilesRequest req = new PostOrgsOrgIdWorkloadProfilesRequest(                new WorkloadProfileRequest("repellat");, "quae");            

            PostOrgsOrgIdWorkloadProfilesResponse res = sdk.workloadProfile.postOrgsOrgIdWorkloadProfiles(req);

            if (res.workloadProfileResponse != null) {
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
| `request`                                                                                                                               | [demo_1.test_1.models.operations.PostOrgsOrgIdWorkloadProfilesRequest](../../models/operations/PostOrgsOrgIdWorkloadProfilesRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[demo_1.test_1.models.operations.PostOrgsOrgIdWorkloadProfilesResponse](../../models/operations/PostOrgsOrgIdWorkloadProfilesResponse.md)**


## postOrgsOrgIdWorkloadProfilesProfileQidVersions

Creates a Workload Profile Version from the uploaded Helm chart. The version is retrieved from the chart's metadata (Charts.yaml file).

The request has content type `multipart/form-data` and the request body includes two parts:

1. `file` with `application/x-gzip` content type which is an archive containing a Helm chart.

2. `metadata` with `application/json` content type which defines the version's metadata.

Request body example:

	Content-Type: multipart/form-data; boundary=----boundary 	----boundary 	Content-Disposition: form-data; name="metadata" 	Content-Type: application/json; charset=UTF-8 	{ 	  "features": { 	     "humanitec/service": {}, 	     "humanitec/volumes": {}, 	     "custom": {"schema": {}} 	  }, 	  "notes": "Notes related to this version of the profile" 	} 	----boundary 	Content-Disposition: form-data; name="file"; filename="my-workload-1.0.1.tgz" 	Content-Type: application/x-gzip 	[TGZ_DATA] 	----boundary

**NOTE:**

A Workload Profile must be created before a version can be added to it.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequestBody;
import demo_1.test_1.models.operations.PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequestBodyFile;
import demo_1.test_1.models.operations.PostOrgsOrgIdWorkloadProfilesProfileQidVersionsResponse;
import demo_1.test_1.models.shared.WorkloadProfileVersionRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequest req = new PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequest(                new PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequestBody() {{
                                file = new PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequestBodyFile("deleniti".getBytes(), "expedita");;
                                metadata = new WorkloadProfileVersionRequest() {{
                                    features = new java.util.HashMap<String, Object>() {{
                                        put("excepturi", "aliquid");
                                        put("sed", "beatae");
                                        put("similique", "ea");
                                        put("animi", "dolore");
                                    }};
                                    notes = "tenetur";
                                }};;
                            }};, "dignissimos", "esse");            

            PostOrgsOrgIdWorkloadProfilesProfileQidVersionsResponse res = sdk.workloadProfile.postOrgsOrgIdWorkloadProfilesProfileQidVersions(req);

            if (res.workloadProfileVersionResponse != null) {
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
| `request`                                                                                                                                                                   | [demo_1.test_1.models.operations.PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequest](../../models/operations/PostOrgsOrgIdWorkloadProfilesProfileQidVersionsRequest.md) | :heavy_check_mark:                                                                                                                                                          | The request object to use for the request.                                                                                                                                  |


### Response

**[demo_1.test_1.models.operations.PostOrgsOrgIdWorkloadProfilesProfileQidVersionsResponse](../../models/operations/PostOrgsOrgIdWorkloadProfilesProfileQidVersionsResponse.md)**

