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

case class S3Bucket (
  accessKeySecret: Option[SecretKeySelector] = None,
  bucket: Option[String] = None,
  endpoint: Option[String] = None,
  insecure: Option[Boolean] = None,
  region: Option[String] = None,
  /* RoleARN is the Amazon Resource Name (ARN) of the role to assume. */
  roleARN: Option[String] = None,
  secretKeySecret: Option[SecretKeySelector] = None,
  /* UseSDKCreds tells the driver to figure out credentials based on sdk defaults. */
  useSDKCreds: Option[Boolean] = None
) extends ApiModel


