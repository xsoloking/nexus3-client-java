
# ApiPrivilegeApplicationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the privilege.  This value cannot be changed. |  [optional]
**description** | **String** |  |  [optional]
**actions** | [**List&lt;ActionsEnum&gt;**](#List&lt;ActionsEnum&gt;) | A collection of actions to associate with the privilege, using BREAD syntax (browse,read,edit,add,delete,all) as well as &#39;run&#39; for script privileges. |  [optional]
**domain** | **String** | The domain (i.e. &#39;blobstores&#39;, &#39;capabilities&#39; or even &#39;*&#39; for all) that this privilege is granting access to.  Note that creating new privileges with a domain is only necessary when using plugins that define their own domain(s). |  [optional]


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



