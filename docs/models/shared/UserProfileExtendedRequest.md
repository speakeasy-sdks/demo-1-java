# UserProfileExtendedRequest

UserProfileExtended holds the profile information of a user including properties only accessible to the user.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `createdAt`                                               | *String*                                                  | :heavy_minus_sign:                                        | The time the user was first registered with Humanitec     | 2020-06-22T09:37:23.523Z                                  |
| `email`                                                   | *String*                                                  | :heavy_minus_sign:                                        | The email address of the user from the profile            |                                                           |
| `id`                                                      | *String*                                                  | :heavy_minus_sign:                                        | The User ID for this user                                 |                                                           |
| `name`                                                    | *String*                                                  | :heavy_minus_sign:                                        | The name the user goes by                                 |                                                           |
| `properties`                                              | Map<String, *Object*>                                     | :heavy_minus_sign:                                        | N/A                                                       |                                                           |
| `roles`                                                   | Map<String, *String*>                                     | :heavy_minus_sign:                                        | N/A                                                       |                                                           |
| `type`                                                    | *String*                                                  | :heavy_minus_sign:                                        | The type of the account. Could be user, service or system |                                                           |