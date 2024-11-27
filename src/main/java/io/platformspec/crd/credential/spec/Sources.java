package io.platformspec.crd.credential.spec;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Sources {


    @JsonProperty("static")
    x_static,               //	Hardcoded values within fields section; not advised for production use.
    environment,            //	Environment variables containing the contents of the credentials, as defined in fields.
    file,                   //	File path relative to consumer of the Credential API.
    vault,                  //	Hashicorp Vault.
    @JsonProperty("aws-ssm")
    aws_ssm,                //	AWS SSM Parameter Store.
    @JsonProperty("aws-secrets")
aws_secrets,                //	AWS Secrets Manager.
    @JsonProperty("aws-s3")
    aws_s3,                 //	AWS S3.
    @JsonProperty("aws-kms")
    aws_kms,                //	AWS KMS.
    @JsonProperty("gcp-secrets")
    gcp_secrets,            //	GCP Secrets Manager.
    @JsonProperty("gcp-kms")
    gcp_kms,                //	GCP KMS.
    @JsonProperty("gcp-gcs")
    gcp_gcs,                //	GCP Cloud Storage.
    @JsonProperty("azure-keyvault")
    azure_keyvault,         //	Azure Key Vault.
    tfstate,                //	Terraform (tfstate) file path relative to consumer of the Credential API.
    @JsonProperty("tfstate-s3")
    tfstate_s3,             //	Terraform (tfstate) file stored in S3.
    @JsonProperty("tfstate-gcs")
    tfstate_gcs,            //	Terraform (tfstate) file stored in GCS.
    @JsonProperty("tfstate-azurerm")
    tfstate_azurerm,        //	Terraform (tfstate) file in AzureRM Blob storage.
    @JsonProperty("tfstate-remote")
    tfstate_remote,         //	Terraform (tfstate) in Terraform Cloud / Terraform Enterprise.
    gitlab,                 //	GitLab Secrets.
    @JsonProperty("kubernetes-configmap")
    kubernetes_configmap,   //	Kubernetes Config Map.
    @JsonProperty("kubernetes-secret")
    kubernetes_secret	    // Kubernetes Secret.
}
