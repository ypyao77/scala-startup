package scala.fast.ch12

object Return {
  def until(condition: => Boolean)(block: => Unit): Unit = {
    if (!condition) {
      block
      until(condition)(block)
    }
  }

  def f1(): Unit = {
    var x = 10
    until(x == 0) {
      x -= 1
      println(x)
    }
  }

  def indexOf(str: String, ch: Char): Int = {
    var i = 0
    until(i == str.length) {
      if (str(i) == ch) return i
      i += 1
    }
    return -1
  }

  def f2(): Unit = {
    val hello = "hello"

    println("indexOf(hello, 'e'): " + indexOf(hello, 'e'))
    println("indexOf(hello, 'x'): " + indexOf(hello, 'x'))
  }

  def main(args: Array[String]): Unit = {
    f1()
    f2()
  }
}
