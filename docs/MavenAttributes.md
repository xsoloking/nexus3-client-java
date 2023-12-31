
# MavenAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**versionPolicy** | [**VersionPolicyEnum**](#VersionPolicyEnum) | What type of artifacts does this repository store? |  [optional]
**layoutPolicy** | [**LayoutPolicyEnum**](#LayoutPolicyEnum) | Validate that all paths are maven artifact or metadata paths |  [optional]
**contentDisposition** | [**ContentDispositionEnum**](#ContentDispositionEnum) | Content Disposition |  [optional]


<a name="VersionPolicyEnum"></a>
## Enum: VersionPolicyEnum
Name | Value
---- | -----
RELEASE | &quot;RELEASE&quot;
SNAPSHOT | &quot;SNAPSHOT&quot;
MIXED | &quot;MIXED&quot;


<a name="LayoutPolicyEnum"></a>
## Enum: LayoutPolicyEnum
Name | Value
---- | -----
STRICT | &quot;STRICT&quot;
PERMISSIVE | &quot;PERMISSIVE&quot;


<a name="ContentDispositionEnum"></a>
## Enum: ContentDispositionEnum
Name | Value
---- | -----
INLINE | &quot;INLINE&quot;
ATTACHMENT | &quot;ATTACHMENT&quot;



