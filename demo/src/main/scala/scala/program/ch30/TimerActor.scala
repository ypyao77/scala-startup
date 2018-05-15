package scala.program.ch30

import scala.concurrent.duration._
import akka.actor.{Actor, ActorSystem, Props, Timers}

object TimerActor {

  private case object TickKey
  private case object FirstTick
  private case object Tick

  def main(args: Array[String]): Unit = {
    val system = ActorSystem("akkaSystem")
    system.actorOf(Props[TimerActor], name = "MyActor")
  }
}

class TimerActor extends Actor with Timers {
  import TimerActor._

  timers.startSingleTimer(TickKey, FirstTick, 5000.millis)

  def receive = {
    case FirstTick => {
      // do something useful here
      timers.startPeriodicTimer(TickKey, Tick, 1.second)
      println("FirstTick")
    }
    case Tick => {
      // do something useful here
      println("Tick")
    }
  }
}