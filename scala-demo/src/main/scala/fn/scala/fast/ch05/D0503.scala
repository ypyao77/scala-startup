package fn.scala.fast.ch05

import java.util.Date

object D0503 {
  class Message {
    val timestamp = new Date
  }

  class Counter {
    private var value = 0L

    def increment() { value += 1 }
    def current = value
  }

  def main(args: Array[String]): Unit = {
    val msg = new Message
    println("Message: " + msg.timestamp)

    val counter = new Counter
    counter.increment
    counter.increment()
    println("Counter: " + counter.current)
  }
}
