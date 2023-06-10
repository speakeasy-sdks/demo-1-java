# event

## Overview

Webhook is a special type of a Job, it performs a HTTPS request to a specified URL with specified headers.
<SchemaDefinition schemaRef="#/components/schemas/WebhookRequest" />


### Available Operations

* [deleteOrgsOrgIdAppsAppIdJobs](#deleteorgsorgidappsappidjobs) - Deletes all Jobs for the Application
* [deleteOrgsOrgIdAppsAppIdWebhooksJobId](#deleteorgsorgidappsappidwebhooksjobid) - Delete a Webhook
* [getOrgsOrgIdAppsAppIdWebhooks](#getorgsorgidappsappidwebhooks) - List Webhooks
* [getOrgsOrgIdAppsAppIdWebhooksJobId](#getorgsorgidappsappidwebhooksjobid) - Get a Webhook
* [getOrgsOrgIdEvents](#getorgsorgidevents) - List Events
* [postOrgsOrgIdAppsAppIdWebhooks](#postorgsorgidappsappidwebhooks) - Create a new Webhook
* [postOrgsOrgIdAppsAppIdWebhooksJobId](#postorgsorgidappsappidwebhooksjobid) - Update a Webhook

## deleteOrgsOrgIdAppsAppIdJobs

Deletes all Jobs for the Application

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdJobsRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdJobsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdAppsAppIdJobsRequest req = new DeleteOrgsOrgIdAppsAppIdJobsRequest("iste", "ex");            

            DeleteOrgsOrgIdAppsAppIdJobsResponse res = sdk.event.deleteOrgsOrgIdAppsAppIdJobs(req);

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

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdJobsRequest](../../models/operations/DeleteOrgsOrgIdAppsAppIdJobsRequest.md) | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |


### Response

**[demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdJobsResponse](../../models/operations/DeleteOrgsOrgIdAppsAppIdJobsResponse.md)**


## deleteOrgsOrgIdAppsAppIdWebhooksJobId

Delete a Webhook

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdWebhooksJobIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdWebhooksJobIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdAppsAppIdWebhooksJobIdRequest req = new DeleteOrgsOrgIdAppsAppIdWebhooksJobIdRequest("nemo", "soluta", "libero");            

            DeleteOrgsOrgIdAppsAppIdWebhooksJobIdResponse res = sdk.event.deleteOrgsOrgIdAppsAppIdWebhooksJobId(req);

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

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                               | [demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdWebhooksJobIdRequest](../../models/operations/DeleteOrgsOrgIdAppsAppIdWebhooksJobIdRequest.md) | :heavy_check_mark:                                                                                                                                      | The request object to use for the request.                                                                                                              |


### Response

**[demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdWebhooksJobIdResponse](../../models/operations/DeleteOrgsOrgIdAppsAppIdWebhooksJobIdResponse.md)**


## getOrgsOrgIdAppsAppIdWebhooks

List Webhooks

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdWebhooksRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdWebhooksResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdWebhooksRequest req = new GetOrgsOrgIdAppsAppIdWebhooksRequest("rem", "dolorum");            

            GetOrgsOrgIdAppsAppIdWebhooksResponse res = sdk.event.getOrgsOrgIdAppsAppIdWebhooks(req);

            if (res.webhookResponses != null) {
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
| `request`                                                                                                                               | [demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdWebhooksRequest](../../models/operations/GetOrgsOrgIdAppsAppIdWebhooksRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdWebhooksResponse](../../models/operations/GetOrgsOrgIdAppsAppIdWebhooksResponse.md)**


## getOrgsOrgIdAppsAppIdWebhooksJobId

Get a Webhook

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdWebhooksJobIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdWebhooksJobIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdWebhooksJobIdRequest req = new GetOrgsOrgIdAppsAppIdWebhooksJobIdRequest("odio", "fugit", "alias");            

            GetOrgsOrgIdAppsAppIdWebhooksJobIdResponse res = sdk.event.getOrgsOrgIdAppsAppIdWebhooksJobId(req);

            if (res.webhookResponse != null) {
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
| `request`                                                                                                                                         | [demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdWebhooksJobIdRequest](../../models/operations/GetOrgsOrgIdAppsAppIdWebhooksJobIdRequest.md) | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdWebhooksJobIdResponse](../../models/operations/GetOrgsOrgIdAppsAppIdWebhooksJobIdResponse.md)**


## getOrgsOrgIdEvents

List Events

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdEventsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdEventsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdEventsRequest req = new GetOrgsOrgIdEventsRequest("magni");            

            GetOrgsOrgIdEventsResponse res = sdk.event.getOrgsOrgIdEvents(req);

            if (res.eventResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [demo_1.test_1.models.operations.GetOrgsOrgIdEventsRequest](../../models/operations/GetOrgsOrgIdEventsRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdEventsResponse](../../models/operations/GetOrgsOrgIdEventsResponse.md)**


## postOrgsOrgIdAppsAppIdWebhooks

Create a new Webhook

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdWebhooksRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdWebhooksResponse;
import demo_1.test_1.models.shared.EventBaseRequest;
import demo_1.test_1.models.shared.WebhookRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdWebhooksRequest req = new PostOrgsOrgIdAppsAppIdWebhooksRequest(                new WebhookRequest() {{
                                disabled = false;
                                headers = new java.util.HashMap<String, Object>() {{
                                    put("quae", "quae");
                                    put("modi", "neque");
                                }};
                                id = "5e139dbc-2259-4b1a-bda8-c070e1084cb0";
                                payload = new java.util.HashMap<String, Object>() {{
                                    put("esse", "dolores");
                                    put("assumenda", "beatae");
                                }};
                                triggers = new demo_1.test_1.models.shared.EventBaseRequest[]{{
                                    add(new EventBaseRequest() {{
                                        scope = "facere";
                                        type = "corrupti";
                                    }}),
                                    add(new EventBaseRequest() {{
                                        scope = "molestiae";
                                        type = "provident";
                                    }}),
                                    add(new EventBaseRequest() {{
                                        scope = "accusamus";
                                        type = "necessitatibus";
                                    }}),
                                }};
                                url = "tempore";
                            }};, "sint", "ea");            

            PostOrgsOrgIdAppsAppIdWebhooksResponse res = sdk.event.postOrgsOrgIdAppsAppIdWebhooks(req);

            if (res.webhookResponse != null) {
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
| `request`                                                                                                                                 | [demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdWebhooksRequest](../../models/operations/PostOrgsOrgIdAppsAppIdWebhooksRequest.md) | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |


### Response

**[demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdWebhooksResponse](../../models/operations/PostOrgsOrgIdAppsAppIdWebhooksResponse.md)**


## postOrgsOrgIdAppsAppIdWebhooksJobId

Update a Webhook

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdWebhooksJobIdRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdWebhooksJobIdResponse;
import demo_1.test_1.models.shared.EventBaseRequest;
import demo_1.test_1.models.shared.WebhookRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdWebhooksJobIdRequest req = new PostOrgsOrgIdAppsAppIdWebhooksJobIdRequest(                new WebhookRequest() {{
                                disabled = false;
                                headers = new java.util.HashMap<String, Object>() {{
                                    put("ipsam", "rerum");
                                    put("laudantium", "corporis");
                                }};
                                id = "efbd02ba-e0be-42d7-8225-9e3ea4b5197f";
                                payload = new java.util.HashMap<String, Object>() {{
                                    put("fugit", "numquam");
                                    put("numquam", "nesciunt");
                                    put("at", "officia");
                                }};
                                triggers = new demo_1.test_1.models.shared.EventBaseRequest[]{{
                                    add(new EventBaseRequest() {{
                                        scope = "optio";
                                        type = "necessitatibus";
                                    }}),
                                    add(new EventBaseRequest() {{
                                        scope = "corporis";
                                        type = "qui";
                                    }}),
                                }};
                                url = "expedita";
                            }};, "voluptatum", "cupiditate", "minima");            

            PostOrgsOrgIdAppsAppIdWebhooksJobIdResponse res = sdk.event.postOrgsOrgIdAppsAppIdWebhooksJobId(req);

            if (res.webhookResponse != null) {
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
| `request`                                                                                                                                           | [demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdWebhooksJobIdRequest](../../models/operations/PostOrgsOrgIdAppsAppIdWebhooksJobIdRequest.md) | :heavy_check_mark:                                                                                                                                  | The request object to use for the request.                                                                                                          |


### Response

**[demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdWebhooksJobIdResponse](../../models/operations/PostOrgsOrgIdAppsAppIdWebhooksJobIdResponse.md)**

