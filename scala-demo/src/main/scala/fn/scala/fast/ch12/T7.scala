package fn.scala.fast.ch12

object T7 {
  def adjustToPair(func: (Int, Int) => Int)(tuple: (Int, Int)) = {
    func(tuple._1, tuple._2)
  }

  def f1(): Unit = {
    val pairs = (1 to 10) zip (11 to 20)

    println("adjustToPair(_ * _)((6, 7)): " + adjustToPair(_ * _)((6, 7)))

    println("map with adjustToPair: ")
    pairs.map(z => adjustToPair(_ + _)(z)).foreach(x => print(x + " "))
    println()

    println("map without adjustToPair: ")
    pairs.map(z => z._1 + z._2).foreach(x => print(x + " "))
    println()
  }

  def adjustToPair2(func: (Int, Int) => Int, tuple: (Int, Int)) = {
    func(tuple._1, tuple._2)
  }

  def f2(): Unit = {
    println("adjustToPair2(_ * _, (6, 7)): " + adjustToPair2(_ * _, (6, 7)))
  }

  def main(args: Array[String]): Unit = {
    f1()
    f2()
  }
}
