
# ApiPrivilegeRepositoryViewRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the privilege.  This value cannot be changed. |  [optional]
**description** | **String** |  |  [optional]
**actions** | [**List&lt;ActionsEnum&gt;**](#List&lt;ActionsEnum&gt;) | A collection of actions to associate with the privilege, using BREAD syntax (browse,read,edit,add,delete,all) as well as &#39;run&#39; for script privileges. |  [optional]
**format** | **String** | The repository format (i.e &#39;nuget&#39;, &#39;npm&#39;) this privilege will grant access to (or * for all). |  [optional]
**repository** | **String** | The name of the repository this privilege will grant access to (or * for all). |  [optional]


<a name="List<ActionsEnum>"></a>
## Enum: List&lt;ActionsEnum&gt;
Name | Value
---- | -----
READ | &quot;READ&quot;
BROWSE | &quot;BROWSE&quot;
EDIT | &quot;EDIT&quot;
ADD | &quot;ADD&quot;
DELETE | &quot;DELETE&quot;
RUN | &quot;RUN&quot;
ASSOCIATE | &quot;ASSOCIATE&quot;
DISASSOCIATE | &quot;DISASSOCIATE&quot;
ALL | &quot;ALL&quot;



