package akka.demo.ch30

import akka.actor._

object SillyActor /*extends Actor*/ {
  def act(): Unit = {
    for (i <- 1 to 5) {
      println("I'm acting ...")
      Thread.sleep(1000)
    }
  }

  def main(args: Array[String]): Unit = {
    // SillyActor.start()
    println("hello actor!")
  }
}
