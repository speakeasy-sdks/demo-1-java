# EnvironmentDefinitionRequest

The ID, Name, Type, and Deployment the Environment will be derived from.




## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `fromDeployId`                                                               | *String*                                                                     | :heavy_check_mark:                                                           | Defines the existing Deployment the new Environment will be based on.        |
| `id`                                                                         | *String*                                                                     | :heavy_check_mark:                                                           | The ID the Environment is referenced as.                                     |
| `name`                                                                       | *String*                                                                     | :heavy_check_mark:                                                           | The Human-friendly name for the Environment.                                 |
| `type`                                                                       | *String*                                                                     | :heavy_check_mark:                                                           | The Environment Type. This is used for organizing and managing Environments. |