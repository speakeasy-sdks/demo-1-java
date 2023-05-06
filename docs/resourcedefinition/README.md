# resourceDefinition

## Overview

A Resource Definitions describes how and when a resource should be provisioned. It links a driver (the how) along with a Matching Criteria (the when) to a Resource Type. This allows Humanitec to invoke a particular driver for the required Resource Type in the context of a particular Application and Environment.

The schema for the `driver_inputs` is defined by the `input_schema` property on the DriverDefinition identified by the `driver_type` property.
<SchemaDefinition schemaRef="#/components/schemas/ResourceDefinitionRequest" />


### Available Operations

* [deleteOrgsOrgIdResourcesDefsDefId](#deleteorgsorgidresourcesdefsdefid) - Delete a Resource Definition.
* [deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId](#deleteorgsorgidresourcesdefsdefidcriteriacriteriaid) - Delete a Matching Criteria from a Resource Definition.
* [getOrgsOrgIdResourcesDefs](#getorgsorgidresourcesdefs) - List Resource Definitions.
* [getOrgsOrgIdResourcesDefsDefId](#getorgsorgidresourcesdefsdefid) - Get a specific Resource Definition.
* [getOrgsOrgIdResourcesDefsDefIdResources](#getorgsorgidresourcesdefsdefidresources) - List Active Resources provisioned via a specific Resource Definition.
* [patchOrgsOrgIdResourcesDefsDefId](#patchorgsorgidresourcesdefsdefid) - Update a Resource Definition.
* [postOrgsOrgIdResourcesDefs](#postorgsorgidresourcesdefs) - Create a new Resource Definition.
* [postOrgsOrgIdResourcesDefsDefIdCriteria](#postorgsorgidresourcesdefsdefidcriteria) - Add a new Matching Criteria to a Resource Definition.
* [putOrgsOrgIdResourcesDefsDefId](#putorgsorgidresourcesdefsdefid) - Update a Resource Definition.

## deleteOrgsOrgIdResourcesDefsDefId

If there **are no** Active Resources provisioned via the current definition, the Resource Definition is deleted immediately.

If there **are** Active Resources provisioned via the current definition, the request fails. The response will describe the changes to the affected Active Resources if operation is forced.

The request can take an optional `force` query parameter. If set to `true`, the current Resource Definition is **marked as** pending deletion and will be deleted (purged) as soon as no existing Active Resources reference it. With the next deployment matching criteria for Resources will be re-evaluated, and current Active Resources for the target environment would be either linked to another matching Resource Definition or decommissioned and created using the new or default Resource Definition (when available).

The Resource Definition that has been marked for deletion cannot be used to provision new resources.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdResourcesDefsDefIdRequest req = new DeleteOrgsOrgIdResourcesDefsDefIdRequest("amet", "exercitationem") {{
                force = false;
            }};            

            DeleteOrgsOrgIdResourcesDefsDefIdResponse res = sdk.resourceDefinition.deleteOrgsOrgIdResourcesDefsDefId(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId

If there **are no** Active Resources that would match to a different Resource Definition when the current Matching Criteria is deleted, the Matching Criteria is deleted immediately.

If there **are** Active Resources that would match to a different Resource Definition, the request fails with HTTP status code 409 (Conflict). The response content will list all of affected Active Resources and their new matches.

The request can take an optional `force` query parameter. If set to `true`, the Matching Criteria is deleted immediately. Referenced Active Resources would match to a different Resource Definition during the next deployment in the target environment.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest req = new DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest("ab", "velit", "facilis") {{
                force = false;
            }};            

            DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdResponse res = sdk.resourceDefinition.deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdResourcesDefs

Filter criteria can be applied to obtain all the resource definitions that could match the filters, grouped by type and sorted by matching rank.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdResourcesDefsRequest req = new GetOrgsOrgIdResourcesDefsRequest("tempore") {{
                app = "nisi";
                env = "voluptatibus";
                envType = "quaerat";
                res = "blanditiis";
                resType = "distinctio";
            }};            

            GetOrgsOrgIdResourcesDefsResponse res = sdk.resourceDefinition.getOrgsOrgIdResourcesDefs(req);

            if (res.resourceDefinitionResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdResourcesDefsDefId

Get a specific Resource Definition.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdResourcesDefsDefIdRequest req = new GetOrgsOrgIdResourcesDefsDefIdRequest("nisi", "quis");            

            GetOrgsOrgIdResourcesDefsDefIdResponse res = sdk.resourceDefinition.getOrgsOrgIdResourcesDefsDefId(req);

            if (res.resourceDefinitionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdResourcesDefsDefIdResources

List Active Resources provisioned via a specific Resource Definition.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResourcesRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDefsDefIdResourcesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdResourcesDefsDefIdResourcesRequest req = new GetOrgsOrgIdResourcesDefsDefIdResourcesRequest("nisi", "libero");            

            GetOrgsOrgIdResourcesDefsDefIdResourcesResponse res = sdk.resourceDefinition.getOrgsOrgIdResourcesDefsDefIdResources(req);

            if (res.activeResourceResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## patchOrgsOrgIdResourcesDefsDefId

Update a Resource Definition.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PatchOrgsOrgIdResourcesDefsDefIdRequest;
import demo_1.test_1.models.operations.PatchOrgsOrgIdResourcesDefsDefIdResponse;
import demo_1.test_1.models.shared.PatchResourceDefinitionRequestRequest;
import demo_1.test_1.models.shared.ValuesSecretsRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PatchOrgsOrgIdResourcesDefsDefIdRequest req = new PatchOrgsOrgIdResourcesDefsDefIdRequest(                new PatchResourceDefinitionRequestRequest() {{
                                driverAccount = "minus";
                                driverInputs = new ValuesSecretsRequest() {{
                                    secrets = new java.util.HashMap<String, Object>() {{
                                        put("facilis", "ipsum");
                                        put("ad", "voluptatibus");
                                        put("voluptatibus", "consequuntur");
                                        put("debitis", "labore");
                                    }};
                                    values = new java.util.HashMap<String, Object>() {{
                                        put("eos", "reprehenderit");
                                        put("nostrum", "neque");
                                        put("iusto", "est");
                                    }};
                                }};;
                                name = "Delbert Stehr";
                            }};, "ducimus", "dolor");            

            PatchOrgsOrgIdResourcesDefsDefIdResponse res = sdk.resourceDefinition.patchOrgsOrgIdResourcesDefsDefId(req);

            if (res.resourceDefinitionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdResourcesDefs

Create a new Resource Definition.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsResponse;
import demo_1.test_1.models.shared.CreateResourceDefinitionRequestRequest;
import demo_1.test_1.models.shared.MatchingCriteriaRequest;
import demo_1.test_1.models.shared.ValuesSecretsRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdResourcesDefsRequest req = new PostOrgsOrgIdResourcesDefsRequest(                new CreateResourceDefinitionRequestRequest("dicta", "error", "porro", "vitae") {{
                                criteria = new demo_1.test_1.models.shared.MatchingCriteriaRequest[]{{
                                    add(new MatchingCriteriaRequest() {{
                                        appId = "esse";
                                        envId = "fugiat";
                                        envType = "ad";
                                        id = "25f77b11-4eeb-452f-b785-fc37814d4c98";
                                        resId = "repudiandae";
                                    }}),
                                    add(new MatchingCriteriaRequest() {{
                                        appId = "consequatur";
                                        envId = "maxime";
                                        envType = "aspernatur";
                                        id = "bb89eb75-dad6-436c-a005-03d8bb31180f";
                                        resId = "iusto";
                                    }}),
                                }};
                                driverAccount = "amet";
                                driverInputs = new ValuesSecretsRequest() {{
                                    secrets = new java.util.HashMap<String, Object>() {{
                                        put("dolorum", "necessitatibus");
                                        put("provident", "repudiandae");
                                        put("consequatur", "nemo");
                                    }};
                                    values = new java.util.HashMap<String, Object>() {{
                                        put("itaque", "facilis");
                                        put("corrupti", "aperiam");
                                    }};
                                }};;
                            }};, "sint");            

            PostOrgsOrgIdResourcesDefsResponse res = sdk.resourceDefinition.postOrgsOrgIdResourcesDefs(req);

            if (res.resourceDefinitionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdResourcesDefsDefIdCriteria

Matching Criteria are combined with Resource Type to select a specific definition. Matching Criteria can be set for any combination of Application ID, Environment ID, Environment Type, and Resource ID. In the event of multiple matches, the most specific match is chosen.

For example, given 3 sets of matching criteria for the same type:

```
 1. {"env_type":"test"}
 2. {"env_type":"development"}
 3. {"env_type":"test", "app_id":"my-app"}
```

If, a resource of that time was needed in an Application `my-app`, Environment `qa-team` with Type `test` and Resource ID `modules.my-module-externals.my-resource`, there would be two resources definitions matching the criteria: #1 & #3. Definition #3 will be chosen because it's matching criteria is the most specific.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsDefIdCriteriaRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsDefIdCriteriaResponse;
import demo_1.test_1.models.shared.MatchingCriteriaRuleRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdResourcesDefsDefIdCriteriaRequest req = new PostOrgsOrgIdResourcesDefsDefIdCriteriaRequest(                new MatchingCriteriaRuleRequest() {{
                                appId = "accusamus";
                                envId = "eos";
                                envType = "totam";
                                resId = "dicta";
                            }};, "voluptatem", "velit");            

            PostOrgsOrgIdResourcesDefsDefIdCriteriaResponse res = sdk.resourceDefinition.postOrgsOrgIdResourcesDefsDefIdCriteria(req);

            if (res.matchingCriteriaResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## putOrgsOrgIdResourcesDefsDefId

Update a Resource Definition.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDefsDefIdRequest;
import demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDefsDefIdResponse;
import demo_1.test_1.models.shared.UpdateResourceDefinitionRequestRequest;
import demo_1.test_1.models.shared.ValuesSecretsRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PutOrgsOrgIdResourcesDefsDefIdRequest req = new PutOrgsOrgIdResourcesDefsDefIdRequest(                new UpdateResourceDefinitionRequestRequest("dolor") {{
                                driverAccount = "sunt";
                                driverInputs = new ValuesSecretsRequest() {{
                                    secrets = new java.util.HashMap<String, Object>() {{
                                        put("dolor", "occaecati");
                                        put("atque", "beatae");
                                        put("at", "labore");
                                        put("minus", "esse");
                                    }};
                                    values = new java.util.HashMap<String, Object>() {{
                                        put("perferendis", "rerum");
                                    }};
                                }};;
                            }};, "ea", "aperiam");            

            PutOrgsOrgIdResourcesDefsDefIdResponse res = sdk.resourceDefinition.putOrgsOrgIdResourcesDefsDefId(req);

            if (res.resourceDefinitionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
