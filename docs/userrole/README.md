# userRole

## Overview

UserRole holds the mapping of role to user for a particular object.
<SchemaDefinition schemaRef="#/components/schemas/UserRoleRequest" />


### Available Operations

* [deleteOrgsOrgIdAppsAppIdUsersUserId](#deleteorgsorgidappsappidusersuserid) - Remove the role of a User on an Application
* [deleteOrgsOrgIdEnvTypesEnvTypeUsersUserId](#deleteorgsorgidenvtypesenvtypeusersuserid) - Remove the role of a User on an Environment Type
* [deleteOrgsOrgIdUsersUserId](#deleteorgsorgidusersuserid) - Remove the role of a User on an Organization
* [getOrgsOrgIdAppsAppIdUsers](#getorgsorgidappsappidusers) - List Users with roles in an App
* [getOrgsOrgIdAppsAppIdUsersUserId](#getorgsorgidappsappidusersuserid) - Get the role of a User on an Application
* [getOrgsOrgIdEnvTypesEnvTypeUsersUserId](#getorgsorgidenvtypesenvtypeusersuserid) - Get the role of a User on an Environment Type
* [getOrgsOrgIdUsers](#getorgsorgidusers) - List Users with roles in an Organization
* [getOrgsOrgIdUsersUserId](#getorgsorgidusersuserid) - Get the role of a User on an Organization
* [patchOrgsOrgIdAppsAppIdUsersUserId](#patchorgsorgidappsappidusersuserid) - Update the role of a User on an Application
* [patchOrgsOrgIdEnvTypesEnvTypeUsersUserId](#patchorgsorgidenvtypesenvtypeusersuserid) - Update the role of a User on an Environment Type
* [patchOrgsOrgIdUsersUserId](#patchorgsorgidusersuserid) - Update the role of a User on an Organization
* [postOrgsOrgIdAppsAppIdUsers](#postorgsorgidappsappidusers) - Adds a User to an Application with a Role
* [postOrgsOrgIdEnvTypesEnvTypeUsers](#postorgsorgidenvtypesenvtypeusers) - Adds a User to an Environment Type with a Role
* [postOrgsOrgIdInvitations](#postorgsorgidinvitations) - Invites a user to an Organization with a specified role.

## deleteOrgsOrgIdAppsAppIdUsersUserId

Remove the role of a User on an Application

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdUsersUserIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdUsersUserIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdAppsAppIdUsersUserIdRequest req = new DeleteOrgsOrgIdAppsAppIdUsersUserIdRequest("ad", "facere", "laborum");            

            DeleteOrgsOrgIdAppsAppIdUsersUserIdResponse res = sdk.userRole.deleteOrgsOrgIdAppsAppIdUsersUserId(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteOrgsOrgIdEnvTypesEnvTypeUsersUserId

Remove the role of a User on an Environment Type

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdEnvTypesEnvTypeUsersUserIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest req = new DeleteOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest("eveniet", "laborum", "incidunt");            

            DeleteOrgsOrgIdEnvTypesEnvTypeUsersUserIdResponse res = sdk.userRole.deleteOrgsOrgIdEnvTypesEnvTypeUsersUserId(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteOrgsOrgIdUsersUserId

Remove the role of a User on an Organization

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdUsersUserIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdUsersUserIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdUsersUserIdRequest req = new DeleteOrgsOrgIdUsersUserIdRequest("maxime", "ipsam");            

            DeleteOrgsOrgIdUsersUserIdResponse res = sdk.userRole.deleteOrgsOrgIdUsersUserId(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdAppsAppIdUsers

List Users with roles in an App

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdUsersRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdUsersResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdUsersRequest req = new GetOrgsOrgIdAppsAppIdUsersRequest("alias", "suscipit");            

            GetOrgsOrgIdAppsAppIdUsersResponse res = sdk.userRole.getOrgsOrgIdAppsAppIdUsers(req);

            if (res.userRoleResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdAppsAppIdUsersUserId

Get the role of a User on an Application

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdUsersUserIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdUsersUserIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdUsersUserIdRequest req = new GetOrgsOrgIdAppsAppIdUsersUserIdRequest("deserunt", "molestias", "laborum");            

            GetOrgsOrgIdAppsAppIdUsersUserIdResponse res = sdk.userRole.getOrgsOrgIdAppsAppIdUsersUserId(req);

            if (res.userRoleResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdEnvTypesEnvTypeUsersUserId

Get the role of a User on an Environment Type

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdEnvTypesEnvTypeUsersUserIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest req = new GetOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest("est", "occaecati", "labore");            

            GetOrgsOrgIdEnvTypesEnvTypeUsersUserIdResponse res = sdk.userRole.getOrgsOrgIdEnvTypesEnvTypeUsersUserId(req);

            if (res.userRoleResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdUsers

List Users with roles in an Organization

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdUsersRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdUsersResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdUsersRequest req = new GetOrgsOrgIdUsersRequest("quo");            

            GetOrgsOrgIdUsersResponse res = sdk.userRole.getOrgsOrgIdUsers(req);

            if (res.userRoleResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdUsersUserId

Get the role of a User on an Organization

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdUsersUserIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdUsersUserIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdUsersUserIdRequest req = new GetOrgsOrgIdUsersUserIdRequest("perferendis", "fugit");            

            GetOrgsOrgIdUsersUserIdResponse res = sdk.userRole.getOrgsOrgIdUsersUserId(req);

            if (res.userRoleResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## patchOrgsOrgIdAppsAppIdUsersUserId

Update the role of a User on an Application

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdUsersUserIdRequest;
import demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdUsersUserIdResponse;
import demo_1.test_1.models.shared.RoleRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PatchOrgsOrgIdAppsAppIdUsersUserIdRequest req = new PatchOrgsOrgIdAppsAppIdUsersUserIdRequest(                new RoleRequest() {{
                                role = "aliquid";
                            }};, "magnam", "quaerat", "eligendi");            

            PatchOrgsOrgIdAppsAppIdUsersUserIdResponse res = sdk.userRole.patchOrgsOrgIdAppsAppIdUsersUserId(req);

            if (res.userRoleResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## patchOrgsOrgIdEnvTypesEnvTypeUsersUserId

Update the role of a User on an Environment Type

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PatchOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest;
import demo_1.test_1.models.operations.PatchOrgsOrgIdEnvTypesEnvTypeUsersUserIdResponse;
import demo_1.test_1.models.shared.RoleRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PatchOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest req = new PatchOrgsOrgIdEnvTypesEnvTypeUsersUserIdRequest(                new RoleRequest() {{
                                role = "hic";
                            }};, "nostrum", "officiis", "unde");            

            PatchOrgsOrgIdEnvTypesEnvTypeUsersUserIdResponse res = sdk.userRole.patchOrgsOrgIdEnvTypesEnvTypeUsersUserId(req);

            if (res.userRoleResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## patchOrgsOrgIdUsersUserId

Update the role of a User on an Organization

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PatchOrgsOrgIdUsersUserIdRequest;
import demo_1.test_1.models.operations.PatchOrgsOrgIdUsersUserIdResponse;
import demo_1.test_1.models.shared.RoleRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PatchOrgsOrgIdUsersUserIdRequest req = new PatchOrgsOrgIdUsersUserIdRequest(                new RoleRequest() {{
                                role = "nulla";
                            }};, "error", "mollitia");            

            PatchOrgsOrgIdUsersUserIdResponse res = sdk.userRole.patchOrgsOrgIdUsersUserId(req);

            if (res.userRoleResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdAppsAppIdUsers

Adds a User to an Application with a Role

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdUsersRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdUsersResponse;
import demo_1.test_1.models.shared.UserRoleRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdUsersRequest req = new PostOrgsOrgIdAppsAppIdUsersRequest(                new UserRoleRequest() {{
                                createdAt = "2020-06-22T09:37:23.523Z";
                                email = "Evert_Koepp@gmail.com";
                                id = "dc1ac600-dec0-401a-8802-e2ec09ff8f0f";
                                invite = "rem";
                                name = "Jeanette Wehner";
                                role = "eius";
                                type = "esse";
                                user = "in";
                            }};, "eligendi", "quasi");            

            PostOrgsOrgIdAppsAppIdUsersResponse res = sdk.userRole.postOrgsOrgIdAppsAppIdUsers(req);

            if (res.userRoleResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdEnvTypesEnvTypeUsers

Adds a User to an Environment Type with a Role

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdEnvTypesEnvTypeUsersRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdEnvTypesEnvTypeUsersResponse;
import demo_1.test_1.models.shared.UserRoleRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdEnvTypesEnvTypeUsersRequest req = new PostOrgsOrgIdEnvTypesEnvTypeUsersRequest(                new UserRoleRequest() {{
                                createdAt = "2020-06-22T09:37:23.523Z";
                                email = "Selmer18@gmail.com";
                                id = "c14125b0-960a-4668-951a-472af923c594";
                                invite = "excepturi";
                                name = "Dwight Frami";
                                role = "nemo";
                                type = "ipsa";
                                user = "quisquam";
                            }};, "tenetur", "quas");            

            PostOrgsOrgIdEnvTypesEnvTypeUsersResponse res = sdk.userRole.postOrgsOrgIdEnvTypesEnvTypeUsers(req);

            if (res.userRoleResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdInvitations

Invites a user to an Organization with a specified role.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdInvitationsRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdInvitationsResponse;
import demo_1.test_1.models.shared.UserInviteRequestRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdInvitationsRequest req = new PostOrgsOrgIdInvitationsRequest(                new UserInviteRequestRequest("molestiae", "aliquid");, "asperiores");            

            PostOrgsOrgIdInvitationsResponse res = sdk.userRole.postOrgsOrgIdInvitations(req);

            if (res.userRoleResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
