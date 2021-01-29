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
package io.argoproj.workflow.apis

import io.argoproj.workflow.models._
import org.json4s._
import scala.reflect.ClassTag

object EnumsSerializers {

  def all: Seq[Serializer[_]] = Seq[Serializer[_]]()

  private class EnumNameSerializer[E <: Enumeration: ClassTag](enum: E)
    extends Serializer[E#Value] {
    import JsonDSL._

    val EnumerationClass: Class[E#Value] = classOf[E#Value]

    def deserialize(implicit format: Formats):
    PartialFunction[(TypeInfo, JValue), E#Value] = {
      case (t @ TypeInfo(EnumerationClass, _), json) if isValid(json) =>
        json match {
          case JString(value) =>
            enum.withName(value)
          case value =>
            throw new MappingException(s"Can't convert $value to $EnumerationClass")
        }
    }

    private[this] def isValid(json: JValue) = json match {
      case JString(value) if enum.values.exists(_.toString == value) => true
      case _ => false
    }

    def serialize(implicit format: Formats): PartialFunction[scala.Any, JValue] = {
      case i: E#Value => i.toString
    }
  }

}