package scala.program.ch8

object Functional {
  def main(args: Array[String]): Unit = {
    // case 1
    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    someNumbers.foreach((x: Int) => println("  x: " + x))
    someNumbers.foreach(println(_))
    someNumbers.foreach(println)

    var _sum = 0
    someNumbers.foreach(_sum += _)
    println("someNumbers.foreach(sum += _): " + _sum)

    // case 2
    println(someNumbers.filter((x: Int) => x > 0))
    println(someNumbers.filter((x) => x > 0))
    println(someNumbers.filter(x => x > 0))
    println(someNumbers.filter(_ > 0))

    // case 3
    val f = (_: Int) + (_: Int)
    println("f(5, 10): " + f(5, 10))

    // case 4
    def sum(a: Int, b: Int, c: Int) = a + b + c

    println("sum(1, 2, 3): " + sum(1, 2, 3))

    // case 5
    val a = sum _
    println("a.apply(1, 2, 3): " + a.apply(1, 2, 3))
    println("a(1, 2, 3): " + a(1, 2, 3))

    // case 6
    val b = sum(1, _: Int, 3)
    println("b(5): " + b(2))

    // case 7
    val more = 1
    val addMore = (x: Int) => x + more
    println("addMore(10): " + addMore(10))

    // case 8
    def makeIncreaser(more: Int) = (x: Int) => x + more

    val inc1 = makeIncreaser(1)
    val inc2 = makeIncreaser(2)
    println("inc1(10): " + inc1(10))
    println("inc2(10): " + inc2(10))

    // case 9
    def echo(args: String*) = for (arg <- args) println(arg)

    echo()
    echo("one")
    echo("hello", "world!")
    echo(Array("What's", "up", "doc?"): _*)
    echo(List("What's", "up", "doc?"): _*)
  }
}
