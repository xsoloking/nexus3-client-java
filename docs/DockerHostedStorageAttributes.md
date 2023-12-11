
# DockerHostedStorageAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blobStoreName** | **String** | Blob store used to store repository contents |  [optional]
**strictContentTypeValidation** | **Boolean** | Whether to validate uploaded content&#39;s MIME type appropriate for the repository format | 
**writePolicy** | [**WritePolicyEnum**](#WritePolicyEnum) | Controls if deployments of and updates to assets are allowed | 
**latestPolicy** | **Boolean** | Whether to allow redeploying the &#39;latest&#39; tag but defer to the Deployment Policy for all other tags |  [optional]


<a name="WritePolicyEnum"></a>
## Enum: WritePolicyEnum
Name | Value
---- | -----
ALLOW | &quot;allow&quot;
ALLOW_ONCE | &quot;allow_once&quot;
DENY | &quot;deny&quot;



