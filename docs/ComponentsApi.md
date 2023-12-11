# ComponentsApi

All URIs are relative to *https://localhost/service/rest/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteComponent**](ComponentsApi.md#deleteComponent) | **DELETE** /v1/components/{id} | Delete a single component
[**getComponentById**](ComponentsApi.md#getComponentById) | **GET** /v1/components/{id} | Get a single component
[**getComponents**](ComponentsApi.md#getComponents) | **GET** /v1/components | List components
[**uploadComponent**](ComponentsApi.md#uploadComponent) | **POST** /v1/components | Upload a single component


<a name="deleteComponent"></a>
# **deleteComponent**
> deleteComponent(id)

Delete a single component



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComponentsApi;


ComponentsApi apiInstance = new ComponentsApi();
String id = "id_example"; // String | ID of the component to delete
try {
    apiInstance.deleteComponent(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ComponentsApi#deleteComponent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the component to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getComponentById"></a>
# **getComponentById**
> ComponentXO getComponentById(id)

Get a single component



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComponentsApi;


ComponentsApi apiInstance = new ComponentsApi();
String id = "id_example"; // String | ID of the component to retrieve
try {
    ComponentXO result = apiInstance.getComponentById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComponentsApi#getComponentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the component to retrieve |

### Return type

[**ComponentXO**](ComponentXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getComponents"></a>
# **getComponents**
> PageComponentXO getComponents(repository, continuationToken)

List components



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComponentsApi;


ComponentsApi apiInstance = new ComponentsApi();
String repository = "repository_example"; // String | Repository from which you would like to retrieve components
String continuationToken = "continuationToken_example"; // String | A token returned by a prior request. If present, the next page of results are returned
try {
    PageComponentXO result = apiInstance.getComponents(repository, continuationToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComponentsApi#getComponents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| Repository from which you would like to retrieve components |
 **continuationToken** | **String**| A token returned by a prior request. If present, the next page of results are returned | [optional]

### Return type

[**PageComponentXO**](PageComponentXO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadComponent"></a>
# **uploadComponent**
> uploadComponent(repository, rAsset, rAssetPathId, pypiAsset, helmAsset, yumDirectory, yumAsset, yumAssetFilename, dockerAsset, rubygemsAsset, nugetAsset, npmAsset, rawDirectory, rawAsset1, rawAsset1Filename, rawAsset2, rawAsset2Filename, rawAsset3, rawAsset3Filename, aptAsset, maven2GroupId, maven2ArtifactId, maven2Version, maven2GeneratePom, maven2Packaging, maven2Asset1, maven2Asset1Classifier, maven2Asset1Extension, maven2Asset2, maven2Asset2Classifier, maven2Asset2Extension, maven2Asset3, maven2Asset3Classifier, maven2Asset3Extension)

Upload a single component



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComponentsApi;


ComponentsApi apiInstance = new ComponentsApi();
String repository = "repository_example"; // String | Name of the repository to which you would like to upload the component
File rAsset = new File("/path/to/file.txt"); // File | r Asset 
String rAssetPathId = "rAssetPathId_example"; // String | r Asset  Package Path
File pypiAsset = new File("/path/to/file.txt"); // File | pypi Asset 
File helmAsset = new File("/path/to/file.txt"); // File | helm Asset 
String yumDirectory = "yumDirectory_example"; // String | yum Directory
File yumAsset = new File("/path/to/file.txt"); // File | yum Asset 
String yumAssetFilename = "yumAssetFilename_example"; // String | yum Asset  Filename
File dockerAsset = new File("/path/to/file.txt"); // File | docker Asset 
File rubygemsAsset = new File("/path/to/file.txt"); // File | rubygems Asset 
File nugetAsset = new File("/path/to/file.txt"); // File | nuget Asset 
File npmAsset = new File("/path/to/file.txt"); // File | npm Asset 
String rawDirectory = "rawDirectory_example"; // String | raw Directory
File rawAsset1 = new File("/path/to/file.txt"); // File | raw Asset 1
String rawAsset1Filename = "rawAsset1Filename_example"; // String | raw Asset 1 Filename
File rawAsset2 = new File("/path/to/file.txt"); // File | raw Asset 2
String rawAsset2Filename = "rawAsset2Filename_example"; // String | raw Asset 2 Filename
File rawAsset3 = new File("/path/to/file.txt"); // File | raw Asset 3
String rawAsset3Filename = "rawAsset3Filename_example"; // String | raw Asset 3 Filename
File aptAsset = new File("/path/to/file.txt"); // File | apt Asset 
String maven2GroupId = "maven2GroupId_example"; // String | maven2 Group ID
String maven2ArtifactId = "maven2ArtifactId_example"; // String | maven2 Artifact ID
String maven2Version = "maven2Version_example"; // String | maven2 Version
Boolean maven2GeneratePom = true; // Boolean | maven2 Generate a POM file with these coordinates
String maven2Packaging = "maven2Packaging_example"; // String | maven2 Packaging
File maven2Asset1 = new File("/path/to/file.txt"); // File | maven2 Asset 1
String maven2Asset1Classifier = "maven2Asset1Classifier_example"; // String | maven2 Asset 1 Classifier
String maven2Asset1Extension = "maven2Asset1Extension_example"; // String | maven2 Asset 1 Extension
File maven2Asset2 = new File("/path/to/file.txt"); // File | maven2 Asset 2
String maven2Asset2Classifier = "maven2Asset2Classifier_example"; // String | maven2 Asset 2 Classifier
String maven2Asset2Extension = "maven2Asset2Extension_example"; // String | maven2 Asset 2 Extension
File maven2Asset3 = new File("/path/to/file.txt"); // File | maven2 Asset 3
String maven2Asset3Classifier = "maven2Asset3Classifier_example"; // String | maven2 Asset 3 Classifier
String maven2Asset3Extension = "maven2Asset3Extension_example"; // String | maven2 Asset 3 Extension
try {
    apiInstance.uploadComponent(repository, rAsset, rAssetPathId, pypiAsset, helmAsset, yumDirectory, yumAsset, yumAssetFilename, dockerAsset, rubygemsAsset, nugetAsset, npmAsset, rawDirectory, rawAsset1, rawAsset1Filename, rawAsset2, rawAsset2Filename, rawAsset3, rawAsset3Filename, aptAsset, maven2GroupId, maven2ArtifactId, maven2Version, maven2GeneratePom, maven2Packaging, maven2Asset1, maven2Asset1Classifier, maven2Asset1Extension, maven2Asset2, maven2Asset2Classifier, maven2Asset2Extension, maven2Asset3, maven2Asset3Classifier, maven2Asset3Extension);
} catch (ApiException e) {
    System.err.println("Exception when calling ComponentsApi#uploadComponent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| Name of the repository to which you would like to upload the component |
 **rAsset** | **File**| r Asset  | [optional]
 **rAssetPathId** | **String**| r Asset  Package Path | [optional]
 **pypiAsset** | **File**| pypi Asset  | [optional]
 **helmAsset** | **File**| helm Asset  | [optional]
 **yumDirectory** | **String**| yum Directory | [optional]
 **yumAsset** | **File**| yum Asset  | [optional]
 **yumAssetFilename** | **String**| yum Asset  Filename | [optional]
 **dockerAsset** | **File**| docker Asset  | [optional]
 **rubygemsAsset** | **File**| rubygems Asset  | [optional]
 **nugetAsset** | **File**| nuget Asset  | [optional]
 **npmAsset** | **File**| npm Asset  | [optional]
 **rawDirectory** | **String**| raw Directory | [optional]
 **rawAsset1** | **File**| raw Asset 1 | [optional]
 **rawAsset1Filename** | **String**| raw Asset 1 Filename | [optional]
 **rawAsset2** | **File**| raw Asset 2 | [optional]
 **rawAsset2Filename** | **String**| raw Asset 2 Filename | [optional]
 **rawAsset3** | **File**| raw Asset 3 | [optional]
 **rawAsset3Filename** | **String**| raw Asset 3 Filename | [optional]
 **aptAsset** | **File**| apt Asset  | [optional]
 **maven2GroupId** | **String**| maven2 Group ID | [optional]
 **maven2ArtifactId** | **String**| maven2 Artifact ID | [optional]
 **maven2Version** | **String**| maven2 Version | [optional]
 **maven2GeneratePom** | **Boolean**| maven2 Generate a POM file with these coordinates | [optional]
 **maven2Packaging** | **String**| maven2 Packaging | [optional]
 **maven2Asset1** | **File**| maven2 Asset 1 | [optional]
 **maven2Asset1Classifier** | **String**| maven2 Asset 1 Classifier | [optional]
 **maven2Asset1Extension** | **String**| maven2 Asset 1 Extension | [optional]
 **maven2Asset2** | **File**| maven2 Asset 2 | [optional]
 **maven2Asset2Classifier** | **String**| maven2 Asset 2 Classifier | [optional]
 **maven2Asset2Extension** | **String**| maven2 Asset 2 Extension | [optional]
 **maven2Asset3** | **File**| maven2 Asset 3 | [optional]
 **maven2Asset3Classifier** | **String**| maven2 Asset 3 Classifier | [optional]
 **maven2Asset3Extension** | **String**| maven2 Asset 3 Extension | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

