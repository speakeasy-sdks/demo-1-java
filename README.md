# test-1

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'demo_1.test_1:test-1:1.10.1'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import demo_1.test_1.Test1;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesAccountTypesRequest;
import demo_1.test_1.models.operations.GetOrgsOrgIdResourcesAccountTypesResponse;

public class Application {
    public static void main(String[] args) {
        try {
            Test1 sdk = Test1.builder()
                .build();

            GetOrgsOrgIdResourcesAccountTypesRequest req = new GetOrgsOrgIdResourcesAccountTypesRequest("corrupti");            

            GetOrgsOrgIdResourcesAccountTypesResponse res = sdk.accountType.getOrgsOrgIdResourcesAccountTypes(req);

            if (res.accountTypeResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [accountType](docs/sdks/accounttype/README.md)

* [getOrgsOrgIdResourcesAccountTypes](docs/sdks/accounttype/README.md#getorgsorgidresourcesaccounttypes) - List Resource Account Types available to the organization.

### [activeResource](docs/sdks/activeresource/README.md)

* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResId](docs/sdks/activeresource/README.md#deleteorgsorgidappsappidenvsenvidresourcestyperesid) - Delete Active Resources.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdResources](docs/sdks/activeresource/README.md#getorgsorgidappsappidenvsenvidresources) - List Active Resources provisioned in an environment.
* [getOrgsOrgIdResourcesDefsDefIdResources](docs/sdks/activeresource/README.md#getorgsorgidresourcesdefsdefidresources) - List Active Resources provisioned via a specific Resource Definition.

### [application](docs/sdks/application/README.md)

* [deleteOrgsOrgIdAppsAppId](docs/sdks/application/README.md#deleteorgsorgidappsappid) - Delete an Application
* [getOrgsOrgIdApps](docs/sdks/application/README.md#getorgsorgidapps) - List all Applications in an Organization.
* [getOrgsOrgIdAppsAppId](docs/sdks/application/README.md#getorgsorgidappsappid) - Get an existing Application
* [postOrgsOrgIdApps](docs/sdks/application/README.md#postorgsorgidapps) - Add a new Application to an Organization

### [artefact](docs/sdks/artefact/README.md)

* [deleteOrgsOrgIdArtefactsArtefactId](docs/sdks/artefact/README.md#deleteorgsorgidartefactsartefactid) - Delete Artefact and all related Artefact Versions
* [getOrgsOrgIdArtefacts](docs/sdks/artefact/README.md#getorgsorgidartefacts) - List all Artefacts.

### [artefactVersion](docs/sdks/artefactversion/README.md)

* [getOrgsOrgIdArtefactVersions](docs/sdks/artefactversion/README.md#getorgsorgidartefactversions) - List all Artefacts Versions.
* [getOrgsOrgIdArtefactVersionsArtefactVersionId](docs/sdks/artefactversion/README.md#getorgsorgidartefactversionsartefactversionid) - Get an Artefacts Versions.
* [getOrgsOrgIdArtefactsArtefactIdVersions](docs/sdks/artefactversion/README.md#getorgsorgidartefactsartefactidversions) - List all Artefact Versions of an Artefact.
* [patchOrgsOrgIdArtefactsArtefactIdVersionsVersionId](docs/sdks/artefactversion/README.md#patchorgsorgidartefactsartefactidversionsversionid) - Update Version of an Artefact.
* [postOrgsOrgIdArtefactVersions](docs/sdks/artefactversion/README.md#postorgsorgidartefactversions) - Register a new Artefact Version with your organization.

### [automationRule](docs/sdks/automationrule/README.md)

* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](docs/sdks/automationrule/README.md#deleteorgsorgidappsappidenvsenvidrulesruleid) - Delete Automation Rule from an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdRules](docs/sdks/automationrule/README.md#getorgsorgidappsappidenvsenvidrules) - List all Automation Rules in an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](docs/sdks/automationrule/README.md#getorgsorgidappsappidenvsenvidrulesruleid) - Get a specific Automation Rule for an Environment.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdRules](docs/sdks/automationrule/README.md#postorgsorgidappsappidenvsenvidrules) - Create a new Automation Rule for an Environment.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](docs/sdks/automationrule/README.md#putorgsorgidappsappidenvsenvidrulesruleid) - Update an existing Automation Rule for an Environment.

### [delta](docs/sdks/delta/README.md)

* [getDelta](docs/sdks/delta/README.md#getdelta) - Fetch an existing Delta
* [getOrgsOrgIdAppsAppIdDeltas](docs/sdks/delta/README.md#getorgsorgidappsappiddeltas) - List Deltas in an Application
* [patchOrgsOrgIdAppsAppIdDeltasDeltaId](docs/sdks/delta/README.md#patchorgsorgidappsappiddeltasdeltaid) - Update an existing Delta
* [postOrgsOrgIdAppsAppIdDeltas](docs/sdks/delta/README.md#postorgsorgidappsappiddeltas) - Create a new Delta
* [putDelta](docs/sdks/delta/README.md#putdelta) - Update an existing Delta
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchived](docs/sdks/delta/README.md#putorgsorgidappsappiddeltasdeltaidmetadataarchived) - Mark a Delta as "archived"
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvId](docs/sdks/delta/README.md#putorgsorgidappsappiddeltasdeltaidmetadataenvid) - Change the Environment of a Delta
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataName](docs/sdks/delta/README.md#putorgsorgidappsappiddeltasdeltaidmetadataname) - Change the name of a Delta

### [deployment](docs/sdks/deployment/README.md)

* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploys](docs/sdks/deployment/README.md#getorgsorgidappsappidenvsenviddeploys) - List Deployments in an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployId](docs/sdks/deployment/README.md#getorgsorgidappsappidenvsenviddeploysdeployid) - Get a specific Deployment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrors](docs/sdks/deployment/README.md#getorgsorgidappsappidenvsenviddeploysdeployiderrors) - List errors that occurred in a Deployment.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdDeploys](docs/sdks/deployment/README.md#postorgsorgidappsappidenvsenviddeploys) - Start a new Deployment.

### [driverDefinition](docs/sdks/driverdefinition/README.md)

* [deleteOrgsOrgIdResourcesDriversDriverId](docs/sdks/driverdefinition/README.md#deleteorgsorgidresourcesdriversdriverid) - Delete a Resources Driver.
* [getOrgsOrgIdResourcesDrivers](docs/sdks/driverdefinition/README.md#getorgsorgidresourcesdrivers) - List Resource Drivers.
* [getOrgsOrgIdResourcesDriversDriverId](docs/sdks/driverdefinition/README.md#getorgsorgidresourcesdriversdriverid) - Get a Resource Driver.
* [postOrgsOrgIdResourcesDrivers](docs/sdks/driverdefinition/README.md#postorgsorgidresourcesdrivers) - Register a new Resource Driver.
* [putOrgsOrgIdResourcesDriversDriverId](docs/sdks/driverdefinition/README.md#putorgsorgidresourcesdriversdriverid) - Update a Resource Driver.

### [environment](docs/sdks/environment/README.md)

* [deleteOrgsOrgIdAppsAppIdEnvsEnvId](docs/sdks/environment/README.md#deleteorgsorgidappsappidenvsenvid) - Delete a specific Environment.
* [getOrgsOrgIdAppsAppIdEnvs](docs/sdks/environment/README.md#getorgsorgidappsappidenvs) - List all Environments.
* [getOrgsOrgIdAppsAppIdEnvsEnvId](docs/sdks/environment/README.md#getorgsorgidappsappidenvsenvid) - Get a specific Environment.
* [postOrgsOrgIdAppsAppIdEnvs](docs/sdks/environment/README.md#postorgsorgidappsappidenvs) - Add a new Environment to an Application.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdFromDeployId](docs/sdks/environment/README.md#putorgsorgidappsappidenvsenvidfromdeployid) - Rebase to a different Deployment.

### [environmentType](docs/sdks/environmenttype/README.md)

* [deleteOrgsOrgIdEnvTypesEnvTypeId](docs/sdks/environmenttype/README.md#deleteorgsorgidenvtypesenvtypeid) - Deletes an Environment Type
* [getOrgsOrgIdEnvTypes](docs/sdks/environmenttype/README.md#getorgsorgidenvtypes) - List all Environment Types
* [getOrgsOrgIdEnvTypesEnvTypeId](docs/sdks/environmenttype/README.md#getorgsorgidenvtypesenvtypeid) - Get an Environment Type
* [postOrgsOrgIdEnvTypes](docs/sdks/environmenttype/README.md#postorgsorgidenvtypes) - Add a new Environment Type

### [event](docs/sdks/event/README.md)

* [deleteOrgsOrgIdAppsAppIdJobs](docs/sdks/event/README.md#deleteorgsorgidappsappidjobs) - Deletes all Jobs for the Application
* [deleteOrgsOrgIdAppsAppIdWebhooksJobId](docs/sdks/event/README.md#deleteorgsorgidappsappidwebhooksjobid) - Delete a Webhook
* [getOrgsOrgIdAppsAppIdWebhooks](docs/sdks/event/README.md#getorgsorgidappsappidwebhooks) - List Webhooks
* [getOrgsOrgIdAppsAppIdWebhooksJobId](docs/sdks/event/README.md#getorgsorgidappsappidwebhooksjobid) - Get a Webhook
* [getOrgsOrgIdEvents](docs/sdks/event/README.md#getorgsorgidevents) - List Events
* [postOrgsOrgIdAppsAppIdWebhooks](docs/sdks/event/README.md#postorgsorgidappsappidwebhooks) - Create a new Webhook
* [postOrgsOrgIdAppsAppIdWebhooksJobId](docs/sdks/event/README.md#postorgsorgidappsappidwebhooksjobid) - Update a Webhook

### [image](docs/sdks/image/README.md)

* [getOrgsOrgIdImages](docs/sdks/image/README.md#getorgsorgidimages) - List all Container Images
* [getOrgsOrgIdImagesImageId](docs/sdks/image/README.md#getorgsorgidimagesimageid) - Get a specific Image Object
* [getOrgsOrgIdImagesImageIdBuilds](docs/sdks/image/README.md#getorgsorgidimagesimageidbuilds) - Lists all the Builds of an Image
* [postOrgsOrgIdImagesImageIdBuilds](docs/sdks/image/README.md#postorgsorgidimagesimageidbuilds) - Add a new Image Build

### [matchingCriteria](docs/sdks/matchingcriteria/README.md)

* [deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId](docs/sdks/matchingcriteria/README.md#deleteorgsorgidresourcesdefsdefidcriteriacriteriaid) - Delete a Matching Criteria from a Resource Definition.
* [postOrgsOrgIdResourcesDefsDefIdCriteria](docs/sdks/matchingcriteria/README.md#postorgsorgidresourcesdefsdefidcriteria) - Add a new Matching Criteria to a Resource Definition.

### [organization](docs/sdks/organization/README.md)

* [getOrgs](docs/sdks/organization/README.md#getorgs) - List active organizations the user has access to.
* [getOrgsOrgId](docs/sdks/organization/README.md#getorgsorgid) - Get the specified Organization.

### [registry](docs/sdks/registry/README.md)

* [deleteOrgsOrgIdRegistriesRegId](docs/sdks/registry/README.md#deleteorgsorgidregistriesregid) - Deletes an existing registry record and all associated credentials and secrets.
* [getOrgsOrgIdRegistries](docs/sdks/registry/README.md#getorgsorgidregistries) - Lists available registries for the organization.
* [getOrgsOrgIdRegistriesRegId](docs/sdks/registry/README.md#getorgsorgidregistriesregid) - Loads a registry record details.
* [getOrgsOrgIdRegistriesRegIdCreds](docs/sdks/registry/README.md#getorgsorgidregistriesregidcreds) - Returns current account credentials or secret details for the registry.
* [patchOrgsOrgIdRegistriesRegId](docs/sdks/registry/README.md#patchorgsorgidregistriesregid) - Updates (patches) an existing registry record.
* [postOrgsOrgIdRegistries](docs/sdks/registry/README.md#postorgsorgidregistries) - Creates a new registry record.

### [resourceAccount](docs/sdks/resourceaccount/README.md)

* [getOrgsOrgIdResourcesAccounts](docs/sdks/resourceaccount/README.md#getorgsorgidresourcesaccounts) - List Resource Accounts in the organization.
* [getOrgsOrgIdResourcesAccountsAccId](docs/sdks/resourceaccount/README.md#getorgsorgidresourcesaccountsaccid) - Get a Resource Account.
* [patchOrgsOrgIdResourcesAccountsAccId](docs/sdks/resourceaccount/README.md#patchorgsorgidresourcesaccountsaccid) - Update a Resource Account.
* [postOrgsOrgIdResourcesAccounts](docs/sdks/resourceaccount/README.md#postorgsorgidresourcesaccounts) - Create a new Resource Account in the organization.

### [resourceDefinition](docs/sdks/resourcedefinition/README.md)

* [deleteOrgsOrgIdResourcesDefsDefId](docs/sdks/resourcedefinition/README.md#deleteorgsorgidresourcesdefsdefid) - Delete a Resource Definition.
* [deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId](docs/sdks/resourcedefinition/README.md#deleteorgsorgidresourcesdefsdefidcriteriacriteriaid) - Delete a Matching Criteria from a Resource Definition.
* [getOrgsOrgIdResourcesDefs](docs/sdks/resourcedefinition/README.md#getorgsorgidresourcesdefs) - List Resource Definitions.
* [getOrgsOrgIdResourcesDefsDefId](docs/sdks/resourcedefinition/README.md#getorgsorgidresourcesdefsdefid) - Get a specific Resource Definition.
* [getOrgsOrgIdResourcesDefsDefIdResources](docs/sdks/resourcedefinition/README.md#getorgsorgidresourcesdefsdefidresources) - List Active Resources provisioned via a specific Resource Definition.
* [patchOrgsOrgIdResourcesDefsDefId](docs/sdks/resourcedefinition/README.md#patchorgsorgidresourcesdefsdefid) - Update a Resource Definition.
* [postOrgsOrgIdResourcesDefs](docs/sdks/resourcedefinition/README.md#postorgsorgidresourcesdefs) - Create a new Resource Definition.
* [postOrgsOrgIdResourcesDefsDefIdCriteria](docs/sdks/resourcedefinition/README.md#postorgsorgidresourcesdefsdefidcriteria) - Add a new Matching Criteria to a Resource Definition.
* [putOrgsOrgIdResourcesDefsDefId](docs/sdks/resourcedefinition/README.md#putorgsorgidresourcesdefsdefid) - Update a Resource Definition.

### [resourceType](docs/sdks/resourcetype/README.md)

* [getOrgsOrgIdResourcesTypes](docs/sdks/resourcetype/README.md#getorgsorgidresourcestypes) - List Resource Types.

### [runtimeInfo](docs/sdks/runtimeinfo/README.md)

* [getOrgsOrgIdAppsAppIdEnvsEnvIdRuntime](docs/sdks/runtimeinfo/README.md#getorgsorgidappsappidenvsenvidruntime) - Get Runtime information about the environment.
* [getOrgsOrgIdAppsAppIdRuntime](docs/sdks/runtimeinfo/README.md#getorgsorgidappsappidruntime) - Get Runtime information about specific environments.
* [patchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicas](docs/sdks/runtimeinfo/README.md#patchorgsorgidappsappidenvsenvidruntimereplicas) - Set number of replicas for an environment's modules.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePaused](docs/sdks/runtimeinfo/README.md#putorgsorgidappsappidenvsenvidruntimepaused) - Pause / Resume an environment.

### [set](docs/sdks/set/README.md)

* [getSets](docs/sdks/set/README.md#getsets) - Get all Deployment Sets
* [getOrgsOrgIdAppsAppIdSetsSetId](docs/sdks/set/README.md#getorgsorgidappsappidsetssetid) - Get a Deployment Set
* [getOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetId](docs/sdks/set/README.md#getorgsorgidappsappidsetssetiddiffsourcesetid) - Get the difference between 2 Deployment Sets
* [postOrgsOrgIdAppsAppIdSetsSetId](docs/sdks/set/README.md#postorgsorgidappsappidsetssetid) - Apply a Deployment Delta to a Deployment Set

### [userInvite](docs/sdks/userinvite/README.md)

* [getOrgsOrgIdInvitations](docs/sdks/userinvite/README.md#getorgsorgidinvitations) - List the invites issued for the organization.

### [userProfile](docs/sdks/userprofile/README.md)

* [deleteTokensTokenId](docs/sdks/userprofile/README.md#deletetokenstokenid) - DEPRECATED
* [getCurrentUser](docs/sdks/userprofile/README.md#getcurrentuser) - Gets the extended profile of the current user
* [getTokens](docs/sdks/userprofile/README.md#gettokens) - DEPRECATED
* [getUsersMe](docs/sdks/userprofile/README.md#getusersme) - DEPRECATED
* [patchCurrentUser](docs/sdks/userprofile/README.md#patchcurrentuser) - Updates the extended profile of the current user.
* [postOrgsOrgIdUsers](docs/sdks/userprofile/README.md#postorgsorgidusers) - Creates a new service user.

### [userRole](docs/sdks/userrole/README.md)

* [deleteOrgsOrgIdAppsAppIdUsersUserId](docs/sdks/userrole/README.md#deleteorgsorgidappsappidusersuserid) - Remove the role of a User on an Application
* [deleteOrgsOrgIdEnvTypesEnvTypeUsersUserId](docs/sdks/userrole/README.md#deleteorgsorgidenvtypesenvtypeusersuserid) - Remove the role of a User on an Environment Type
* [deleteOrgsOrgIdUsersUserId](docs/sdks/userrole/README.md#deleteorgsorgidusersuserid) - Remove the role of a User on an Organization
* [getOrgsOrgIdAppsAppIdUsers](docs/sdks/userrole/README.md#getorgsorgidappsappidusers) - List Users with roles in an App
* [getOrgsOrgIdAppsAppIdUsersUserId](docs/sdks/userrole/README.md#getorgsorgidappsappidusersuserid) - Get the role of a User on an Application
* [getOrgsOrgIdEnvTypesEnvTypeUsersUserId](docs/sdks/userrole/README.md#getorgsorgidenvtypesenvtypeusersuserid) - Get the role of a User on an Environment Type
* [getOrgsOrgIdUsers](docs/sdks/userrole/README.md#getorgsorgidusers) - List Users with roles in an Organization
* [getOrgsOrgIdUsersUserId](docs/sdks/userrole/README.md#getorgsorgidusersuserid) - Get the role of a User on an Organization
* [patchOrgsOrgIdAppsAppIdUsersUserId](docs/sdks/userrole/README.md#patchorgsorgidappsappidusersuserid) - Update the role of a User on an Application
* [patchOrgsOrgIdEnvTypesEnvTypeUsersUserId](docs/sdks/userrole/README.md#patchorgsorgidenvtypesenvtypeusersuserid) - Update the role of a User on an Environment Type
* [patchOrgsOrgIdUsersUserId](docs/sdks/userrole/README.md#patchorgsorgidusersuserid) - Update the role of a User on an Organization
* [postOrgsOrgIdAppsAppIdUsers](docs/sdks/userrole/README.md#postorgsorgidappsappidusers) - Adds a User to an Application with a Role
* [postOrgsOrgIdEnvTypesEnvTypeUsers](docs/sdks/userrole/README.md#postorgsorgidenvtypesenvtypeusers) - Adds a User to an Environment Type with a Role
* [postOrgsOrgIdInvitations](docs/sdks/userrole/README.md#postorgsorgidinvitations) - Invites a user to an Organization with a specified role.

### [value](docs/sdks/value/README.md)

* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdValues](docs/sdks/value/README.md#deleteorgsorgidappsappidenvsenvidvalues) - Delete all Shared Value for an Environment
* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](docs/sdks/value/README.md#deleteorgsorgidappsappidenvsenvidvalueskey) - Delete Shared Value for an Environment
* [deleteOrgsOrgIdAppsAppIdValues](docs/sdks/value/README.md#deleteorgsorgidappsappidvalues) - Delete all Shared Value for an App
* [deleteOrgsOrgIdAppsAppIdValuesKey](docs/sdks/value/README.md#deleteorgsorgidappsappidvalueskey) - Delete Shared Value for an Application
* [getOrgsOrgIdAppsAppIdEnvsEnvIdValues](docs/sdks/value/README.md#getorgsorgidappsappidenvsenvidvalues) - List Shared Values in an Environment
* [getOrgsOrgIdAppsAppIdValues](docs/sdks/value/README.md#getorgsorgidappsappidvalues) - List Shared Values in an Application
* [patchOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](docs/sdks/value/README.md#patchorgsorgidappsappidenvsenvidvalueskey) - Update Shared Value for an Environment
* [patchOrgsOrgIdAppsAppIdValuesKey](docs/sdks/value/README.md#patchorgsorgidappsappidvalueskey) - Update Shared Value for an Application
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValues](docs/sdks/value/README.md#postorgsorgidappsappidenvsenvidvalues) - Create a Shared Value for an Environment
* [postOrgsOrgIdAppsAppIdValues](docs/sdks/value/README.md#postorgsorgidappsappidvalues) - Create a Shared Value for an Application
* [putOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](docs/sdks/value/README.md#putorgsorgidappsappidenvsenvidvalueskey) - Update Shared Value for an Environment
* [putOrgsOrgIdAppsAppIdValuesKey](docs/sdks/value/README.md#putorgsorgidappsappidvalueskey) - Update Shared Value for an Application

### [valueSetVersion](docs/sdks/valuesetversion/README.md)

* [getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersions](docs/sdks/valuesetversion/README.md#getorgsorgidappsappidenvsenvidvaluesetversions) - List Value Set Versions in an Environment of an App
* [getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionId](docs/sdks/valuesetversion/README.md#getorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionid) - Get a single Value Set Version in an Environment of an App
* [getOrgsOrgIdAppsAppIdValueSetVersions](docs/sdks/valuesetversion/README.md#getorgsorgidappsappidvaluesetversions) - List Value Set Versions in the App
* [getOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionId](docs/sdks/valuesetversion/README.md#getorgsorgidappsappidvaluesetversionsvaluesetversionid) - Get a single Value Set Version from the App
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdPurgeKey](docs/sdks/valuesetversion/README.md#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidpurgekey) - Purge the value of a specific Shared Value from the App Environment Version history.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestore](docs/sdks/valuesetversion/README.md#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidrestore) - Restore a Value Set Version in an Environment of an App
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKey](docs/sdks/valuesetversion/README.md#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidrestorekey) - Restore a specific key from the Value Set Version in an Environment of an App
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdPurgeKey](docs/sdks/valuesetversion/README.md#postorgsorgidappsappidvaluesetversionsvaluesetversionidpurgekey) - Purge the value of a specific Shared Value from the App Version history.
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestore](docs/sdks/valuesetversion/README.md#postorgsorgidappsappidvaluesetversionsvaluesetversionidrestore) - Restore a Value Set Version in an App
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreKey](docs/sdks/valuesetversion/README.md#postorgsorgidappsappidvaluesetversionsvaluesetversionidrestorekey) - Restore a specific key from the Value Set Version in an App

### [workloadProfile](docs/sdks/workloadprofile/README.md)

* [deleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersion](docs/sdks/workloadprofile/README.md#deleteorgsorgidworkloadprofilesprofileidversionsversion) - Delete a Workload Profile Version
* [deleteOrgsOrgIdWorkloadProfilesProfileQid](docs/sdks/workloadprofile/README.md#deleteorgsorgidworkloadprofilesprofileqid) - Delete a Workload Profile
* [getOrgsOrgIdWorkloadProfiles](docs/sdks/workloadprofile/README.md#getorgsorgidworkloadprofiles) - List workload profiles available to the organization.
* [getOrgsOrgIdWorkloadProfilesProfileQid](docs/sdks/workloadprofile/README.md#getorgsorgidworkloadprofilesprofileqid) - Get a Workload Profile
* [getOrgsOrgIdWorkloadProfilesProfileQidVersions](docs/sdks/workloadprofile/README.md#getorgsorgidworkloadprofilesprofileqidversions) - List versions of the given workload profile with optional constraint.
* [postOrgsOrgIdWorkloadProfiles](docs/sdks/workloadprofile/README.md#postorgsorgidworkloadprofiles) - Create new Workload Profile
* [postOrgsOrgIdWorkloadProfilesProfileQidVersions](docs/sdks/workloadprofile/README.md#postorgsorgidworkloadprofilesprofileqidversions) - Add new Version of the Workload Profile

### [public_](docs/sdks/public/README.md)

* [deleteOrgsOrgIdAppsAppId](docs/sdks/public/README.md#deleteorgsorgidappsappid) - Delete an Application
* [deleteOrgsOrgIdAppsAppIdEnvsEnvId](docs/sdks/public/README.md#deleteorgsorgidappsappidenvsenvid) - Delete a specific Environment.
* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResId](docs/sdks/public/README.md#deleteorgsorgidappsappidenvsenvidresourcestyperesid) - Delete Active Resources.
* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](docs/sdks/public/README.md#deleteorgsorgidappsappidenvsenvidrulesruleid) - Delete Automation Rule from an Environment.
* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdValues](docs/sdks/public/README.md#deleteorgsorgidappsappidenvsenvidvalues) - Delete all Shared Value for an Environment
* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](docs/sdks/public/README.md#deleteorgsorgidappsappidenvsenvidvalueskey) - Delete Shared Value for an Environment
* [deleteOrgsOrgIdAppsAppIdJobs](docs/sdks/public/README.md#deleteorgsorgidappsappidjobs) - Deletes all Jobs for the Application
* [deleteOrgsOrgIdAppsAppIdUsersUserId](docs/sdks/public/README.md#deleteorgsorgidappsappidusersuserid) - Remove the role of a User on an Application
* [deleteOrgsOrgIdAppsAppIdValues](docs/sdks/public/README.md#deleteorgsorgidappsappidvalues) - Delete all Shared Value for an App
* [deleteOrgsOrgIdAppsAppIdValuesKey](docs/sdks/public/README.md#deleteorgsorgidappsappidvalueskey) - Delete Shared Value for an Application
* [deleteOrgsOrgIdAppsAppIdWebhooksJobId](docs/sdks/public/README.md#deleteorgsorgidappsappidwebhooksjobid) - Delete a Webhook
* [deleteOrgsOrgIdArtefactsArtefactId](docs/sdks/public/README.md#deleteorgsorgidartefactsartefactid) - Delete Artefact and all related Artefact Versions
* [deleteOrgsOrgIdEnvTypesEnvTypeId](docs/sdks/public/README.md#deleteorgsorgidenvtypesenvtypeid) - Deletes an Environment Type
* [deleteOrgsOrgIdEnvTypesEnvTypeUsersUserId](docs/sdks/public/README.md#deleteorgsorgidenvtypesenvtypeusersuserid) - Remove the role of a User on an Environment Type
* [deleteOrgsOrgIdRegistriesRegId](docs/sdks/public/README.md#deleteorgsorgidregistriesregid) - Deletes an existing registry record and all associated credentials and secrets.
* [deleteOrgsOrgIdResourcesDefsDefId](docs/sdks/public/README.md#deleteorgsorgidresourcesdefsdefid) - Delete a Resource Definition.
* [deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId](docs/sdks/public/README.md#deleteorgsorgidresourcesdefsdefidcriteriacriteriaid) - Delete a Matching Criteria from a Resource Definition.
* [deleteOrgsOrgIdResourcesDriversDriverId](docs/sdks/public/README.md#deleteorgsorgidresourcesdriversdriverid) - Delete a Resources Driver.
* [deleteOrgsOrgIdUsersUserId](docs/sdks/public/README.md#deleteorgsorgidusersuserid) - Remove the role of a User on an Organization
* [deleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersion](docs/sdks/public/README.md#deleteorgsorgidworkloadprofilesprofileidversionsversion) - Delete a Workload Profile Version
* [deleteOrgsOrgIdWorkloadProfilesProfileQid](docs/sdks/public/README.md#deleteorgsorgidworkloadprofilesprofileqid) - Delete a Workload Profile
* [deleteTokensTokenId](docs/sdks/public/README.md#deletetokenstokenid) - DEPRECATED
* [getDelta](docs/sdks/public/README.md#getdelta) - Fetch an existing Delta
* [getSets](docs/sdks/public/README.md#getsets) - Get all Deployment Sets
* [getCurrentUser](docs/sdks/public/README.md#getcurrentuser) - Gets the extended profile of the current user
* [getOrgs](docs/sdks/public/README.md#getorgs) - List active organizations the user has access to.
* [getOrgsOrgId](docs/sdks/public/README.md#getorgsorgid) - Get the specified Organization.
* [getOrgsOrgIdApps](docs/sdks/public/README.md#getorgsorgidapps) - List all Applications in an Organization.
* [getOrgsOrgIdAppsAppId](docs/sdks/public/README.md#getorgsorgidappsappid) - Get an existing Application
* [getOrgsOrgIdAppsAppIdDeltas](docs/sdks/public/README.md#getorgsorgidappsappiddeltas) - List Deltas in an Application
* [getOrgsOrgIdAppsAppIdEnvs](docs/sdks/public/README.md#getorgsorgidappsappidenvs) - List all Environments.
* [getOrgsOrgIdAppsAppIdEnvsEnvId](docs/sdks/public/README.md#getorgsorgidappsappidenvsenvid) - Get a specific Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploys](docs/sdks/public/README.md#getorgsorgidappsappidenvsenviddeploys) - List Deployments in an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployId](docs/sdks/public/README.md#getorgsorgidappsappidenvsenviddeploysdeployid) - Get a specific Deployment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrors](docs/sdks/public/README.md#getorgsorgidappsappidenvsenviddeploysdeployiderrors) - List errors that occurred in a Deployment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdResources](docs/sdks/public/README.md#getorgsorgidappsappidenvsenvidresources) - List Active Resources provisioned in an environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdRules](docs/sdks/public/README.md#getorgsorgidappsappidenvsenvidrules) - List all Automation Rules in an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](docs/sdks/public/README.md#getorgsorgidappsappidenvsenvidrulesruleid) - Get a specific Automation Rule for an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdRuntime](docs/sdks/public/README.md#getorgsorgidappsappidenvsenvidruntime) - Get Runtime information about the environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersions](docs/sdks/public/README.md#getorgsorgidappsappidenvsenvidvaluesetversions) - List Value Set Versions in an Environment of an App
* [getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionId](docs/sdks/public/README.md#getorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionid) - Get a single Value Set Version in an Environment of an App
* [getOrgsOrgIdAppsAppIdEnvsEnvIdValues](docs/sdks/public/README.md#getorgsorgidappsappidenvsenvidvalues) - List Shared Values in an Environment
* [getOrgsOrgIdAppsAppIdRuntime](docs/sdks/public/README.md#getorgsorgidappsappidruntime) - Get Runtime information about specific environments.
* [getOrgsOrgIdAppsAppIdSetsSetId](docs/sdks/public/README.md#getorgsorgidappsappidsetssetid) - Get a Deployment Set
* [getOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetId](docs/sdks/public/README.md#getorgsorgidappsappidsetssetiddiffsourcesetid) - Get the difference between 2 Deployment Sets
* [getOrgsOrgIdAppsAppIdUsers](docs/sdks/public/README.md#getorgsorgidappsappidusers) - List Users with roles in an App
* [getOrgsOrgIdAppsAppIdUsersUserId](docs/sdks/public/README.md#getorgsorgidappsappidusersuserid) - Get the role of a User on an Application
* [getOrgsOrgIdAppsAppIdValueSetVersions](docs/sdks/public/README.md#getorgsorgidappsappidvaluesetversions) - List Value Set Versions in the App
* [getOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionId](docs/sdks/public/README.md#getorgsorgidappsappidvaluesetversionsvaluesetversionid) - Get a single Value Set Version from the App
* [getOrgsOrgIdAppsAppIdValues](docs/sdks/public/README.md#getorgsorgidappsappidvalues) - List Shared Values in an Application
* [getOrgsOrgIdAppsAppIdWebhooks](docs/sdks/public/README.md#getorgsorgidappsappidwebhooks) - List Webhooks
* [getOrgsOrgIdAppsAppIdWebhooksJobId](docs/sdks/public/README.md#getorgsorgidappsappidwebhooksjobid) - Get a Webhook
* [getOrgsOrgIdArtefactVersions](docs/sdks/public/README.md#getorgsorgidartefactversions) - List all Artefacts Versions.
* [getOrgsOrgIdArtefactVersionsArtefactVersionId](docs/sdks/public/README.md#getorgsorgidartefactversionsartefactversionid) - Get an Artefacts Versions.
* [getOrgsOrgIdArtefacts](docs/sdks/public/README.md#getorgsorgidartefacts) - List all Artefacts.
* [getOrgsOrgIdArtefactsArtefactIdVersions](docs/sdks/public/README.md#getorgsorgidartefactsartefactidversions) - List all Artefact Versions of an Artefact.
* [getOrgsOrgIdEnvTypes](docs/sdks/public/README.md#getorgsorgidenvtypes) - List all Environment Types
* [getOrgsOrgIdEnvTypesEnvTypeId](docs/sdks/public/README.md#getorgsorgidenvtypesenvtypeid) - Get an Environment Type
* [getOrgsOrgIdEnvTypesEnvTypeUsersUserId](docs/sdks/public/README.md#getorgsorgidenvtypesenvtypeusersuserid) - Get the role of a User on an Environment Type
* [getOrgsOrgIdEvents](docs/sdks/public/README.md#getorgsorgidevents) - List Events
* [getOrgsOrgIdImages](docs/sdks/public/README.md#getorgsorgidimages) - List all Container Images
* [getOrgsOrgIdImagesImageId](docs/sdks/public/README.md#getorgsorgidimagesimageid) - Get a specific Image Object
* [getOrgsOrgIdImagesImageIdBuilds](docs/sdks/public/README.md#getorgsorgidimagesimageidbuilds) - Lists all the Builds of an Image
* [getOrgsOrgIdInvitations](docs/sdks/public/README.md#getorgsorgidinvitations) - List the invites issued for the organization.
* [getOrgsOrgIdRegistries](docs/sdks/public/README.md#getorgsorgidregistries) - Lists available registries for the organization.
* [getOrgsOrgIdRegistriesRegId](docs/sdks/public/README.md#getorgsorgidregistriesregid) - Loads a registry record details.
* [getOrgsOrgIdRegistriesRegIdCreds](docs/sdks/public/README.md#getorgsorgidregistriesregidcreds) - Returns current account credentials or secret details for the registry.
* [getOrgsOrgIdResourcesAccountTypes](docs/sdks/public/README.md#getorgsorgidresourcesaccounttypes) - List Resource Account Types available to the organization.
* [getOrgsOrgIdResourcesAccounts](docs/sdks/public/README.md#getorgsorgidresourcesaccounts) - List Resource Accounts in the organization.
* [getOrgsOrgIdResourcesAccountsAccId](docs/sdks/public/README.md#getorgsorgidresourcesaccountsaccid) - Get a Resource Account.
* [getOrgsOrgIdResourcesDefs](docs/sdks/public/README.md#getorgsorgidresourcesdefs) - List Resource Definitions.
* [getOrgsOrgIdResourcesDefsDefId](docs/sdks/public/README.md#getorgsorgidresourcesdefsdefid) - Get a specific Resource Definition.
* [getOrgsOrgIdResourcesDefsDefIdResources](docs/sdks/public/README.md#getorgsorgidresourcesdefsdefidresources) - List Active Resources provisioned via a specific Resource Definition.
* [getOrgsOrgIdResourcesDrivers](docs/sdks/public/README.md#getorgsorgidresourcesdrivers) - List Resource Drivers.
* [getOrgsOrgIdResourcesDriversDriverId](docs/sdks/public/README.md#getorgsorgidresourcesdriversdriverid) - Get a Resource Driver.
* [getOrgsOrgIdResourcesTypes](docs/sdks/public/README.md#getorgsorgidresourcestypes) - List Resource Types.
* [getOrgsOrgIdUsers](docs/sdks/public/README.md#getorgsorgidusers) - List Users with roles in an Organization
* [getOrgsOrgIdUsersUserId](docs/sdks/public/README.md#getorgsorgidusersuserid) - Get the role of a User on an Organization
* [getOrgsOrgIdWorkloadProfiles](docs/sdks/public/README.md#getorgsorgidworkloadprofiles) - List workload profiles available to the organization.
* [getOrgsOrgIdWorkloadProfilesProfileQid](docs/sdks/public/README.md#getorgsorgidworkloadprofilesprofileqid) - Get a Workload Profile
* [getOrgsOrgIdWorkloadProfilesProfileQidVersions](docs/sdks/public/README.md#getorgsorgidworkloadprofilesprofileqidversions) - List versions of the given workload profile with optional constraint.
* [getTokens](docs/sdks/public/README.md#gettokens) - DEPRECATED
* [getUsersMe](docs/sdks/public/README.md#getusersme) - DEPRECATED
* [patchCurrentUser](docs/sdks/public/README.md#patchcurrentuser) - Updates the extended profile of the current user.
* [patchOrgsOrgIdAppsAppIdDeltasDeltaId](docs/sdks/public/README.md#patchorgsorgidappsappiddeltasdeltaid) - Update an existing Delta
* [patchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicas](docs/sdks/public/README.md#patchorgsorgidappsappidenvsenvidruntimereplicas) - Set number of replicas for an environment's modules.
* [patchOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](docs/sdks/public/README.md#patchorgsorgidappsappidenvsenvidvalueskey) - Update Shared Value for an Environment
* [patchOrgsOrgIdAppsAppIdUsersUserId](docs/sdks/public/README.md#patchorgsorgidappsappidusersuserid) - Update the role of a User on an Application
* [patchOrgsOrgIdAppsAppIdValuesKey](docs/sdks/public/README.md#patchorgsorgidappsappidvalueskey) - Update Shared Value for an Application
* [patchOrgsOrgIdArtefactsArtefactIdVersionsVersionId](docs/sdks/public/README.md#patchorgsorgidartefactsartefactidversionsversionid) - Update Version of an Artefact.
* [patchOrgsOrgIdEnvTypesEnvTypeUsersUserId](docs/sdks/public/README.md#patchorgsorgidenvtypesenvtypeusersuserid) - Update the role of a User on an Environment Type
* [patchOrgsOrgIdRegistriesRegId](docs/sdks/public/README.md#patchorgsorgidregistriesregid) - Updates (patches) an existing registry record.
* [patchOrgsOrgIdResourcesAccountsAccId](docs/sdks/public/README.md#patchorgsorgidresourcesaccountsaccid) - Update a Resource Account.
* [patchOrgsOrgIdResourcesDefsDefId](docs/sdks/public/README.md#patchorgsorgidresourcesdefsdefid) - Update a Resource Definition.
* [patchOrgsOrgIdUsersUserId](docs/sdks/public/README.md#patchorgsorgidusersuserid) - Update the role of a User on an Organization
* [postOrgsOrgIdApps](docs/sdks/public/README.md#postorgsorgidapps) - Add a new Application to an Organization
* [postOrgsOrgIdAppsAppIdDeltas](docs/sdks/public/README.md#postorgsorgidappsappiddeltas) - Create a new Delta
* [postOrgsOrgIdAppsAppIdEnvs](docs/sdks/public/README.md#postorgsorgidappsappidenvs) - Add a new Environment to an Application.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdDeploys](docs/sdks/public/README.md#postorgsorgidappsappidenvsenviddeploys) - Start a new Deployment.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdRules](docs/sdks/public/README.md#postorgsorgidappsappidenvsenvidrules) - Create a new Automation Rule for an Environment.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdPurgeKey](docs/sdks/public/README.md#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidpurgekey) - Purge the value of a specific Shared Value from the App Environment Version history.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestore](docs/sdks/public/README.md#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidrestore) - Restore a Value Set Version in an Environment of an App
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKey](docs/sdks/public/README.md#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidrestorekey) - Restore a specific key from the Value Set Version in an Environment of an App
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValues](docs/sdks/public/README.md#postorgsorgidappsappidenvsenvidvalues) - Create a Shared Value for an Environment
* [postOrgsOrgIdAppsAppIdSetsSetId](docs/sdks/public/README.md#postorgsorgidappsappidsetssetid) - Apply a Deployment Delta to a Deployment Set
* [postOrgsOrgIdAppsAppIdUsers](docs/sdks/public/README.md#postorgsorgidappsappidusers) - Adds a User to an Application with a Role
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdPurgeKey](docs/sdks/public/README.md#postorgsorgidappsappidvaluesetversionsvaluesetversionidpurgekey) - Purge the value of a specific Shared Value from the App Version history.
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestore](docs/sdks/public/README.md#postorgsorgidappsappidvaluesetversionsvaluesetversionidrestore) - Restore a Value Set Version in an App
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreKey](docs/sdks/public/README.md#postorgsorgidappsappidvaluesetversionsvaluesetversionidrestorekey) - Restore a specific key from the Value Set Version in an App
* [postOrgsOrgIdAppsAppIdValues](docs/sdks/public/README.md#postorgsorgidappsappidvalues) - Create a Shared Value for an Application
* [postOrgsOrgIdAppsAppIdWebhooks](docs/sdks/public/README.md#postorgsorgidappsappidwebhooks) - Create a new Webhook
* [postOrgsOrgIdAppsAppIdWebhooksJobId](docs/sdks/public/README.md#postorgsorgidappsappidwebhooksjobid) - Update a Webhook
* [postOrgsOrgIdArtefactVersions](docs/sdks/public/README.md#postorgsorgidartefactversions) - Register a new Artefact Version with your organization.
* [postOrgsOrgIdEnvTypes](docs/sdks/public/README.md#postorgsorgidenvtypes) - Add a new Environment Type
* [postOrgsOrgIdEnvTypesEnvTypeUsers](docs/sdks/public/README.md#postorgsorgidenvtypesenvtypeusers) - Adds a User to an Environment Type with a Role
* [postOrgsOrgIdImagesImageIdBuilds](docs/sdks/public/README.md#postorgsorgidimagesimageidbuilds) - Add a new Image Build
* [postOrgsOrgIdInvitations](docs/sdks/public/README.md#postorgsorgidinvitations) - Invites a user to an Organization with a specified role.
* [postOrgsOrgIdRegistries](docs/sdks/public/README.md#postorgsorgidregistries) - Creates a new registry record.
* [postOrgsOrgIdResourcesAccounts](docs/sdks/public/README.md#postorgsorgidresourcesaccounts) - Create a new Resource Account in the organization.
* [postOrgsOrgIdResourcesDefs](docs/sdks/public/README.md#postorgsorgidresourcesdefs) - Create a new Resource Definition.
* [postOrgsOrgIdResourcesDefsDefIdCriteria](docs/sdks/public/README.md#postorgsorgidresourcesdefsdefidcriteria) - Add a new Matching Criteria to a Resource Definition.
* [postOrgsOrgIdResourcesDrivers](docs/sdks/public/README.md#postorgsorgidresourcesdrivers) - Register a new Resource Driver.
* [postOrgsOrgIdUsers](docs/sdks/public/README.md#postorgsorgidusers) - Creates a new service user.
* [postOrgsOrgIdWorkloadProfiles](docs/sdks/public/README.md#postorgsorgidworkloadprofiles) - Create new Workload Profile
* [postOrgsOrgIdWorkloadProfilesProfileQidVersions](docs/sdks/public/README.md#postorgsorgidworkloadprofilesprofileqidversions) - Add new Version of the Workload Profile
* [putDelta](docs/sdks/public/README.md#putdelta) - Update an existing Delta
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchived](docs/sdks/public/README.md#putorgsorgidappsappiddeltasdeltaidmetadataarchived) - Mark a Delta as "archived"
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvId](docs/sdks/public/README.md#putorgsorgidappsappiddeltasdeltaidmetadataenvid) - Change the Environment of a Delta
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataName](docs/sdks/public/README.md#putorgsorgidappsappiddeltasdeltaidmetadataname) - Change the name of a Delta
* [putOrgsOrgIdAppsAppIdEnvsEnvIdFromDeployId](docs/sdks/public/README.md#putorgsorgidappsappidenvsenvidfromdeployid) - Rebase to a different Deployment.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](docs/sdks/public/README.md#putorgsorgidappsappidenvsenvidrulesruleid) - Update an existing Automation Rule for an Environment.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePaused](docs/sdks/public/README.md#putorgsorgidappsappidenvsenvidruntimepaused) - Pause / Resume an environment.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](docs/sdks/public/README.md#putorgsorgidappsappidenvsenvidvalueskey) - Update Shared Value for an Environment
* [putOrgsOrgIdAppsAppIdValuesKey](docs/sdks/public/README.md#putorgsorgidappsappidvalueskey) - Update Shared Value for an Application
* [putOrgsOrgIdResourcesDefsDefId](docs/sdks/public/README.md#putorgsorgidresourcesdefsdefid) - Update a Resource Definition.
* [putOrgsOrgIdResourcesDriversDriverId](docs/sdks/public/README.md#putorgsorgidresourcesdriversdriverid) - Update a Resource Driver.
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
