# delta

## Overview

A Deployment Delta (or just "Delta") describes the changes that must be applied to one Deployment Set to generate another Deployment Set. Deployment Deltas are the only way to create new Deployment Sets.

Deployment Deltas can be created fully formed or combined together via PATCHing. They can also be generated from the difference between two Deployment Sets.

**Basic Structure**

```
 {
   "id": <ID of the Deployment Delta.>,
   "metadata": {
     <Properties such as who created the Delta, which Environment it is associated to and a Human-friendly name>
   }
   "modules" : {
     "add" : {
       <ID of Module to add to the Deployment Set> : {
         <An entire Modules object>
       }
     },
     "remove": [
       <An array of Module IDs that should be removed from the Deployment Set>
     ],
    "update": {
       <ID of Module already in the Set to be updated> : [
         <An array of JSON Patch (Search Results (RFC 6902) objects scoped to the module>
       ]
     }
   }
 }
```
<SchemaDefinition schemaRef="#/components/schemas/DeltaRequest" />


### Available Operations

* [getDelta](#getdelta) - Fetch an existing Delta
* [getOrgsOrgIdAppsAppIdDeltas](#getorgsorgidappsappiddeltas) - List Deltas in an Application
* [patchOrgsOrgIdAppsAppIdDeltasDeltaId](#patchorgsorgidappsappiddeltasdeltaid) - Update an existing Delta
* [postOrgsOrgIdAppsAppIdDeltas](#postorgsorgidappsappiddeltas) - Create a new Delta
* [putDelta](#putdelta) - Update an existing Delta
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchived](#putorgsorgidappsappiddeltasdeltaidmetadataarchived) - Mark a Delta as "archived"
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvId](#putorgsorgidappsappiddeltasdeltaidmetadataenvid) - Change the Environment of a Delta
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataName](#putorgsorgidappsappiddeltasdeltaidmetadataname) - Change the name of a Delta

## getDelta

Fetch an existing Delta

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetDeltaRequest;
import demo_1.test_1.models.operations.GetDeltaResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetDeltaRequest req = new GetDeltaRequest("explicabo", "nobis", "enim");            

            GetDeltaResponse res = sdk.delta.getDelta(req);

            if (res.deltaResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOrgsOrgIdAppsAppIdDeltas

List Deltas in an Application

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdDeltasRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdAppsAppIdDeltasResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdAppsAppIdDeltasRequest req = new GetOrgsOrgIdAppsAppIdDeltasRequest("omnis", "nemo") {{
                archived = false;
                env = "minima";
            }};            

            GetOrgsOrgIdAppsAppIdDeltasResponse res = sdk.delta.getOrgsOrgIdAppsAppIdDeltas(req);

            if (res.deltaResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## patchOrgsOrgIdAppsAppIdDeltasDeltaId

Update an existing Delta

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdDeltasDeltaIdRequest;
import demo_1.test_1.models.operations.PatchOrgsOrgIdAppsAppIdDeltasDeltaIdResponse;
import demo_1.test_1.models.shared.ControllerRequest;
import demo_1.test_1.models.shared.DeltaMetadataRequest;
import demo_1.test_1.models.shared.DeltaRequest;
import demo_1.test_1.models.shared.ModuleDeltasRequest;
import demo_1.test_1.models.shared.PodStateRequest;
import demo_1.test_1.models.shared.UpdateActionRequest;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PatchOrgsOrgIdAppsAppIdDeltasDeltaIdRequest req = new PatchOrgsOrgIdAppsAppIdDeltasDeltaIdRequest(                new demo_1.test_1.models.shared.DeltaRequest[]{{
                                add(new DeltaRequest() {{
                                    id = "07aff1a3-a2fa-4946-b739-251aa52c3f5a";
                                    metadata = new DeltaMetadataRequest() {{
                                        archived = false;
                                        contributers = new String[]{{
                                            add("aut"),
                                            add("quasi"),
                                            add("error"),
                                            add("temporibus"),
                                        }};
                                        createdAt = OffsetDateTime.parse("2020-06-22T09:37:23.523Z");
                                        createdBy = "laborum";
                                        envId = "quasi";
                                        lastModifiedAt = OffsetDateTime.parse("2020-06-22T09:37:23.523Z");
                                        name = "Jan Thiel";
                                        shared = false;
                                    }};
                                    modules = new ModuleDeltasRequest() {{
                                        add = new java.util.HashMap<String, java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>>() {{
                                            put("ipsa", new java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>() {{
                                                put("voluptate", new ControllerRequest() {{
                                                    kind = "cum";
                                                    message = "perferendis";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("maiores", "dicta");
                                                                    put("corporis", "dolore");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("dicta", "harum");
                                                                    put("enim", "accusamus");
                                                                }}),
                                                            }};
                                                            phase = "commodi";
                                                            podName = "repudiandae";
                                                            revision = 64147L;
                                                            status = "ipsum";
                                                        }}),
                                                    }};
                                                    replicas = 692472L;
                                                    revision = 565189L;
                                                    status = "excepturi";
                                                }});
                                                put("pariatur", new ControllerRequest() {{
                                                    kind = "modi";
                                                    message = "praesentium";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("repudiandae", "sint");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("itaque", "incidunt");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("consequatur", "est");
                                                                    put("quibusdam", "explicabo");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("distinctio", "quibusdam");
                                                                    put("labore", "modi");
                                                                    put("qui", "aliquid");
                                                                }}),
                                                            }};
                                                            phase = "cupiditate";
                                                            podName = "quos";
                                                            revision = 20107L;
                                                            status = "magni";
                                                        }}),
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("alias", "fugit");
                                                                    put("dolorum", "excepturi");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("facilis", "tempore");
                                                                    put("labore", "delectus");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("non", "eligendi");
                                                                    put("sint", "aliquid");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("necessitatibus", "sint");
                                                                    put("officia", "dolor");
                                                                    put("debitis", "a");
                                                                }}),
                                                            }};
                                                            phase = "dolorum";
                                                            podName = "in";
                                                            revision = 449198L;
                                                            status = "illum";
                                                        }}),
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("dicta", "magnam");
                                                                    put("cumque", "facere");
                                                                    put("ea", "aliquid");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("accusamus", "non");
                                                                    put("occaecati", "enim");
                                                                    put("accusamus", "delectus");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("provident", "nam");
                                                                    put("id", "blanditiis");
                                                                    put("deleniti", "sapiente");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("deserunt", "nisi");
                                                                }}),
                                                            }};
                                                            phase = "vel";
                                                            podName = "natus";
                                                            revision = 606393L;
                                                            status = "molestiae";
                                                        }}),
                                                    }};
                                                    replicas = 19193L;
                                                    revision = 470132L;
                                                    status = "magnam";
                                                }});
                                                put("distinctio", new ControllerRequest() {{
                                                    kind = "id";
                                                    message = "labore";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("nobis", "eum");
                                                                    put("vero", "aspernatur");
                                                                    put("architecto", "magnam");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("excepturi", "ullam");
                                                                }}),
                                                            }};
                                                            phase = "provident";
                                                            podName = "quos";
                                                            revision = 574325L;
                                                            status = "accusantium";
                                                        }}),
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("mollitia", "ad");
                                                                    put("eum", "dolor");
                                                                    put("necessitatibus", "odit");
                                                                    put("nemo", "quasi");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("doloribus", "debitis");
                                                                    put("eius", "maxime");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("facilis", "in");
                                                                    put("architecto", "architecto");
                                                                    put("repudiandae", "ullam");
                                                                }}),
                                                            }};
                                                            phase = "expedita";
                                                            podName = "nihil";
                                                            revision = 998848L;
                                                            status = "quibusdam";
                                                        }}),
                                                    }};
                                                    replicas = 149448L;
                                                    revision = 904648L;
                                                    status = "pariatur";
                                                }});
                                            }});
                                            put("accusantium", new java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>() {{
                                                put("praesentium", new ControllerRequest() {{
                                                    kind = "natus";
                                                    message = "magni";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("pariatur", "maxime");
                                                                    put("ea", "excepturi");
                                                                    put("odit", "ea");
                                                                    put("accusantium", "ab");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("quidem", "ipsam");
                                                                    put("voluptate", "autem");
                                                                    put("nam", "eaque");
                                                                    put("pariatur", "nemo");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("perferendis", "fugiat");
                                                                    put("amet", "aut");
                                                                    put("cumque", "corporis");
                                                                    put("hic", "libero");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("dolores", "quis");
                                                                    put("totam", "dignissimos");
                                                                    put("eaque", "quis");
                                                                }}),
                                                            }};
                                                            phase = "nesciunt";
                                                            podName = "eos";
                                                            revision = 18521L;
                                                            status = "dolores";
                                                        }}),
                                                    }};
                                                    replicas = 793698L;
                                                    revision = 463451L;
                                                    status = "dolor";
                                                }});
                                            }});
                                            put("vero", new java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>() {{
                                                put("hic", new ControllerRequest() {{
                                                    kind = "recusandae";
                                                    message = "omnis";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("porro", "consequuntur");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("error", "eaque");
                                                                    put("occaecati", "rerum");
                                                                    put("adipisci", "asperiores");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("modi", "iste");
                                                                    put("dolorum", "deleniti");
                                                                    put("pariatur", "provident");
                                                                    put("nobis", "libero");
                                                                }}),
                                                            }};
                                                            phase = "delectus";
                                                            podName = "quaerat";
                                                            revision = 554242L;
                                                            status = "aliquid";
                                                        }}),
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("dolor", "qui");
                                                                }}),
                                                            }};
                                                            phase = "ipsum";
                                                            podName = "hic";
                                                            revision = 569574L;
                                                            status = "cum";
                                                        }}),
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("reiciendis", "amet");
                                                                    put("dolorum", "numquam");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("ipsa", "ipsa");
                                                                }}),
                                                            }};
                                                            phase = "iure";
                                                            podName = "odio";
                                                            revision = 311796L;
                                                            status = "accusamus";
                                                        }}),
                                                    }};
                                                    replicas = 696344L;
                                                    revision = 976405L;
                                                    status = "voluptas";
                                                }});
                                                put("natus", new ControllerRequest() {{
                                                    kind = "eos";
                                                    message = "atque";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("soluta", "dolorum");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("voluptate", "dolorum");
                                                                    put("deleniti", "omnis");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("distinctio", "asperiores");
                                                                    put("nihil", "ipsum");
                                                                    put("voluptate", "id");
                                                                    put("saepe", "eius");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("perferendis", "amet");
                                                                }}),
                                                            }};
                                                            phase = "optio";
                                                            podName = "accusamus";
                                                            revision = 320017L;
                                                            status = "saepe";
                                                        }}),
                                                    }};
                                                    replicas = 383464L;
                                                    revision = 645785L;
                                                    status = "provident";
                                                }});
                                            }});
                                            put("minima", new java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>() {{
                                                put("totam", new ControllerRequest() {{
                                                    kind = "similique";
                                                    message = "alias";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("vel", "quod");
                                                                    put("officiis", "qui");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("a", "esse");
                                                                    put("harum", "iusto");
                                                                    put("ipsum", "quisquam");
                                                                }}),
                                                            }};
                                                            phase = "tenetur";
                                                            podName = "amet";
                                                            revision = 730856L;
                                                            status = "accusamus";
                                                        }}),
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("dolorem", "sapiente");
                                                                    put("totam", "nihil");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("expedita", "neque");
                                                                }}),
                                                            }};
                                                            phase = "sed";
                                                            podName = "vel";
                                                            revision = 730442L;
                                                            status = "voluptas";
                                                        }}),
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("ipsum", "incidunt");
                                                                    put("qui", "cupiditate");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("pariatur", "soluta");
                                                                    put("dicta", "laborum");
                                                                    put("totam", "incidunt");
                                                                    put("aspernatur", "dolores");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("facilis", "aliquid");
                                                                    put("quam", "molestias");
                                                                    put("temporibus", "qui");
                                                                }}),
                                                            }};
                                                            phase = "neque";
                                                            podName = "fugit";
                                                            revision = 164959L;
                                                            status = "odio";
                                                        }}),
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("nam", "hic");
                                                                    put("voluptatem", "cumque");
                                                                }}),
                                                            }};
                                                            phase = "soluta";
                                                            podName = "nobis";
                                                            revision = 92596L;
                                                            status = "saepe";
                                                        }}),
                                                    }};
                                                    replicas = 217450L;
                                                    revision = 83422L;
                                                    status = "nobis";
                                                }});
                                                put("quos", new ControllerRequest() {{
                                                    kind = "tempore";
                                                    message = "cupiditate";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("dolore", "labore");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("dolorum", "architecto");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("aut", "quas");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("consequatur", "est");
                                                                    put("repellendus", "porro");
                                                                    put("doloribus", "ut");
                                                                    put("facilis", "cupiditate");
                                                                }}),
                                                            }};
                                                            phase = "qui";
                                                            podName = "quae";
                                                            revision = 512393L;
                                                            status = "odio";
                                                        }}),
                                                    }};
                                                    replicas = 580447L;
                                                    revision = 977496L;
                                                    status = "quisquam";
                                                }});
                                                put("vero", new ControllerRequest() {{
                                                    kind = "omnis";
                                                    message = "quis";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("consectetur", "vero");
                                                                    put("tenetur", "dignissimos");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("distinctio", "quod");
                                                                    put("odio", "similique");
                                                                    put("facilis", "vero");
                                                                    put("ducimus", "dolore");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("illum", "sequi");
                                                                    put("natus", "impedit");
                                                                    put("aut", "voluptatibus");
                                                                    put("exercitationem", "nulla");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("porro", "maiores");
                                                                }}),
                                                            }};
                                                            phase = "doloribus";
                                                            podName = "iusto";
                                                            revision = 753570L;
                                                            status = "ducimus";
                                                        }}),
                                                    }};
                                                    replicas = 4048L;
                                                    revision = 639473L;
                                                    status = "tempora";
                                                }});
                                                put("ipsam", new ControllerRequest() {{
                                                    kind = "ea";
                                                    message = "aspernatur";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("ratione", "ex");
                                                                    put("laudantium", "dicta");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("maiores", "quasi");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("nulla", "excepturi");
                                                                    put("voluptatibus", "nostrum");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("quisquam", "saepe");
                                                                    put("ea", "impedit");
                                                                    put("corporis", "veniam");
                                                                    put("aliquid", "inventore");
                                                                }}),
                                                            }};
                                                            phase = "magnam";
                                                            podName = "ea";
                                                            revision = 775220L;
                                                            status = "consectetur";
                                                        }}),
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("minima", "eaque");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("libero", "aut");
                                                                    put("aut", "deleniti");
                                                                    put("impedit", "aliquam");
                                                                    put("fugit", "accusamus");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("non", "et");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("laborum", "placeat");
                                                                    put("velit", "eum");
                                                                    put("autem", "nobis");
                                                                }}),
                                                            }};
                                                            phase = "quas";
                                                            podName = "assumenda";
                                                            revision = 860552L;
                                                            status = "voluptas";
                                                        }}),
                                                    }};
                                                    replicas = 727044L;
                                                    revision = 96549L;
                                                    status = "tempora";
                                                }});
                                            }});
                                        }};
                                        remove = new String[]{{
                                            add("explicabo"),
                                            add("provident"),
                                        }};
                                        update = new java.util.HashMap<String, demo_1.test_1.models.shared.UpdateActionRequest[]>() {{
                                            put("molestiae", new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                                add(new UpdateActionRequest() {{
                                                    from = "odio";
                                                    op = "eius";
                                                    path = "esse";
                                                    value = "esse";
                                                }}),
                                                add(new UpdateActionRequest() {{
                                                    from = "rem";
                                                    op = "fuga";
                                                    path = "reprehenderit";
                                                    value = "quidem";
                                                }}),
                                            }});
                                        }};
                                    }};
                                    shared = new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                        add(new UpdateActionRequest() {{
                                            from = "ut";
                                            op = "eum";
                                            path = "suscipit";
                                            value = "assumenda";
                                        }}),
                                        add(new UpdateActionRequest() {{
                                            from = "eos";
                                            op = "praesentium";
                                            path = "quisquam";
                                            value = "veritatis";
                                        }}),
                                        add(new UpdateActionRequest() {{
                                            from = "ipsa";
                                            op = "id";
                                            path = "quidem";
                                            value = "neque";
                                        }}),
                                        add(new UpdateActionRequest() {{
                                            from = "quo";
                                            op = "illum";
                                            path = "quo";
                                            value = "fuga";
                                        }}),
                                    }};
                                }}),
                                add(new DeltaRequest() {{
                                    id = "4251904e-523c-47e0-bc71-78e4796f2a70";
                                    metadata = new DeltaMetadataRequest() {{
                                        archived = false;
                                        contributers = new String[]{{
                                            add("eum"),
                                            add("quas"),
                                            add("praesentium"),
                                            add("consequuntur"),
                                        }};
                                        createdAt = OffsetDateTime.parse("2020-06-22T09:37:23.523Z");
                                        createdBy = "deleniti";
                                        envId = "fugit";
                                        lastModifiedAt = OffsetDateTime.parse("2020-06-22T09:37:23.523Z");
                                        name = "Hubert Gottlieb";
                                        shared = false;
                                    }};
                                    modules = new ModuleDeltasRequest() {{
                                        add = new java.util.HashMap<String, java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>>() {{
                                            put("nisi", new java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>() {{
                                                put("sapiente", new ControllerRequest() {{
                                                    kind = "consequuntur";
                                                    message = "ratione";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("atque", "et");
                                                                    put("esse", "eveniet");
                                                                    put("accusamus", "veritatis");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("quod", "nam");
                                                                    put("vero", "aliquid");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("saepe", "vel");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("molestiae", "rerum");
                                                                    put("occaecati", "minima");
                                                                    put("distinctio", "eligendi");
                                                                }}),
                                                            }};
                                                            phase = "sit";
                                                            podName = "culpa";
                                                            revision = 731398L;
                                                            status = "adipisci";
                                                        }}),
                                                    }};
                                                    replicas = 766964L;
                                                    revision = 160538L;
                                                    status = "consequatur";
                                                }});
                                            }});
                                            put("minus", new java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>() {{
                                                put("sapiente", new ControllerRequest() {{
                                                    kind = "consectetur";
                                                    message = "esse";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("nulla", "quas");
                                                                    put("esse", "quasi");
                                                                    put("a", "error");
                                                                    put("sint", "pariatur");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("quia", "eveniet");
                                                                    put("asperiores", "facere");
                                                                    put("veritatis", "consequuntur");
                                                                    put("quasi", "similique");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("aliquid", "tenetur");
                                                                    put("quae", "earum");
                                                                    put("vel", "in");
                                                                }}),
                                                            }};
                                                            phase = "eius";
                                                            podName = "libero";
                                                            revision = 849039L;
                                                            status = "soluta";
                                                        }}),
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("sapiente", "dicta");
                                                                    put("ullam", "reprehenderit");
                                                                }}),
                                                            }};
                                                            phase = "ullam";
                                                            podName = "nisi";
                                                            revision = 16328L;
                                                            status = "voluptatum";
                                                        }}),
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("ex", "deleniti");
                                                                    put("itaque", "dolorum");
                                                                    put("architecto", "omnis");
                                                                    put("tenetur", "quasi");
                                                                }}),
                                                            }};
                                                            phase = "at";
                                                            podName = "et";
                                                            revision = 454162L;
                                                            status = "ipsa";
                                                        }}),
                                                    }};
                                                    replicas = 326701L;
                                                    revision = 86532L;
                                                    status = "consectetur";
                                                }});
                                                put("adipisci", new ControllerRequest() {{
                                                    kind = "iste";
                                                    message = "temporibus";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("laudantium", "eum");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("ab", "corrupti");
                                                                    put("non", "voluptatem");
                                                                    put("dolor", "occaecati");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("impedit", "explicabo");
                                                                    put("voluptas", "aut");
                                                                }}),
                                                            }};
                                                            phase = "dignissimos";
                                                            podName = "dicta";
                                                            revision = 981640L;
                                                            status = "natus";
                                                        }}),
                                                    }};
                                                    replicas = 244651L;
                                                    revision = 974257L;
                                                    status = "voluptas";
                                                }});
                                            }});
                                        }};
                                        remove = new String[]{{
                                            add("aperiam"),
                                            add("ea"),
                                            add("quaerat"),
                                            add("consequuntur"),
                                        }};
                                        update = new java.util.HashMap<String, demo_1.test_1.models.shared.UpdateActionRequest[]>() {{
                                            put("officia", new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                                add(new UpdateActionRequest() {{
                                                    from = "dignissimos";
                                                    op = "officia";
                                                    path = "asperiores";
                                                    value = "nemo";
                                                }}),
                                                add(new UpdateActionRequest() {{
                                                    from = "quae";
                                                    op = "quaerat";
                                                    path = "porro";
                                                    value = "quod";
                                                }}),
                                                add(new UpdateActionRequest() {{
                                                    from = "labore";
                                                    op = "ab";
                                                    path = "adipisci";
                                                    value = "fuga";
                                                }}),
                                                add(new UpdateActionRequest() {{
                                                    from = "id";
                                                    op = "suscipit";
                                                    path = "velit";
                                                    value = "culpa";
                                                }}),
                                            }});
                                            put("est", new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                                add(new UpdateActionRequest() {{
                                                    from = "totam";
                                                    op = "fugiat";
                                                    path = "vel";
                                                    value = "ducimus";
                                                }}),
                                                add(new UpdateActionRequest() {{
                                                    from = "quos";
                                                    op = "vel";
                                                    path = "labore";
                                                    value = "possimus";
                                                }}),
                                                add(new UpdateActionRequest() {{
                                                    from = "facilis";
                                                    op = "cum";
                                                    path = "commodi";
                                                    value = "in";
                                                }}),
                                                add(new UpdateActionRequest() {{
                                                    from = "corporis";
                                                    op = "reiciendis";
                                                    path = "assumenda";
                                                    value = "nemo";
                                                }}),
                                            }});
                                            put("recusandae", new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                                add(new UpdateActionRequest() {{
                                                    from = "aperiam";
                                                    op = "cum";
                                                    path = "consectetur";
                                                    value = "in";
                                                }}),
                                                add(new UpdateActionRequest() {{
                                                    from = "exercitationem";
                                                    op = "earum";
                                                    path = "facere";
                                                    value = "numquam";
                                                }}),
                                            }});
                                            put("doloribus", new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                                add(new UpdateActionRequest() {{
                                                    from = "reiciendis";
                                                    op = "quidem";
                                                    path = "saepe";
                                                    value = "necessitatibus";
                                                }}),
                                                add(new UpdateActionRequest() {{
                                                    from = "dolore";
                                                    op = "sunt";
                                                    path = "asperiores";
                                                    value = "adipisci";
                                                }}),
                                            }});
                                        }};
                                    }};
                                    shared = new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                        add(new UpdateActionRequest() {{
                                            from = "amet";
                                            op = "beatae";
                                            path = "dignissimos";
                                            value = "a";
                                        }}),
                                    }};
                                }}),
                                add(new DeltaRequest() {{
                                    id = "e35b60eb-1ea4-4265-95ba-3c28744ed53b";
                                    metadata = new DeltaMetadataRequest() {{
                                        archived = false;
                                        contributers = new String[]{{
                                            add("quas"),
                                            add("hic"),
                                            add("nesciunt"),
                                        }};
                                        createdAt = OffsetDateTime.parse("2020-06-22T09:37:23.523Z");
                                        createdBy = "culpa";
                                        envId = "corrupti";
                                        lastModifiedAt = OffsetDateTime.parse("2020-06-22T09:37:23.523Z");
                                        name = "Jimmie Weimann";
                                        shared = false;
                                    }};
                                    modules = new ModuleDeltasRequest() {{
                                        add = new java.util.HashMap<String, java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>>() {{
                                            put("rerum", new java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>() {{
                                                put("reiciendis", new ControllerRequest() {{
                                                    kind = "explicabo";
                                                    message = "asperiores";
                                                    pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("ab", "iste");
                                                                    put("dolore", "laborum");
                                                                    put("sed", "in");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("quidem", "explicabo");
                                                                    put("voluptas", "unde");
                                                                }}),
                                                            }};
                                                            phase = "architecto";
                                                            podName = "suscipit";
                                                            revision = 960257L;
                                                            status = "debitis";
                                                        }}),
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("perferendis", "corrupti");
                                                                    put("maiores", "incidunt");
                                                                    put("sed", "provident");
                                                                    put("eius", "necessitatibus");
                                                                }}),
                                                            }};
                                                            phase = "ipsum";
                                                            podName = "ea";
                                                            revision = 579912L;
                                                            status = "quos";
                                                        }}),
                                                        add(new PodStateRequest() {{
                                                            containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("tempora", "voluptate");
                                                                    put("reiciendis", "ex");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("non", "officiis");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("facilis", "quaerat");
                                                                    put("incidunt", "ipsam");
                                                                    put("debitis", "rem");
                                                                }}),
                                                                add(new java.util.HashMap<String, Object>() {{
                                                                    put("nobis", "error");
                                                                }}),
                                                            }};
                                                            phase = "veniam";
                                                            podName = "minima";
                                                            revision = 924159L;
                                                            status = "reiciendis";
                                                        }}),
                                                    }};
                                                    replicas = 862319L;
                                                    revision = 168576L;
                                                    status = "aperiam";
                                                }});
                                            }});
                                        }};
                                        remove = new String[]{{
                                            add("numquam"),
                                            add("veniam"),
                                            add("in"),
                                            add("officiis"),
                                        }};
                                        update = new java.util.HashMap<String, demo_1.test_1.models.shared.UpdateActionRequest[]>() {{
                                            put("laudantium", new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                                add(new UpdateActionRequest() {{
                                                    from = "praesentium";
                                                    op = "cum";
                                                    path = "laboriosam";
                                                    value = "dolorum";
                                                }}),
                                                add(new UpdateActionRequest() {{
                                                    from = "voluptatum";
                                                    op = "error";
                                                    path = "hic";
                                                    value = "expedita";
                                                }}),
                                            }});
                                        }};
                                    }};
                                    shared = new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                        add(new UpdateActionRequest() {{
                                            from = "neque";
                                            op = "dolorum";
                                            path = "nostrum";
                                            value = "officia";
                                        }}),
                                        add(new UpdateActionRequest() {{
                                            from = "dolorum";
                                            op = "corrupti";
                                            path = "accusamus";
                                            value = "tempora";
                                        }}),
                                        add(new UpdateActionRequest() {{
                                            from = "atque";
                                            op = "fugit";
                                            path = "ut";
                                            value = "fugiat";
                                        }}),
                                        add(new UpdateActionRequest() {{
                                            from = "voluptatem";
                                            op = "culpa";
                                            path = "expedita";
                                            value = "magnam";
                                        }}),
                                    }};
                                }}),
                            }}, "consequatur", "esse", "ipsam");            

            PatchOrgsOrgIdAppsAppIdDeltasDeltaIdResponse res = sdk.delta.patchOrgsOrgIdAppsAppIdDeltasDeltaId(req);

            if (res.deltaResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## postOrgsOrgIdAppsAppIdDeltas

Create a new Delta

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdDeltasRequest;
import demo_1.test_1.models.operations.PostOrgsOrgIdAppsAppIdDeltasResponse;
import demo_1.test_1.models.shared.ControllerRequest;
import demo_1.test_1.models.shared.DeltaMetadataRequest;
import demo_1.test_1.models.shared.DeltaRequest;
import demo_1.test_1.models.shared.ModuleDeltasRequest;
import demo_1.test_1.models.shared.PodStateRequest;
import demo_1.test_1.models.shared.UpdateActionRequest;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PostOrgsOrgIdAppsAppIdDeltasRequest req = new PostOrgsOrgIdAppsAppIdDeltasRequest(                new DeltaRequest() {{
                                id = "088e5186-2065-4e90-8f3b-1194b8abf603";
                                metadata = new DeltaMetadataRequest() {{
                                    archived = false;
                                    contributers = new String[]{{
                                        add("voluptate"),
                                        add("unde"),
                                        add("reiciendis"),
                                    }};
                                    createdAt = OffsetDateTime.parse("2020-06-22T09:37:23.523Z");
                                    createdBy = "provident";
                                    envId = "repellendus";
                                    lastModifiedAt = OffsetDateTime.parse("2020-06-22T09:37:23.523Z");
                                    name = "Noah Armstrong";
                                    shared = false;
                                }};;
                                modules = new ModuleDeltasRequest() {{
                                    add = new java.util.HashMap<String, java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>>() {{
                                        put("facere", new java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>() {{
                                            put("praesentium", new ControllerRequest() {{
                                                kind = "mollitia";
                                                message = "veniam";
                                                pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("quasi", "atque");
                                                                put("reprehenderit", "asperiores");
                                                                put("totam", "suscipit");
                                                                put("quidem", "maxime");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("esse", "amet");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("ea", "atque");
                                                                put("error", "officiis");
                                                                put("officiis", "accusamus");
                                                                put("natus", "minima");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("ex", "maiores");
                                                            }}),
                                                        }};
                                                        phase = "corrupti";
                                                        podName = "at";
                                                        revision = 621693L;
                                                        status = "blanditiis";
                                                    }}),
                                                }};
                                                replicas = 379356L;
                                                revision = 922348L;
                                                status = "atque";
                                            }});
                                            put("atque", new ControllerRequest() {{
                                                kind = "sunt";
                                                message = "recusandae";
                                                pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("reiciendis", "doloremque");
                                                                put("repudiandae", "dicta");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("beatae", "dolores");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("laboriosam", "velit");
                                                                put("a", "molestias");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("saepe", "consequuntur");
                                                                put("occaecati", "officiis");
                                                            }}),
                                                        }};
                                                        phase = "perspiciatis";
                                                        podName = "in";
                                                        revision = 238043L;
                                                        status = "eveniet";
                                                    }}),
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("fugit", "id");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("reprehenderit", "error");
                                                                put("illo", "corporis");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("eveniet", "non");
                                                                put("vero", "doloremque");
                                                                put("iure", "ipsa");
                                                            }}),
                                                        }};
                                                        phase = "totam";
                                                        podName = "quae";
                                                        revision = 474668L;
                                                        status = "eveniet";
                                                    }}),
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("iure", "necessitatibus");
                                                                put("ratione", "laborum");
                                                                put("distinctio", "voluptatum");
                                                            }}),
                                                        }};
                                                        phase = "rem";
                                                        podName = "aliquam";
                                                        revision = 320565L;
                                                        status = "repellat";
                                                    }}),
                                                }};
                                                replicas = 3099L;
                                                revision = 362189L;
                                                status = "perspiciatis";
                                            }});
                                            put("nihil", new ControllerRequest() {{
                                                kind = "mollitia";
                                                message = "voluptas";
                                                pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("dolores", "id");
                                                                put("minima", "dolore");
                                                                put("dolorum", "nesciunt");
                                                                put("quae", "recusandae");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("quaerat", "molestiae");
                                                                put("ex", "ut");
                                                                put("culpa", "adipisci");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("laudantium", "eum");
                                                                put("nemo", "recusandae");
                                                                put("esse", "provident");
                                                                put("quis", "eum");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("provident", "aspernatur");
                                                                put("ullam", "quasi");
                                                                put("animi", "nostrum");
                                                                put("mollitia", "provident");
                                                            }}),
                                                        }};
                                                        phase = "possimus";
                                                        podName = "animi";
                                                        revision = 402767L;
                                                        status = "aliquid";
                                                    }}),
                                                }};
                                                replicas = 37565L;
                                                revision = 999278L;
                                                status = "doloribus";
                                            }});
                                        }});
                                        put("ullam", new java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>() {{
                                            put("nam", new ControllerRequest() {{
                                                kind = "earum";
                                                message = "officia";
                                                pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("voluptatibus", "molestias");
                                                                put("officiis", "sapiente");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("vitae", "rerum");
                                                                put("tempora", "quis");
                                                                put("inventore", "fugit");
                                                                put("cumque", "quae");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("velit", "aspernatur");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("eius", "rem");
                                                                put("at", "impedit");
                                                            }}),
                                                        }};
                                                        phase = "eos";
                                                        podName = "sapiente";
                                                        revision = 433279L;
                                                        status = "dicta";
                                                    }}),
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("cupiditate", "provident");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("soluta", "hic");
                                                                put("illum", "eaque");
                                                                put("earum", "perspiciatis");
                                                                put("maiores", "debitis");
                                                            }}),
                                                        }};
                                                        phase = "aliquid";
                                                        podName = "porro";
                                                        revision = 380335L;
                                                        status = "dolorem";
                                                    }}),
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("fuga", "ratione");
                                                                put("animi", "necessitatibus");
                                                                put("nulla", "consequatur");
                                                                put("quasi", "et");
                                                            }}),
                                                        }};
                                                        phase = "ducimus";
                                                        podName = "natus";
                                                        revision = 581082L;
                                                        status = "suscipit";
                                                    }}),
                                                }};
                                                replicas = 241557L;
                                                revision = 96562L;
                                                status = "magni";
                                            }});
                                            put("doloribus", new ControllerRequest() {{
                                                kind = "nulla";
                                                message = "necessitatibus";
                                                pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("molestiae", "dicta");
                                                                put("iusto", "esse");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("maiores", "reiciendis");
                                                                put("vel", "architecto");
                                                                put("fugiat", "doloremque");
                                                            }}),
                                                        }};
                                                        phase = "dicta";
                                                        podName = "odio";
                                                        revision = 271252L;
                                                        status = "esse";
                                                    }}),
                                                }};
                                                replicas = 403793L;
                                                revision = 235263L;
                                                status = "aliquid";
                                            }});
                                        }});
                                    }};
                                    remove = new String[]{{
                                        add("laborum"),
                                    }};
                                    update = new java.util.HashMap<String, demo_1.test_1.models.shared.UpdateActionRequest[]>() {{
                                        put("nostrum", new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                            add(new UpdateActionRequest() {{
                                                from = "expedita";
                                                op = "aliquid";
                                                path = "officia";
                                                value = "suscipit";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "aliquid";
                                                op = "perferendis";
                                                path = "eum";
                                                value = "voluptas";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "iste";
                                                op = "id";
                                                path = "ab";
                                                value = "error";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "possimus";
                                                op = "voluptates";
                                                path = "mollitia";
                                                value = "laborum";
                                            }}),
                                        }});
                                    }};
                                }};;
                                shared = new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                    add(new UpdateActionRequest() {{
                                        from = "ad";
                                        op = "deleniti";
                                        path = "enim";
                                        value = "vitae";
                                    }}),
                                    add(new UpdateActionRequest() {{
                                        from = "repellendus";
                                        op = "ex";
                                        path = "quo";
                                        value = "ex";
                                    }}),
                                    add(new UpdateActionRequest() {{
                                        from = "ut";
                                        op = "ad";
                                        path = "expedita";
                                        value = "voluptatem";
                                    }}),
                                }};
                            }};, "molestias", "cum");            

            PostOrgsOrgIdAppsAppIdDeltasResponse res = sdk.delta.postOrgsOrgIdAppsAppIdDeltas(req);

            if (res.postOrgsOrgIdAppsAppIdDeltas200ApplicationJSONOneOf != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## putDelta

Update an existing Delta

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PutDeltaRequest;
import demo_1.test_1.models.operations.PutDeltaResponse;
import demo_1.test_1.models.shared.ControllerRequest;
import demo_1.test_1.models.shared.DeltaMetadataRequest;
import demo_1.test_1.models.shared.DeltaRequest;
import demo_1.test_1.models.shared.ModuleDeltasRequest;
import demo_1.test_1.models.shared.PodStateRequest;
import demo_1.test_1.models.shared.UpdateActionRequest;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PutDeltaRequest req = new PutDeltaRequest(                new DeltaRequest() {{
                                id = "61891baa-0fe1-4ade-808e-6f8c5f350d8c";
                                metadata = new DeltaMetadataRequest() {{
                                    archived = false;
                                    contributers = new String[]{{
                                        add("nam"),
                                        add("ipsam"),
                                        add("culpa"),
                                        add("dolor"),
                                    }};
                                    createdAt = OffsetDateTime.parse("2020-06-22T09:37:23.523Z");
                                    createdBy = "aliquam";
                                    envId = "inventore";
                                    lastModifiedAt = OffsetDateTime.parse("2020-06-22T09:37:23.523Z");
                                    name = "Peter Goodwin Sr.";
                                    shared = false;
                                }};;
                                modules = new ModuleDeltasRequest() {{
                                    add = new java.util.HashMap<String, java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>>() {{
                                        put("modi", new java.util.HashMap<String, demo_1.test_1.models.shared.ControllerRequest>() {{
                                            put("ab", new ControllerRequest() {{
                                                kind = "laudantium";
                                                message = "quae";
                                                pods = new demo_1.test_1.models.shared.PodStateRequest[]{{
                                                    add(new PodStateRequest() {{
                                                        containerStatuses = new java.util.HashMap<String, Object>[]{{
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("consequuntur", "ipsa");
                                                                put("quas", "eveniet");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("officiis", "esse");
                                                                put("necessitatibus", "sed");
                                                                put("veniam", "nesciunt");
                                                                put("expedita", "eum");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("voluptatum", "magnam");
                                                                put("exercitationem", "ab");
                                                            }}),
                                                            add(new java.util.HashMap<String, Object>() {{
                                                                put("autem", "nobis");
                                                                put("laboriosam", "recusandae");
                                                                put("consequuntur", "voluptatem");
                                                                put("exercitationem", "necessitatibus");
                                                            }}),
                                                        }};
                                                        phase = "quasi";
                                                        podName = "nisi";
                                                        revision = 871103L;
                                                        status = "vero";
                                                    }}),
                                                }};
                                                replicas = 667593L;
                                                revision = 690785L;
                                                status = "sequi";
                                            }});
                                        }});
                                    }};
                                    remove = new String[]{{
                                        add("repudiandae"),
                                        add("optio"),
                                        add("occaecati"),
                                        add("nemo"),
                                    }};
                                    update = new java.util.HashMap<String, demo_1.test_1.models.shared.UpdateActionRequest[]>() {{
                                        put("blanditiis", new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                            add(new UpdateActionRequest() {{
                                                from = "voluptas";
                                                op = "numquam";
                                                path = "nemo";
                                                value = "quos";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "eius";
                                                op = "aspernatur";
                                                path = "ducimus";
                                                value = "nesciunt";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "fuga";
                                                op = "laudantium";
                                                path = "incidunt";
                                                value = "quasi";
                                            }}),
                                        }});
                                        put("rem", new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                            add(new UpdateActionRequest() {{
                                                from = "dicta";
                                                op = "nisi";
                                                path = "consequuntur";
                                                value = "consectetur";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "aperiam";
                                                op = "cupiditate";
                                                path = "reiciendis";
                                                value = "soluta";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "alias";
                                                op = "omnis";
                                                path = "eos";
                                                value = "occaecati";
                                            }}),
                                            add(new UpdateActionRequest() {{
                                                from = "iste";
                                                op = "magni";
                                                path = "inventore";
                                                value = "fuga";
                                            }}),
                                        }});
                                    }};
                                }};;
                                shared = new demo_1.test_1.models.shared.UpdateActionRequest[]{{
                                    add(new UpdateActionRequest() {{
                                        from = "voluptatibus";
                                        op = "distinctio";
                                        path = "omnis";
                                        value = "delectus";
                                    }}),
                                    add(new UpdateActionRequest() {{
                                        from = "minima";
                                        op = "praesentium";
                                        path = "maxime";
                                        value = "magnam";
                                    }}),
                                    add(new UpdateActionRequest() {{
                                        from = "temporibus";
                                        op = "quos";
                                        path = "commodi";
                                        value = "itaque";
                                    }}),
                                    add(new UpdateActionRequest() {{
                                        from = "commodi";
                                        op = "totam";
                                        path = "earum";
                                        value = "modi";
                                    }}),
                                }};
                            }};, "nam", "vero", "voluptatem");            

            PutDeltaResponse res = sdk.delta.putDelta(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchived

Archived Deltas are still accessible but can no longer be updated.

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchivedRequest;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchivedResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchivedRequest req = new PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchivedRequest(false, "ipsam", "vel", "alias");            

            PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchivedResponse res = sdk.delta.putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchived(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvId

Change the Environment of a Delta

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvIdRequest;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvIdRequest req = new PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvIdRequest("quasi", "non", "maiores", "enim");            

            PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvIdResponse res = sdk.delta.putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvId(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataName

Change the name of a Delta

### Example Usage

```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataNameRequest;
import demo_1.test_1.models.operations.PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataNameResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataNameRequest req = new PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataNameRequest("sint", "nulla", "deserunt", "esse");            

            PutOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataNameResponse res = sdk.delta.putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataName(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
