/**
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.argoproj.workflow.models

import io.argoproj.workflow.ApiModel

case class Gauge (
  /* Realtime emits this metric in real time if applicable */
  realtime: Boolean,
  /* Value is the value of the metric */
  value: String
) extends ApiModel

