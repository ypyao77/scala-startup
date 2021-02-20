package fn.scala.fast.ch12

object RunInThread {
  def f1() = {
    def runInThread(block: () => Unit): Unit = {
      new Thread {
        override def run() {
          block()
        }
      }.start()
    }

    println("f1()")
    runInThread {
      () => {
        println("f1():Hi")
        Thread.sleep(5000)
        println("f1():Bye")
      }
    }
  }

  def f2() = {
    def runInThread(block: => Unit) {
      new Thread {
        override def run() { block }
      }.start()
    }

    println("f2()")
    runInThread {
      println("f2():Hi")
      Thread.sleep(5000)
      println("f2():Bye")
    }
  }
  def main(args: Array[String]): Unit = {
    f1()
    f2()
  }
}
