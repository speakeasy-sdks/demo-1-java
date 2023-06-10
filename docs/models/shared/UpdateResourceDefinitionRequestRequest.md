# UpdateResourceDefinitionRequestRequest

UpdateResourceDefinitionRequest describes a ResourceDefinition change request.


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `driverAccount`                                                              | *String*                                                                     | :heavy_minus_sign:                                                           | (Optional) Security account required by the driver.                          |
| `driverInputs`                                                               | [ValuesSecretsRequest](../../models/shared/ValuesSecretsRequest.md)          | :heavy_minus_sign:                                                           | ValuesSecrets stores data that should be passed around split by sensitivity. |
| `name`                                                                       | *String*                                                                     | :heavy_check_mark:                                                           | The display name.                                                            |