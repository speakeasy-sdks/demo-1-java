# automationRule

## Overview

An Automation Rule defining how and when artefacts in an environment should be updated.
<SchemaDefinition schemaRef="#/components/schemas/AutomationRuleRequest" />


### Available Operations

* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](#deleteorgsorgidappsappidenvsenvidrulesruleid) - Delete Automation Rule from an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdRules](#getorgsorgidappsappidenvsenvidrules) - List all Automation Rules in an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](#getorgsorgidappsappidenvsenvidrulesruleid) - Get a specific Automation Rule for an Environment.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdRules](#postorgsorgidappsappidenvsenvidrules) - Create a new Automation Rule for an Environment.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](#putorgsorgidappsappidenvsenvidrulesruleid) - Update an existing Automation Rule for an Environment.

## deleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId

Delete Automation Rule from an Environment.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest req = new DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest("molestiae", "modi", "qui", "impedit");            

            DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse res = sdk.automationRule.deleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId(req);

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

| Parameter                                                                                                                                                             | Type                                                                                                                                                                  | Required                                                                                                                                                              | Description                                                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                             | [demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest](../../models/operations/DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest.md) | :heavy_check_mark:                                                                                                                                                    | The request object to use for the request.                                                                                                                            |


### Response

**[demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse](../../models/operations/DeleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse.md)**


## getOrgsOrgIdAppsAppIdEnvsEnvIdRules

List all Automation Rules in an Environment.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest req = new GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest("cum", "esse", "ipsum");            

            GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse res = sdk.automationRule.getOrgsOrgIdAppsAppIdEnvsEnvIdRules(req);

            if (res.automationRuleResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                           | Type                                                                                                                                                | Required                                                                                                                                            | Description                                                                                                                                         |
| --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                           | [demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest](../../models/operations/GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest.md) | :heavy_check_mark:                                                                                                                                  | The request object to use for the request.                                                                                                          |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse](../../models/operations/GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse.md)**


## getOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId

Get a specific Automation Rule for an Environment.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest req = new GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest("excepturi", "aspernatur", "perferendis", "ad");            

            GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse res = sdk.automationRule.getOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId(req);

            if (res.automationRuleResponse != null) {
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
| `request`                                                                                                                                                       | [demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest](../../models/operations/GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest.md) | :heavy_check_mark:                                                                                                                                              | The request object to use for the request.                                                                                                                      |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse](../../models/operations/GetOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse.md)**


## postOrgsOrgIdAppsAppIdEnvsEnvIdRules

Items marked as deprecated are still supported (however not recommended) for use and are incompatible with properties of the latest api version. In particular an error is raised if  `images_filter` (deprecated) and `artefacts_filter` are used in the same payload. The same is true for `exclude_images_filter` (deprecated) and `exclude_artefacts_filter`. `match` and `update_to` are still supported but will trigger an error if combined with `match_ref`.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse;
import demo_1.test_1.models.shared.AutomationRuleRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest req = new PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest(                new AutomationRuleRequest("natus") {{
                                active = false;
                                artefactsFilter = new String[]{{
                                    add("iste"),
                                }};
                                excludeArtefactsFilter = false;
                                excludeImagesFilter = false;
                                imagesFilter = new String[]{{
                                    add("natus"),
                                }};
                                match = "laboriosam";
                                matchRef = "hic";
                                updateTo = "saepe";
                            }};, "fuga", "in", "corporis");            

            PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse res = sdk.automationRule.postOrgsOrgIdAppsAppIdEnvsEnvIdRules(req);

            if (res.automationRuleResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                             | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                             | [demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest](../../models/operations/PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesRequest.md) | :heavy_check_mark:                                                                                                                                    | The request object to use for the request.                                                                                                            |


### Response

**[demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse](../../models/operations/PostOrgsOrgIdAppsAppIdEnvsEnvIdRulesResponse.md)**


## putOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId

Items marked as deprecated are still supported (however not recommended) for use and are incompatible with properties of the latest api version. In particular an error is raised if  `images_filter` (deprecated) and `artefacts_filter` are used in the same payload. The same is true for `exclude_images_filter` (deprecated) and `exclude_artefacts_filter`. `match` and `update_to` are still supported but will trigger an error if combined with `match_ref`.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse;
import demo_1.test_1.models.shared.AutomationRuleRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest req = new PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest(                new AutomationRuleRequest("iste") {{
                                active = false;
                                artefactsFilter = new String[]{{
                                    add("saepe"),
                                    add("quidem"),
                                }};
                                excludeArtefactsFilter = false;
                                excludeImagesFilter = false;
                                imagesFilter = new String[]{{
                                    add("ipsa"),
                                }};
                                match = "reiciendis";
                                matchRef = "est";
                                updateTo = "mollitia";
                            }};, "laborum", "dolores", "dolorem", "corporis");            

            PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse res = sdk.automationRule.putOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId(req);

            if (res.automationRuleResponse != null) {
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
| `request`                                                                                                                                                       | [demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest](../../models/operations/PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdRequest.md) | :heavy_check_mark:                                                                                                                                              | The request object to use for the request.                                                                                                                      |


### Response

**[demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse](../../models/operations/PutOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleIdResponse.md)**

