# SecurityManagementPrivilegesApi

All URIs are relative to *https://localhost/service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPrivilege**](SecurityManagementPrivilegesApi.md#createPrivilege) | **POST** /v1/security/privileges/wildcard | Create a wildcard type privilege.
[**createPrivilege1**](SecurityManagementPrivilegesApi.md#createPrivilege1) | **POST** /v1/security/privileges/application | Create an application type privilege.
[**createPrivilege2**](SecurityManagementPrivilegesApi.md#createPrivilege2) | **POST** /v1/security/privileges/repository-content-selector | Create a repository content selector type privilege.
[**createPrivilege3**](SecurityManagementPrivilegesApi.md#createPrivilege3) | **POST** /v1/security/privileges/repository-admin | Create a repository admin type privilege.
[**createPrivilege4**](SecurityManagementPrivilegesApi.md#createPrivilege4) | **POST** /v1/security/privileges/repository-view | Create a repository view type privilege.
[**createPrivilege5**](SecurityManagementPrivilegesApi.md#createPrivilege5) | **POST** /v1/security/privileges/script | Create a script type privilege.
[**deletePrivilege**](SecurityManagementPrivilegesApi.md#deletePrivilege) | **DELETE** /v1/security/privileges/{privilegeName} | Delete a privilege by name.
[**getPrivilege**](SecurityManagementPrivilegesApi.md#getPrivilege) | **GET** /v1/security/privileges/{privilegeName} | Retrieve a privilege by name.
[**getPrivileges**](SecurityManagementPrivilegesApi.md#getPrivileges) | **GET** /v1/security/privileges | Retrieve a list of privileges.
[**updatePrivilege**](SecurityManagementPrivilegesApi.md#updatePrivilege) | **PUT** /v1/security/privileges/wildcard/{privilegeName} | Update a wildcard type privilege.
[**updatePrivilege1**](SecurityManagementPrivilegesApi.md#updatePrivilege1) | **PUT** /v1/security/privileges/application/{privilegeName} | Update an application type privilege.
[**updatePrivilege2**](SecurityManagementPrivilegesApi.md#updatePrivilege2) | **PUT** /v1/security/privileges/repository-view/{privilegeName} | Update a repository view type privilege.
[**updatePrivilege3**](SecurityManagementPrivilegesApi.md#updatePrivilege3) | **PUT** /v1/security/privileges/repository-content-selector/{privilegeName} | Update a repository content selector type privilege.
[**updatePrivilege4**](SecurityManagementPrivilegesApi.md#updatePrivilege4) | **PUT** /v1/security/privileges/repository-admin/{privilegeName} | Update a repository admin type privilege.
[**updatePrivilege5**](SecurityManagementPrivilegesApi.md#updatePrivilege5) | **PUT** /v1/security/privileges/script/{privilegeName} | Update a script type privilege.


<a name="createPrivilege"></a>
# **createPrivilege**
> createPrivilege(body)

Create a wildcard type privilege.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
ApiPrivilegeWildcardRequest body = new ApiPrivilegeWildcardRequest(); // ApiPrivilegeWildcardRequest | The privilege to create.
try {
    apiInstance.createPrivilege(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#createPrivilege");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiPrivilegeWildcardRequest**](ApiPrivilegeWildcardRequest.md)| The privilege to create. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPrivilege1"></a>
# **createPrivilege1**
> createPrivilege1(body)

Create an application type privilege.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
ApiPrivilegeApplicationRequest body = new ApiPrivilegeApplicationRequest(); // ApiPrivilegeApplicationRequest | The privilege to create.
try {
    apiInstance.createPrivilege1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#createPrivilege1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiPrivilegeApplicationRequest**](ApiPrivilegeApplicationRequest.md)| The privilege to create. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPrivilege2"></a>
# **createPrivilege2**
> createPrivilege2(body)

Create a repository content selector type privilege.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
ApiPrivilegeRepositoryContentSelectorRequest body = new ApiPrivilegeRepositoryContentSelectorRequest(); // ApiPrivilegeRepositoryContentSelectorRequest | The privilege to create.
try {
    apiInstance.createPrivilege2(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#createPrivilege2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiPrivilegeRepositoryContentSelectorRequest**](ApiPrivilegeRepositoryContentSelectorRequest.md)| The privilege to create. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPrivilege3"></a>
# **createPrivilege3**
> createPrivilege3(body)

Create a repository admin type privilege.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
ApiPrivilegeRepositoryAdminRequest body = new ApiPrivilegeRepositoryAdminRequest(); // ApiPrivilegeRepositoryAdminRequest | The privilege to create.
try {
    apiInstance.createPrivilege3(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#createPrivilege3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiPrivilegeRepositoryAdminRequest**](ApiPrivilegeRepositoryAdminRequest.md)| The privilege to create. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPrivilege4"></a>
# **createPrivilege4**
> createPrivilege4(body)

Create a repository view type privilege.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
ApiPrivilegeRepositoryViewRequest body = new ApiPrivilegeRepositoryViewRequest(); // ApiPrivilegeRepositoryViewRequest | The privilege to create.
try {
    apiInstance.createPrivilege4(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#createPrivilege4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiPrivilegeRepositoryViewRequest**](ApiPrivilegeRepositoryViewRequest.md)| The privilege to create. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPrivilege5"></a>
# **createPrivilege5**
> createPrivilege5(body)

Create a script type privilege.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
ApiPrivilegeScriptRequest body = new ApiPrivilegeScriptRequest(); // ApiPrivilegeScriptRequest | The privilege to create.
try {
    apiInstance.createPrivilege5(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#createPrivilege5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiPrivilegeScriptRequest**](ApiPrivilegeScriptRequest.md)| The privilege to create. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePrivilege"></a>
# **deletePrivilege**
> deletePrivilege(privilegeName)

Delete a privilege by name.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
String privilegeName = "privilegeName_example"; // String | The name of the privilege to delete.
try {
    apiInstance.deletePrivilege(privilegeName);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#deletePrivilege");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilegeName** | **String**| The name of the privilege to delete. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPrivilege"></a>
# **getPrivilege**
> ApiPrivilege getPrivilege(privilegeName)

Retrieve a privilege by name.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
String privilegeName = "privilegeName_example"; // String | The name of the privilege to retrieve.
try {
    ApiPrivilege result = apiInstance.getPrivilege(privilegeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#getPrivilege");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilegeName** | **String**| The name of the privilege to retrieve. |

### Return type

[**ApiPrivilege**](ApiPrivilege.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPrivileges"></a>
# **getPrivileges**
> List&lt;ApiPrivilege&gt; getPrivileges()

Retrieve a list of privileges.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
try {
    List<ApiPrivilege> result = apiInstance.getPrivileges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#getPrivileges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ApiPrivilege&gt;**](ApiPrivilege.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePrivilege"></a>
# **updatePrivilege**
> updatePrivilege(privilegeName, body)

Update a wildcard type privilege.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
String privilegeName = "privilegeName_example"; // String | The name of the privilege to update.
ApiPrivilegeWildcardRequest body = new ApiPrivilegeWildcardRequest(); // ApiPrivilegeWildcardRequest | The privilege to update.
try {
    apiInstance.updatePrivilege(privilegeName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#updatePrivilege");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilegeName** | **String**| The name of the privilege to update. |
 **body** | [**ApiPrivilegeWildcardRequest**](ApiPrivilegeWildcardRequest.md)| The privilege to update. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePrivilege1"></a>
# **updatePrivilege1**
> updatePrivilege1(privilegeName, body)

Update an application type privilege.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
String privilegeName = "privilegeName_example"; // String | The name of the privilege to update.
ApiPrivilegeApplicationRequest body = new ApiPrivilegeApplicationRequest(); // ApiPrivilegeApplicationRequest | The privilege to update.
try {
    apiInstance.updatePrivilege1(privilegeName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#updatePrivilege1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilegeName** | **String**| The name of the privilege to update. |
 **body** | [**ApiPrivilegeApplicationRequest**](ApiPrivilegeApplicationRequest.md)| The privilege to update. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePrivilege2"></a>
# **updatePrivilege2**
> updatePrivilege2(privilegeName, body)

Update a repository view type privilege.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
String privilegeName = "privilegeName_example"; // String | The name of the privilege to update.
ApiPrivilegeRepositoryViewRequest body = new ApiPrivilegeRepositoryViewRequest(); // ApiPrivilegeRepositoryViewRequest | The privilege to update.
try {
    apiInstance.updatePrivilege2(privilegeName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#updatePrivilege2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilegeName** | **String**| The name of the privilege to update. |
 **body** | [**ApiPrivilegeRepositoryViewRequest**](ApiPrivilegeRepositoryViewRequest.md)| The privilege to update. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePrivilege3"></a>
# **updatePrivilege3**
> updatePrivilege3(privilegeName, body)

Update a repository content selector type privilege.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
String privilegeName = "privilegeName_example"; // String | The name of the privilege to update.
ApiPrivilegeRepositoryContentSelectorRequest body = new ApiPrivilegeRepositoryContentSelectorRequest(); // ApiPrivilegeRepositoryContentSelectorRequest | The privilege to update.
try {
    apiInstance.updatePrivilege3(privilegeName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#updatePrivilege3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilegeName** | **String**| The name of the privilege to update. |
 **body** | [**ApiPrivilegeRepositoryContentSelectorRequest**](ApiPrivilegeRepositoryContentSelectorRequest.md)| The privilege to update. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePrivilege4"></a>
# **updatePrivilege4**
> updatePrivilege4(privilegeName, body)

Update a repository admin type privilege.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
String privilegeName = "privilegeName_example"; // String | The name of the privilege to update.
ApiPrivilegeRepositoryAdminRequest body = new ApiPrivilegeRepositoryAdminRequest(); // ApiPrivilegeRepositoryAdminRequest | The privilege to update.
try {
    apiInstance.updatePrivilege4(privilegeName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#updatePrivilege4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilegeName** | **String**| The name of the privilege to update. |
 **body** | [**ApiPrivilegeRepositoryAdminRequest**](ApiPrivilegeRepositoryAdminRequest.md)| The privilege to update. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePrivilege5"></a>
# **updatePrivilege5**
> updatePrivilege5(privilegeName, body)

Update a script type privilege.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityManagementPrivilegesApi;


SecurityManagementPrivilegesApi apiInstance = new SecurityManagementPrivilegesApi();
String privilegeName = "privilegeName_example"; // String | The name of the privilege to update.
ApiPrivilegeScriptRequest body = new ApiPrivilegeScriptRequest(); // ApiPrivilegeScriptRequest | The privilege to update.
try {
    apiInstance.updatePrivilege5(privilegeName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityManagementPrivilegesApi#updatePrivilege5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilegeName** | **String**| The name of the privilege to update. |
 **body** | [**ApiPrivilegeScriptRequest**](ApiPrivilegeScriptRequest.md)| The privilege to update. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

