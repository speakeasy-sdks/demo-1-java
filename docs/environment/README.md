# environment

## Overview

Environments are independent spaces where Applications can run. An Application is always deployed into an Environment.
<SchemaDefinition schemaRef="#/components/schemas/EnvironmentRequest" />


### Available Operations

* [deleteOrgsOrgIdAppsAppIdEnvsEnvId](#deleteorgsorgidappsappidenvsenvid) - Delete a specific Environment.
* [getOrgsOrgIdAppsAppIdEnvs](#getorgsorgidappsappidenvs) - List all Environments.
* [getOrgsOrgIdAppsAppIdEnvsEnvId](#getorgsorgidappsappidenvsenvid) - Get a specific Environment.
* [postOrgsOrgIdAppsAppIdEnvs](#postorgsorgidappsappidenvs) - Add a new Environment to an Application.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdFromDeployId](#putorgsorgidappsappidenvsenvidfromdeployid) - Rebase to a different Deployment.

## deleteOrgsOrgIdAppsAppIdEnvsEnvId

Deletes a specific Environment in an Application.

Deleting an Environment will also delete the Deployment history of the Environment.

_Deletions are currently irreversible._

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRequest req = new DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRequest("facilis", "placeat", "perspiciatis");            

            DeleteOrgsOrgIdAppsAppIdEnvsEnvIdResponse res = sdk.environment.deleteOrgsOrgIdAppsAppIdEnvsEnvId(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdAppsAppIdEnvs

Lists all of the Environments in the Application.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdEnvsRequest req = new GetOrgsOrgIdAppsAppIdEnvsRequest("expedita", "deleniti");            

            GetOrgsOrgIdAppsAppIdEnvsResponse res = sdk.environment.getOrgsOrgIdAppsAppIdEnvs(req);

            if (res.environmentResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdAppsAppIdEnvsEnvId

Gets a specific Environment in an Application.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdEnvsEnvIdRequest req = new GetOrgsOrgIdAppsAppIdEnvsEnvIdRequest("a", "voluptate", "ullam");            

            GetOrgsOrgIdAppsAppIdEnvsEnvIdResponse res = sdk.environment.getOrgsOrgIdAppsAppIdEnvsEnvId(req);

            if (res.environmentResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdAppsAppIdEnvs

Creates a new Environment of the specified Type and associates it with the Application specified by `appId`.

The Environment is also initialized to the **current or past state of Deployment in another Environment**. This ensures that every Environment is derived from a previously known state. This means it is not possible to create a new Environment for an Application until at least one Deployment has occurred. (The Deployment does not have to be successful.)

The Type of the Environment must be already defined in the Organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsResponse;
import demo_1.test_1.models.shared.EnvironmentDefinitionRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdEnvsRequest req = new PostOrgsOrgIdAppsAppIdEnvsRequest(                new EnvironmentDefinitionRequest("unde", "necessitatibus", "animi", "impedit");, "ipsam", "corporis");            

            PostOrgsOrgIdAppsAppIdEnvsResponse res = sdk.environment.postOrgsOrgIdAppsAppIdEnvs(req);

            if (res.environmentResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## putOrgsOrgIdAppsAppIdEnvsEnvIdFromDeployId

Rebasing an Environment means that the next Deployment to the Environment will be based on the Deployment specified in the rebase rather than the last one in the Environment. The Deployment to rebase to can either be current or a previous Deployment. The Deployment can be from any Environment of the same Application.

_Running code will only be affected on the next Deployment to the Environment._

Common use cases for rebasing an Environment:

* _Rollback_: Rebasing to a previous Deployment in the current Environment and then Deploying without additional changes will execute a rollback to the previous Deployment state.

* _Clone_: Rebasing to the current Deployment in a different Environment and then deploying without additional changes will clone all of the configuration of the other Environment into the current one. (NOTE: External Resources will not be cloned in the process - the current External Resources of the Environment will remain unchanged and will be used by the deployed Application in the Environment.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdFromDeployIdRequest;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdFromDeployIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PutOrgsOrgIdAppsAppIdEnvsEnvIdFromDeployIdRequest req = new PutOrgsOrgIdAppsAppIdEnvsEnvIdFromDeployIdRequest("est", "error", "esse", "labore");            

            PutOrgsOrgIdAppsAppIdEnvsEnvIdFromDeployIdResponse res = sdk.environment.putOrgsOrgIdAppsAppIdEnvsEnvIdFromDeployId(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
