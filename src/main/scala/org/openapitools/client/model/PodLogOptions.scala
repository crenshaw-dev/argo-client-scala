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

case class PodLogOptions (
  container: Option[String] = None,
  follow: Option[Boolean] = None,
  limitBytes: Option[String] = None,
  previous: Option[Boolean] = None,
  sinceSeconds: Option[String] = None,
  sinceTime: Option[Time] = None,
  tailLines: Option[String] = None,
  timestamps: Option[Boolean] = None
) extends ApiModel


