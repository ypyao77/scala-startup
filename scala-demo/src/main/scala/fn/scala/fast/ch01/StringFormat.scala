package fn.scala.fast.ch01

object StringFormat {
  def f1(): Unit = {
    println("f1()")

    var v = 5.111
    println(f"$v%.2f")
    println("%.2f".format(v))

    v = 5.150
    println(f"$v%.2f")
    println("%.2f".format(v))

    v = 5.149
    println(f"$v%.2f")
    println("%.2f".format(v))

    v = 5.151
    println(f"$v%.2f")
    println("%.2f".format(v))

    v = 5.155
    println(f"$v%.2f")
    println("%.2f".format(v))
  }

  def f2(): Unit = {
    println("f2()")

    val formatter = java.text.NumberFormat.getIntegerInstance
    println(formatter.format(10000))
    println(formatter.format(1000000))
  }

  def f3(): Unit = {
    println("f3()")

    val locale = new java.util.Locale("de", "DE")
    val formatter = java.text.NumberFormat.getIntegerInstance(locale)
    println(formatter.format(1000000))
  }

  def main(args: Array[String]): Unit = {
    f1()
    f2()
    f3()
  }
}
