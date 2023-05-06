# deployment

## Overview

Deployments represent updates to the running state of an Environment.

Deployments are made by applying _Deltas_ to a state defined by an existing Deployment. The Environment’s from_deploy property defines the Deployment. This Deployment is usually but not always in the current Environment. If the Deployment is from another Environment, the state of that Environment will be "cloned" into the current Environment with the option to apply a Delta.
<SchemaDefinition schemaRef="#/components/schemas/DeploymentRequest" />


### Available Operations

* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploys](#getorgsorgidappsappidenvsenviddeploys) - List Deployments in an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployId](#getorgsorgidappsappidenvsenviddeploysdeployid) - Get a specific Deployment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrors](#getorgsorgidappsappidenvsenviddeploysdeployiderrors) - List errors that occurred in a Deployment.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdDeploys](#postorgsorgidappsappidenvsenviddeploys) - Start a new Deployment.

## getOrgsOrgIdAppsAppIdEnvsEnvIdDeploys

List all of the Deployments that have been carried out in the current Environment. Deployments are returned with the newest first.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysRequest req = new GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysRequest("nemo", "reprehenderit", "est");            

            GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysResponse res = sdk.deployment.getOrgsOrgIdAppsAppIdEnvsEnvIdDeploys(req);

            if (res.deploymentResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployId

Gets a specific Deployment in an Application and an Environment.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdRequest req = new GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdRequest("quis", "sint", "accusamus", "impedit");            

            GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdResponse res = sdk.deployment.getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployId(req);

            if (res.deploymentResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrors

List errors that occurred in a Deployment.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrorsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrorsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrorsRequest req = new GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrorsRequest("hic", "necessitatibus", "asperiores", "ex");            

            GetOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrorsResponse res = sdk.deployment.getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrors(req);

            if (res.deploymentErrorResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdAppsAppIdEnvsEnvIdDeploys

At Humanitec, Deployments are defined as changes to the state of the Environment. The state can be changed by defining a set of desired changes to the current state via a Deployment Delta or by resetting the current state after a previous Deployment. (See Environment Rebase.) Both types of changes can be combined into a single Deployment during which the Delta is applied to the Rebased state.

When specifying a Delta, a Delta ID must be used. That Delta must have been committed to the Delta store prior to the Deployment.

A Set ID can also be defined in the deployment to force the state of the environment to a particular state. This will be ignored if the Delta is specified.

**NOTE:**

Directly setting a `set_id` in a deployment is not recommended as it will not record history of where the set came from. If the intention is to replicate an existing environment, use the environment rebasing approach described above.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdDeploysRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdDeploysResponse;
import demo_1.test_1.models.shared.DeploymentRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdEnvsEnvIdDeploysRequest req = new PostOrgsOrgIdAppsAppIdEnvsEnvIdDeploysRequest(                new DeploymentRequest() {{
                                comment = "voluptas";
                                deltaId = "debitis";
                                valueSetVersionId = "delectus";
                            }};, "quae", "minus", "fuga");            

            PostOrgsOrgIdAppsAppIdEnvsEnvIdDeploysResponse res = sdk.deployment.postOrgsOrgIdAppsAppIdEnvsEnvIdDeploys(req);

            if (res.deploymentResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
