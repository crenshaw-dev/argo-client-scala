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

case class WorkflowTemplateList (
  items: Option[Seq[WorkflowTemplate]] = None,
  metadata: Option[ListMeta] = None
) extends ApiModel


