# value

## Overview

Shared Values can be used to manage variables and configuration that might vary between environments. They are also the way that secrets can be stored securely.

Shared Values are by default shared across all environments in an application. However, they can be overridden on an Environment by Environment basis.

For example: There might be 2 API keys that are used in an application. One development key used in the development and staging environments and another used for production. The development API key would be set at the Application level. The value would then be overridden at the Environment level for the production Environment.
<SchemaDefinition schemaRef="#/components/schemas/ValueRequest" />


### Available Operations

* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdValues](#deleteorgsorgidappsappidenvsenvidvalues) - Delete all Shared Value for an Environment
* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](#deleteorgsorgidappsappidenvsenvidvalueskey) - Delete Shared Value for an Environment
* [deleteOrgsOrgIdAppsAppIdValues](#deleteorgsorgidappsappidvalues) - Delete all Shared Value for an App
* [deleteOrgsOrgIdAppsAppIdValuesKey](#deleteorgsorgidappsappidvalueskey) - Delete Shared Value for an Application
* [getOrgsOrgIdAppsAppIdEnvsEnvIdValues](#getorgsorgidappsappidenvsenvidvalues) - List Shared Values in an Environment
* [getOrgsOrgIdAppsAppIdValues](#getorgsorgidappsappidvalues) - List Shared Values in an Application
* [patchOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](#patchorgsorgidappsappidenvsenvidvalueskey) - Update Shared Value for an Environment
* [patchOrgsOrgIdAppsAppIdValuesKey](#patchorgsorgidappsappidvalueskey) - Update Shared Value for an Application
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValues](#postorgsorgidappsappidenvsenvidvalues) - Create a Shared Value for an Environment
* [postOrgsOrgIdAppsAppIdValues](#postorgsorgidappsappidvalues) - Create a Shared Value for an Application
* [putOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](#putorgsorgidappsappidenvsenvidvalueskey) - Update Shared Value for an Environment
* [putOrgsOrgIdAppsAppIdValuesKey](#putorgsorgidappsappidvalueskey) - Update Shared Value for an Application

## deleteOrgsOrgIdAppsAppIdEnvsEnvIdValues

All Shared Values will be deleted. If the Shared Values are marked as a secret, they will also be deleted.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest req = new DeleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest("a", "nobis", "perspiciatis");            

            DeleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesResponse res = sdk.value.deleteOrgsOrgIdAppsAppIdEnvsEnvIdValues(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey

The specified Shared Value will be permanently deleted. If the Shared Value is marked as a secret, it will also be permanently deleted.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest req = new DeleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest("accusantium", "dicta", "minus", "commodi");            

            DeleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyResponse res = sdk.value.deleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteOrgsOrgIdAppsAppIdValues

All Shared Values will be deleted. If the Shared Values are marked as a secret, they will also be deleted.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdValuesRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdValuesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdAppsAppIdValuesRequest req = new DeleteOrgsOrgIdAppsAppIdValuesRequest("eveniet", "porro");            

            DeleteOrgsOrgIdAppsAppIdValuesResponse res = sdk.value.deleteOrgsOrgIdAppsAppIdValues(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteOrgsOrgIdAppsAppIdValuesKey

The specified Shared Value will be permanently deleted. If the Shared Value is marked as a secret, it will also be permanently deleted.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdValuesKeyRequest;
import demo_1.test_1.models.operations.DeleteOrgsOrgIdAppsAppIdValuesKeyResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            DeleteOrgsOrgIdAppsAppIdValuesKeyRequest req = new DeleteOrgsOrgIdAppsAppIdValuesKeyRequest("tempore", "quidem", "modi");            

            DeleteOrgsOrgIdAppsAppIdValuesKeyResponse res = sdk.value.deleteOrgsOrgIdAppsAppIdValuesKey(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdAppsAppIdEnvsEnvIdValues

The returned values will be the base Application values with the Environment overrides where applicable. The `source` field will specify the level from which the value is from.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdEnvsEnvIdValuesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest req = new GetOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest("voluptates", "fugit", "eius");            

            GetOrgsOrgIdAppsAppIdEnvsEnvIdValuesResponse res = sdk.value.getOrgsOrgIdAppsAppIdEnvsEnvIdValues(req);

            if (res.valueResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdAppsAppIdValues

The returned values will be the "base" values for the Application. The overridden value for the Environment can be retrieved via the `/orgs/{orgId}/apps/{appId}/envs/{envId}/values` endpoint.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdValuesRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdValuesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdValuesRequest req = new GetOrgsOrgIdAppsAppIdValuesRequest("sequi", "eligendi");            

            GetOrgsOrgIdAppsAppIdValuesResponse res = sdk.value.getOrgsOrgIdAppsAppIdValues(req);

            if (res.valueResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## patchOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey

Update the value or description of the Shared Value. Shared Values marked as secret can also be updated.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest;
import demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyResponse;
import demo_1.test_1.models.shared.ValuePatchPayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PatchOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest req = new PatchOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest(                new ValuePatchPayloadRequest() {{
                                description = "asperiores";
                                value = "esse";
                            }};, "blanditiis", "sint", "repellat", "a");            

            PatchOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyResponse res = sdk.value.patchOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey(req);

            if (res.valueResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## patchOrgsOrgIdAppsAppIdValuesKey

Update the value or description of the Shared Value. Shared Values marked as secret can also be updated.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdValuesKeyRequest;
import demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdValuesKeyResponse;
import demo_1.test_1.models.shared.ValuePatchPayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PatchOrgsOrgIdAppsAppIdValuesKeyRequest req = new PatchOrgsOrgIdAppsAppIdValuesKeyRequest(                new ValuePatchPayloadRequest() {{
                                description = "animi";
                                value = "maiores";
                            }};, "itaque", "nulla", "deserunt");            

            PatchOrgsOrgIdAppsAppIdValuesKeyResponse res = sdk.value.patchOrgsOrgIdAppsAppIdValuesKey(req);

            if (res.valueResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdAppsAppIdEnvsEnvIdValues

The Shared Value created will only be available to the specific Environment.

If a Value is marked as a secret, it will be securely stored. It will not be possible to retrieve the value again through the API. The value of the secret can however be updated.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdEnvsEnvIdValuesResponse;
import demo_1.test_1.models.shared.ValueCreatePayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest req = new PostOrgsOrgIdAppsAppIdEnvsEnvIdValuesRequest(                new ValueCreatePayloadRequest("corporis", "velit", "officiis") {{
                                isSecret = false;
                            }};, "enim", "officia", "saepe");            

            PostOrgsOrgIdAppsAppIdEnvsEnvIdValuesResponse res = sdk.value.postOrgsOrgIdAppsAppIdEnvsEnvIdValues(req);

            if (res.valueResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdAppsAppIdValues

The Shared Value created will be available to all Environments in that Application.

If a Value is marked as a secret, it will be securely stored. It will not be possible to retrieve the value again through the API. The value of the secret can however be updated.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdValuesRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdValuesResponse;
import demo_1.test_1.models.shared.ValueCreatePayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdValuesRequest req = new PostOrgsOrgIdAppsAppIdValuesRequest(                new ValueCreatePayloadRequest("eum", "repudiandae", "accusantium") {{
                                isSecret = false;
                            }};, "officia", "impedit");            

            PostOrgsOrgIdAppsAppIdValuesResponse res = sdk.value.postOrgsOrgIdAppsAppIdValues(req);

            if (res.valueResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## putOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey

Update the value or description of the Shared Value. Shared Values marked as secret can also be updated.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyResponse;
import demo_1.test_1.models.shared.ValueEditPayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PutOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest req = new PutOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyRequest(                new ValueEditPayloadRequest("quasi", "blanditiis") {{
                                isSecret = false;
                                key = "eius";
                            }};, "quisquam", "eos", "nobis", "natus");            

            PutOrgsOrgIdAppsAppIdEnvsEnvIdValuesKeyResponse res = sdk.value.putOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey(req);

            if (res.valueResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## putOrgsOrgIdAppsAppIdValuesKey

Update the value or description of the Shared Value. Shared Values marked as secret can also be updated.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdValuesKeyRequest;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdValuesKeyResponse;
import demo_1.test_1.models.shared.ValueEditPayloadRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PutOrgsOrgIdAppsAppIdValuesKeyRequest req = new PutOrgsOrgIdAppsAppIdValuesKeyRequest(                new ValueEditPayloadRequest("minus", "quia") {{
                                isSecret = false;
                                key = "magnam";
                            }};, "reprehenderit", "quod", "quos");            

            PutOrgsOrgIdAppsAppIdValuesKeyResponse res = sdk.value.putOrgsOrgIdAppsAppIdValuesKey(req);

            if (res.valueResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
