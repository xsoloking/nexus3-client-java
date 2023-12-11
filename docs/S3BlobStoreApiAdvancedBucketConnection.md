
# S3BlobStoreApiAdvancedBucketConnection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpoint** | **String** | A custom endpoint URL for third party object stores using the S3 API. |  [optional]
**signerType** | **String** | An API signature version which may be required for third party object stores using the S3 API. |  [optional]
**forcePathStyle** | **Boolean** | Setting this flag will result in path-style access being used for all requests. |  [optional]
**maxConnectionPoolSize** | **Integer** | Setting this value will override the default connection pool size of Nexus of the s3 client for this blobstore. |  [optional]



