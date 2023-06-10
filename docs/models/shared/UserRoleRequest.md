# UserRoleRequest

UserRole holds the mapping of role to user for a particular object.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `createdAt`                                               | *String*                                                  | :heavy_minus_sign:                                        | The time the user was first registered with Humanitec     | 2020-06-22T09:37:23.523Z                                  |
| `email`                                                   | *String*                                                  | :heavy_minus_sign:                                        | The email address of the user from the profile            |                                                           |
| `id`                                                      | *String*                                                  | :heavy_minus_sign:                                        | The User ID for this user                                 |                                                           |
| `invite`                                                  | *String*                                                  | :heavy_minus_sign:                                        | The status of an invitation (If applicable)               |                                                           |
| `name`                                                    | *String*                                                  | :heavy_minus_sign:                                        | The name the user goes by                                 |                                                           |
| `role`                                                    | *String*                                                  | :heavy_minus_sign:                                        | The role that this user holds                             |                                                           |
| `type`                                                    | *String*                                                  | :heavy_minus_sign:                                        | The type of the account. Could be user, service or system |                                                           |
| `user`                                                    | *String*                                                  | :heavy_minus_sign:                                        | The user ID that hold the role                            |                                                           |