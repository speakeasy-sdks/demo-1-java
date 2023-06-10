# ModuleDeltasRequest

ModuleDeltas groups the different operations together.


## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `add`                                                                                   | Map<String, Map<String, [ControllerRequest](../../models/shared/ControllerRequest.md)>> | :heavy_minus_sign:                                                                      | N/A                                                                                     |
| `remove`                                                                                | List<*String*>                                                                          | :heavy_minus_sign:                                                                      | N/A                                                                                     |
| `update`                                                                                | Map<String, List<[UpdateActionRequest](../../models/shared/UpdateActionRequest.md)>>    | :heavy_minus_sign:                                                                      | N/A                                                                                     |