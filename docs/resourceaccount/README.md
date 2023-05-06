# resourceAccount

## Overview

ResourceAccount represents the account being used to access a resource.

Resource Accounts hold credentials that are required to provision and manage resources.
<SchemaDefinition schemaRef="#/components/schemas/ResourceAccountRequest" />


### Available Operations

* [getOrgsOrgIdResourcesAccounts](#getorgsorgidresourcesaccounts) - List Resource Accounts in the organization.
* [getOrgsOrgIdResourcesAccountsAccId](#getorgsorgidresourcesaccountsaccid) - Get a Resource Account.
* [patchOrgsOrgIdResourcesAccountsAccId](#patchorgsorgidresourcesaccountsaccid) - Update a Resource Account.
* [postOrgsOrgIdResourcesAccounts](#postorgsorgidresourcesaccounts) - Create a new Resource Account in the organization.

## getOrgsOrgIdResourcesAccounts

List Resource Accounts in the organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesAccountsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesAccountsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdResourcesAccountsRequest req = new GetOrgsOrgIdResourcesAccountsRequest("ipsa");            

            GetOrgsOrgIdResourcesAccountsResponse res = sdk.resourceAccount.getOrgsOrgIdResourcesAccounts(req);

            if (res.resourceAccountResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdResourcesAccountsAccId

Get a Resource Account.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesAccountsAccIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesAccountsAccIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdResourcesAccountsAccIdRequest req = new GetOrgsOrgIdResourcesAccountsAccIdRequest("ducimus", "maiores");            

            GetOrgsOrgIdResourcesAccountsAccIdResponse res = sdk.resourceAccount.getOrgsOrgIdResourcesAccountsAccId(req);

            if (res.resourceAccountResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## patchOrgsOrgIdResourcesAccountsAccId

Update a Resource Account.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PatchOrgsOrgIdResourcesAccountsAccIdRequest;
import demo_1.test_1.models.operations.PatchOrgsOrgIdResourcesAccountsAccIdResponse;
import demo_1.test_1.models.shared.UpdateResourceAccountRequestRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PatchOrgsOrgIdResourcesAccountsAccIdRequest req = new PatchOrgsOrgIdResourcesAccountsAccIdRequest(                new UpdateResourceAccountRequestRequest() {{
                                credentials = new java.util.HashMap<String, Object>() {{
                                    put("quasi", "laboriosam");
                                }};
                                name = "Pete Mann";
                            }};, "aliquam", "nostrum");            

            PatchOrgsOrgIdResourcesAccountsAccIdResponse res = sdk.resourceAccount.patchOrgsOrgIdResourcesAccountsAccId(req);

            if (res.resourceAccountResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdResourcesAccounts

Create a new Resource Account in the organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdResourcesAccountsRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdResourcesAccountsResponse;
import demo_1.test_1.models.shared.CreateResourceAccountRequestRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdResourcesAccountsRequest req = new PostOrgsOrgIdResourcesAccountsRequest(                new CreateResourceAccountRequestRequest() {{
                                credentials = new java.util.HashMap<String, Object>() {{
                                    put("eligendi", "sint");
                                    put("enim", "hic");
                                    put("animi", "quas");
                                    put("totam", "molestias");
                                }};
                                id = "70e189db-b30f-4cb3-bea0-55b197cd44e2";
                                name = "Jerome Cruickshank";
                                type = "odit";
                            }};, "pariatur");            

            PostOrgsOrgIdResourcesAccountsResponse res = sdk.resourceAccount.postOrgsOrgIdResourcesAccounts(req);

            if (res.resourceAccountResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
