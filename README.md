# test-1

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'demo_1.test_1:test-1:1.7.1'
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


### [accountType](docs/accounttype/README.md)

* [getOrgsOrgIdResourcesAccountTypes](docs/accounttype/README.md#getorgsorgidresourcesaccounttypes) - List Resource Account Types available to the organization.

### [activeResource](docs/activeresource/README.md)

* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResId](docs/activeresource/README.md#deleteorgsorgidappsappidenvsenvidresourcestyperesid) - Delete Active Resources.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdResources](docs/activeresource/README.md#getorgsorgidappsappidenvsenvidresources) - List Active Resources provisioned in an environment.
* [getOrgsOrgIdResourcesDefsDefIdResources](docs/activeresource/README.md#getorgsorgidresourcesdefsdefidresources) - List Active Resources provisioned via a specific Resource Definition.

### [application](docs/application/README.md)

* [deleteOrgsOrgIdAppsAppId](docs/application/README.md#deleteorgsorgidappsappid) - Delete an Application
* [getOrgsOrgIdApps](docs/application/README.md#getorgsorgidapps) - List all Applications in an Organization.
* [getOrgsOrgIdAppsAppId](docs/application/README.md#getorgsorgidappsappid) - Get an existing Application
* [postOrgsOrgIdApps](docs/application/README.md#postorgsorgidapps) - Add a new Application to an Organization

### [artefact](docs/artefact/README.md)

* [deleteOrgsOrgIdArtefactsArtefactId](docs/artefact/README.md#deleteorgsorgidartefactsartefactid) - Delete Artefact and all related Artefact Versions
* [getOrgsOrgIdArtefacts](docs/artefact/README.md#getorgsorgidartefacts) - List all Artefacts.

### [artefactVersion](docs/artefactversion/README.md)

* [getOrgsOrgIdArtefactVersions](docs/artefactversion/README.md#getorgsorgidartefactversions) - List all Artefacts Versions.
* [getOrgsOrgIdArtefactVersionsArtefactVersionId](docs/artefactversion/README.md#getorgsorgidartefactversionsartefactversionid) - Get an Artefacts Versions.
* [getOrgsOrgIdArtefactsArtefactIdVersions](docs/artefactversion/README.md#getorgsorgidartefactsartefactidversions) - List all Artefact Versions of an Artefact.
* [patchOrgsOrgIdArtefactsArtefactIdVersionsVersionId](docs/artefactversion/README.md#patchorgsorgidartefactsartefactidversionsversionid) - Update Version of an Artefact.
* [postOrgsOrgIdArtefactVersions](docs/artefactversion/README.md#postorgsorgidartefactversions) - Register a new Artefact Version with your organization.

### [automationRule](docs/automationrule/README.md)

* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](docs/automationrule/README.md#deleteorgsorgidappsappidenvsenvidrulesruleid) - Delete Automation Rule from an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdRules](docs/automationrule/README.md#getorgsorgidappsappidenvsenvidrules) - List all Automation Rules in an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](docs/automationrule/README.md#getorgsorgidappsappidenvsenvidrulesruleid) - Get a specific Automation Rule for an Environment.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdRules](docs/automationrule/README.md#postorgsorgidappsappidenvsenvidrules) - Create a new Automation Rule for an Environment.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](docs/automationrule/README.md#putorgsorgidappsappidenvsenvidrulesruleid) - Update an existing Automation Rule for an Environment.

### [delta](docs/delta/README.md)

* [getDelta](docs/delta/README.md#getdelta) - Fetch an existing Delta
* [getOrgsOrgIdAppsAppIdDeltas](docs/delta/README.md#getorgsorgidappsappiddeltas) - List Deltas in an Application
* [patchOrgsOrgIdAppsAppIdDeltasDeltaId](docs/delta/README.md#patchorgsorgidappsappiddeltasdeltaid) - Update an existing Delta
* [postOrgsOrgIdAppsAppIdDeltas](docs/delta/README.md#postorgsorgidappsappiddeltas) - Create a new Delta
* [putDelta](docs/delta/README.md#putdelta) - Update an existing Delta
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchived](docs/delta/README.md#putorgsorgidappsappiddeltasdeltaidmetadataarchived) - Mark a Delta as "archived"
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvId](docs/delta/README.md#putorgsorgidappsappiddeltasdeltaidmetadataenvid) - Change the Environment of a Delta
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataName](docs/delta/README.md#putorgsorgidappsappiddeltasdeltaidmetadataname) - Change the name of a Delta

### [deployment](docs/deployment/README.md)

* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploys](docs/deployment/README.md#getorgsorgidappsappidenvsenviddeploys) - List Deployments in an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployId](docs/deployment/README.md#getorgsorgidappsappidenvsenviddeploysdeployid) - Get a specific Deployment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrors](docs/deployment/README.md#getorgsorgidappsappidenvsenviddeploysdeployiderrors) - List errors that occurred in a Deployment.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdDeploys](docs/deployment/README.md#postorgsorgidappsappidenvsenviddeploys) - Start a new Deployment.

### [driverDefinition](docs/driverdefinition/README.md)

* [deleteOrgsOrgIdResourcesDriversDriverId](docs/driverdefinition/README.md#deleteorgsorgidresourcesdriversdriverid) - Delete a Resources Driver.
* [getOrgsOrgIdResourcesDrivers](docs/driverdefinition/README.md#getorgsorgidresourcesdrivers) - List Resource Drivers.
* [getOrgsOrgIdResourcesDriversDriverId](docs/driverdefinition/README.md#getorgsorgidresourcesdriversdriverid) - Get a Resource Driver.
* [postOrgsOrgIdResourcesDrivers](docs/driverdefinition/README.md#postorgsorgidresourcesdrivers) - Register a new Resource Driver.
* [putOrgsOrgIdResourcesDriversDriverId](docs/driverdefinition/README.md#putorgsorgidresourcesdriversdriverid) - Update a Resource Driver.

### [environment](docs/environment/README.md)

* [deleteOrgsOrgIdAppsAppIdEnvsEnvId](docs/environment/README.md#deleteorgsorgidappsappidenvsenvid) - Delete a specific Environment.
* [getOrgsOrgIdAppsAppIdEnvs](docs/environment/README.md#getorgsorgidappsappidenvs) - List all Environments.
* [getOrgsOrgIdAppsAppIdEnvsEnvId](docs/environment/README.md#getorgsorgidappsappidenvsenvid) - Get a specific Environment.
* [postOrgsOrgIdAppsAppIdEnvs](docs/environment/README.md#postorgsorgidappsappidenvs) - Add a new Environment to an Application.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdFromDeployId](docs/environment/README.md#putorgsorgidappsappidenvsenvidfromdeployid) - Rebase to a different Deployment.

### [environmentType](docs/environmenttype/README.md)

* [deleteOrgsOrgIdEnvTypesEnvTypeId](docs/environmenttype/README.md#deleteorgsorgidenvtypesenvtypeid) - Deletes an Environment Type
* [getOrgsOrgIdEnvTypes](docs/environmenttype/README.md#getorgsorgidenvtypes) - List all Environment Types
* [getOrgsOrgIdEnvTypesEnvTypeId](docs/environmenttype/README.md#getorgsorgidenvtypesenvtypeid) - Get an Environment Type
* [postOrgsOrgIdEnvTypes](docs/environmenttype/README.md#postorgsorgidenvtypes) - Add a new Environment Type

### [event](docs/event/README.md)

* [deleteOrgsOrgIdAppsAppIdJobs](docs/event/README.md#deleteorgsorgidappsappidjobs) - Deletes all Jobs for the Application
* [deleteOrgsOrgIdAppsAppIdWebhooksJobId](docs/event/README.md#deleteorgsorgidappsappidwebhooksjobid) - Delete a Webhook
* [getOrgsOrgIdAppsAppIdWebhooks](docs/event/README.md#getorgsorgidappsappidwebhooks) - List Webhooks
* [getOrgsOrgIdAppsAppIdWebhooksJobId](docs/event/README.md#getorgsorgidappsappidwebhooksjobid) - Get a Webhook
* [getOrgsOrgIdEvents](docs/event/README.md#getorgsorgidevents) - List Events
* [postOrgsOrgIdAppsAppIdWebhooks](docs/event/README.md#postorgsorgidappsappidwebhooks) - Create a new Webhook
* [postOrgsOrgIdAppsAppIdWebhooksJobId](docs/event/README.md#postorgsorgidappsappidwebhooksjobid) - Update a Webhook

### [image](docs/image/README.md)

* [getOrgsOrgIdImages](docs/image/README.md#getorgsorgidimages) - List all Container Images
* [getOrgsOrgIdImagesImageId](docs/image/README.md#getorgsorgidimagesimageid) - Get a specific Image Object
* [getOrgsOrgIdImagesImageIdBuilds](docs/image/README.md#getorgsorgidimagesimageidbuilds) - Lists all the Builds of an Image
* [postOrgsOrgIdImagesImageIdBuilds](docs/image/README.md#postorgsorgidimagesimageidbuilds) - Add a new Image Build

### [matchingCriteria](docs/matchingcriteria/README.md)

* [deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId](docs/matchingcriteria/README.md#deleteorgsorgidresourcesdefsdefidcriteriacriteriaid) - Delete a Matching Criteria from a Resource Definition.
* [postOrgsOrgIdResourcesDefsDefIdCriteria](docs/matchingcriteria/README.md#postorgsorgidresourcesdefsdefidcriteria) - Add a new Matching Criteria to a Resource Definition.

### [organization](docs/organization/README.md)

* [getOrgs](docs/organization/README.md#getorgs) - List active organizations the user has access to.
* [getOrgsOrgId](docs/organization/README.md#getorgsorgid) - Get the specified Organization.

### [registry](docs/registry/README.md)

* [deleteOrgsOrgIdRegistriesRegId](docs/registry/README.md#deleteorgsorgidregistriesregid) - Deletes an existing registry record and all associated credentials and secrets.
* [getOrgsOrgIdRegistries](docs/registry/README.md#getorgsorgidregistries) - Lists available registries for the organization.
* [getOrgsOrgIdRegistriesRegId](docs/registry/README.md#getorgsorgidregistriesregid) - Loads a registry record details.
* [getOrgsOrgIdRegistriesRegIdCreds](docs/registry/README.md#getorgsorgidregistriesregidcreds) - Returns current account credentials or secret details for the registry.
* [patchOrgsOrgIdRegistriesRegId](docs/registry/README.md#patchorgsorgidregistriesregid) - Updates (patches) an existing registry record.
* [postOrgsOrgIdRegistries](docs/registry/README.md#postorgsorgidregistries) - Creates a new registry record.

### [resourceAccount](docs/resourceaccount/README.md)

* [getOrgsOrgIdResourcesAccounts](docs/resourceaccount/README.md#getorgsorgidresourcesaccounts) - List Resource Accounts in the organization.
* [getOrgsOrgIdResourcesAccountsAccId](docs/resourceaccount/README.md#getorgsorgidresourcesaccountsaccid) - Get a Resource Account.
* [patchOrgsOrgIdResourcesAccountsAccId](docs/resourceaccount/README.md#patchorgsorgidresourcesaccountsaccid) - Update a Resource Account.
* [postOrgsOrgIdResourcesAccounts](docs/resourceaccount/README.md#postorgsorgidresourcesaccounts) - Create a new Resource Account in the organization.

### [resourceDefinition](docs/resourcedefinition/README.md)

* [deleteOrgsOrgIdResourcesDefsDefId](docs/resourcedefinition/README.md#deleteorgsorgidresourcesdefsdefid) - Delete a Resource Definition.
* [deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId](docs/resourcedefinition/README.md#deleteorgsorgidresourcesdefsdefidcriteriacriteriaid) - Delete a Matching Criteria from a Resource Definition.
* [getOrgsOrgIdResourcesDefs](docs/resourcedefinition/README.md#getorgsorgidresourcesdefs) - List Resource Definitions.
* [getOrgsOrgIdResourcesDefsDefId](docs/resourcedefinition/README.md#getorgsorgidresourcesdefsdefid) - Get a specific Resource Definition.
* [getOrgsOrgIdResourcesDefsDefIdResources](docs/resourcedefinition/README.md#getorgsorgidresourcesdefsdefidresources) - List Active Resources provisioned via a specific Resource Definition.
* [patchOrgsOrgIdResourcesDefsDefId](docs/resourcedefinition/README.md#patchorgsorgidresourcesdefsdefid) - Update a Resource Definition.
* [postOrgsOrgIdResourcesDefs](docs/resourcedefinition/README.md#postorgsorgidresourcesdefs) - Create a new Resource Definition.
* [postOrgsOrgIdResourcesDefsDefIdCriteria](docs/resourcedefinition/README.md#postorgsorgidresourcesdefsdefidcriteria) - Add a new Matching Criteria to a Resource Definition.
* [putOrgsOrgIdResourcesDefsDefId](docs/resourcedefinition/README.md#putorgsorgidresourcesdefsdefid) - Update a Resource Definition.

### [resourceType](docs/resourcetype/README.md)

* [getOrgsOrgIdResourcesTypes](docs/resourcetype/README.md#getorgsorgidresourcestypes) - List Resource Types.

### [runtimeInfo](docs/runtimeinfo/README.md)

* [getOrgsOrgIdAppsAppIdEnvsEnvIdRuntime](docs/runtimeinfo/README.md#getorgsorgidappsappidenvsenvidruntime) - Get Runtime information about the environment.
* [getOrgsOrgIdAppsAppIdRuntime](docs/runtimeinfo/README.md#getorgsorgidappsappidruntime) - Get Runtime information about specific environments.
* [patchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicas](docs/runtimeinfo/README.md#patchorgsorgidappsappidenvsenvidruntimereplicas) - Set number of replicas for an environment's modules.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePaused](docs/runtimeinfo/README.md#putorgsorgidappsappidenvsenvidruntimepaused) - Pause / Resume an environment.

### [set](docs/set/README.md)

* [getSets](docs/set/README.md#getsets) - Get all Deployment Sets
* [getOrgsOrgIdAppsAppIdSetsSetId](docs/set/README.md#getorgsorgidappsappidsetssetid) - Get a Deployment Set
* [getOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetId](docs/set/README.md#getorgsorgidappsappidsetssetiddiffsourcesetid) - Get the difference between 2 Deployment Sets
* [postOrgsOrgIdAppsAppIdSetsSetId](docs/set/README.md#postorgsorgidappsappidsetssetid) - Apply a Deployment Delta to a Deployment Set

### [userInvite](docs/userinvite/README.md)

* [getOrgsOrgIdInvitations](docs/userinvite/README.md#getorgsorgidinvitations) - List the invites issued for the organization.

### [userProfile](docs/userprofile/README.md)

* [deleteTokensTokenId](docs/userprofile/README.md#deletetokenstokenid) - DEPRECATED
* [getCurrentUser](docs/userprofile/README.md#getcurrentuser) - Gets the extended profile of the current user
* [getTokens](docs/userprofile/README.md#gettokens) - DEPRECATED
* [getUsersMe](docs/userprofile/README.md#getusersme) - DEPRECATED
* [patchCurrentUser](docs/userprofile/README.md#patchcurrentuser) - Updates the extended profile of the current user.
* [postOrgsOrgIdUsers](docs/userprofile/README.md#postorgsorgidusers) - Creates a new service user.

### [userRole](docs/userrole/README.md)

* [deleteOrgsOrgIdAppsAppIdUsersUserId](docs/userrole/README.md#deleteorgsorgidappsappidusersuserid) - Remove the role of a User on an Application
* [deleteOrgsOrgIdEnvTypesEnvTypeUsersUserId](docs/userrole/README.md#deleteorgsorgidenvtypesenvtypeusersuserid) - Remove the role of a User on an Environment Type
* [deleteOrgsOrgIdUsersUserId](docs/userrole/README.md#deleteorgsorgidusersuserid) - Remove the role of a User on an Organization
* [getOrgsOrgIdAppsAppIdUsers](docs/userrole/README.md#getorgsorgidappsappidusers) - List Users with roles in an App
* [getOrgsOrgIdAppsAppIdUsersUserId](docs/userrole/README.md#getorgsorgidappsappidusersuserid) - Get the role of a User on an Application
* [getOrgsOrgIdEnvTypesEnvTypeUsersUserId](docs/userrole/README.md#getorgsorgidenvtypesenvtypeusersuserid) - Get the role of a User on an Environment Type
* [getOrgsOrgIdUsers](docs/userrole/README.md#getorgsorgidusers) - List Users with roles in an Organization
* [getOrgsOrgIdUsersUserId](docs/userrole/README.md#getorgsorgidusersuserid) - Get the role of a User on an Organization
* [patchOrgsOrgIdAppsAppIdUsersUserId](docs/userrole/README.md#patchorgsorgidappsappidusersuserid) - Update the role of a User on an Application
* [patchOrgsOrgIdEnvTypesEnvTypeUsersUserId](docs/userrole/README.md#patchorgsorgidenvtypesenvtypeusersuserid) - Update the role of a User on an Environment Type
* [patchOrgsOrgIdUsersUserId](docs/userrole/README.md#patchorgsorgidusersuserid) - Update the role of a User on an Organization
* [postOrgsOrgIdAppsAppIdUsers](docs/userrole/README.md#postorgsorgidappsappidusers) - Adds a User to an Application with a Role
* [postOrgsOrgIdEnvTypesEnvTypeUsers](docs/userrole/README.md#postorgsorgidenvtypesenvtypeusers) - Adds a User to an Environment Type with a Role
* [postOrgsOrgIdInvitations](docs/userrole/README.md#postorgsorgidinvitations) - Invites a user to an Organization with a specified role.

### [value](docs/value/README.md)

* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdValues](docs/value/README.md#deleteorgsorgidappsappidenvsenvidvalues) - Delete all Shared Value for an Environment
* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](docs/value/README.md#deleteorgsorgidappsappidenvsenvidvalueskey) - Delete Shared Value for an Environment
* [deleteOrgsOrgIdAppsAppIdValues](docs/value/README.md#deleteorgsorgidappsappidvalues) - Delete all Shared Value for an App
* [deleteOrgsOrgIdAppsAppIdValuesKey](docs/value/README.md#deleteorgsorgidappsappidvalueskey) - Delete Shared Value for an Application
* [getOrgsOrgIdAppsAppIdEnvsEnvIdValues](docs/value/README.md#getorgsorgidappsappidenvsenvidvalues) - List Shared Values in an Environment
* [getOrgsOrgIdAppsAppIdValues](docs/value/README.md#getorgsorgidappsappidvalues) - List Shared Values in an Application
* [patchOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](docs/value/README.md#patchorgsorgidappsappidenvsenvidvalueskey) - Update Shared Value for an Environment
* [patchOrgsOrgIdAppsAppIdValuesKey](docs/value/README.md#patchorgsorgidappsappidvalueskey) - Update Shared Value for an Application
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValues](docs/value/README.md#postorgsorgidappsappidenvsenvidvalues) - Create a Shared Value for an Environment
* [postOrgsOrgIdAppsAppIdValues](docs/value/README.md#postorgsorgidappsappidvalues) - Create a Shared Value for an Application
* [putOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](docs/value/README.md#putorgsorgidappsappidenvsenvidvalueskey) - Update Shared Value for an Environment
* [putOrgsOrgIdAppsAppIdValuesKey](docs/value/README.md#putorgsorgidappsappidvalueskey) - Update Shared Value for an Application

### [valueSetVersion](docs/valuesetversion/README.md)

* [getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersions](docs/valuesetversion/README.md#getorgsorgidappsappidenvsenvidvaluesetversions) - List Value Set Versions in an Environment of an App
* [getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionId](docs/valuesetversion/README.md#getorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionid) - Get a single Value Set Version in an Environment of an App
* [getOrgsOrgIdAppsAppIdValueSetVersions](docs/valuesetversion/README.md#getorgsorgidappsappidvaluesetversions) - List Value Set Versions in the App
* [getOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionId](docs/valuesetversion/README.md#getorgsorgidappsappidvaluesetversionsvaluesetversionid) - Get a single Value Set Version from the App
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdPurgeKey](docs/valuesetversion/README.md#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidpurgekey) - Purge the value of a specific Shared Value from the App Environment Version history.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestore](docs/valuesetversion/README.md#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidrestore) - Restore a Value Set Version in an Environment of an App
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKey](docs/valuesetversion/README.md#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidrestorekey) - Restore a specific key from the Value Set Version in an Environment of an App
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdPurgeKey](docs/valuesetversion/README.md#postorgsorgidappsappidvaluesetversionsvaluesetversionidpurgekey) - Purge the value of a specific Shared Value from the App Version history.
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestore](docs/valuesetversion/README.md#postorgsorgidappsappidvaluesetversionsvaluesetversionidrestore) - Restore a Value Set Version in an App
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreKey](docs/valuesetversion/README.md#postorgsorgidappsappidvaluesetversionsvaluesetversionidrestorekey) - Restore a specific key from the Value Set Version in an App

### [workloadProfile](docs/workloadprofile/README.md)

* [deleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersion](docs/workloadprofile/README.md#deleteorgsorgidworkloadprofilesprofileidversionsversion) - Delete a Workload Profile Version
* [deleteOrgsOrgIdWorkloadProfilesProfileQid](docs/workloadprofile/README.md#deleteorgsorgidworkloadprofilesprofileqid) - Delete a Workload Profile
* [getOrgsOrgIdWorkloadProfiles](docs/workloadprofile/README.md#getorgsorgidworkloadprofiles) - List workload profiles available to the organization.
* [getOrgsOrgIdWorkloadProfilesProfileQid](docs/workloadprofile/README.md#getorgsorgidworkloadprofilesprofileqid) - Get a Workload Profile
* [getOrgsOrgIdWorkloadProfilesProfileQidVersions](docs/workloadprofile/README.md#getorgsorgidworkloadprofilesprofileqidversions) - List versions of the given workload profile with optional constraint.
* [postOrgsOrgIdWorkloadProfiles](docs/workloadprofile/README.md#postorgsorgidworkloadprofiles) - Create new Workload Profile
* [postOrgsOrgIdWorkloadProfilesProfileQidVersions](docs/workloadprofile/README.md#postorgsorgidworkloadprofilesprofileqidversions) - Add new Version of the Workload Profile

### [public_](docs/public/README.md)

* [deleteOrgsOrgIdAppsAppId](docs/public/README.md#deleteorgsorgidappsappid) - Delete an Application
* [deleteOrgsOrgIdAppsAppIdEnvsEnvId](docs/public/README.md#deleteorgsorgidappsappidenvsenvid) - Delete a specific Environment.
* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdResourcesTypeResId](docs/public/README.md#deleteorgsorgidappsappidenvsenvidresourcestyperesid) - Delete Active Resources.
* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](docs/public/README.md#deleteorgsorgidappsappidenvsenvidrulesruleid) - Delete Automation Rule from an Environment.
* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdValues](docs/public/README.md#deleteorgsorgidappsappidenvsenvidvalues) - Delete all Shared Value for an Environment
* [deleteOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](docs/public/README.md#deleteorgsorgidappsappidenvsenvidvalueskey) - Delete Shared Value for an Environment
* [deleteOrgsOrgIdAppsAppIdJobs](docs/public/README.md#deleteorgsorgidappsappidjobs) - Deletes all Jobs for the Application
* [deleteOrgsOrgIdAppsAppIdUsersUserId](docs/public/README.md#deleteorgsorgidappsappidusersuserid) - Remove the role of a User on an Application
* [deleteOrgsOrgIdAppsAppIdValues](docs/public/README.md#deleteorgsorgidappsappidvalues) - Delete all Shared Value for an App
* [deleteOrgsOrgIdAppsAppIdValuesKey](docs/public/README.md#deleteorgsorgidappsappidvalueskey) - Delete Shared Value for an Application
* [deleteOrgsOrgIdAppsAppIdWebhooksJobId](docs/public/README.md#deleteorgsorgidappsappidwebhooksjobid) - Delete a Webhook
* [deleteOrgsOrgIdArtefactsArtefactId](docs/public/README.md#deleteorgsorgidartefactsartefactid) - Delete Artefact and all related Artefact Versions
* [deleteOrgsOrgIdEnvTypesEnvTypeId](docs/public/README.md#deleteorgsorgidenvtypesenvtypeid) - Deletes an Environment Type
* [deleteOrgsOrgIdEnvTypesEnvTypeUsersUserId](docs/public/README.md#deleteorgsorgidenvtypesenvtypeusersuserid) - Remove the role of a User on an Environment Type
* [deleteOrgsOrgIdRegistriesRegId](docs/public/README.md#deleteorgsorgidregistriesregid) - Deletes an existing registry record and all associated credentials and secrets.
* [deleteOrgsOrgIdResourcesDefsDefId](docs/public/README.md#deleteorgsorgidresourcesdefsdefid) - Delete a Resource Definition.
* [deleteOrgsOrgIdResourcesDefsDefIdCriteriaCriteriaId](docs/public/README.md#deleteorgsorgidresourcesdefsdefidcriteriacriteriaid) - Delete a Matching Criteria from a Resource Definition.
* [deleteOrgsOrgIdResourcesDriversDriverId](docs/public/README.md#deleteorgsorgidresourcesdriversdriverid) - Delete a Resources Driver.
* [deleteOrgsOrgIdUsersUserId](docs/public/README.md#deleteorgsorgidusersuserid) - Remove the role of a User on an Organization
* [deleteOrgsOrgIdWorkloadProfilesProfileIdVersionsVersion](docs/public/README.md#deleteorgsorgidworkloadprofilesprofileidversionsversion) - Delete a Workload Profile Version
* [deleteOrgsOrgIdWorkloadProfilesProfileQid](docs/public/README.md#deleteorgsorgidworkloadprofilesprofileqid) - Delete a Workload Profile
* [deleteTokensTokenId](docs/public/README.md#deletetokenstokenid) - DEPRECATED
* [getDelta](docs/public/README.md#getdelta) - Fetch an existing Delta
* [getSets](docs/public/README.md#getsets) - Get all Deployment Sets
* [getCurrentUser](docs/public/README.md#getcurrentuser) - Gets the extended profile of the current user
* [getOrgs](docs/public/README.md#getorgs) - List active organizations the user has access to.
* [getOrgsOrgId](docs/public/README.md#getorgsorgid) - Get the specified Organization.
* [getOrgsOrgIdApps](docs/public/README.md#getorgsorgidapps) - List all Applications in an Organization.
* [getOrgsOrgIdAppsAppId](docs/public/README.md#getorgsorgidappsappid) - Get an existing Application
* [getOrgsOrgIdAppsAppIdDeltas](docs/public/README.md#getorgsorgidappsappiddeltas) - List Deltas in an Application
* [getOrgsOrgIdAppsAppIdEnvs](docs/public/README.md#getorgsorgidappsappidenvs) - List all Environments.
* [getOrgsOrgIdAppsAppIdEnvsEnvId](docs/public/README.md#getorgsorgidappsappidenvsenvid) - Get a specific Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploys](docs/public/README.md#getorgsorgidappsappidenvsenviddeploys) - List Deployments in an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployId](docs/public/README.md#getorgsorgidappsappidenvsenviddeploysdeployid) - Get a specific Deployment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdDeploysDeployIdErrors](docs/public/README.md#getorgsorgidappsappidenvsenviddeploysdeployiderrors) - List errors that occurred in a Deployment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdResources](docs/public/README.md#getorgsorgidappsappidenvsenvidresources) - List Active Resources provisioned in an environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdRules](docs/public/README.md#getorgsorgidappsappidenvsenvidrules) - List all Automation Rules in an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](docs/public/README.md#getorgsorgidappsappidenvsenvidrulesruleid) - Get a specific Automation Rule for an Environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdRuntime](docs/public/README.md#getorgsorgidappsappidenvsenvidruntime) - Get Runtime information about the environment.
* [getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersions](docs/public/README.md#getorgsorgidappsappidenvsenvidvaluesetversions) - List Value Set Versions in an Environment of an App
* [getOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionId](docs/public/README.md#getorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionid) - Get a single Value Set Version in an Environment of an App
* [getOrgsOrgIdAppsAppIdEnvsEnvIdValues](docs/public/README.md#getorgsorgidappsappidenvsenvidvalues) - List Shared Values in an Environment
* [getOrgsOrgIdAppsAppIdRuntime](docs/public/README.md#getorgsorgidappsappidruntime) - Get Runtime information about specific environments.
* [getOrgsOrgIdAppsAppIdSetsSetId](docs/public/README.md#getorgsorgidappsappidsetssetid) - Get a Deployment Set
* [getOrgsOrgIdAppsAppIdSetsSetIdDiffSourceSetId](docs/public/README.md#getorgsorgidappsappidsetssetiddiffsourcesetid) - Get the difference between 2 Deployment Sets
* [getOrgsOrgIdAppsAppIdUsers](docs/public/README.md#getorgsorgidappsappidusers) - List Users with roles in an App
* [getOrgsOrgIdAppsAppIdUsersUserId](docs/public/README.md#getorgsorgidappsappidusersuserid) - Get the role of a User on an Application
* [getOrgsOrgIdAppsAppIdValueSetVersions](docs/public/README.md#getorgsorgidappsappidvaluesetversions) - List Value Set Versions in the App
* [getOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionId](docs/public/README.md#getorgsorgidappsappidvaluesetversionsvaluesetversionid) - Get a single Value Set Version from the App
* [getOrgsOrgIdAppsAppIdValues](docs/public/README.md#getorgsorgidappsappidvalues) - List Shared Values in an Application
* [getOrgsOrgIdAppsAppIdWebhooks](docs/public/README.md#getorgsorgidappsappidwebhooks) - List Webhooks
* [getOrgsOrgIdAppsAppIdWebhooksJobId](docs/public/README.md#getorgsorgidappsappidwebhooksjobid) - Get a Webhook
* [getOrgsOrgIdArtefactVersions](docs/public/README.md#getorgsorgidartefactversions) - List all Artefacts Versions.
* [getOrgsOrgIdArtefactVersionsArtefactVersionId](docs/public/README.md#getorgsorgidartefactversionsartefactversionid) - Get an Artefacts Versions.
* [getOrgsOrgIdArtefacts](docs/public/README.md#getorgsorgidartefacts) - List all Artefacts.
* [getOrgsOrgIdArtefactsArtefactIdVersions](docs/public/README.md#getorgsorgidartefactsartefactidversions) - List all Artefact Versions of an Artefact.
* [getOrgsOrgIdEnvTypes](docs/public/README.md#getorgsorgidenvtypes) - List all Environment Types
* [getOrgsOrgIdEnvTypesEnvTypeId](docs/public/README.md#getorgsorgidenvtypesenvtypeid) - Get an Environment Type
* [getOrgsOrgIdEnvTypesEnvTypeUsersUserId](docs/public/README.md#getorgsorgidenvtypesenvtypeusersuserid) - Get the role of a User on an Environment Type
* [getOrgsOrgIdEvents](docs/public/README.md#getorgsorgidevents) - List Events
* [getOrgsOrgIdImages](docs/public/README.md#getorgsorgidimages) - List all Container Images
* [getOrgsOrgIdImagesImageId](docs/public/README.md#getorgsorgidimagesimageid) - Get a specific Image Object
* [getOrgsOrgIdImagesImageIdBuilds](docs/public/README.md#getorgsorgidimagesimageidbuilds) - Lists all the Builds of an Image
* [getOrgsOrgIdInvitations](docs/public/README.md#getorgsorgidinvitations) - List the invites issued for the organization.
* [getOrgsOrgIdRegistries](docs/public/README.md#getorgsorgidregistries) - Lists available registries for the organization.
* [getOrgsOrgIdRegistriesRegId](docs/public/README.md#getorgsorgidregistriesregid) - Loads a registry record details.
* [getOrgsOrgIdRegistriesRegIdCreds](docs/public/README.md#getorgsorgidregistriesregidcreds) - Returns current account credentials or secret details for the registry.
* [getOrgsOrgIdResourcesAccountTypes](docs/public/README.md#getorgsorgidresourcesaccounttypes) - List Resource Account Types available to the organization.
* [getOrgsOrgIdResourcesAccounts](docs/public/README.md#getorgsorgidresourcesaccounts) - List Resource Accounts in the organization.
* [getOrgsOrgIdResourcesAccountsAccId](docs/public/README.md#getorgsorgidresourcesaccountsaccid) - Get a Resource Account.
* [getOrgsOrgIdResourcesDefs](docs/public/README.md#getorgsorgidresourcesdefs) - List Resource Definitions.
* [getOrgsOrgIdResourcesDefsDefId](docs/public/README.md#getorgsorgidresourcesdefsdefid) - Get a specific Resource Definition.
* [getOrgsOrgIdResourcesDefsDefIdResources](docs/public/README.md#getorgsorgidresourcesdefsdefidresources) - List Active Resources provisioned via a specific Resource Definition.
* [getOrgsOrgIdResourcesDrivers](docs/public/README.md#getorgsorgidresourcesdrivers) - List Resource Drivers.
* [getOrgsOrgIdResourcesDriversDriverId](docs/public/README.md#getorgsorgidresourcesdriversdriverid) - Get a Resource Driver.
* [getOrgsOrgIdResourcesTypes](docs/public/README.md#getorgsorgidresourcestypes) - List Resource Types.
* [getOrgsOrgIdUsers](docs/public/README.md#getorgsorgidusers) - List Users with roles in an Organization
* [getOrgsOrgIdUsersUserId](docs/public/README.md#getorgsorgidusersuserid) - Get the role of a User on an Organization
* [getOrgsOrgIdWorkloadProfiles](docs/public/README.md#getorgsorgidworkloadprofiles) - List workload profiles available to the organization.
* [getOrgsOrgIdWorkloadProfilesProfileQid](docs/public/README.md#getorgsorgidworkloadprofilesprofileqid) - Get a Workload Profile
* [getOrgsOrgIdWorkloadProfilesProfileQidVersions](docs/public/README.md#getorgsorgidworkloadprofilesprofileqidversions) - List versions of the given workload profile with optional constraint.
* [getTokens](docs/public/README.md#gettokens) - DEPRECATED
* [getUsersMe](docs/public/README.md#getusersme) - DEPRECATED
* [patchCurrentUser](docs/public/README.md#patchcurrentuser) - Updates the extended profile of the current user.
* [patchOrgsOrgIdAppsAppIdDeltasDeltaId](docs/public/README.md#patchorgsorgidappsappiddeltasdeltaid) - Update an existing Delta
* [patchOrgsOrgIdAppsAppIdEnvsEnvIdRuntimeReplicas](docs/public/README.md#patchorgsorgidappsappidenvsenvidruntimereplicas) - Set number of replicas for an environment's modules.
* [patchOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](docs/public/README.md#patchorgsorgidappsappidenvsenvidvalueskey) - Update Shared Value for an Environment
* [patchOrgsOrgIdAppsAppIdUsersUserId](docs/public/README.md#patchorgsorgidappsappidusersuserid) - Update the role of a User on an Application
* [patchOrgsOrgIdAppsAppIdValuesKey](docs/public/README.md#patchorgsorgidappsappidvalueskey) - Update Shared Value for an Application
* [patchOrgsOrgIdArtefactsArtefactIdVersionsVersionId](docs/public/README.md#patchorgsorgidartefactsartefactidversionsversionid) - Update Version of an Artefact.
* [patchOrgsOrgIdEnvTypesEnvTypeUsersUserId](docs/public/README.md#patchorgsorgidenvtypesenvtypeusersuserid) - Update the role of a User on an Environment Type
* [patchOrgsOrgIdRegistriesRegId](docs/public/README.md#patchorgsorgidregistriesregid) - Updates (patches) an existing registry record.
* [patchOrgsOrgIdResourcesAccountsAccId](docs/public/README.md#patchorgsorgidresourcesaccountsaccid) - Update a Resource Account.
* [patchOrgsOrgIdResourcesDefsDefId](docs/public/README.md#patchorgsorgidresourcesdefsdefid) - Update a Resource Definition.
* [patchOrgsOrgIdUsersUserId](docs/public/README.md#patchorgsorgidusersuserid) - Update the role of a User on an Organization
* [postOrgsOrgIdApps](docs/public/README.md#postorgsorgidapps) - Add a new Application to an Organization
* [postOrgsOrgIdAppsAppIdDeltas](docs/public/README.md#postorgsorgidappsappiddeltas) - Create a new Delta
* [postOrgsOrgIdAppsAppIdEnvs](docs/public/README.md#postorgsorgidappsappidenvs) - Add a new Environment to an Application.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdDeploys](docs/public/README.md#postorgsorgidappsappidenvsenviddeploys) - Start a new Deployment.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdRules](docs/public/README.md#postorgsorgidappsappidenvsenvidrules) - Create a new Automation Rule for an Environment.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdPurgeKey](docs/public/README.md#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidpurgekey) - Purge the value of a specific Shared Value from the App Environment Version history.
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestore](docs/public/README.md#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidrestore) - Restore a Value Set Version in an Environment of an App
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValueSetVersionsValueSetVersionIdRestoreKey](docs/public/README.md#postorgsorgidappsappidenvsenvidvaluesetversionsvaluesetversionidrestorekey) - Restore a specific key from the Value Set Version in an Environment of an App
* [postOrgsOrgIdAppsAppIdEnvsEnvIdValues](docs/public/README.md#postorgsorgidappsappidenvsenvidvalues) - Create a Shared Value for an Environment
* [postOrgsOrgIdAppsAppIdSetsSetId](docs/public/README.md#postorgsorgidappsappidsetssetid) - Apply a Deployment Delta to a Deployment Set
* [postOrgsOrgIdAppsAppIdUsers](docs/public/README.md#postorgsorgidappsappidusers) - Adds a User to an Application with a Role
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdPurgeKey](docs/public/README.md#postorgsorgidappsappidvaluesetversionsvaluesetversionidpurgekey) - Purge the value of a specific Shared Value from the App Version history.
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestore](docs/public/README.md#postorgsorgidappsappidvaluesetversionsvaluesetversionidrestore) - Restore a Value Set Version in an App
* [postOrgsOrgIdAppsAppIdValueSetVersionsValueSetVersionIdRestoreKey](docs/public/README.md#postorgsorgidappsappidvaluesetversionsvaluesetversionidrestorekey) - Restore a specific key from the Value Set Version in an App
* [postOrgsOrgIdAppsAppIdValues](docs/public/README.md#postorgsorgidappsappidvalues) - Create a Shared Value for an Application
* [postOrgsOrgIdAppsAppIdWebhooks](docs/public/README.md#postorgsorgidappsappidwebhooks) - Create a new Webhook
* [postOrgsOrgIdAppsAppIdWebhooksJobId](docs/public/README.md#postorgsorgidappsappidwebhooksjobid) - Update a Webhook
* [postOrgsOrgIdArtefactVersions](docs/public/README.md#postorgsorgidartefactversions) - Register a new Artefact Version with your organization.
* [postOrgsOrgIdEnvTypes](docs/public/README.md#postorgsorgidenvtypes) - Add a new Environment Type
* [postOrgsOrgIdEnvTypesEnvTypeUsers](docs/public/README.md#postorgsorgidenvtypesenvtypeusers) - Adds a User to an Environment Type with a Role
* [postOrgsOrgIdImagesImageIdBuilds](docs/public/README.md#postorgsorgidimagesimageidbuilds) - Add a new Image Build
* [postOrgsOrgIdInvitations](docs/public/README.md#postorgsorgidinvitations) - Invites a user to an Organization with a specified role.
* [postOrgsOrgIdRegistries](docs/public/README.md#postorgsorgidregistries) - Creates a new registry record.
* [postOrgsOrgIdResourcesAccounts](docs/public/README.md#postorgsorgidresourcesaccounts) - Create a new Resource Account in the organization.
* [postOrgsOrgIdResourcesDefs](docs/public/README.md#postorgsorgidresourcesdefs) - Create a new Resource Definition.
* [postOrgsOrgIdResourcesDefsDefIdCriteria](docs/public/README.md#postorgsorgidresourcesdefsdefidcriteria) - Add a new Matching Criteria to a Resource Definition.
* [postOrgsOrgIdResourcesDrivers](docs/public/README.md#postorgsorgidresourcesdrivers) - Register a new Resource Driver.
* [postOrgsOrgIdUsers](docs/public/README.md#postorgsorgidusers) - Creates a new service user.
* [postOrgsOrgIdWorkloadProfiles](docs/public/README.md#postorgsorgidworkloadprofiles) - Create new Workload Profile
* [postOrgsOrgIdWorkloadProfilesProfileQidVersions](docs/public/README.md#postorgsorgidworkloadprofilesprofileqidversions) - Add new Version of the Workload Profile
* [putDelta](docs/public/README.md#putdelta) - Update an existing Delta
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataArchived](docs/public/README.md#putorgsorgidappsappiddeltasdeltaidmetadataarchived) - Mark a Delta as "archived"
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataEnvId](docs/public/README.md#putorgsorgidappsappiddeltasdeltaidmetadataenvid) - Change the Environment of a Delta
* [putOrgsOrgIdAppsAppIdDeltasDeltaIdMetadataName](docs/public/README.md#putorgsorgidappsappiddeltasdeltaidmetadataname) - Change the name of a Delta
* [putOrgsOrgIdAppsAppIdEnvsEnvIdFromDeployId](docs/public/README.md#putorgsorgidappsappidenvsenvidfromdeployid) - Rebase to a different Deployment.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdRulesRuleId](docs/public/README.md#putorgsorgidappsappidenvsenvidrulesruleid) - Update an existing Automation Rule for an Environment.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdRuntimePaused](docs/public/README.md#putorgsorgidappsappidenvsenvidruntimepaused) - Pause / Resume an environment.
* [putOrgsOrgIdAppsAppIdEnvsEnvIdValuesKey](docs/public/README.md#putorgsorgidappsappidenvsenvidvalueskey) - Update Shared Value for an Environment
* [putOrgsOrgIdAppsAppIdValuesKey](docs/public/README.md#putorgsorgidappsappidvalueskey) - Update Shared Value for an Application
* [putOrgsOrgIdResourcesDefsDefId](docs/public/README.md#putorgsorgidresourcesdefsdefid) - Update a Resource Definition.
* [putOrgsOrgIdResourcesDriversDriverId](docs/public/README.md#putorgsorgidresourcesdriversdriverid) - Update a Resource Driver.
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
