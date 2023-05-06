# valueSetVersion

## Overview

A Value Set Version can be used as a track record of Shared Values changes, to restore a previous version of a Shared Value or Value Set, or to purge a Shared Value if it shouldn't be accessible anymore.
<SchemaDefinition schemaRef="#/components/schemas/ValueSetVersionResponse" />


### Available Operations

* [getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersions](#getorgsorgidappsappidenvsenvidvaluesetversions) - List Value Set Versions in an Environment of an App
* [getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionId](#getorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionid) - Get a single Value Set Version in an Environment of an App
* [getOrgsOrgIdAppsAppIdValueSetVersions](#getorgsorgidappsappidvaluesetversions) - List Value Set Versions in the App
* [getOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionId](#getorgsorgidappsappidvaluesetversionsvaluesetversionid) - Get a single Value Set Version from the App
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdPurgeKey](#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidpurgekey) - Purge the value of a specific Shared Value from the App Environment Version history.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestore](#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidrestore) - Restore a Value Set Version in an Environment of an App
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKey](#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidrestorekey) - Restore a specific key from the Value Set Version in an Environment of an App
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdPurgeKey](#postorgsorgidappsappidvaluesetversionsvaluesetversionidpurgekey) - Purge the value of a specific Shared Value from the App Version history.
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestore](#postorgsorgidappsappidvaluesetversionsvaluesetversionidrestore) - Restore a Value Set Version in an App
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreKey](#postorgsorgidappsappidvaluesetversionsvaluesetversionidrestorekey) - Restore a specific key from the Value Set Version in an App

## getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersions

A new Value Set Version is created on every modification of a Value inside the an Environment of an App. In case this environment has no overrides the response is the same as the App level endpoint.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsRequest req = new GetOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsRequest("corrupti", "amet", "molestiae") {{
                keyChanged = "amet";
            }};            

            GetOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsResponse res = sdk.valueSetVersion.getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersions(req);

            if (res.valueSetVersionResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionId

Get a single Value Set Version in an Environment of an App

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRequest req = new GetOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRequest("laborum", "modi", "perferendis", "e1942f32-e550-4557-96f5-d56d0bd0af2d");            

            GetOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdResponse res = sdk.valueSetVersion.getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionId(req);

            if (res.valueSetVersionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdAppsAppIdValueSetVersions

A new Value Set Version is created on every modification of a Value inside the app.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdValueSetVersionsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdValueSetVersionsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdValueSetVersionsRequest req = new GetOrgsOrgIdAppsAppIdValueSetVersionsRequest("repellat", "repudiandae") {{
                keyChanged = "architecto";
            }};            

            GetOrgsOrgIdAppsAppIdValueSetVersionsResponse res = sdk.valueSetVersion.getOrgsOrgIdAppsAppIdValueSetVersions(req);

            if (res.valueSetVersionResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionId

Get a single Value Set Version from the App

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRequest req = new GetOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRequest("adipisci", "pariatur", "b4f62cba-3f89-441a-abc0-b80a6924d3b2");            

            GetOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdResponse res = sdk.valueSetVersion.getOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionId(req);

            if (res.valueSetVersionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdPurgeKey

Purging permanently removes the value of a specific Shared Value in an application. A purged value is no longer accessible, can't be restored and can't be used
by deployments referencing a Value Set Version where the value was present.

Learn more about purging in our [docs](https://docs.humanitec.com/reference/concepts/app-config/shared-app-values#purge).


### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdPurgeKeyRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdPurgeKeyResponse;
import demo_1.test_1.models.shared.ValueSetActionPayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdPurgeKeyRequest req = new PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdPurgeKeyRequest(                new ValueSetActionPayloadRequest() {{
                                comment = "accusamus";
                            }};, "optio", "delectus", "minus", "quo", "8f895010-f5dd-43d6-ba18-04e54c82f168");            

            PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdPurgeKeyResponse res = sdk.valueSetVersion.postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdPurgeKey(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestore

Restore the values of all Shared Values in an environment from a specific version. Keys not existing in the selected version are deleted.

Learn more about reverting in our [docs](https://docs.humanitec.com/reference/concepts/app-config/shared-app-values#revert).


### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreResponse;
import demo_1.test_1.models.shared.ValueSetActionPayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreRequest req = new PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreRequest(                new ValueSetActionPayloadRequest() {{
                                comment = "est";
                            }};, "dolor", "aliquid", "consectetur", "c8873e48-4380-4b1f-ab8c-a275a60a04c4");            

            PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreResponse res = sdk.valueSetVersion.postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestore(req);

            if (res.valueSetVersionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKey

Restore the values of a single Shared Value in an Environment from a specific version.

Learn more about reverting in our [docs](https://docs.humanitec.com/reference/concepts/app-config/shared-app-values#revert).


### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKeyRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKeyResponse;
import demo_1.test_1.models.shared.ValueSetActionPayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKeyRequest req = new PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKeyRequest(                new ValueSetActionPayloadRequest() {{
                                comment = "iste";
                            }};, "ullam", "eligendi", "placeat", "voluptas", "99171b51-c1bd-4b1c-b4b8-88ebdfc4ccca");            

            PostOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKeyResponse res = sdk.valueSetVersion.postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKey(req);

            if (res.valueSetVersionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdPurgeKey

Purging permanently removes the value of a specific Shared Value in an Application. A purged value is no longer accessible, can't be restored and can't be used
by deployments referencing a Value Set Version where the value was present.

Learn more about purging in our [docs](https://docs.humanitec.com/reference/concepts/app-config/shared-app-values#purge).


### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdPurgeKeyRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdPurgeKeyResponse;
import demo_1.test_1.models.shared.ValueSetActionPayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdPurgeKeyRequest req = new PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdPurgeKeyRequest(                new ValueSetActionPayloadRequest() {{
                                comment = "excepturi";
                            }};, "occaecati", "libero", "quo", "7fc0b2dc-e108-473e-82b0-06d678878ba8");            

            PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdPurgeKeyResponse res = sdk.valueSetVersion.postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdPurgeKey(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestore

Restore the values of all Shared Values in an application from a specific version. Keys not existing in the selected version are deleted.

Learn more about reverting in our [docs](https://docs.humanitec.com/reference/concepts/app-config/shared-app-values#revert).


### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreResponse;
import demo_1.test_1.models.shared.ValueSetActionPayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreRequest req = new PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreRequest(                new ValueSetActionPayloadRequest() {{
                                comment = "nostrum";
                            }};, "atque", "architecto", "a58208c5-4fef-4a9c-95f2-eac5565d307c");            

            PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreResponse res = sdk.valueSetVersion.postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestore(req);

            if (res.valueSetVersionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreKey

Restore the values of a single Shared Value in an application from a specific version.

Learn more about reverting in our [docs](https://docs.humanitec.com/reference/concepts/app-config/shared-app-values#revert).


### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreKeyRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreKeyResponse;
import demo_1.test_1.models.shared.ValueSetActionPayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreKeyRequest req = new PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreKeyRequest(                new ValueSetActionPayloadRequest() {{
                                comment = "asperiores";
                            }};, "recusandae", "voluptates", "praesentium", "1206e281-3fa4-4a41-8480-d3f2132af031");            

            PostOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreKeyResponse res = sdk.valueSetVersion.postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreKey(req);

            if (res.valueSetVersionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
