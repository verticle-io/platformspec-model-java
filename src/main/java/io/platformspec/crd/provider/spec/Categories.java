package io.platformspec.crd.provider.spec;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Categories {

    iaas,           //	Infrastructure as a Service providers (e.g., AWS, Azure, GCP)
    dns,            //	Domain Name System providers (e.g., Route53, Cloudflare)
    identity,       //	Identity and access management (IAM) providers (e.g., Okta, Auth0)
    registry,       //	Container image registries (e.g., Docker Hub, ECR, GCR)
    backup,         //	Backup and recovery services (e.g., AWS Backup, Azure Backup)
    monitoring,     //	Monitoring and observability platforms (e.g., Prometheus, Datadog)
    secrets,        //	Secrets management systems (e.g., Vault, HashiCorp Secret Manager)
    observability,  //	Comprehensive observability tools (e.g., Grafana, Jaeger).
    cicd,           //	Continuous integration and continuous delivery platforms (e.g., CircleCI, ArgoCD, Jenkins, GitLab CI/CD)
    logging,        //	Logging providers that collect, store, and analyze log data from applications and systems (e.g., Elasticsearch, Splunk, Graylog).
    automation,     //	Automation tools (e.g., Terraform Atlantis, Rundeck, Ansible).
    auditing,       //	Security auditing and compliance solutions (e.g., CloudTrail, Audit Logs).
    security,       //	Security posture management platforms (e.g., Prisma Cloud, Qualys).
    alerting,       //	Alerting and notification services (e.g., PagerDuty, Opsgenie).
    cluster,        //	Cluster management systems (e.g., Kubernetes on AWS, Azure, GCP).
    @JsonProperty("x-custom")
    xCustom         //	Placeholder for custom provider categories.
}
