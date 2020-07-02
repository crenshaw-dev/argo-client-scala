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

case class CronWorkflowSpec (
  concurrencyPolicy: Option[String] = None,
  failedJobsHistoryLimit: Option[Int] = None,
  schedule: Option[String] = None,
  /* StartingDeadlineSeconds is the K8s-style deadline that will limit the time a CronWorkflow will be run after its original scheduled time if it is missed. */
  startingDeadlineSeconds: Option[String] = None,
  successfulJobsHistoryLimit: Option[Int] = None,
  suspend: Option[Boolean] = None,
  /* Timezone is the timezone against which the cron schedule will be calculated, e.g. \"Asia/Tokyo\". Default is machine's local time. */
  timezone: Option[String] = None,
  workflowMeta: Option[ObjectMeta] = None,
  workflowSpec: Option[WorkflowSpec] = None
) extends ApiModel


