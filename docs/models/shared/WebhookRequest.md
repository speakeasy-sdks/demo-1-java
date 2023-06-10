# WebhookRequest

Webhook is a special type of a Job, it performs a HTTPS request to a specified URL with specified headers.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `disabled`                                                        | *Boolean*                                                         | :heavy_minus_sign:                                                | Defines whether this job is currently disabled.                   |
| `headers`                                                         | Map<String, *Object*>                                             | :heavy_minus_sign:                                                | N/A                                                               |
| `id`                                                              | *String*                                                          | :heavy_minus_sign:                                                | Job ID, unique within the Organization                            |
| `payload`                                                         | Map<String, *Object*>                                             | :heavy_minus_sign:                                                | N/A                                                               |
| `triggers`                                                        | List<[EventBaseRequest](../../models/shared/EventBaseRequest.md)> | :heavy_minus_sign:                                                | A list of Events by which the Job is triggered                    |
| `url`                                                             | *String*                                                          | :heavy_minus_sign:                                                | Thw webhook's URL (without protocol, only HTTPS is supported)     |