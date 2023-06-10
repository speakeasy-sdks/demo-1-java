# ImageBuildRequest

DEPRECATED: This type exists for historical compatibility and should not be used. Please use the [Artefact API](https://api-docs.humanitec.com/#tag/Artefact) instead.

Holds the metadata associated withe a Container Image Build


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `branch`                                                              | *String*                                                              | :heavy_minus_sign:                                                    | The branch name of the branch the build was built on                  |
| `commit`                                                              | *String*                                                              | :heavy_minus_sign:                                                    | The commit ID that this build was built from.                         |
| `image`                                                               | *String*                                                              | :heavy_minus_sign:                                                    | The fully qualified Image URL including registry, repository and tag. |
| `tags`                                                                | List<*String*>                                                        | :heavy_minus_sign:                                                    | The tag that the build was built from.                                |