package akka.demo.ch30

import akka.actor.{Actor, ActorSystem, Props}

class HelloActor extends Actor {
  def receive = {
    case "hello" => println("您好！")
    case _ => println("您是?")
  }
}

object SimplestActor extends App {
  val system = ActorSystem("HelloSystem")
  // 缺省的Actor构造函数
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")

  helloActor ! "hello"
  helloActor ! "喂"
}
