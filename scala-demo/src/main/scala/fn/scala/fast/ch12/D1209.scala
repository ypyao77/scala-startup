package fn.scala.fast.ch12

object D1209 {
  def runInThread1(block: () => Unit): Unit = {
    new Thread {
      override def run() { block() }
    }.start()
  }

  def runInThread2(block: => Unit): Unit = {
    new Thread {
      override def run() { block }
    }.start()
  }

  def until(condition: => Boolean)(block: => Unit): Unit = {
    if (!condition) {
      block
      until(condition)(block)
    }
  }

  def main(args: Array[String]): Unit = {
    var x = 3
    until(x == 0) {
      x -= 1
      println(x)
    }

    Thread.sleep(1*1000)

    runInThread1 {
      () => {
        println("Hi1")
        Thread.sleep(3 * 1000)
        println("Bye1")
      }
    }

    runInThread1 {
      () =>
        println("Hi2")
        Thread.sleep(3 * 1000)
        println("Bye2")
    }

    runInThread2 {
      println("Hi3")
      Thread.sleep(3 * 1000)
      println("Bye3")
    }
  }
}
