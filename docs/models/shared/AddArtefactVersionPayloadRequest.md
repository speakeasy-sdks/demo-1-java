# AddArtefactVersionPayloadRequest

AddArtefactVersionPayload describes the payload for a new ArtefactVersion request.


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `commit`                                                    | *String*                                                    | :heavy_minus_sign:                                          | (Optional) The commit ID the Artefact Version was built on. |
| `digest`                                                    | *String*                                                    | :heavy_minus_sign:                                          | (Optional) The Artefact Version digest.                     |
| `name`                                                      | *String*                                                    | :heavy_check_mark:                                          | The Artefact name.                                          |
| `ref`                                                       | *String*                                                    | :heavy_minus_sign:                                          | (Optional) The ref the Artefact Version was built from.     |
| `type`                                                      | *String*                                                    | :heavy_check_mark:                                          | The Artefact Version type.                                  |
| `version`                                                   | *String*                                                    | :heavy_minus_sign:                                          | (Optional) The Artefact Version.                            |