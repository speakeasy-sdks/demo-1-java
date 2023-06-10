# matchingCriteria

## Overview

Matching Criteria are a set of rules used to choose which Resource Definition to use to provision a particular Resource Type.

Matching criteria are made up in order of specificity with least specific first:

- Environment Type (`env_type`)

- Application (`app_id`)

- Environment (`env_id`)

- Resource (`res_id`)

When selecting matching criteria, the most specific one is selected. In general, this means of all the Matching Criteria fully matching the context, the Matching Criteria Rule with the most specific element filled is chosen. If there is a tie, the next most specific elements are compared and so on until one is chosen.

**NOTE:**

Humanitec will reject the registration of matching criteria rules that duplicate rules already present for a Resource Type.
<SchemaDefinition schemaRef="#/components/schemas/MatchingCriteriaRequest" />


### Available Operations

* [deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId](#deleteorgsorgidresourcesdefsdefidcriteriacriteriaid) - Delete a Matching Criteria from a Resource Definition.
* [postOrgsOrgIdResourcesDefsDefIdCriteria](#postorgsorgidresourcesdefsdefidcriteria) - Add a new Matching Criteria to a Resource Definition.

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

            DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest req = new DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest("libero", "ratione", "labore") {{
                force = false;
            }};            

            DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdResponse res = sdk.matchingCriteria.deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId(req);

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

| Parameter                                                                                                                                                                           | Type                                                                                                                                                                                | Required                                                                                                                                                                            | Description                                                                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                           | [demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest](../../models/operations/DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdRequest.md) | :heavy_check_mark:                                                                                                                                                                  | The request object to use for the request.                                                                                                                                          |


### Response

**[demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdResponse](../../models/operations/DeleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaIdResponse.md)**


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
                                appId = "totam";
                                envId = "occaecati";
                                envType = "voluptas";
                                resId = "quo";
                            }};, "velit", "minus");            

            PostOrgsOrgIdResourcesDefsDefIdCriteriaResponse res = sdk.matchingCriteria.postOrgsOrgIdResourcesDefsDefIdCriteria(req);

            if (res.matchingCriteriaResponse != null) {
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
| `request`                                                                                                                                                   | [demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsDefIdCriteriaRequest](../../models/operations/PostOrgsOrgIdResourcesDefsDefIdCriteriaRequest.md) | :heavy_check_mark:                                                                                                                                          | The request object to use for the request.                                                                                                                  |


### Response

**[demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDefsDefIdCriteriaResponse](../../models/operations/PostOrgsOrgIdResourcesDefsDefIdCriteriaResponse.md)**

