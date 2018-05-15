package akka.demo.timer

import java.util.concurrent.TimeUnit

import akka.actor.{Actor, ActorSystem, Props}
import scala.concurrent.duration.Duration
import scala.concurrent.ExecutionContext.Implicits.global

object Timer {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("testSystem")

    for (_ <- 1 to 1) {
      val Tick = "tick"
      val tickActor = system.actorOf(Props(new Actor {
        private var counter = 0
        def receive = {
          case Tick => {
            println("tick: ")
            counter += 1
            if (counter > 500)
              system.terminate()
          }
          case _ => println("what??")
        }
      }))

      //This will schedule to send the Tick-message
      //to the tickActor after 0ms repeating every 50ms
      val cancellable = system.scheduler.schedule(Duration(5, TimeUnit.SECONDS), Duration(1, TimeUnit.SECONDS), tickActor, Tick)

      //This cancels further Ticks to be sent
      // cancellable.cancel()
    }
  }
}
