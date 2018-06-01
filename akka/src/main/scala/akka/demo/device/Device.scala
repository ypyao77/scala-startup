package akka.demo.device

import akka.actor.{Actor, ActorLogging, ActorSystem, Props}

final case object ReadTemperature
final case class RespondTemperature(value: Option[Double])
final case class RecordTemperature(value: Double)

object Device {
  def main(args: Array[String]): Unit = {
  }
}

