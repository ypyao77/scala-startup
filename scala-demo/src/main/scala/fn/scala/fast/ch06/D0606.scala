package fn.scala.fast.ch06

object D0606 {
  object TLC1 extends Enumeration {
    val Red, Yellow, Green = Value
  }

  object TLC2 extends Enumeration {
    val Red = Value
    val Yellow = Value
    val Green = Value
  }

  object TLC3 extends Enumeration {
    val Red = Value(0, "STOP")
    val Yellow = Value(10)
    val Green = Value("GO")
  }

  def main(args: Array[String]): Unit = {
    println(TLC1.Red + " " + TLC1.Yellow + " " + TLC1.Green)
    println(TLC2.Red + " " + TLC2.Yellow + " " + TLC2.Green)
    println(TLC3.Red + " " + TLC3.Yellow + " " + TLC3.Green)

    println(TLC1.Red==TLC1.Red)
    println(TLC1.Red==TLC2.Red)
    println(TLC1.Red==TLC3.Red)

    for ( c <- TLC1.values) println(c.id + ": " + c)
    for ( c <- TLC2.values) println(c.id + ": " + c)
    for ( c <- TLC3.values) println(c.id + ": " + c)
  }
}
