# AzureBlobStoreApi

All URIs are relative to *https://localhost/service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verifyConnection1**](AzureBlobStoreApi.md#verifyConnection1) | **POST** /v1/azureblobstore/test-connection | Verify connection using supplied Azure Blob Store settings


<a name="verifyConnection1"></a>
# **verifyConnection1**
> verifyConnection1(body)

Verify connection using supplied Azure Blob Store settings



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AzureBlobStoreApi;


AzureBlobStoreApi apiInstance = new AzureBlobStoreApi();
AzureConnectionXO body = new AzureConnectionXO(); // AzureConnectionXO | 
try {
    apiInstance.verifyConnection1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AzureBlobStoreApi#verifyConnection1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AzureConnectionXO**](AzureConnectionXO.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

