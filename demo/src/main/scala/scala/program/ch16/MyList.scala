package scala.program.ch16

object MyList {
  val func1 = {
    println("\nin func1()")

    val fruits = List("apple", "orange", "pear")
    val nums = List(1, 2, 3, 4)
    val diag3 = List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )
    val empty: List[Nothing] = List()

    println("fruits: " + fruits)
    println("nums: " + nums)
    println("diag3: " + diag3)
    println("empty: " + empty)
  }

  val func2 = {
    println("\nin func2()")

    val fruits = "apple" :: "orange" :: "pear" :: Nil
    val nums = 1 :: 2 :: 3 :: 4 :: Nil
    val diag3 = (1 :: 0 :: 0 :: Nil) ::
      (0 :: 1 :: 0 :: Nil) ::
      (0 :: 0 :: 1 :: Nil) :: Nil
    val empty = Nil

    println("fruits: " + fruits)
    println("fruits.head: " + fruits.head)
    println("fruits.tail: " + fruits.tail)
    println("fruits.last: " + fruits.last)
    println("nums: " + nums)
    println("diag3: " + diag3)
    println("empty: " + empty)
  }

  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case x :: xs1 => insert(x, isort(xs1))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }

  val func3 = {
    println("\nin func3()")

    var l: List[Int] = List()
    l = insert(3, l)
    println("l: " + l)
    l = insert(2, l)
    println("l: " + l)
    l = insert(1, l)
    println("l: " + l)
    l = insert(4, l)
    println("l: " + l)
    l = insert(5, l)
    println("l: " + l)
    l = insert(6, l)
    println("l: " + l)
  }
  val func4 = {
    println("\nin func4()")

    var l: List[Int] = List(1, 4, 7, 2, 5, 8, 3, 6, 9)
    l = isort(l)
    println("l: " + l)
  }

  val func5 = {
    println("\nin func5()")

    val l = List(1, 2) ::: List(3, 4, 5)
    println("l: " + l)
  }
  def main(args: Array[String]): Unit = {
    MyList.func1
    MyList.func2
    MyList.func3
    MyList.func4
    MyList.func5
  }
}
