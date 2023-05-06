# userProfile

## Overview

UserProfile holds the profile information of a user
<SchemaDefinition schemaRef="#/components/schemas/UserProfileRequest" />


### Available Operations

* [deleteTokensTokenId](#deletetokenstokenid) - DEPRECATED
* [getCurrentUser](#getcurrentuser) - Gets the extended profile of the current user
* [getTokens](#gettokens) - DEPRECATED
* [getUsersMe](#getusersme) - DEPRECATED
* [patchCurrentUser](#patchcurrentuser) - Updates the extended profile of the current user.
* [postOrgsOrgIdUsers](#postorgsorgidusers) - Creates a new service user.

## deleteTokensTokenId

DEPRECATED

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteTokensTokenIdRequest;
import demo_1.test_1.models.operations.DeleteTokensTokenIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteTokensTokenIdRequest req = new DeleteTokensTokenIdRequest("quisquam");            

            DeleteTokensTokenIdResponse res = sdk.userProfile.deleteTokensTokenId(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getCurrentUser

Gets the extended profile of the current user

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetCurrentUserResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetCurrentUserResponse res = sdk.userProfile.getCurrentUser();

            if (res.userProfileExtendedResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getTokens

DEPRECATED

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetTokensResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetTokensResponse res = sdk.userProfile.getTokens();

            if (res.getTokens200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getUsersMe

DEPRECATED

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetUsersMeResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetUsersMeResponse res = sdk.userProfile.getUsersMe();

            if (res.getUsersMe200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## patchCurrentUser

Updates the extended profile of the current user.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PatchCurrentUserResponse;
import demo_1.test_1.models.shared.UserProfileExtendedRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            demo_1.test_1.models.shared.UserProfileExtendedRequest req = new UserProfileExtendedRequest() {{
                createdAt = "2020-06-22T09:37:23.523Z";
                email = "Xzavier.Shields0@gmail.com";
                id = "a0ce2169-e510-4019-86dc-5e34762799bf";
                name = "Rickey Waters";
                properties = new java.util.HashMap<String, Object>() {{
                    put("perspiciatis", "hic");
                    put("cum", "aspernatur");
                }};
                roles = new java.util.HashMap<String, String>() {{
                    put("nam", "incidunt");
                    put("recusandae", "quod");
                    put("id", "saepe");
                }};
                type = "autem";
            }};            

            PatchCurrentUserResponse res = sdk.userProfile.patchCurrentUser(req);

            if (res.userProfileExtendedResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdUsers

Creates a new service user.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdUsersRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdUsersResponse;
import demo_1.test_1.models.shared.NewServiceUserRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdUsersRequest req = new PostOrgsOrgIdUsersRequest(                new NewServiceUserRequest() {{
                                email = "Cloyd_Stanton@hotmail.com";
                                name = "Melvin O'Conner";
                                role = "distinctio";
                            }};, "pariatur");            

            PostOrgsOrgIdUsersResponse res = sdk.userProfile.postOrgsOrgIdUsers(req);

            if (res.userProfileExtendedResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
