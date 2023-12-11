
# DockerProxyAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**indexType** | [**IndexTypeEnum**](#IndexTypeEnum) | Type of Docker Index |  [optional]
**indexUrl** | **String** | Url of Docker Index to use |  [optional]
**cacheForeignLayers** | **Boolean** | Allow Nexus Repository Manager to download and cache foreign layers |  [optional]
**foreignLayerUrlWhitelist** | **List&lt;String&gt;** | Regular expressions used to identify URLs that are allowed for foreign layer requests |  [optional]


<a name="IndexTypeEnum"></a>
## Enum: IndexTypeEnum
Name | Value
---- | -----
HUB | &quot;HUB&quot;
REGISTRY | &quot;REGISTRY&quot;
CUSTOM | &quot;CUSTOM&quot;



