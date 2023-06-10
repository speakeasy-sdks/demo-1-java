# UpdateActionResponse

A representation of the main object defined in JSON Patch specified in RFC 6902 from the IETF. The main differences are:

* Only `add`, `remove` and `replace` are supported

* `remove` can have have its scope of application applied in its `value`. e.g. `{"scope":"delta"}


## Fields

| Field              | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `from`             | *String*           | :heavy_minus_sign: | N/A                |
| `op`               | *String*           | :heavy_check_mark: | N/A                |
| `path`             | *String*           | :heavy_check_mark: | N/A                |
| `value`            | *Object*           | :heavy_minus_sign: | N/A                |