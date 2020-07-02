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

case class VolumeSource (
  awsElasticBlockStore: Option[AWSElasticBlockStoreVolumeSource] = None,
  azureDisk: Option[AzureDiskVolumeSource] = None,
  azureFile: Option[AzureFileVolumeSource] = None,
  cephfs: Option[CephFSVolumeSource] = None,
  cinder: Option[CinderVolumeSource] = None,
  configMap: Option[ConfigMapVolumeSource] = None,
  csi: Option[CSIVolumeSource] = None,
  downwardAPI: Option[DownwardAPIVolumeSource] = None,
  emptyDir: Option[EmptyDirVolumeSource] = None,
  fc: Option[FCVolumeSource] = None,
  flexVolume: Option[FlexVolumeSource] = None,
  flocker: Option[FlockerVolumeSource] = None,
  gcePersistentDisk: Option[GCEPersistentDiskVolumeSource] = None,
  gitRepo: Option[GitRepoVolumeSource] = None,
  glusterfs: Option[GlusterfsVolumeSource] = None,
  hostPath: Option[HostPathVolumeSource] = None,
  iscsi: Option[ISCSIVolumeSource] = None,
  nfs: Option[NFSVolumeSource] = None,
  persistentVolumeClaim: Option[PersistentVolumeClaimVolumeSource] = None,
  photonPersistentDisk: Option[PhotonPersistentDiskVolumeSource] = None,
  portworxVolume: Option[PortworxVolumeSource] = None,
  projected: Option[ProjectedVolumeSource] = None,
  quobyte: Option[QuobyteVolumeSource] = None,
  rbd: Option[RBDVolumeSource] = None,
  scaleIO: Option[ScaleIOVolumeSource] = None,
  secret: Option[SecretVolumeSource] = None,
  storageos: Option[StorageOSVolumeSource] = None,
  vsphereVolume: Option[VsphereVirtualDiskVolumeSource] = None
) extends ApiModel

