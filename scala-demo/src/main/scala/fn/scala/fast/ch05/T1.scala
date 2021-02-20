package fn.scala.fast.ch05

object T1 {
  class Counter {
    private var value = Int.MaxValue

    def increment() {
      if (value < Int.MaxValue) value += 1
      else value
    }

    def current = value
  }

  def main(args: Array[String]): Unit = {

  }
}
