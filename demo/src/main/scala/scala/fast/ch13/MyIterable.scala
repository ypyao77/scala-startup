package scala.fast.ch13

object MyIterable {
  def f1(): Unit = {
    println("f1()")

    val iterable = Iterable(0xFF, 0xFF00, 0xFF0000)
    val iter = iterable.iterator

    while (iter.hasNext) {
      println("iter.next = " + iter.next)
    }
  }

  def f2() = {
    object Color extends Enumeration {
      val RED, GREEN, BLUE = Value
    }

    println("f2()")

    val set = Set(Color.RED, Color.GREEN, Color.BLUE)
    val iter = set.iterator

    while (iter.hasNext) {
      println("iter.next = " + iter.next)
    }
  }

  def f3(): Unit = {
    def digits(n: Int): Set[Int] = {
      if (n < 0) digits(-n)
      else if (n < 10) Set(n)
      else digits(n / 10) + (n % 10)
    }

    println("f3()")

    println("digits(-2): " + digits(-2))
    println("digits(-1): " + digits(-1))
    println("digits(0): " + digits(0))
    println("digits(1): " + digits(1))
    println("digits(2): " + digits(2))
    println("digits(5): " + digits(5))
    println("digits(10): " + digits(10))
    println("digits(11): " + digits(11))
    println("digits(115): " + digits(115))
    println("digits(1155): " + digits(1155))
  }

  def f4(): Unit = {
    println("f4()")

    val list = List(1, 2, 3, 4, 5)

    println("(9 :: list): " + (9 :: list))
    println("(9 :: list).sorted: " + (9 :: list).sorted)
    println("(list ::: List(9): " + (list ::: List(9)))
  }

  def main(args: Array[String]): Unit = {
    f1()
    f2()
    f3()
    f4()
  }
}
