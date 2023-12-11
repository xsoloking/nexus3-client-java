# RepositoryManagementApi

All URIs are relative to *https://localhost/service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRepository**](RepositoryManagementApi.md#createRepository) | **POST** /v1/repositories/maven/group | Create Maven group repository
[**createRepository1**](RepositoryManagementApi.md#createRepository1) | **POST** /v1/repositories/maven/hosted | Create Maven hosted repository
[**createRepository10**](RepositoryManagementApi.md#createRepository10) | **POST** /v1/repositories/npm/proxy | Create npm proxy repository
[**createRepository11**](RepositoryManagementApi.md#createRepository11) | **POST** /v1/repositories/nuget/group | Create NuGet group repository
[**createRepository12**](RepositoryManagementApi.md#createRepository12) | **POST** /v1/repositories/nuget/hosted | Create NuGet hosted repository
[**createRepository13**](RepositoryManagementApi.md#createRepository13) | **POST** /v1/repositories/nuget/proxy | Create NuGet proxy repository
[**createRepository14**](RepositoryManagementApi.md#createRepository14) | **POST** /v1/repositories/rubygems/group | Create RubyGems group repository
[**createRepository15**](RepositoryManagementApi.md#createRepository15) | **POST** /v1/repositories/rubygems/hosted | Create RubyGems hosted repository
[**createRepository16**](RepositoryManagementApi.md#createRepository16) | **POST** /v1/repositories/rubygems/proxy | Create RubyGems proxy repository
[**createRepository17**](RepositoryManagementApi.md#createRepository17) | **POST** /v1/repositories/docker/group | Create Docker group repository
[**createRepository18**](RepositoryManagementApi.md#createRepository18) | **POST** /v1/repositories/docker/hosted | Create Docker hosted repository
[**createRepository19**](RepositoryManagementApi.md#createRepository19) | **POST** /v1/repositories/docker/proxy | Create Docker proxy repository
[**createRepository2**](RepositoryManagementApi.md#createRepository2) | **POST** /v1/repositories/maven/proxy | Create Maven proxy repository
[**createRepository20**](RepositoryManagementApi.md#createRepository20) | **POST** /v1/repositories/yum/group | Create Yum group repository
[**createRepository21**](RepositoryManagementApi.md#createRepository21) | **POST** /v1/repositories/yum/hosted | Create Yum hosted repository
[**createRepository22**](RepositoryManagementApi.md#createRepository22) | **POST** /v1/repositories/yum/proxy | Create Yum proxy repository
[**createRepository23**](RepositoryManagementApi.md#createRepository23) | **POST** /v1/repositories/helm/hosted | Create Helm hosted repository
[**createRepository24**](RepositoryManagementApi.md#createRepository24) | **POST** /v1/repositories/helm/proxy | Create Helm proxy repository
[**createRepository25**](RepositoryManagementApi.md#createRepository25) | **POST** /v1/repositories/gitlfs/hosted | Create Git LFS hosted repository
[**createRepository26**](RepositoryManagementApi.md#createRepository26) | **POST** /v1/repositories/pypi/group | Create PyPI group repository
[**createRepository27**](RepositoryManagementApi.md#createRepository27) | **POST** /v1/repositories/pypi/hosted | Create PyPI hosted repository
[**createRepository28**](RepositoryManagementApi.md#createRepository28) | **POST** /v1/repositories/pypi/proxy | Create PyPI proxy repository
[**createRepository29**](RepositoryManagementApi.md#createRepository29) | **POST** /v1/repositories/conda/proxy | Create conda proxy repository
[**createRepository3**](RepositoryManagementApi.md#createRepository3) | **POST** /v1/repositories/apt/hosted | Create APT hosted repository
[**createRepository30**](RepositoryManagementApi.md#createRepository30) | **POST** /v1/repositories/conan/proxy | Create Conan proxy repository
[**createRepository31**](RepositoryManagementApi.md#createRepository31) | **POST** /v1/repositories/r/group | Create R group repository
[**createRepository32**](RepositoryManagementApi.md#createRepository32) | **POST** /v1/repositories/r/hosted | Create R hosted repository
[**createRepository33**](RepositoryManagementApi.md#createRepository33) | **POST** /v1/repositories/r/proxy | Create R proxy repository
[**createRepository34**](RepositoryManagementApi.md#createRepository34) | **POST** /v1/repositories/cocoapods/proxy | Create Cocoapods proxy repository
[**createRepository35**](RepositoryManagementApi.md#createRepository35) | **POST** /v1/repositories/go/group | Create a Go group repository
[**createRepository36**](RepositoryManagementApi.md#createRepository36) | **POST** /v1/repositories/go/proxy | Create a Go proxy repository
[**createRepository37**](RepositoryManagementApi.md#createRepository37) | **POST** /v1/repositories/p2/proxy | Create p2 proxy repository
[**createRepository38**](RepositoryManagementApi.md#createRepository38) | **POST** /v1/repositories/bower/group | Create Bower group repository
[**createRepository39**](RepositoryManagementApi.md#createRepository39) | **POST** /v1/repositories/bower/hosted | Create Bower hosted repository
[**createRepository4**](RepositoryManagementApi.md#createRepository4) | **POST** /v1/repositories/apt/proxy | Create APT proxy repository
[**createRepository40**](RepositoryManagementApi.md#createRepository40) | **POST** /v1/repositories/bower/proxy | Create Bower proxy repository
[**createRepository5**](RepositoryManagementApi.md#createRepository5) | **POST** /v1/repositories/raw/group | Create raw group repository
[**createRepository6**](RepositoryManagementApi.md#createRepository6) | **POST** /v1/repositories/raw/hosted | Create raw hosted repository
[**createRepository7**](RepositoryManagementApi.md#createRepository7) | **POST** /v1/repositories/raw/proxy | Create raw proxy repository
[**createRepository8**](RepositoryManagementApi.md#createRepository8) | **POST** /v1/repositories/npm/group | Create npm group repository
[**createRepository9**](RepositoryManagementApi.md#createRepository9) | **POST** /v1/repositories/npm/hosted | Create npm hosted repository
[**deleteRepository**](RepositoryManagementApi.md#deleteRepository) | **DELETE** /v1/repositories/{repositoryName} | Delete repository of any format
[**disableRepositoryHealthCheck**](RepositoryManagementApi.md#disableRepositoryHealthCheck) | **DELETE** /v1/repositories/{repositoryName}/health-check | Disable repository health check. Proxy repositories only.
[**enableRepositoryHealthCheck**](RepositoryManagementApi.md#enableRepositoryHealthCheck) | **POST** /v1/repositories/{repositoryName}/health-check | Enable repository health check. Proxy repositories only.
[**getRepositories**](RepositoryManagementApi.md#getRepositories) | **GET** /v1/repositorySettings | List repositories
[**getRepositories1**](RepositoryManagementApi.md#getRepositories1) | **GET** /v1/repositories | List repositories
[**getRepository**](RepositoryManagementApi.md#getRepository) | **GET** /v1/repositories/{repositoryName} | Get repository details
[**getRepository1**](RepositoryManagementApi.md#getRepository1) | **GET** /v1/repositories/maven/group/{repositoryName} | Get repository
[**getRepository10**](RepositoryManagementApi.md#getRepository10) | **GET** /v1/repositories/npm/hosted/{repositoryName} | Get repository
[**getRepository11**](RepositoryManagementApi.md#getRepository11) | **GET** /v1/repositories/npm/proxy/{repositoryName} | Get repository
[**getRepository12**](RepositoryManagementApi.md#getRepository12) | **GET** /v1/repositories/nuget/group/{repositoryName} | Get repository
[**getRepository13**](RepositoryManagementApi.md#getRepository13) | **GET** /v1/repositories/nuget/hosted/{repositoryName} | Get repository
[**getRepository14**](RepositoryManagementApi.md#getRepository14) | **GET** /v1/repositories/nuget/proxy/{repositoryName} | Get repository
[**getRepository15**](RepositoryManagementApi.md#getRepository15) | **GET** /v1/repositories/rubygems/group/{repositoryName} | Get repository
[**getRepository16**](RepositoryManagementApi.md#getRepository16) | **GET** /v1/repositories/rubygems/hosted/{repositoryName} | Get repository
[**getRepository17**](RepositoryManagementApi.md#getRepository17) | **GET** /v1/repositories/rubygems/proxy/{repositoryName} | Get repository
[**getRepository18**](RepositoryManagementApi.md#getRepository18) | **GET** /v1/repositories/docker/group/{repositoryName} | Get repository
[**getRepository19**](RepositoryManagementApi.md#getRepository19) | **GET** /v1/repositories/docker/hosted/{repositoryName} | Get repository
[**getRepository2**](RepositoryManagementApi.md#getRepository2) | **GET** /v1/repositories/maven/hosted/{repositoryName} | Get repository
[**getRepository20**](RepositoryManagementApi.md#getRepository20) | **GET** /v1/repositories/docker/proxy/{repositoryName} | Get repository
[**getRepository21**](RepositoryManagementApi.md#getRepository21) | **GET** /v1/repositories/yum/group/{repositoryName} | Get repository
[**getRepository22**](RepositoryManagementApi.md#getRepository22) | **GET** /v1/repositories/yum/hosted/{repositoryName} | Get repository
[**getRepository23**](RepositoryManagementApi.md#getRepository23) | **GET** /v1/repositories/yum/proxy/{repositoryName} | Get repository
[**getRepository24**](RepositoryManagementApi.md#getRepository24) | **GET** /v1/repositories/helm/hosted/{repositoryName} | Get repository
[**getRepository25**](RepositoryManagementApi.md#getRepository25) | **GET** /v1/repositories/helm/proxy/{repositoryName} | Get repository
[**getRepository26**](RepositoryManagementApi.md#getRepository26) | **GET** /v1/repositories/gitlfs/hosted/{repositoryName} | Get repository
[**getRepository27**](RepositoryManagementApi.md#getRepository27) | **GET** /v1/repositories/pypi/group/{repositoryName} | Get repository
[**getRepository28**](RepositoryManagementApi.md#getRepository28) | **GET** /v1/repositories/pypi/hosted/{repositoryName} | Get repository
[**getRepository29**](RepositoryManagementApi.md#getRepository29) | **GET** /v1/repositories/pypi/proxy/{repositoryName} | Get repository
[**getRepository3**](RepositoryManagementApi.md#getRepository3) | **GET** /v1/repositories/maven/proxy/{repositoryName} | Get repository
[**getRepository30**](RepositoryManagementApi.md#getRepository30) | **GET** /v1/repositories/conda/proxy/{repositoryName} | Get repository
[**getRepository31**](RepositoryManagementApi.md#getRepository31) | **GET** /v1/repositories/conan/proxy/{repositoryName} | Get repository
[**getRepository32**](RepositoryManagementApi.md#getRepository32) | **GET** /v1/repositories/r/group/{repositoryName} | Get repository
[**getRepository33**](RepositoryManagementApi.md#getRepository33) | **GET** /v1/repositories/r/hosted/{repositoryName} | Get repository
[**getRepository34**](RepositoryManagementApi.md#getRepository34) | **GET** /v1/repositories/r/proxy/{repositoryName} | Get repository
[**getRepository35**](RepositoryManagementApi.md#getRepository35) | **GET** /v1/repositories/cocoapods/proxy/{repositoryName} | Get repository
[**getRepository36**](RepositoryManagementApi.md#getRepository36) | **GET** /v1/repositories/go/group/{repositoryName} | Get repository
[**getRepository37**](RepositoryManagementApi.md#getRepository37) | **GET** /v1/repositories/go/proxy/{repositoryName} | Get repository
[**getRepository38**](RepositoryManagementApi.md#getRepository38) | **GET** /v1/repositories/p2/proxy/{repositoryName} | Get repository
[**getRepository39**](RepositoryManagementApi.md#getRepository39) | **GET** /v1/repositories/bower/group/{repositoryName} | Get repository
[**getRepository4**](RepositoryManagementApi.md#getRepository4) | **GET** /v1/repositories/apt/hosted/{repositoryName} | Get repository
[**getRepository40**](RepositoryManagementApi.md#getRepository40) | **GET** /v1/repositories/bower/hosted/{repositoryName} | Get repository
[**getRepository41**](RepositoryManagementApi.md#getRepository41) | **GET** /v1/repositories/bower/proxy/{repositoryName} | Get repository
[**getRepository5**](RepositoryManagementApi.md#getRepository5) | **GET** /v1/repositories/apt/proxy/{repositoryName} | Get repository
[**getRepository6**](RepositoryManagementApi.md#getRepository6) | **GET** /v1/repositories/raw/group/{repositoryName} | Get repository
[**getRepository7**](RepositoryManagementApi.md#getRepository7) | **GET** /v1/repositories/raw/hosted/{repositoryName} | Get repository
[**getRepository8**](RepositoryManagementApi.md#getRepository8) | **GET** /v1/repositories/raw/proxy/{repositoryName} | Get repository
[**getRepository9**](RepositoryManagementApi.md#getRepository9) | **GET** /v1/repositories/npm/group/{repositoryName} | Get repository
[**invalidateCache**](RepositoryManagementApi.md#invalidateCache) | **POST** /v1/repositories/{repositoryName}/invalidate-cache | Invalidate repository cache. Proxy or group repositories only.
[**rebuildIndex**](RepositoryManagementApi.md#rebuildIndex) | **POST** /v1/repositories/{repositoryName}/rebuild-index | Schedule a &#39;Repair - Rebuild repository search&#39; Task. Hosted or proxy repositories only.
[**updateRepository**](RepositoryManagementApi.md#updateRepository) | **PUT** /v1/repositories/maven/group/{repositoryName} | Update Maven group repository
[**updateRepository1**](RepositoryManagementApi.md#updateRepository1) | **PUT** /v1/repositories/maven/hosted/{repositoryName} | Update Maven hosted repository
[**updateRepository10**](RepositoryManagementApi.md#updateRepository10) | **PUT** /v1/repositories/npm/proxy/{repositoryName} | Update npm proxy repository
[**updateRepository11**](RepositoryManagementApi.md#updateRepository11) | **PUT** /v1/repositories/nuget/group/{repositoryName} | Update NuGet group repository
[**updateRepository12**](RepositoryManagementApi.md#updateRepository12) | **PUT** /v1/repositories/nuget/hosted/{repositoryName} | Update NuGet hosted repository
[**updateRepository13**](RepositoryManagementApi.md#updateRepository13) | **PUT** /v1/repositories/nuget/proxy/{repositoryName} | Update NuGet proxy repository
[**updateRepository14**](RepositoryManagementApi.md#updateRepository14) | **PUT** /v1/repositories/rubygems/group/{repositoryName} | Update RubyGems group repository
[**updateRepository15**](RepositoryManagementApi.md#updateRepository15) | **PUT** /v1/repositories/rubygems/hosted/{repositoryName} | Update RubyGems hosted repository
[**updateRepository16**](RepositoryManagementApi.md#updateRepository16) | **PUT** /v1/repositories/rubygems/proxy/{repositoryName} | Update RubyGems proxy repository
[**updateRepository17**](RepositoryManagementApi.md#updateRepository17) | **PUT** /v1/repositories/docker/group/{repositoryName} | Update Docker group repository
[**updateRepository18**](RepositoryManagementApi.md#updateRepository18) | **PUT** /v1/repositories/docker/hosted/{repositoryName} | Update Docker hosted repository
[**updateRepository19**](RepositoryManagementApi.md#updateRepository19) | **PUT** /v1/repositories/docker/proxy/{repositoryName} | Update Docker group repository
[**updateRepository2**](RepositoryManagementApi.md#updateRepository2) | **PUT** /v1/repositories/maven/proxy/{repositoryName} | Update Maven proxy repository
[**updateRepository20**](RepositoryManagementApi.md#updateRepository20) | **PUT** /v1/repositories/yum/group/{repositoryName} | Update Yum group repository
[**updateRepository21**](RepositoryManagementApi.md#updateRepository21) | **PUT** /v1/repositories/yum/hosted/{repositoryName} | Update Yum hosted repository
[**updateRepository22**](RepositoryManagementApi.md#updateRepository22) | **PUT** /v1/repositories/yum/proxy/{repositoryName} | Update Yum proxy repository
[**updateRepository23**](RepositoryManagementApi.md#updateRepository23) | **PUT** /v1/repositories/helm/hosted/{repositoryName} | Update Helm hosted repository
[**updateRepository24**](RepositoryManagementApi.md#updateRepository24) | **PUT** /v1/repositories/helm/proxy/{repositoryName} | Update Helm proxy repository
[**updateRepository25**](RepositoryManagementApi.md#updateRepository25) | **PUT** /v1/repositories/gitlfs/hosted/{repositoryName} | Update Git LFS hosted repository
[**updateRepository26**](RepositoryManagementApi.md#updateRepository26) | **PUT** /v1/repositories/pypi/group/{repositoryName} | Update PyPI group repository
[**updateRepository27**](RepositoryManagementApi.md#updateRepository27) | **PUT** /v1/repositories/pypi/hosted/{repositoryName} | Update PyPI hosted repository
[**updateRepository28**](RepositoryManagementApi.md#updateRepository28) | **PUT** /v1/repositories/pypi/proxy/{repositoryName} | Update PyPI proxy repository
[**updateRepository29**](RepositoryManagementApi.md#updateRepository29) | **PUT** /v1/repositories/conda/proxy/{repositoryName} | Update conda proxy repository
[**updateRepository3**](RepositoryManagementApi.md#updateRepository3) | **PUT** /v1/repositories/apt/hosted/{repositoryName} | Update APT hosted repository
[**updateRepository30**](RepositoryManagementApi.md#updateRepository30) | **PUT** /v1/repositories/conan/proxy/{repositoryName} | Update Conan proxy repository
[**updateRepository31**](RepositoryManagementApi.md#updateRepository31) | **PUT** /v1/repositories/r/group/{repositoryName} | Update R group repository
[**updateRepository32**](RepositoryManagementApi.md#updateRepository32) | **PUT** /v1/repositories/r/hosted/{repositoryName} | Update R hosted repository
[**updateRepository33**](RepositoryManagementApi.md#updateRepository33) | **PUT** /v1/repositories/r/proxy/{repositoryName} | Update R proxy repository
[**updateRepository34**](RepositoryManagementApi.md#updateRepository34) | **PUT** /v1/repositories/cocoapods/proxy/{repositoryName} | Update Cocoapods proxy repository
[**updateRepository35**](RepositoryManagementApi.md#updateRepository35) | **PUT** /v1/repositories/go/group/{repositoryName} | Update a Go group repository
[**updateRepository36**](RepositoryManagementApi.md#updateRepository36) | **PUT** /v1/repositories/go/proxy/{repositoryName} | Update a Go proxy repository
[**updateRepository37**](RepositoryManagementApi.md#updateRepository37) | **PUT** /v1/repositories/p2/proxy/{repositoryName} | Update p2 proxy repository
[**updateRepository38**](RepositoryManagementApi.md#updateRepository38) | **PUT** /v1/repositories/bower/group/{repositoryName} | Update Bower group repository
[**updateRepository39**](RepositoryManagementApi.md#updateRepository39) | **PUT** /v1/repositories/bower/hosted/{repositoryName} | Update Bower hosted repository
[**updateRepository4**](RepositoryManagementApi.md#updateRepository4) | **PUT** /v1/repositories/apt/proxy/{repositoryName} | Update APT proxy repository
[**updateRepository40**](RepositoryManagementApi.md#updateRepository40) | **PUT** /v1/repositories/bower/proxy/{repositoryName} | Update Bower proxy repository
[**updateRepository5**](RepositoryManagementApi.md#updateRepository5) | **PUT** /v1/repositories/raw/group/{repositoryName} | Update raw group repository
[**updateRepository6**](RepositoryManagementApi.md#updateRepository6) | **PUT** /v1/repositories/raw/hosted/{repositoryName} | Update raw hosted repository
[**updateRepository7**](RepositoryManagementApi.md#updateRepository7) | **PUT** /v1/repositories/raw/proxy/{repositoryName} | Update raw proxy repository
[**updateRepository8**](RepositoryManagementApi.md#updateRepository8) | **PUT** /v1/repositories/npm/group/{repositoryName} | Update npm group repository
[**updateRepository9**](RepositoryManagementApi.md#updateRepository9) | **PUT** /v1/repositories/npm/hosted/{repositoryName} | Update npm hosted repository


<a name="createRepository"></a>
# **createRepository**
> createRepository(body)

Create Maven group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
MavenGroupRepositoryApiRequest body = new MavenGroupRepositoryApiRequest(); // MavenGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MavenGroupRepositoryApiRequest**](MavenGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository1"></a>
# **createRepository1**
> createRepository1(body)

Create Maven hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
MavenHostedRepositoryApiRequest body = new MavenHostedRepositoryApiRequest(); // MavenHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MavenHostedRepositoryApiRequest**](MavenHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository10"></a>
# **createRepository10**
> createRepository10(body)

Create npm proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
NpmProxyRepositoryApiRequest body = new NpmProxyRepositoryApiRequest(); // NpmProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository10(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NpmProxyRepositoryApiRequest**](NpmProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository11"></a>
# **createRepository11**
> createRepository11(body)

Create NuGet group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
NugetGroupRepositoryApiRequest body = new NugetGroupRepositoryApiRequest(); // NugetGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository11(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository11");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NugetGroupRepositoryApiRequest**](NugetGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository12"></a>
# **createRepository12**
> createRepository12(body)

Create NuGet hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
NugetHostedRepositoryApiRequest body = new NugetHostedRepositoryApiRequest(); // NugetHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository12(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository12");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NugetHostedRepositoryApiRequest**](NugetHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository13"></a>
# **createRepository13**
> createRepository13(body)

Create NuGet proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
NugetProxyRepositoryApiRequest body = new NugetProxyRepositoryApiRequest(); // NugetProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository13(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository13");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NugetProxyRepositoryApiRequest**](NugetProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository14"></a>
# **createRepository14**
> createRepository14(body)

Create RubyGems group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RubyGemsGroupRepositoryApiRequest body = new RubyGemsGroupRepositoryApiRequest(); // RubyGemsGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository14(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository14");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RubyGemsGroupRepositoryApiRequest**](RubyGemsGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository15"></a>
# **createRepository15**
> createRepository15(body)

Create RubyGems hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RubyGemsHostedRepositoryApiRequest body = new RubyGemsHostedRepositoryApiRequest(); // RubyGemsHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository15(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository15");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RubyGemsHostedRepositoryApiRequest**](RubyGemsHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository16"></a>
# **createRepository16**
> createRepository16(body)

Create RubyGems proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RubyGemsProxyRepositoryApiRequest body = new RubyGemsProxyRepositoryApiRequest(); // RubyGemsProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository16(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository16");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RubyGemsProxyRepositoryApiRequest**](RubyGemsProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository17"></a>
# **createRepository17**
> createRepository17(body)

Create Docker group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
DockerGroupRepositoryApiRequest body = new DockerGroupRepositoryApiRequest(); // DockerGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository17(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository17");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DockerGroupRepositoryApiRequest**](DockerGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository18"></a>
# **createRepository18**
> createRepository18(body)

Create Docker hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
DockerHostedRepositoryApiRequest body = new DockerHostedRepositoryApiRequest(); // DockerHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository18(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository18");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DockerHostedRepositoryApiRequest**](DockerHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository19"></a>
# **createRepository19**
> createRepository19(body)

Create Docker proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
DockerProxyRepositoryApiRequest body = new DockerProxyRepositoryApiRequest(); // DockerProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository19(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository19");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DockerProxyRepositoryApiRequest**](DockerProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository2"></a>
# **createRepository2**
> createRepository2(body)

Create Maven proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
MavenProxyRepositoryApiRequest body = new MavenProxyRepositoryApiRequest(); // MavenProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository2(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MavenProxyRepositoryApiRequest**](MavenProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository20"></a>
# **createRepository20**
> createRepository20(body)

Create Yum group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
YumGroupRepositoryApiRequest body = new YumGroupRepositoryApiRequest(); // YumGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository20(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository20");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**YumGroupRepositoryApiRequest**](YumGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository21"></a>
# **createRepository21**
> createRepository21(body)

Create Yum hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
YumHostedRepositoryApiRequest body = new YumHostedRepositoryApiRequest(); // YumHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository21(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository21");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**YumHostedRepositoryApiRequest**](YumHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository22"></a>
# **createRepository22**
> createRepository22(body)

Create Yum proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
YumProxyRepositoryApiRequest body = new YumProxyRepositoryApiRequest(); // YumProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository22(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository22");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**YumProxyRepositoryApiRequest**](YumProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository23"></a>
# **createRepository23**
> createRepository23(body)

Create Helm hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
HelmHostedRepositoryApiRequest body = new HelmHostedRepositoryApiRequest(); // HelmHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository23(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository23");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HelmHostedRepositoryApiRequest**](HelmHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository24"></a>
# **createRepository24**
> createRepository24(body)

Create Helm proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
HelmProxyRepositoryApiRequest body = new HelmProxyRepositoryApiRequest(); // HelmProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository24(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository24");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HelmProxyRepositoryApiRequest**](HelmProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository25"></a>
# **createRepository25**
> createRepository25(body)

Create Git LFS hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
GitLfsHostedRepositoryApiRequest body = new GitLfsHostedRepositoryApiRequest(); // GitLfsHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository25(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository25");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GitLfsHostedRepositoryApiRequest**](GitLfsHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository26"></a>
# **createRepository26**
> createRepository26(body)

Create PyPI group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
PypiGroupRepositoryApiRequest body = new PypiGroupRepositoryApiRequest(); // PypiGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository26(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository26");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PypiGroupRepositoryApiRequest**](PypiGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository27"></a>
# **createRepository27**
> createRepository27(body)

Create PyPI hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
PypiHostedRepositoryApiRequest body = new PypiHostedRepositoryApiRequest(); // PypiHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository27(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository27");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PypiHostedRepositoryApiRequest**](PypiHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository28"></a>
# **createRepository28**
> createRepository28(body)

Create PyPI proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
PypiProxyRepositoryApiRequest body = new PypiProxyRepositoryApiRequest(); // PypiProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository28(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository28");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PypiProxyRepositoryApiRequest**](PypiProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository29"></a>
# **createRepository29**
> createRepository29(body)

Create conda proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
CondaProxyRepositoryApiRequest body = new CondaProxyRepositoryApiRequest(); // CondaProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository29(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository29");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CondaProxyRepositoryApiRequest**](CondaProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository3"></a>
# **createRepository3**
> createRepository3(body)

Create APT hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
AptHostedRepositoryApiRequest body = new AptHostedRepositoryApiRequest(); // AptHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository3(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AptHostedRepositoryApiRequest**](AptHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository30"></a>
# **createRepository30**
> createRepository30(body)

Create Conan proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
ConanProxyRepositoryApiRequest body = new ConanProxyRepositoryApiRequest(); // ConanProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository30(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository30");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConanProxyRepositoryApiRequest**](ConanProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository31"></a>
# **createRepository31**
> createRepository31(body)

Create R group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RGroupRepositoryApiRequest body = new RGroupRepositoryApiRequest(); // RGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository31(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository31");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RGroupRepositoryApiRequest**](RGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository32"></a>
# **createRepository32**
> createRepository32(body)

Create R hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RHostedRepositoryApiRequest body = new RHostedRepositoryApiRequest(); // RHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository32(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository32");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RHostedRepositoryApiRequest**](RHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository33"></a>
# **createRepository33**
> createRepository33(body)

Create R proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RProxyRepositoryApiRequest body = new RProxyRepositoryApiRequest(); // RProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository33(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository33");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RProxyRepositoryApiRequest**](RProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository34"></a>
# **createRepository34**
> createRepository34(body)

Create Cocoapods proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
CocoapodsProxyRepositoryApiRequest body = new CocoapodsProxyRepositoryApiRequest(); // CocoapodsProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository34(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository34");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CocoapodsProxyRepositoryApiRequest**](CocoapodsProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository35"></a>
# **createRepository35**
> createRepository35(body)

Create a Go group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
GolangGroupRepositoryApiRequest body = new GolangGroupRepositoryApiRequest(); // GolangGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository35(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository35");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GolangGroupRepositoryApiRequest**](GolangGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository36"></a>
# **createRepository36**
> createRepository36(body)

Create a Go proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
GolangProxyRepositoryApiRequest body = new GolangProxyRepositoryApiRequest(); // GolangProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository36(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository36");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GolangProxyRepositoryApiRequest**](GolangProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository37"></a>
# **createRepository37**
> createRepository37(body)

Create p2 proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
P2ProxyRepositoryApiRequest body = new P2ProxyRepositoryApiRequest(); // P2ProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository37(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository37");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**P2ProxyRepositoryApiRequest**](P2ProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository38"></a>
# **createRepository38**
> createRepository38(body)

Create Bower group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
BowerGroupRepositoryApiRequest body = new BowerGroupRepositoryApiRequest(); // BowerGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository38(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository38");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BowerGroupRepositoryApiRequest**](BowerGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository39"></a>
# **createRepository39**
> createRepository39(body)

Create Bower hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
BowerHostedRepositoryApiRequest body = new BowerHostedRepositoryApiRequest(); // BowerHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository39(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository39");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BowerHostedRepositoryApiRequest**](BowerHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository4"></a>
# **createRepository4**
> createRepository4(body)

Create APT proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
AptProxyRepositoryApiRequest body = new AptProxyRepositoryApiRequest(); // AptProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository4(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AptProxyRepositoryApiRequest**](AptProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository40"></a>
# **createRepository40**
> createRepository40(body)

Create Bower proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
BowerProxyRepositoryApiRequest body = new BowerProxyRepositoryApiRequest(); // BowerProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository40(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository40");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BowerProxyRepositoryApiRequest**](BowerProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository5"></a>
# **createRepository5**
> createRepository5(body)

Create raw group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RawGroupRepositoryApiRequest body = new RawGroupRepositoryApiRequest(); // RawGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository5(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RawGroupRepositoryApiRequest**](RawGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository6"></a>
# **createRepository6**
> createRepository6(body)

Create raw hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RawHostedRepositoryApiRequest body = new RawHostedRepositoryApiRequest(); // RawHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository6(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RawHostedRepositoryApiRequest**](RawHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository7"></a>
# **createRepository7**
> createRepository7(body)

Create raw proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
RawProxyRepositoryApiRequest body = new RawProxyRepositoryApiRequest(); // RawProxyRepositoryApiRequest | 
try {
    apiInstance.createRepository7(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RawProxyRepositoryApiRequest**](RawProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository8"></a>
# **createRepository8**
> createRepository8(body)

Create npm group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
NpmGroupRepositoryApiRequest body = new NpmGroupRepositoryApiRequest(); // NpmGroupRepositoryApiRequest | 
try {
    apiInstance.createRepository8(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NpmGroupRepositoryApiRequest**](NpmGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRepository9"></a>
# **createRepository9**
> createRepository9(body)

Create npm hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
NpmHostedRepositoryApiRequest body = new NpmHostedRepositoryApiRequest(); // NpmHostedRepositoryApiRequest | 
try {
    apiInstance.createRepository9(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#createRepository9");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NpmHostedRepositoryApiRequest**](NpmHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRepository"></a>
# **deleteRepository**
> deleteRepository(repositoryName)

Delete repository of any format



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to delete
try {
    apiInstance.deleteRepository(repositoryName);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#deleteRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableRepositoryHealthCheck"></a>
# **disableRepositoryHealthCheck**
> disableRepositoryHealthCheck(repositoryName)

Disable repository health check. Proxy repositories only.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to disable Repository Health Check for
try {
    apiInstance.disableRepositoryHealthCheck(repositoryName);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#disableRepositoryHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to disable Repository Health Check for |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="enableRepositoryHealthCheck"></a>
# **enableRepositoryHealthCheck**
> enableRepositoryHealthCheck(repositoryName)

Enable repository health check. Proxy repositories only.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to enable Repository Health Check for
try {
    apiInstance.enableRepositoryHealthCheck(repositoryName);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#enableRepositoryHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to enable Repository Health Check for |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRepositories"></a>
# **getRepositories**
> List&lt;AbstractApiRepository&gt; getRepositories()

List repositories



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
try {
    List<AbstractApiRepository> result = apiInstance.getRepositories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepositories");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AbstractApiRepository&gt;**](AbstractApiRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepositories1"></a>
# **getRepositories1**
> List&lt;RepositoryXO&gt; getRepositories1()

List repositories



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
try {
    List<RepositoryXO> result = apiInstance.getRepositories1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepositories1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RepositoryXO&gt;**](RepositoryXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository"></a>
# **getRepository**
> RepositoryXO getRepository(repositoryName)

Get repository details



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to get
try {
    RepositoryXO result = apiInstance.getRepository(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to get |

### Return type

[**RepositoryXO**](RepositoryXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository1"></a>
# **getRepository1**
> SimpleApiGroupRepository getRepository1(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiGroupRepository result = apiInstance.getRepository1(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiGroupRepository**](SimpleApiGroupRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository10"></a>
# **getRepository10**
> SimpleApiHostedRepository getRepository10(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiHostedRepository result = apiInstance.getRepository10(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiHostedRepository**](SimpleApiHostedRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository11"></a>
# **getRepository11**
> NpmProxyApiRepository getRepository11(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    NpmProxyApiRepository result = apiInstance.getRepository11(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository11");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**NpmProxyApiRepository**](NpmProxyApiRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository12"></a>
# **getRepository12**
> SimpleApiGroupRepository getRepository12(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiGroupRepository result = apiInstance.getRepository12(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository12");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiGroupRepository**](SimpleApiGroupRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository13"></a>
# **getRepository13**
> SimpleApiHostedRepository getRepository13(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiHostedRepository result = apiInstance.getRepository13(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository13");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiHostedRepository**](SimpleApiHostedRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository14"></a>
# **getRepository14**
> NugetProxyApiRepository getRepository14(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    NugetProxyApiRepository result = apiInstance.getRepository14(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository14");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**NugetProxyApiRepository**](NugetProxyApiRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository15"></a>
# **getRepository15**
> SimpleApiGroupRepository getRepository15(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiGroupRepository result = apiInstance.getRepository15(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository15");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiGroupRepository**](SimpleApiGroupRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository16"></a>
# **getRepository16**
> SimpleApiHostedRepository getRepository16(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiHostedRepository result = apiInstance.getRepository16(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository16");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiHostedRepository**](SimpleApiHostedRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository17"></a>
# **getRepository17**
> SimpleApiProxyRepository getRepository17(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiProxyRepository result = apiInstance.getRepository17(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository17");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiProxyRepository**](SimpleApiProxyRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository18"></a>
# **getRepository18**
> DockerGroupApiRepository getRepository18(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    DockerGroupApiRepository result = apiInstance.getRepository18(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository18");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**DockerGroupApiRepository**](DockerGroupApiRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository19"></a>
# **getRepository19**
> DockerHostedApiRepository getRepository19(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    DockerHostedApiRepository result = apiInstance.getRepository19(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository19");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**DockerHostedApiRepository**](DockerHostedApiRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository2"></a>
# **getRepository2**
> MavenHostedApiRepository getRepository2(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    MavenHostedApiRepository result = apiInstance.getRepository2(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**MavenHostedApiRepository**](MavenHostedApiRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository20"></a>
# **getRepository20**
> DockerProxyApiRepository getRepository20(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    DockerProxyApiRepository result = apiInstance.getRepository20(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository20");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**DockerProxyApiRepository**](DockerProxyApiRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository21"></a>
# **getRepository21**
> SimpleApiGroupRepository getRepository21(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiGroupRepository result = apiInstance.getRepository21(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository21");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiGroupRepository**](SimpleApiGroupRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository22"></a>
# **getRepository22**
> YumHostedApiRepository getRepository22(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    YumHostedApiRepository result = apiInstance.getRepository22(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository22");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**YumHostedApiRepository**](YumHostedApiRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository23"></a>
# **getRepository23**
> SimpleApiProxyRepository getRepository23(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiProxyRepository result = apiInstance.getRepository23(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository23");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiProxyRepository**](SimpleApiProxyRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository24"></a>
# **getRepository24**
> SimpleApiHostedRepository getRepository24(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiHostedRepository result = apiInstance.getRepository24(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository24");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiHostedRepository**](SimpleApiHostedRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository25"></a>
# **getRepository25**
> SimpleApiProxyRepository getRepository25(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiProxyRepository result = apiInstance.getRepository25(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository25");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiProxyRepository**](SimpleApiProxyRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository26"></a>
# **getRepository26**
> SimpleApiHostedRepository getRepository26(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiHostedRepository result = apiInstance.getRepository26(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository26");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiHostedRepository**](SimpleApiHostedRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository27"></a>
# **getRepository27**
> SimpleApiGroupRepository getRepository27(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiGroupRepository result = apiInstance.getRepository27(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository27");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiGroupRepository**](SimpleApiGroupRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository28"></a>
# **getRepository28**
> SimpleApiHostedRepository getRepository28(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiHostedRepository result = apiInstance.getRepository28(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository28");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiHostedRepository**](SimpleApiHostedRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository29"></a>
# **getRepository29**
> SimpleApiProxyRepository getRepository29(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiProxyRepository result = apiInstance.getRepository29(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository29");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiProxyRepository**](SimpleApiProxyRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository3"></a>
# **getRepository3**
> MavenProxyApiRepository getRepository3(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    MavenProxyApiRepository result = apiInstance.getRepository3(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**MavenProxyApiRepository**](MavenProxyApiRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository30"></a>
# **getRepository30**
> SimpleApiProxyRepository getRepository30(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiProxyRepository result = apiInstance.getRepository30(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository30");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiProxyRepository**](SimpleApiProxyRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository31"></a>
# **getRepository31**
> SimpleApiProxyRepository getRepository31(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiProxyRepository result = apiInstance.getRepository31(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository31");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiProxyRepository**](SimpleApiProxyRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository32"></a>
# **getRepository32**
> SimpleApiGroupRepository getRepository32(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiGroupRepository result = apiInstance.getRepository32(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository32");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiGroupRepository**](SimpleApiGroupRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository33"></a>
# **getRepository33**
> SimpleApiHostedRepository getRepository33(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiHostedRepository result = apiInstance.getRepository33(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository33");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiHostedRepository**](SimpleApiHostedRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository34"></a>
# **getRepository34**
> SimpleApiProxyRepository getRepository34(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiProxyRepository result = apiInstance.getRepository34(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository34");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiProxyRepository**](SimpleApiProxyRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository35"></a>
# **getRepository35**
> SimpleApiProxyRepository getRepository35(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiProxyRepository result = apiInstance.getRepository35(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository35");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiProxyRepository**](SimpleApiProxyRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository36"></a>
# **getRepository36**
> SimpleApiGroupRepository getRepository36(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiGroupRepository result = apiInstance.getRepository36(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository36");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiGroupRepository**](SimpleApiGroupRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository37"></a>
# **getRepository37**
> SimpleApiProxyRepository getRepository37(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiProxyRepository result = apiInstance.getRepository37(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository37");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiProxyRepository**](SimpleApiProxyRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository38"></a>
# **getRepository38**
> SimpleApiProxyRepository getRepository38(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiProxyRepository result = apiInstance.getRepository38(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository38");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiProxyRepository**](SimpleApiProxyRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository39"></a>
# **getRepository39**
> SimpleApiGroupRepository getRepository39(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiGroupRepository result = apiInstance.getRepository39(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository39");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiGroupRepository**](SimpleApiGroupRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository4"></a>
# **getRepository4**
> AptHostedApiRepository getRepository4(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    AptHostedApiRepository result = apiInstance.getRepository4(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**AptHostedApiRepository**](AptHostedApiRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository40"></a>
# **getRepository40**
> SimpleApiHostedRepository getRepository40(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiHostedRepository result = apiInstance.getRepository40(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository40");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiHostedRepository**](SimpleApiHostedRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository41"></a>
# **getRepository41**
> BowerProxyApiRepository getRepository41(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    BowerProxyApiRepository result = apiInstance.getRepository41(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository41");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**BowerProxyApiRepository**](BowerProxyApiRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository5"></a>
# **getRepository5**
> AptProxyApiRepository getRepository5(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    AptProxyApiRepository result = apiInstance.getRepository5(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**AptProxyApiRepository**](AptProxyApiRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository6"></a>
# **getRepository6**
> SimpleApiGroupRepository getRepository6(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiGroupRepository result = apiInstance.getRepository6(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiGroupRepository**](SimpleApiGroupRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository7"></a>
# **getRepository7**
> SimpleApiHostedRepository getRepository7(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiHostedRepository result = apiInstance.getRepository7(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiHostedRepository**](SimpleApiHostedRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository8"></a>
# **getRepository8**
> SimpleApiProxyRepository getRepository8(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiProxyRepository result = apiInstance.getRepository8(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiProxyRepository**](SimpleApiProxyRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRepository9"></a>
# **getRepository9**
> SimpleApiGroupDeployRepository getRepository9(repositoryName)

Get repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | 
try {
    SimpleApiGroupDeployRepository result = apiInstance.getRepository9(repositoryName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#getRepository9");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**|  |

### Return type

[**SimpleApiGroupDeployRepository**](SimpleApiGroupDeployRepository.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invalidateCache"></a>
# **invalidateCache**
> invalidateCache(repositoryName)

Invalidate repository cache. Proxy or group repositories only.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to invalidate cache
try {
    apiInstance.invalidateCache(repositoryName);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#invalidateCache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to invalidate cache |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rebuildIndex"></a>
# **rebuildIndex**
> rebuildIndex(repositoryName)

Schedule a &#39;Repair - Rebuild repository search&#39; Task. Hosted or proxy repositories only.



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to rebuild index
try {
    apiInstance.rebuildIndex(repositoryName);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#rebuildIndex");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to rebuild index |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository"></a>
# **updateRepository**
> updateRepository(repositoryName, body)

Update Maven group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
MavenGroupRepositoryApiRequest body = new MavenGroupRepositoryApiRequest(); // MavenGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**MavenGroupRepositoryApiRequest**](MavenGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository1"></a>
# **updateRepository1**
> updateRepository1(repositoryName, body)

Update Maven hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
MavenHostedRepositoryApiRequest body = new MavenHostedRepositoryApiRequest(); // MavenHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository1(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**MavenHostedRepositoryApiRequest**](MavenHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository10"></a>
# **updateRepository10**
> updateRepository10(repositoryName, body)

Update npm proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
NpmProxyRepositoryApiRequest body = new NpmProxyRepositoryApiRequest(); // NpmProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository10(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository10");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**NpmProxyRepositoryApiRequest**](NpmProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository11"></a>
# **updateRepository11**
> updateRepository11(repositoryName, body)

Update NuGet group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
NugetGroupRepositoryApiRequest body = new NugetGroupRepositoryApiRequest(); // NugetGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository11(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository11");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**NugetGroupRepositoryApiRequest**](NugetGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository12"></a>
# **updateRepository12**
> updateRepository12(repositoryName, body)

Update NuGet hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
NugetHostedRepositoryApiRequest body = new NugetHostedRepositoryApiRequest(); // NugetHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository12(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository12");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**NugetHostedRepositoryApiRequest**](NugetHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository13"></a>
# **updateRepository13**
> updateRepository13(repositoryName, body)

Update NuGet proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
NugetProxyRepositoryApiRequest body = new NugetProxyRepositoryApiRequest(); // NugetProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository13(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository13");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**NugetProxyRepositoryApiRequest**](NugetProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository14"></a>
# **updateRepository14**
> updateRepository14(repositoryName, body)

Update RubyGems group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RubyGemsGroupRepositoryApiRequest body = new RubyGemsGroupRepositoryApiRequest(); // RubyGemsGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository14(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository14");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RubyGemsGroupRepositoryApiRequest**](RubyGemsGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository15"></a>
# **updateRepository15**
> updateRepository15(repositoryName, body)

Update RubyGems hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RubyGemsHostedRepositoryApiRequest body = new RubyGemsHostedRepositoryApiRequest(); // RubyGemsHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository15(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository15");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RubyGemsHostedRepositoryApiRequest**](RubyGemsHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository16"></a>
# **updateRepository16**
> updateRepository16(repositoryName, body)

Update RubyGems proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RubyGemsProxyRepositoryApiRequest body = new RubyGemsProxyRepositoryApiRequest(); // RubyGemsProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository16(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository16");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RubyGemsProxyRepositoryApiRequest**](RubyGemsProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository17"></a>
# **updateRepository17**
> updateRepository17(repositoryName, body)

Update Docker group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
DockerGroupRepositoryApiRequest body = new DockerGroupRepositoryApiRequest(); // DockerGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository17(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository17");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**DockerGroupRepositoryApiRequest**](DockerGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository18"></a>
# **updateRepository18**
> updateRepository18(repositoryName, body)

Update Docker hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
DockerHostedRepositoryApiRequest body = new DockerHostedRepositoryApiRequest(); // DockerHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository18(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository18");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**DockerHostedRepositoryApiRequest**](DockerHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository19"></a>
# **updateRepository19**
> updateRepository19(repositoryName, body)

Update Docker group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
DockerProxyRepositoryApiRequest body = new DockerProxyRepositoryApiRequest(); // DockerProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository19(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository19");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**DockerProxyRepositoryApiRequest**](DockerProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository2"></a>
# **updateRepository2**
> updateRepository2(repositoryName, body)

Update Maven proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
MavenProxyRepositoryApiRequest body = new MavenProxyRepositoryApiRequest(); // MavenProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository2(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**MavenProxyRepositoryApiRequest**](MavenProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository20"></a>
# **updateRepository20**
> updateRepository20(repositoryName, body)

Update Yum group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
YumGroupRepositoryApiRequest body = new YumGroupRepositoryApiRequest(); // YumGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository20(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository20");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**YumGroupRepositoryApiRequest**](YumGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository21"></a>
# **updateRepository21**
> updateRepository21(repositoryName, body)

Update Yum hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
YumHostedRepositoryApiRequest body = new YumHostedRepositoryApiRequest(); // YumHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository21(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository21");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**YumHostedRepositoryApiRequest**](YumHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository22"></a>
# **updateRepository22**
> updateRepository22(repositoryName, body)

Update Yum proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
YumProxyRepositoryApiRequest body = new YumProxyRepositoryApiRequest(); // YumProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository22(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository22");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**YumProxyRepositoryApiRequest**](YumProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository23"></a>
# **updateRepository23**
> updateRepository23(repositoryName, body)

Update Helm hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
HelmHostedRepositoryApiRequest body = new HelmHostedRepositoryApiRequest(); // HelmHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository23(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository23");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**HelmHostedRepositoryApiRequest**](HelmHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository24"></a>
# **updateRepository24**
> updateRepository24(repositoryName, body)

Update Helm proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
HelmProxyRepositoryApiRequest body = new HelmProxyRepositoryApiRequest(); // HelmProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository24(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository24");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**HelmProxyRepositoryApiRequest**](HelmProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository25"></a>
# **updateRepository25**
> updateRepository25(repositoryName, body)

Update Git LFS hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
GitLfsHostedRepositoryApiRequest body = new GitLfsHostedRepositoryApiRequest(); // GitLfsHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository25(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository25");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**GitLfsHostedRepositoryApiRequest**](GitLfsHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository26"></a>
# **updateRepository26**
> updateRepository26(repositoryName, body)

Update PyPI group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
PypiGroupRepositoryApiRequest body = new PypiGroupRepositoryApiRequest(); // PypiGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository26(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository26");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**PypiGroupRepositoryApiRequest**](PypiGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository27"></a>
# **updateRepository27**
> updateRepository27(repositoryName, body)

Update PyPI hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
PypiHostedRepositoryApiRequest body = new PypiHostedRepositoryApiRequest(); // PypiHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository27(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository27");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**PypiHostedRepositoryApiRequest**](PypiHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository28"></a>
# **updateRepository28**
> updateRepository28(repositoryName, body)

Update PyPI proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
PypiProxyRepositoryApiRequest body = new PypiProxyRepositoryApiRequest(); // PypiProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository28(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository28");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**PypiProxyRepositoryApiRequest**](PypiProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository29"></a>
# **updateRepository29**
> updateRepository29(repositoryName, body)

Update conda proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
CondaProxyRepositoryApiRequest body = new CondaProxyRepositoryApiRequest(); // CondaProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository29(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository29");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**CondaProxyRepositoryApiRequest**](CondaProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository3"></a>
# **updateRepository3**
> updateRepository3(repositoryName, body)

Update APT hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
AptHostedRepositoryApiRequest body = new AptHostedRepositoryApiRequest(); // AptHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository3(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**AptHostedRepositoryApiRequest**](AptHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository30"></a>
# **updateRepository30**
> updateRepository30(repositoryName, body)

Update Conan proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
ConanProxyRepositoryApiRequest body = new ConanProxyRepositoryApiRequest(); // ConanProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository30(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository30");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**ConanProxyRepositoryApiRequest**](ConanProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository31"></a>
# **updateRepository31**
> updateRepository31(repositoryName, body)

Update R group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RGroupRepositoryApiRequest body = new RGroupRepositoryApiRequest(); // RGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository31(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository31");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RGroupRepositoryApiRequest**](RGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository32"></a>
# **updateRepository32**
> updateRepository32(repositoryName, body)

Update R hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RHostedRepositoryApiRequest body = new RHostedRepositoryApiRequest(); // RHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository32(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository32");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RHostedRepositoryApiRequest**](RHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository33"></a>
# **updateRepository33**
> updateRepository33(repositoryName, body)

Update R proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RProxyRepositoryApiRequest body = new RProxyRepositoryApiRequest(); // RProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository33(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository33");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RProxyRepositoryApiRequest**](RProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository34"></a>
# **updateRepository34**
> updateRepository34(repositoryName, body)

Update Cocoapods proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
CocoapodsProxyRepositoryApiRequest body = new CocoapodsProxyRepositoryApiRequest(); // CocoapodsProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository34(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository34");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**CocoapodsProxyRepositoryApiRequest**](CocoapodsProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository35"></a>
# **updateRepository35**
> updateRepository35(repositoryName, body)

Update a Go group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
GolangGroupRepositoryApiRequest body = new GolangGroupRepositoryApiRequest(); // GolangGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository35(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository35");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**GolangGroupRepositoryApiRequest**](GolangGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository36"></a>
# **updateRepository36**
> updateRepository36(repositoryName, body)

Update a Go proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
GolangProxyRepositoryApiRequest body = new GolangProxyRepositoryApiRequest(); // GolangProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository36(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository36");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**GolangProxyRepositoryApiRequest**](GolangProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository37"></a>
# **updateRepository37**
> updateRepository37(repositoryName, body)

Update p2 proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
P2ProxyRepositoryApiRequest body = new P2ProxyRepositoryApiRequest(); // P2ProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository37(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository37");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**P2ProxyRepositoryApiRequest**](P2ProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository38"></a>
# **updateRepository38**
> updateRepository38(repositoryName, body)

Update Bower group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
BowerGroupRepositoryApiRequest body = new BowerGroupRepositoryApiRequest(); // BowerGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository38(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository38");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**BowerGroupRepositoryApiRequest**](BowerGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository39"></a>
# **updateRepository39**
> updateRepository39(repositoryName, body)

Update Bower hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
BowerHostedRepositoryApiRequest body = new BowerHostedRepositoryApiRequest(); // BowerHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository39(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository39");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**BowerHostedRepositoryApiRequest**](BowerHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository4"></a>
# **updateRepository4**
> updateRepository4(repositoryName, body)

Update APT proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
AptProxyRepositoryApiRequest body = new AptProxyRepositoryApiRequest(); // AptProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository4(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**AptProxyRepositoryApiRequest**](AptProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository40"></a>
# **updateRepository40**
> updateRepository40(repositoryName, body)

Update Bower proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
BowerProxyRepositoryApiRequest body = new BowerProxyRepositoryApiRequest(); // BowerProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository40(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository40");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**BowerProxyRepositoryApiRequest**](BowerProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository5"></a>
# **updateRepository5**
> updateRepository5(repositoryName, body)

Update raw group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RawGroupRepositoryApiRequest body = new RawGroupRepositoryApiRequest(); // RawGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository5(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RawGroupRepositoryApiRequest**](RawGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository6"></a>
# **updateRepository6**
> updateRepository6(repositoryName, body)

Update raw hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RawHostedRepositoryApiRequest body = new RawHostedRepositoryApiRequest(); // RawHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository6(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RawHostedRepositoryApiRequest**](RawHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository7"></a>
# **updateRepository7**
> updateRepository7(repositoryName, body)

Update raw proxy repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
RawProxyRepositoryApiRequest body = new RawProxyRepositoryApiRequest(); // RawProxyRepositoryApiRequest | 
try {
    apiInstance.updateRepository7(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**RawProxyRepositoryApiRequest**](RawProxyRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository8"></a>
# **updateRepository8**
> updateRepository8(repositoryName, body)

Update npm group repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
NpmGroupRepositoryApiRequest body = new NpmGroupRepositoryApiRequest(); // NpmGroupRepositoryApiRequest | 
try {
    apiInstance.updateRepository8(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**NpmGroupRepositoryApiRequest**](NpmGroupRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRepository9"></a>
# **updateRepository9**
> updateRepository9(repositoryName, body)

Update npm hosted repository



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RepositoryManagementApi;


RepositoryManagementApi apiInstance = new RepositoryManagementApi();
String repositoryName = "repositoryName_example"; // String | Name of the repository to update
NpmHostedRepositoryApiRequest body = new NpmHostedRepositoryApiRequest(); // NpmHostedRepositoryApiRequest | 
try {
    apiInstance.updateRepository9(repositoryName, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RepositoryManagementApi#updateRepository9");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repositoryName** | **String**| Name of the repository to update |
 **body** | [**NpmHostedRepositoryApiRequest**](NpmHostedRepositoryApiRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

