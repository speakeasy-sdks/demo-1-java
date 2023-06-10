# ControllerResponse

Controller represents deployment, stateful set etc


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `kind`                                                            | *String*                                                          | :heavy_check_mark:                                                | N/A                                                               |
| `message`                                                         | *String*                                                          | :heavy_check_mark:                                                | N/A                                                               |
| `pods`                                                            | List<[PodStateResponse](../../models/shared/PodStateResponse.md)> | :heavy_check_mark:                                                | N/A                                                               |
| `replicas`                                                        | *Long*                                                            | :heavy_check_mark:                                                | N/A                                                               |
| `revision`                                                        | *Long*                                                            | :heavy_check_mark:                                                | N/A                                                               |
| `status`                                                          | *String*                                                          | :heavy_check_mark:                                                | N/A                                                               |