# ApplicationCreationRequest

The request ID, Human-friendly name and environment of the Application.




## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `env`                                                                   | [EnvironmentBaseRequest](../../models/shared/EnvironmentBaseRequest.md) | :heavy_minus_sign:                                                      | N/A                                                                     |
| `id`                                                                    | *String*                                                                | :heavy_check_mark:                                                      | The ID which refers to a specific application.                          |
| `name`                                                                  | *String*                                                                | :heavy_check_mark:                                                      | The Human-friendly name for the Application.                            |