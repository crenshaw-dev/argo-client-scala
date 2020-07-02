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

case class CSIVolumeSource (
  /* Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster. */
  driver: Option[String] = None,
  fsType: Option[String] = None,
  nodePublishSecretRef: Option[LocalObjectReference] = None,
  readOnly: Option[Boolean] = None,
  volumeAttributes: Option[Map[String, String]] = None
) extends ApiModel

