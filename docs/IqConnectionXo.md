
# IqConnectionXo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | Whether to use Sonatype Repository Firewall |  [optional]
**showLink** | **Boolean** | Show Sonatype Repository Firewall link in Browse menu when server is enabled |  [optional]
**url** | **String** | The address of your Sonatype Repository Firewall |  [optional]
**authenticationType** | [**AuthenticationTypeEnum**](#AuthenticationTypeEnum) | Authentication method | 
**username** | **String** | User with access to Sonatype Repository Firewall |  [optional]
**password** | **String** | Credentials for the Sonatype Repository Firewall User |  [optional]
**useTrustStoreForUrl** | **Boolean** | Use certificates stored in the Nexus Repository Manager truststore to connect to Sonatype Repository Firewall |  [optional]
**timeoutSeconds** | **Integer** | Seconds to wait for activity before stopping and retrying the connection. Leave blank to use the globally defined HTTP timeout. |  [optional]
**properties** | **String** | Additional properties to configure for Sonatype Repository Firewall |  [optional]
**failOpenModeEnabled** | **Boolean** | Allow by default when quarantine is enabled and the IQ connection fails |  [optional]


<a name="AuthenticationTypeEnum"></a>
## Enum: AuthenticationTypeEnum
Name | Value
---- | -----
USER | &quot;USER&quot;
PKI | &quot;PKI&quot;



