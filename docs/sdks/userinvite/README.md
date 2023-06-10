# userInvite

### Available Operations

* [getOrgsOrgIdInvitations](#getorgsorgidinvitations) - List the invites issued for the organization.

## getOrgsOrgIdInvitations

List the invites issued for the organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdInvitationsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdInvitationsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdInvitationsRequest req = new GetOrgsOrgIdInvitationsRequest("a");            

            GetOrgsOrgIdInvitationsResponse res = sdk.userInvite.getOrgsOrgIdInvitations(req);

            if (res.userInviteResponses != null) {
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
| `request`                                                                                                                   | [demo_1.test_1.models.operations.GetOrgsOrgIdInvitationsRequest](../../models/operations/GetOrgsOrgIdInvitationsRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[demo_1.test_1.models.operations.GetOrgsOrgIdInvitationsResponse](../../models/operations/GetOrgsOrgIdInvitationsResponse.md)**

