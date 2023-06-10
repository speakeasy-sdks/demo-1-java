# RuntimeInfoResponse

RuntimeInfo object returned by the runtime endpoint. Represents a list post statuses grouped by modules and controllers (deployments and stateful sets).


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `modules`                                                                                 | Map<String, Map<String, [ControllerResponse](../../models/shared/ControllerResponse.md)>> | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `namespace`                                                                               | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |