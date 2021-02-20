package fn.scala.fast.ch02

object T6 {
  def t1(str: String) = {
    var a = 1L
    for (i <- str)
      a *= i.toLong
    a
  }

  def t2(str: String) = {
    var a = 1L
    str.toCharArray.foreach(a *= _.toLong)
    a
  }

  def t3(str: String): Long = {
    if (str.length < 1) {
      1L
    } else {
      str.head.toLong * t3(str.tail)
    }
  }

  def main(args: Array[String]): Unit = {
    println("t1(\"Hello\"): " + t1("Hello"))
    println("t2(\"Hello\"): " + t2("Hello"))
    println("t3(\"Hello\"): " + t3("Hello"))
  }
}
