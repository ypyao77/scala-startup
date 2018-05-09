package scala.program.ch16

object MyList {
  def func1 = {
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

  def func2 = {
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

  def func3 = {
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

  def func4 = {
    println("\nin func4()")

    var l: List[Int] = List(1, 4, 7, 2, 5, 8, 3, 6, 9)
    l = isort(l)
    println("l: " + l)
  }

  def func5 = {
    println("\nin func5()")

    val l = List(1, 2) ::: List(3, 4, 5)
    println("l: " + l)
  }

  def merge[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case x :: xs1 => x :: merge(xs1, ys)
  }

  def func6 = {
    println("\nin func6()")
    val l = merge(List(1, 2), List(3, 4, 5))
    println("merge(List(1, 2), List(3, 4, 5): " + l)
    println("l.drop(2): " + l.drop(2))
    println("l: " + l)
    println("l.take(2): " + l.take(2))
    println("l: " + l)
    println("l.splitAt(3): " + l.splitAt(3))
  }

  def func7 = {
    println("\nin func7()")
    val s = "abcde"
    val a = List('a', 'b', 'c', 'd', 'e')
    val l = s.indices zip s

    println("l: " + l)
    println("s.toString: " + s.toString)
    println("a.mkString(\"<<<\", \", \", \">>>\"): " + a.mkString("<<<", ", ", ">>>"))
  }

  def func8 = {
    println("\nin func8()")
    val a = "abcde"
    println("a.toArray: " + a.toArray)
    println("a.toList: " + a.toList)
  }

  def mergesort[T](less: (T, T) => Boolean)(xs: List[T]): List[T] = {
    def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
      case (Nil, _) => ys
      case (_, Nil) => xs
      case (x :: xs1, y :: ys1) => if (less(x, y)) x :: merge(xs1, ys) else y :: merge(xs, ys1)
    }

    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (ys, zs) = xs splitAt n
      merge(mergesort(less)(ys), mergesort(less)(zs))
    }
  }

  def func9 = {
    println("\nin func8()")
    val l = List(5, 7, 1, 9, 3)
    println("mergesort(l): " + mergesort((x: Int, y: Int) => x < y)(l))
  }

  def main(args: Array[String]): Unit = {
    func1
    func2
    func3
    func4
    func5
    func6
    func7
    func8
    func9
  }
}
