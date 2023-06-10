# CreateResourceAccountRequestRequest

CreateResourceAccountRequest describes the request to create a new security account.


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `credentials`                                                                   | Map<String, *Object*>                                                           | :heavy_minus_sign:                                                              | Credentials associated with the account.                                        |
| `id`                                                                            | *String*                                                                        | :heavy_minus_sign:                                                              | Unique identifier for the account (in scope of the organization it belongs to). |
| `name`                                                                          | *String*                                                                        | :heavy_minus_sign:                                                              | Display name.                                                                   |
| `type`                                                                          | *String*                                                                        | :heavy_minus_sign:                                                              | The type of the account                                                         |