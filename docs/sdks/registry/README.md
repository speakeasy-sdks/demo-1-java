# registry

## Overview

Humanitec can be used to manage registry credentials. The Registry object represents how to match credentials to a particular registry.

Humanitec supports all Docker compatible registries as well as the custom authentication formats used by AWS Elastic Container Registry and Google Container Registry. It also supports the injection of a specific secret to be copied from an existing namespace in the cluster.
<SchemaDefinition schemaRef="#/components/schemas/RegistryRequest" />


### Available Operations

* [deleteOrgsOrgIdRegistriesRegId](#deleteorgsorgidregistriesregid) - Deletes an existing registry record and all associated credentials and secrets.
* [getOrgsOrgIdRegistries](#getorgsorgidregistries) - Lists available registries for the organization.
* [getOrgsOrgIdRegistriesRegId](#getorgsorgidregistriesregid) - Loads a registry record details.
* [getOrgsOrgIdRegistriesRegIdCreds](#getorgsorgidregistriesregidcreds) - Returns current account credentials or secret details for the registry.
* [patchOrgsOrgIdRegistriesRegId](#patchorgsorgidregistriesregid) - Updates (patches) an existing registry record.
* [postOrgsOrgIdRegistries](#postorgsorgidregistries) - Creates a new registry record.

## deleteOrgsOrgIdRegistriesRegId

_Deletions are currently irreversible._

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdRegistriesRegIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdRegistriesRegIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdRegistriesRegIdRequest req = new DeleteOrgsOrgIdRegistriesRegIdRequest("nostrum", "est");            

            DeleteOrgsOrgIdRegistriesRegIdResponse res = sdk.registry.deleteOrgsOrgIdRegistriesRegId(req);

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

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                 | [demo_1.test_1.models.operations.DeleteOrgsOrgIdRegistriesRegIdRequest](../../models/operations/DeleteOrgsOrgIdRegistriesRegIdRequest.md) | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |


### Response

**[demo_1.test_1.models.operations.DeleteOrgsOrgIdRegistriesRegIdResponse](../../models/operations/DeleteOrgsOrgIdRegistriesRegIdResponse.md)**


## getOrgsOrgIdRegistries

Lists available registries for the organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdRegistriesRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdRegistriesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdRegistriesRequest req = new GetOrgsOrgIdRegistriesRequest("impedit");            

            GetOrgsOrgIdRegistriesResponse res = sdk.registry.getOrgsOrgIdRegistries(req);

            if (res.registryResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [demo_1.test_1.models.operations.GetOrgsOrgIdRegistriesRequest](../../models/operations/GetOrgsOrgIdRegistriesRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdRegistriesResponse](../../models/operations/GetOrgsOrgIdRegistriesResponse.md)**


## getOrgsOrgIdRegistriesRegId

Loads a registry record details.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdRegistriesRegIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdRegistriesRegIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdRegistriesRegIdRequest req = new GetOrgsOrgIdRegistriesRegIdRequest("delectus", "tempore");            

            GetOrgsOrgIdRegistriesRegIdResponse res = sdk.registry.getOrgsOrgIdRegistriesRegId(req);

            if (res.registryResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [demo_1.test_1.models.operations.GetOrgsOrgIdRegistriesRegIdRequest](../../models/operations/GetOrgsOrgIdRegistriesRegIdRequest.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdRegistriesRegIdResponse](../../models/operations/GetOrgsOrgIdRegistriesRegIdResponse.md)**


## getOrgsOrgIdRegistriesRegIdCreds

Returns current account credentials or secret details for the registry.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdRegistriesRegIdCredsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdRegistriesRegIdCredsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdRegistriesRegIdCredsRequest req = new GetOrgsOrgIdRegistriesRegIdCredsRequest("vero", "odit");            

            GetOrgsOrgIdRegistriesRegIdCredsResponse res = sdk.registry.getOrgsOrgIdRegistriesRegIdCreds(req);

            if (res.registryCredsResponse != null) {
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
| `request`                                                                                                                                     | [demo_1.test_1.models.operations.GetOrgsOrgIdRegistriesRegIdCredsRequest](../../models/operations/GetOrgsOrgIdRegistriesRegIdCredsRequest.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdRegistriesRegIdCredsResponse](../../models/operations/GetOrgsOrgIdRegistriesRegIdCredsResponse.md)**


## patchOrgsOrgIdRegistriesRegId

Updates (patches) an existing registry record.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PatchOrgsOrgIdRegistriesRegIdRequest;
import demo_1.test_1.models.operations.PatchOrgsOrgIdRegistriesRegIdResponse;
import demo_1.test_1.models.shared.AccountCredsRequest;
import demo_1.test_1.models.shared.ClusterSecretRequest;
import demo_1.test_1.models.shared.RegistryRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PatchOrgsOrgIdRegistriesRegIdRequest req = new PatchOrgsOrgIdRegistriesRegIdRequest(                new RegistryRequest("repellat", "pariatur", "nemo") {{
                                creds = new AccountCredsRequest("reprehenderit", "aperiam") {{
                                    expires = "2020-06-22T09:37:23.523Z";
                                }};;
                                enableCi = false;
                                secrets = new java.util.HashMap<String, demo_1.test_1.models.shared.ClusterSecretRequest>() {{
                                    put("minima", new ClusterSecretRequest("excepturi", "dolores") {{
                                        namespace = "in";
                                        secret = "ducimus";
                                    }});
                                    put("error", new ClusterSecretRequest("voluptate", "pariatur") {{
                                        namespace = "veritatis";
                                        secret = "ducimus";
                                    }});
                                }};
                            }};, "itaque", "similique");            

            PatchOrgsOrgIdRegistriesRegIdResponse res = sdk.registry.patchOrgsOrgIdRegistriesRegId(req);

            if (res.registryResponse != null) {
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
| `request`                                                                                                                               | [demo_1.test_1.models.operations.PatchOrgsOrgIdRegistriesRegIdRequest](../../models/operations/PatchOrgsOrgIdRegistriesRegIdRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[demo_1.test_1.models.operations.PatchOrgsOrgIdRegistriesRegIdResponse](../../models/operations/PatchOrgsOrgIdRegistriesRegIdResponse.md)**


## postOrgsOrgIdRegistries

Creates a new registry record.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdRegistriesRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdRegistriesResponse;
import demo_1.test_1.models.shared.AccountCredsRequest;
import demo_1.test_1.models.shared.ClusterSecretRequest;
import demo_1.test_1.models.shared.RegistryRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdRegistriesRequest req = new PostOrgsOrgIdRegistriesRequest(                new RegistryRequest("optio", "ex", "quaerat") {{
                                creds = new AccountCredsRequest("commodi", "officiis") {{
                                    expires = "2020-06-22T09:37:23.523Z";
                                }};;
                                enableCi = false;
                                secrets = new java.util.HashMap<String, demo_1.test_1.models.shared.ClusterSecretRequest>() {{
                                    put("quidem", new ClusterSecretRequest("dolorem", "modi") {{
                                        namespace = "exercitationem";
                                        secret = "quam";
                                    }});
                                    put("ipsa", new ClusterSecretRequest("sequi", "repudiandae") {{
                                        namespace = "sint";
                                        secret = "vero";
                                    }});
                                    put("cum", new ClusterSecretRequest("veniam", "animi") {{
                                        namespace = "dicta";
                                        secret = "earum";
                                    }});
                                    put("dolores", new ClusterSecretRequest("consequuntur", "necessitatibus") {{
                                        namespace = "nam";
                                        secret = "dicta";
                                    }});
                                }};
                            }};, "nobis");            

            PostOrgsOrgIdRegistriesResponse res = sdk.registry.postOrgsOrgIdRegistries(req);

            if (res.registryResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [demo_1.test_1.models.operations.PostOrgsOrgIdRegistriesRequest](../../models/operations/PostOrgsOrgIdRegistriesRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[demo_1.test_1.models.operations.PostOrgsOrgIdRegistriesResponse](../../models/operations/PostOrgsOrgIdRegistriesResponse.md)**

