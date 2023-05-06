# image

## Overview

DEPRECATED: This type exists for historical compatibility and should not be used. Please use the [Artefact API](https://api-docs.humanitec.com/#tag/Artefact) instead.

Container Images (known simply as Images) can be registered with Humanitec. Continuous Integration (CI) pipelines can then notify Humanitec when a new build of a Container Image becomes available. Humanitec tracks the Image along with metadata about how it was built.
<SchemaDefinition schemaRef="#/components/schemas/ImageRequest" />


### Available Operations

* [getOrgsOrgIdImages](#getorgsorgidimages) - List all Container Images
* [getOrgsOrgIdImagesImageId](#getorgsorgidimagesimageid) - Get a specific Image Object
* [getOrgsOrgIdImagesImageIdBuilds](#getorgsorgidimagesimageidbuilds) - Lists all the Builds of an Image
* [postOrgsOrgIdImagesImageIdBuilds](#postorgsorgidimagesimageidbuilds) - Add a new Image Build

## getOrgsOrgIdImages

DEPRECATED: This endpoint exists for historical compatibility and should not be used. Please use the [Artefact API](https://api-docs.humanitec.com/#tag/Artefact) instead.

Lists all of the Container Images registered for this organization.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdImagesRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdImagesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdImagesRequest req = new GetOrgsOrgIdImagesRequest("placeat");            

            GetOrgsOrgIdImagesResponse res = sdk.image.getOrgsOrgIdImages(req);

            if (res.imageResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdImagesImageId

DEPRECATED: This endpoint exists for historical compatibility and should not be used. Please use the [Artefact API](https://api-docs.humanitec.com/#tag/Artefact) instead.

The response includes a list of Image Builds as well as some metadata about the Image such as its Image Source.

Note, `imageId` may not be the same as the container name. `imageId` is determined by the system making notifications about new builds.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdImagesImageIdRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdImagesImageIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdImagesImageIdRequest req = new GetOrgsOrgIdImagesImageIdRequest("enim", "neque");            

            GetOrgsOrgIdImagesImageIdResponse res = sdk.image.getOrgsOrgIdImagesImageId(req);

            if (res.imageResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdImagesImageIdBuilds

DEPRECATED: This endpoint exists for historical compatibility and should not be used. Please use the [Artefact API](https://api-docs.humanitec.com/#tag/Artefact) instead.

The response lists all available Image Builds of an Image.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdImagesImageIdBuildsRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdImagesImageIdBuildsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdImagesImageIdBuildsRequest req = new GetOrgsOrgIdImagesImageIdBuildsRequest("in", "minus");            

            GetOrgsOrgIdImagesImageIdBuildsResponse res = sdk.image.getOrgsOrgIdImagesImageIdBuilds(req);

            if (res.imageBuildResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdImagesImageIdBuilds

DEPRECATED: This endpoint exists for historical compatibility and should not be used. Please use the [Artefact API](https://api-docs.humanitec.com/#tag/Artefact) instead.

This endpoint is used by Continuous Integration (CI) pipelines to notify Humanitec that a new Image Build is available.

If there is no Image with ID `imageId`, it will be automatically created.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdImagesImageIdBuildsRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdImagesImageIdBuildsResponse;
import demo_1.test_1.models.shared.ImageBuildRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdImagesImageIdBuildsRequest req = new PostOrgsOrgIdImagesImageIdBuildsRequest(                new ImageBuildRequest() {{
                                branch = "eum";
                                commit = "modi";
                                image = "corporis";
                                tags = new String[]{{
                                    add("voluptates"),
                                    add("maiores"),
                                }};
                            }};, "tempore", "aperiam");            

            PostOrgsOrgIdImagesImageIdBuildsResponse res = sdk.image.postOrgsOrgIdImagesImageIdBuilds(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
