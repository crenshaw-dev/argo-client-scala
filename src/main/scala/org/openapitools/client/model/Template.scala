/**
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: v2.7.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class Template (
  /* Optional duration in seconds relative to the StartTime that the pod may be active on a node before the system actively tries to terminate the pod; value must be positive integer This field is only applicable to container and script templates. */
  activeDeadlineSeconds: Option[String] = None,
  affinity: Option[Affinity] = None,
  archiveLocation: Option[ArtifactLocation] = None,
  arguments: Option[Arguments] = None,
  /* AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false. */
  automountServiceAccountToken: Option[Boolean] = None,
  container: Option[Container] = None,
  daemon: Option[Boolean] = None,
  dag: Option[DAGTemplate] = None,
  executor: Option[ExecutorConfig] = None,
  hostAliases: Option[Seq[HostAlias]] = None,
  initContainers: Option[Seq[UserContainer]] = None,
  inputs: Option[Inputs] = None,
  metadata: Option[Metadata] = None,
  metrics: Option[Metrics] = None,
  name: Option[String] = None,
  /* NodeSelector is a selector to schedule this step of the workflow to be run on the selected node(s). Overrides the selector set at the workflow level. */
  nodeSelector: Option[Map[String, String]] = None,
  outputs: Option[Outputs] = None,
  /* Parallelism limits the max total parallel pods that can execute at the same time within the boundaries of this template invocation. If additional steps/dag templates are invoked, the pods created by those templates will not be counted towards this total. */
  parallelism: Option[String] = None,
  /* PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits). */
  podSpecPatch: Option[String] = None,
  /* Priority to apply to workflow pods. */
  priority: Option[Int] = None,
  /* PriorityClassName to apply to workflow pods. */
  priorityClassName: Option[String] = None,
  resource: Option[ResourceTemplate] = None,
  resubmitPendingPods: Option[Boolean] = None,
  retryStrategy: Option[RetryStrategy] = None,
  schedulerName: Option[String] = None,
  script: Option[ScriptTemplate] = None,
  securityContext: Option[PodSecurityContext] = None,
  serviceAccountName: Option[String] = None,
  sidecars: Option[Seq[UserContainer]] = None,
  steps: Option[Seq[Seq[WorkflowStep]]] = None,
  suspend: Option[SuspendTemplate] = None,
  /* Template is the name of the template which is used as the base of this template. DEPRECATED: This field is not used. */
  template: Option[String] = None,
  templateRef: Option[TemplateRef] = None,
  tolerations: Option[Seq[Toleration]] = None,
  volumes: Option[Seq[Volume]] = None
) extends ApiModel


