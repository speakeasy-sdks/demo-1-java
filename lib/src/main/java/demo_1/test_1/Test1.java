/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1;

import demo_1.test_1.utils.HTTPClient;
import demo_1.test_1.utils.SpeakeasyHTTPClient;

/**
 * # Introduction
 * The *Humanitec API* allows you to automate and integrate Humanitec into your developer and operational workflows.
 * The API is a REST based API. It is based around a set of concepts:
 * 
 * * Core
 * * External Resources
 * * Sets and Deltas
 * 
 * ## Authentication
 * Almost all requests made to the Humanitec API require Authentication. Humanitec provides 2 ways of authenticating with the API: `Bearer` and `JWT`.
 * 
 * ### Bearer Authentication
 * This form of authentication makes use of a **static token**. It is intended to be used when machines interact with the Humanitec API. Bearer tokens should be used for very narrow purposes. This allows for the token to be revoked if it is compromised and so limit the scope of exposure.
 * New Bearer tokens can be obtained via the UI:
 * 
 * 1. Log into Humanitec at https://app.humanitec.io
 * 1. Go to **Organization Settings**
 * 1. Select **API tokens**
 * 1. Enter a *name* for the new token and click on **Generate new token**
 * 
 * The token is passed to the API via the `Authorization` header. Assuming the issued token is `HUMANITEC_TOKEN`, the request could be made as follows:
 * 
 * ```
 *     curl -H 'Authorization: Bearer HUMANITEC_TOKEN' https://api.humanitec.io/orgs/my-org/apps
 * ```
 * 
 * ### JWT Authentication
 * This form of authentication makes use of a **JSON Web Token (JWT)**. It is intended to be used when humans interact with the Humanitec API. JWTs expire after a period of time. This means that a new JWT will need to be generated regularly. This makes them well suited to working in short sessions, but not for automation. (See Bearer Authentication.)
 * The token is passed to the API via the `Authorization` header. Assuming the issued token is `HUMANITEC_JWT`, the request could be made as follows:
 * 
 * ```
 *     curl -H 'Authorization: JWT HUMANITEC_JWT' https://api.humanitec.io/orgs/my-org/apps
 * ```
 * 
 * ## Content Types
 * All of the Humanitec API unless explicitly only accepts content types of `application/json` and will always return valid `application/json` or an empty response.
 * 
 * ## Response Codes
 * ### Success
 * Any response code in the `2xx` range should be regarded as success.
 * 
 * | **Code** | **Meaning** |
 * | --- | --- |
 * | `200` | Success |
 * | `201` | Success (In future, `201` will be replaced by `200`) |
 * | `204` | Success, but no content in response |
 * 
 * _Note: We plan to simplify the interface by replacing 201 with 200 status codes._
 * 
 * ### Failure
 * Any response code in the `4xx` should be regarded as an error which can be rectified by the client. `5xx` error codes indicate errors that cannot be corrected by the client.
 * 
 * | **Code** | **Meaning** |
 * | --- | --- |
 * | `400` | General error. (Body will contain details) |
 * | `401` | Attempt to access protected resource without `Authorization` Header. |
 * | `403` | The `Bearer` or `JWT` does not grant access to the requested resource. |
 * | `404` | Resource not found. |
 * | `405` | Method not allowed |
 * | `409` | Conflict. Usually indicated a resource with that ID already exists. |
 * | `422` | Unprocessable Entity. The body was not valid JSON, was empty or contained an object different from what was expected. |
 * | `429` | Too many requests - request rate limit has been reached. |
 * | `500` | Internal Error. If it occurs repeatedly, contact support. |
 * 
 * https://docs.humanitec.com - Find out more about how to use Humanitec in your every-day development work.
 */
public class Test1 {
	/**
	 * SERVERS contains the list of server urls available to the SDK.
	 */
	public static final String[] SERVERS = {
        "https://api.humanitec.io/",
	};
  	
    /**
     * Resource Account Types define cloud providers or protocols to which a resource account can belong.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/AccountTypeRequest" /&gt;
     * 
     */
    public AccountType accountType;
    /**
     * Active Resources represent the concrete resources provisioned for an Environment. They are provisioned on the first deployment after a dependency on a particular resource type is introduced into an Environment. In general, Active Resources are only deleted when their introductory Environment is deleted.
     * 
     * Active Resources are provisioned based on a Resource Definition. The Resource Definition describes how to provision a concrete resource based on a Resource Type and metadata about the Environment (for example the Environment Type or the Application ID). The criteria for how to choose a Resource Definition is known as a Matching Criteria. If the Matching Criteria changes or the Resource Definition is deleted, the concrete resource represented by an Active Resource might be deleted and reprovisioned when a deployment occurs in the Environment.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ActiveResourceRequest" /&gt;
     * 
     */
    public ActiveResource activeResource;
    /**
     * An Application is a collection of Workloads that work together. When deployed, all Workloads in an Application are deployed to the same namespace.
     * 
     * Apps are the root of the configuration tree holding Environments, Deployments, Shared Values, and Secrets.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ApplicationRequest" /&gt;
     * 
     */
    public Application application;
    /**
     * Artefacts can be registered with Humanitec. Continuous Integration (CI) pipelines notify Humanitec when a new version of an Artefact becomes available. Humanitec tracks the Artefact along with metadata about how it was built.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ArtefactRequest" /&gt;
     * 
     */
    public Artefact artefact;
    /**
     * An Artefact Version represents a particular version of an Artefact that can be added to an Application.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ArtefactVersionRequest" /&gt;
     * 
     */
    public ArtefactVersion artefactVersion;
    /**
     * An Automation Rule defining how and when artefacts in an environment should be updated.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/AutomationRuleRequest" /&gt;
     * 
     */
    public AutomationRule automationRule;
    /**
     * A Deployment Delta (or just "Delta") describes the changes that must be applied to one Deployment Set to generate another Deployment Set. Deployment Deltas are the only way to create new Deployment Sets.
     * 
     * Deployment Deltas can be created fully formed or combined together via PATCHing. They can also be generated from the difference between two Deployment Sets.
     * 
     * **Basic Structure**
     * 
     * ```
     *  {
     *    "id": &lt;ID of the Deployment Delta.&gt;,
     *    "metadata": {
     *      &lt;Properties such as who created the Delta, which Environment it is associated to and a Human-friendly name&gt;
     *    }
     *    "modules" : {
     *      "add" : {
     *        &lt;ID of Module to add to the Deployment Set&gt; : {
     *          &lt;An entire Modules object&gt;
     *        }
     *      },
     *      "remove": [
     *        &lt;An array of Module IDs that should be removed from the Deployment Set&gt;
     *      ],
     *     "update": {
     *        &lt;ID of Module already in the Set to be updated&gt; : [
     *          &lt;An array of JSON Patch (Search Results (RFC 6902) objects scoped to the module&gt;
     *        ]
     *      }
     *    }
     *  }
     * ```
     * &lt;SchemaDefinition schemaRef="#/components/schemas/DeltaRequest" /&gt;
     * 
     */
    public Delta delta;
    /**
     * Deployments represent updates to the running state of an Environment.
     * 
     * Deployments are made by applying _Deltas_ to a state defined by an existing Deployment. The Environment’s from_deploy property defines the Deployment. This Deployment is usually but not always in the current Environment. If the Deployment is from another Environment, the state of that Environment will be "cloned" into the current Environment with the option to apply a Delta.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/DeploymentRequest" /&gt;
     * 
     */
    public Deployment deployment;
    /**
     * DriverDefinition describes the resource driver.
     * 
     * Resource Drivers are code that fulfils the Humanitec Resource Driver Interface. This interface allows for certain actions to be performed on resources such as creation and destruction. Humanitec provides numerous Resource Drivers “out of the box”. It is also possible to use 3rd party Resource Drivers or write your own.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/DriverDefinitionRequest" /&gt;
     * 
     */
    public DriverDefinition driverDefinition;
    /**
     * Environments are independent spaces where Applications can run. An Application is always deployed into an Environment.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/EnvironmentRequest" /&gt;
     * 
     */
    public Environment environment;
    /**
     * Environment Types are a way of grouping and managing Environments. Every Environment has exactly 1 Environment Type.
     * 
     * Environment Types can be used with External Resources to manage where resources such as databases are provisioned or even which cluster to deploy to.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/EnvironmentTypeRequest" /&gt;
     * 
     */
    public EnvironmentType environmentType;
    /**
     * Webhook is a special type of a Job, it performs a HTTPS request to a specified URL with specified headers.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/WebhookRequest" /&gt;
     * 
     */
    public Event event;
    /**
     * DEPRECATED: This type exists for historical compatibility and should not be used. Please use the [Artefact API](https://api-docs.humanitec.com/#tag/Artefact) instead.
     * 
     * Container Images (known simply as Images) can be registered with Humanitec. Continuous Integration (CI) pipelines can then notify Humanitec when a new build of a Container Image becomes available. Humanitec tracks the Image along with metadata about how it was built.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ImageRequest" /&gt;
     * 
     */
    public Image image;
    /**
     * Matching Criteria are a set of rules used to choose which Resource Definition to use to provision a particular Resource Type.
     * 
     * Matching criteria are made up in order of specificity with least specific first:
     * 
     * - Environment Type (`env_type`)
     * 
     * - Application (`app_id`)
     * 
     * - Environment (`env_id`)
     * 
     * - Resource (`res_id`)
     * 
     * When selecting matching criteria, the most specific one is selected. In general, this means of all the Matching Criteria fully matching the context, the Matching Criteria Rule with the most specific element filled is chosen. If there is a tie, the next most specific elements are compared and so on until one is chosen.
     * 
     * **NOTE:**
     * 
     * Humanitec will reject the registration of matching criteria rules that duplicate rules already present for a Resource Type.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/MatchingCriteriaRequest" /&gt;
     * 
     */
    public MatchingCriteria matchingCriteria;
    /**
     * An Organization is the top level object in Humanitec. All other objects belong to an Organization.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/OrganizationRequest" /&gt;
     * 
     */
    public Organization organization;
    /**
     * Humanitec can be used to manage registry credentials. The Registry object represents how to match credentials to a particular registry.
     * 
     * Humanitec supports all Docker compatible registries as well as the custom authentication formats used by AWS Elastic Container Registry and Google Container Registry. It also supports the injection of a specific secret to be copied from an existing namespace in the cluster.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/RegistryRequest" /&gt;
     * 
     */
    public Registry registry;
    /**
     * ResourceAccount represents the account being used to access a resource.
     * 
     * Resource Accounts hold credentials that are required to provision and manage resources.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ResourceAccountRequest" /&gt;
     * 
     */
    public ResourceAccount resourceAccount;
    /**
     * A Resource Definitions describes how and when a resource should be provisioned. It links a driver (the how) along with a Matching Criteria (the when) to a Resource Type. This allows Humanitec to invoke a particular driver for the required Resource Type in the context of a particular Application and Environment.
     * 
     * The schema for the `driver_inputs` is defined by the `input_schema` property on the DriverDefinition identified by the `driver_type` property.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ResourceDefinitionRequest" /&gt;
     * 
     */
    public ResourceDefinition resourceDefinition;
    /**
     * Resources Types define the technology that Applications can have dependencies on.
     * 
     * Each Resource Type also defines a set of input parameters (`inputs_schema`), and a set of output data (`outputs_schema`). When provisioning a resource, these are treated as inputs and outputs respectively.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ResourceTypeRequest" /&gt;
     * 
     */
    public ResourceType resourceType;
    /**
     * RuntimeInfo object returned by the runtime endpoint. Represents a list post statuses grouped by modules and controllers (deployments and stateful sets).
     * &lt;SchemaDefinition schemaRef="#/components/schemas/RuntimeInfoRequest" /&gt;
     * 
     */
    public RuntimeInfo runtimeInfo;
    /**
     * A Deployment Set (or just "Set") defines all of the non-Environment specific configuration for Modules and External Resources. Each of these Modules or External Resources has a unique name.
     * 
     * Deployment Sets are immutable and their ID is a cryptographic hash of their content. This means that a Deployment Set can be globally identified based on its ID. It also means that referencing a Deployment Set by ID will always return the same Deployment Set.
     * 
     * Deployment Sets cannot be created directly, instead they are created by applying a Deployment Delta to an existing Deployment Set.
     * 
     * **Basic Structure**
     * 
     * ```
     *  {
     *    "id": &lt;ID of the Deployment Set&gt;,
     *    "modules" : {
     *      &lt;ID of Module&gt; : {
     *        "profile": &lt;Defines how the optional "spec" property is interpreted&gt;
     *        "spec": {
     *          &lt;Properties that depend on the "profile" property.&gt;
     *        }
     *        "externals": {
     *          &lt;External Resource Name&gt; : {
     *            "type": &lt;Resource Type&gt;,
     *            "params": {
     *              &lt;Properties which parametrize the resource depending on the Resource Type.&gt;
     *            }
     *          }
     *        }
     *      }
     *    }
     *  }
     * ```
     * 
     * For details about how the Humanitec provided profiles work, see (Deployment Set Profiles)[].
     * &lt;SchemaDefinition schemaRef="#/components/schemas/SetRequest" /&gt;
     * 
     */
    public Set set;
    public UserInvite userInvite;
    /**
     * UserProfile holds the profile information of a user
     * &lt;SchemaDefinition schemaRef="#/components/schemas/UserProfileRequest" /&gt;
     * 
     */
    public UserProfile userProfile;
    /**
     * UserRole holds the mapping of role to user for a particular object.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/UserRoleRequest" /&gt;
     * 
     */
    public UserRole userRole;
    /**
     * Shared Values can be used to manage variables and configuration that might vary between environments. They are also the way that secrets can be stored securely.
     * 
     * Shared Values are by default shared across all environments in an application. However, they can be overridden on an Environment by Environment basis.
     * 
     * For example: There might be 2 API keys that are used in an application. One development key used in the development and staging environments and another used for production. The development API key would be set at the Application level. The value would then be overridden at the Environment level for the production Environment.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ValueRequest" /&gt;
     * 
     */
    public Value value;
    /**
     * A Value Set Version can be used as a track record of Shared Values changes, to restore a previous version of a Shared Value or Value Set, or to purge a Shared Value if it shouldn't be accessible anymore.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/ValueSetVersionResponse" /&gt;
     * 
     */
    public ValueSetVersion valueSetVersion;
    /**
     * Workload Profiles provide the baseline configuration for Workloads in Applications in Humanitec. Developers can configure various features of a workload profile to suit their needs. Examples of features might be `schedules` used in Kubernetes CronJobs or `ingress` which might be used to expose Pods controlled by a Kubernetes Deployment.
     * 
     * Workloads in Humanitec are implemented as Helm Charts which must implement a specific schema.
     * &lt;SchemaDefinition schemaRef="#/components/schemas/WorkloadProfileRequest" /&gt;
     * 
     */
    public WorkloadProfile workloadProfile;
    public Public public_;	

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "1.6.1";
	private String _genVersion = "2.32.7";
	/**
	 * The Builder class allows the configuration of a new instance of the SDK.
	 */
	public static class Builder {
		private HTTPClient client;
		
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		/**
		 * Allows the default HTTP client to be overridden with a custom implementation.
		 * @param client The HTTP client to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL.
		 * @param serverUrl The server URL to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl) {
			this.serverUrl = serverUrl;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
		 * @param serverUrl The server URL to use for all requests.
		 * @param params The parameters to use when templating the URL.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.serverUrl = serverUrl;
			this.params = params;
			return this;
		}
		
		/**
		 * Builds a new instance of the SDK.
		 * @return The SDK instance.
		 * @throws Exception Thrown if the SDK could not be built.
		 */
		public Test1 build() throws Exception {
			return new Test1(this.client, this.serverUrl, this.params);
		}
	}

	/**
	 * Get a new instance of the SDK builder to configure a new instance of the SDK.
	 * @return The SDK builder instance.
	 */
	public static Builder builder() {
		return new Builder();
	}

	private Test1(HTTPClient client, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = demo_1.test_1.utils.Utils.templateUrl(serverUrl, params);
		}
		
		if (this._serverUrl == null) {
			this._serverUrl = SERVERS[0];
		}

		if (this._serverUrl.endsWith("/")) {
            this._serverUrl = this._serverUrl.substring(0, this._serverUrl.length() - 1);
        }

		
		
		this.accountType = new AccountType(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.activeResource = new ActiveResource(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.application = new Application(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.artefact = new Artefact(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.artefactVersion = new ArtefactVersion(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.automationRule = new AutomationRule(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.delta = new Delta(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.deployment = new Deployment(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.driverDefinition = new DriverDefinition(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.environment = new Environment(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.environmentType = new EnvironmentType(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.event = new Event(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.image = new Image(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.matchingCriteria = new MatchingCriteria(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.organization = new Organization(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.registry = new Registry(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.resourceAccount = new ResourceAccount(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.resourceDefinition = new ResourceDefinition(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.resourceType = new ResourceType(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.runtimeInfo = new RuntimeInfo(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.set = new Set(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.userInvite = new UserInvite(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.userProfile = new UserProfile(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.userRole = new UserRole(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.value = new Value(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.valueSetVersion = new ValueSetVersion(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.workloadProfile = new WorkloadProfile(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.public_ = new Public(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
	}
}