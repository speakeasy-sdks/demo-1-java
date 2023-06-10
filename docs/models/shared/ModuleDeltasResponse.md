# ModuleDeltasResponse

ModuleDeltas groups the different operations together.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `add`                                                                                     | Map<String, Map<String, [ControllerResponse](../../models/shared/ControllerResponse.md)>> | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `remove`                                                                                  | List<*String*>                                                                            | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `update`                                                                                  | Map<String, List<[UpdateActionResponse](../../models/shared/UpdateActionResponse.md)>>    | :heavy_check_mark:                                                                        | N/A                                                                                       |