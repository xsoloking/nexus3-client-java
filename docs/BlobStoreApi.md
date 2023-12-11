# BlobStoreApi

All URIs are relative to *https://localhost/service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBlobStore**](BlobStoreApi.md#createBlobStore) | **POST** /v1/blobstores/s3 | Create an S3 blob store
[**createBlobStore1**](BlobStoreApi.md#createBlobStore1) | **POST** /v1/blobstores/azure | Create an Azure blob store
[**createFileBlobStore**](BlobStoreApi.md#createFileBlobStore) | **POST** /v1/blobstores/file | Create a file blob store
[**deleteBlobStore**](BlobStoreApi.md#deleteBlobStore) | **DELETE** /v1/blobstores/{name} | Delete a blob store by name
[**getBlobStore**](BlobStoreApi.md#getBlobStore) | **GET** /v1/blobstores/s3/{name} | Get a S3 blob store configuration by name
[**getBlobStore1**](BlobStoreApi.md#getBlobStore1) | **GET** /v1/blobstores/azure/{name} | Get an Azure blob store configuration by name
[**getFileBlobStoreConfiguration**](BlobStoreApi.md#getFileBlobStoreConfiguration) | **GET** /v1/blobstores/file/{name} | Get a file blob store configuration by name
[**listBlobStores**](BlobStoreApi.md#listBlobStores) | **GET** /v1/blobstores | List the blob stores
[**quotaStatus**](BlobStoreApi.md#quotaStatus) | **GET** /v1/blobstores/{name}/quota-status | Get quota status for a given blob store
[**updateBlobStore**](BlobStoreApi.md#updateBlobStore) | **PUT** /v1/blobstores/s3/{name} | Update an S3 blob store configuration by name
[**updateBlobStore1**](BlobStoreApi.md#updateBlobStore1) | **PUT** /v1/blobstores/azure/{name} | Update an Azure blob store configuration by name
[**updateFileBlobStore**](BlobStoreApi.md#updateFileBlobStore) | **PUT** /v1/blobstores/file/{name} | Update a file blob store configuration by name


<a name="createBlobStore"></a>
# **createBlobStore**
> createBlobStore(body)

Create an S3 blob store



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
S3BlobStoreApiModel body = new S3BlobStoreApiModel(); // S3BlobStoreApiModel | 
try {
    apiInstance.createBlobStore(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#createBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**S3BlobStoreApiModel**](S3BlobStoreApiModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBlobStore1"></a>
# **createBlobStore1**
> createBlobStore1(body)

Create an Azure blob store



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
AzureBlobStoreApiModel body = new AzureBlobStoreApiModel(); // AzureBlobStoreApiModel | 
try {
    apiInstance.createBlobStore1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#createBlobStore1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AzureBlobStoreApiModel**](AzureBlobStoreApiModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFileBlobStore"></a>
# **createFileBlobStore**
> createFileBlobStore(body)

Create a file blob store



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
FileBlobStoreApiCreateRequest body = new FileBlobStoreApiCreateRequest(); // FileBlobStoreApiCreateRequest | 
try {
    apiInstance.createFileBlobStore(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#createFileBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FileBlobStoreApiCreateRequest**](FileBlobStoreApiCreateRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBlobStore"></a>
# **deleteBlobStore**
> deleteBlobStore(name)

Delete a blob store by name



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | The name of the blob store to delete
try {
    apiInstance.deleteBlobStore(name);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#deleteBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the blob store to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBlobStore"></a>
# **getBlobStore**
> S3BlobStoreApiModel getBlobStore(name)

Get a S3 blob store configuration by name



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | Name of the blob store configuration to fetch
try {
    S3BlobStoreApiModel result = apiInstance.getBlobStore(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#getBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the blob store configuration to fetch |

### Return type

[**S3BlobStoreApiModel**](S3BlobStoreApiModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBlobStore1"></a>
# **getBlobStore1**
> AzureBlobStoreApiModel getBlobStore1(name)

Get an Azure blob store configuration by name



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | Name of the blob store configuration to fetch
try {
    AzureBlobStoreApiModel result = apiInstance.getBlobStore1(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#getBlobStore1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the blob store configuration to fetch |

### Return type

[**AzureBlobStoreApiModel**](AzureBlobStoreApiModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFileBlobStoreConfiguration"></a>
# **getFileBlobStoreConfiguration**
> FileBlobStoreApiModel getFileBlobStoreConfiguration(name)

Get a file blob store configuration by name



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "default"; // String | The name of the file blob store to read
try {
    FileBlobStoreApiModel result = apiInstance.getFileBlobStoreConfiguration(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#getFileBlobStoreConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the file blob store to read |

### Return type

[**FileBlobStoreApiModel**](FileBlobStoreApiModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listBlobStores"></a>
# **listBlobStores**
> List&lt;GenericBlobStoreApiResponse&gt; listBlobStores()

List the blob stores



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
try {
    List<GenericBlobStoreApiResponse> result = apiInstance.listBlobStores();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#listBlobStores");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GenericBlobStoreApiResponse&gt;**](GenericBlobStoreApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quotaStatus"></a>
# **quotaStatus**
> BlobStoreQuotaResultXO quotaStatus(name)

Get quota status for a given blob store



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | 
try {
    BlobStoreQuotaResultXO result = apiInstance.quotaStatus(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#quotaStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**BlobStoreQuotaResultXO**](BlobStoreQuotaResultXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBlobStore"></a>
# **updateBlobStore**
> updateBlobStore(name, body)

Update an S3 blob store configuration by name



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | Name of the blob store to update
S3BlobStoreApiModel body = new S3BlobStoreApiModel(); // S3BlobStoreApiModel | 
try {
    apiInstance.updateBlobStore(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#updateBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the blob store to update |
 **body** | [**S3BlobStoreApiModel**](S3BlobStoreApiModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBlobStore1"></a>
# **updateBlobStore1**
> updateBlobStore1(name, body)

Update an Azure blob store configuration by name



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | Name of the blob store to update
AzureBlobStoreApiModel body = new AzureBlobStoreApiModel(); // AzureBlobStoreApiModel | 
try {
    apiInstance.updateBlobStore1(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#updateBlobStore1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the blob store to update |
 **body** | [**AzureBlobStoreApiModel**](AzureBlobStoreApiModel.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFileBlobStore"></a>
# **updateFileBlobStore**
> updateFileBlobStore(name, body)

Update a file blob store configuration by name



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlobStoreApi;


BlobStoreApi apiInstance = new BlobStoreApi();
String name = "name_example"; // String | The name of the file blob store to update
FileBlobStoreApiUpdateRequest body = new FileBlobStoreApiUpdateRequest(); // FileBlobStoreApiUpdateRequest | 
try {
    apiInstance.updateFileBlobStore(name, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BlobStoreApi#updateFileBlobStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the file blob store to update |
 **body** | [**FileBlobStoreApiUpdateRequest**](FileBlobStoreApiUpdateRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

