package fn.scala.fast.ch05

object T1 {
  class Counter {
    private var value = Byte.MaxValue-2

    def increment {
      if (value < Byte.MaxValue) value += 1
    }

    def current = value
  }

  def main(args: Array[String]): Unit = {
    val counter = new Counter

    println("counter.current(): " + counter.current)
    counter.increment
    println("counter.current(): " + counter.current)
    counter.increment
    println("counter.current(): " + counter.current)
    counter.increment
    println("counter.current(): " + counter.current)
    counter.increment
    println("counter.current(): " + counter.current)
  }
}
