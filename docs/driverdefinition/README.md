# driverDefinition

## Overview

DriverDefinition describes the resource driver.

Resource Drivers are code that fulfils the Humanitec Resource Driver Interface. This interface allows for certain actions to be performed on resources such as creation and destruction. Humanitec provides numerous Resource Drivers “out of the box”. It is also possible to use 3rd party Resource Drivers or write your own.
<SchemaDefinition schemaRef="#/components/schemas/DriverDefinitionRequest" />


### Available Operations

* [deleteOrgsOrgIdResourcesDriversDriverId](#deleteorgsorgidresourcesdriversdriverid) - Delete a Resources Driver.
* [getOrgsOrgIdResourcesDrivers](#getorgsorgidresourcesdrivers) - List Resource Drivers.
* [getOrgsOrgIdResourcesDriversDriverId](#getorgsorgidresourcesdriversdriverid) - Get a Resource Driver.
* [postOrgsOrgIdResourcesDrivers](#postorgsorgidresourcesdrivers) - Register a new Resource Driver.
* [putOrgsOrgIdResourcesDriversDriverId](#putorgsorgidresourcesdriversdriverid) - Update a Resource Driver.

## deleteOrgsOrgIdResourcesDriversDriverId

Delete a Resources Driver.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDriversDriverIdRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdResourcesDriversDriverIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdResourcesDriversDriverIdRequest req = new DeleteOrgsOrgIdResourcesDriversDriverIdRequest("laborum", "consectetur");            

            DeleteOrgsOrgIdResourcesDriversDriverIdResponse res = sdk.driverDefinition.deleteOrgsOrgIdResourcesDriversDriverId(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdResourcesDrivers

List Resource Drivers.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdResourcesDriversRequest req = new GetOrgsOrgIdResourcesDriversRequest("velit");            

            GetOrgsOrgIdResourcesDriversResponse res = sdk.driverDefinition.getOrgsOrgIdResourcesDrivers(req);

            if (res.driverDefinitionResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdResourcesDriversDriverId

# Only drivers that belongs to the given organization or registered as `public` are accessible through this endpoint

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversDriverIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesDriversDriverIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdResourcesDriversDriverIdRequest req = new GetOrgsOrgIdResourcesDriversDriverIdRequest("atque", "ipsum");            

            GetOrgsOrgIdResourcesDriversDriverIdResponse res = sdk.driverDefinition.getOrgsOrgIdResourcesDriversDriverId(req);

            if (res.driverDefinitionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdResourcesDrivers

Register a new Resource Driver.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDriversRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdResourcesDriversResponse;
import demo_1.test_1.models.shared.CreateDriverRequestRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdResourcesDriversRequest req = new PostOrgsOrgIdResourcesDriversRequest(                new CreateDriverRequestRequest(                new String[]{{
                                                add("magni"),
                                                add("soluta"),
                                                add("repudiandae"),
                                                add("nam"),
                                            }},                 new java.util.HashMap<String, Object>() {{
                                                put("iusto", "voluptate");
                                                put("sequi", "dignissimos");
                                            }}, "neque", "quo") {{
                                id = "8d72f64d-1db1-4f2c-8310-661e96349e1c";
                                isPublic = false;
                                template = "voluptatibus";
                            }};, "iste");            

            PostOrgsOrgIdResourcesDriversResponse res = sdk.driverDefinition.postOrgsOrgIdResourcesDrivers(req);

            if (res.driverDefinitionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## putOrgsOrgIdResourcesDriversDriverId

Update a Resource Driver.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDriversDriverIdRequest;
import demo_1.test_1.models.operations.PutOrgsOrgIdResourcesDriversDriverIdResponse;
import demo_1.test_1.models.shared.UpdateDriverRequestRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PutOrgsOrgIdResourcesDriversDriverIdRequest req = new PutOrgsOrgIdResourcesDriversDriverIdRequest(                new UpdateDriverRequestRequest(                new String[]{{
                                                add("alias"),
                                                add("nisi"),
                                                add("itaque"),
                                                add("velit"),
                                            }},                 new java.util.HashMap<String, Object>() {{
                                                put("non", "dolor");
                                                put("iusto", "sit");
                                                put("doloremque", "consequatur");
                                            }}, "officia", "recusandae") {{
                                isPublic = false;
                                template = "ea";
                            }};, "quidem", "voluptas");            

            PutOrgsOrgIdResourcesDriversDriverIdResponse res = sdk.driverDefinition.putOrgsOrgIdResourcesDriversDriverId(req);

            if (res.driverDefinitionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
