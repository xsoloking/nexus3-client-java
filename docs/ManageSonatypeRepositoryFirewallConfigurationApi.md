# ManageSonatypeRepositoryFirewallConfigurationApi

All URIs are relative to *https://localhost/service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableIq**](ManageSonatypeRepositoryFirewallConfigurationApi.md#disableIq) | **POST** /v1/iq/disable | Disable Sonatype Repository Firewall
[**enableIq**](ManageSonatypeRepositoryFirewallConfigurationApi.md#enableIq) | **POST** /v1/iq/enable | Enable Sonatype Repository Firewall
[**getConfiguration**](ManageSonatypeRepositoryFirewallConfigurationApi.md#getConfiguration) | **GET** /v1/iq | Get Sonatype Repository Firewall configuration
[**updateConfiguration**](ManageSonatypeRepositoryFirewallConfigurationApi.md#updateConfiguration) | **PUT** /v1/iq | Update Sonatype Repository Firewall configuration
[**verifyConnection**](ManageSonatypeRepositoryFirewallConfigurationApi.md#verifyConnection) | **POST** /v1/iq/verify-connection | Verify Sonatype Repository Firewall connection


<a name="disableIq"></a>
# **disableIq**
> disableIq()

Disable Sonatype Repository Firewall



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManageSonatypeRepositoryFirewallConfigurationApi;


ManageSonatypeRepositoryFirewallConfigurationApi apiInstance = new ManageSonatypeRepositoryFirewallConfigurationApi();
try {
    apiInstance.disableIq();
} catch (ApiException e) {
    System.err.println("Exception when calling ManageSonatypeRepositoryFirewallConfigurationApi#disableIq");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enableIq"></a>
# **enableIq**
> enableIq()

Enable Sonatype Repository Firewall



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManageSonatypeRepositoryFirewallConfigurationApi;


ManageSonatypeRepositoryFirewallConfigurationApi apiInstance = new ManageSonatypeRepositoryFirewallConfigurationApi();
try {
    apiInstance.enableIq();
} catch (ApiException e) {
    System.err.println("Exception when calling ManageSonatypeRepositoryFirewallConfigurationApi#enableIq");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConfiguration"></a>
# **getConfiguration**
> getConfiguration()

Get Sonatype Repository Firewall configuration



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManageSonatypeRepositoryFirewallConfigurationApi;


ManageSonatypeRepositoryFirewallConfigurationApi apiInstance = new ManageSonatypeRepositoryFirewallConfigurationApi();
try {
    apiInstance.getConfiguration();
} catch (ApiException e) {
    System.err.println("Exception when calling ManageSonatypeRepositoryFirewallConfigurationApi#getConfiguration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateConfiguration"></a>
# **updateConfiguration**
> updateConfiguration(body)

Update Sonatype Repository Firewall configuration



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManageSonatypeRepositoryFirewallConfigurationApi;


ManageSonatypeRepositoryFirewallConfigurationApi apiInstance = new ManageSonatypeRepositoryFirewallConfigurationApi();
IqConnectionXo body = new IqConnectionXo(); // IqConnectionXo | 
try {
    apiInstance.updateConfiguration(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ManageSonatypeRepositoryFirewallConfigurationApi#updateConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IqConnectionXo**](IqConnectionXo.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyConnection"></a>
# **verifyConnection**
> verifyConnection()

Verify Sonatype Repository Firewall connection



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ManageSonatypeRepositoryFirewallConfigurationApi;


ManageSonatypeRepositoryFirewallConfigurationApi apiInstance = new ManageSonatypeRepositoryFirewallConfigurationApi();
try {
    apiInstance.verifyConnection();
} catch (ApiException e) {
    System.err.println("Exception when calling ManageSonatypeRepositoryFirewallConfigurationApi#verifyConnection");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

