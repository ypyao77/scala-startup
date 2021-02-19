package scala.program.ch16

object MyList2 {
  def func1 = {
    println("\nin func1()")

    val l = List(1, 2, 3, 4)
    println("l.map(_ + 3): " + l.map(_ + 3))

    val ws = List("the", "scala", "book", "is", "known", "I", "love", "it")
    println("ws.map(_.length): " + ws.map(_.length))
    println("ws.map(_.toList.reverse.mkString): " + ws.map(_.toList.reverse.mkString))
    println("ws.map(_.toList): " + ws.map(_.toList))
    println("ws.flatMap(_.toList): " + ws.flatMap(_.toList))
  }

  def sum1(xs: List[Int]): Int = (0 /: xs) (_ + _)

  def sum2(xs: List[Int]): Int = (xs :\ 0) (_ + _)

  def func2 = {
    println("\nin func2()")

    println("List.range(1, 5): " + List.range(1, 5))
    val fm = List.range(1, 5).flatMap(i => List.range(1, i).map(j => (i, j)))
    println("flatMap: " + fm)

    val fm2 = for (i <- List.range(1, 5); j <- List.range(1, i)) yield (i, j)
    println(" forMap: " + fm2)

    var _sum = 0
    val l = List(1, 2, 3, 4, 5)
    println("l.foreach( (sum += _)): " + l.foreach((_sum += _)))
    println("sum1(l): " + sum1(l))
    println("sum2(l): " + sum2(l))
  }

  def func3 = {
    println("\nin func3()")

    val l = List.range(1, 10)
    println("l: " + l)
    println("l.filter(_ % 3 == 0)" + l.filter(_ % 3 == 0))

    val ws = List("the", "scala", "book", "is", "known", "I", "love", "it")
    println("ws.filter(_.length > 2): " + ws.filter(_.length > 2))
    println("ws.partition(_.length > 2): " + ws.partition(_.length > 2))
  }

  def func4 = {
    println("\nin func4()")
    val ws = List("the", "scala", "book", "is", "known", "I", "love", "it")
    println("(\"\" /: ws) (_ + \" \" + _): " + ("" /: ws) (_ + " " + _))
    println("(ws.head /: ws.tail) (_ + \" \" + _): " + (ws.head /: ws.tail) (_ + " " + _))
  }

  def func5 = {
    println("\nin func5()")

    val l1 = List.apply(1, 2, 3, 4, 5)
    val l2 = List(1, 2, 3, 4, 5)

    println("l1: " + l1)
    println("l2: " + l2)
    println("(l1 == l2): " + (l1 == l2))

    val xss = List(List("a", "b"), List("c", "d"), List("e", "f", "g"))
    println("xss.flatten: " + xss.flatten)
    println("List.concat(List(\"a\", \"b\"), List(\"c\", \"d\"), List(\"e\", \"f\", \"g\")): " + List.concat(List("a", "b"), List("c", "d"), List("e", "f", "g")))
  }

  def main(args: Array[String]): Unit = {
    func1
    func2
    func3
    func4
    func5
  }
}
