package scala.program.ch19

object Queue {

  abstract class Queue[T](elems: List[T]) {
    override def toString = elems.toString
  }

  class SlowAppendQueue[T](elems: List[T]) extends Queue(elems) {
    def head = elems.head

    def tail = new SlowAppendQueue(elems.tail)

    def append(x: T) = new SlowAppendQueue(elems ::: List(x))
  }

  class SlowHeadQueue[T](elems: List[T]) extends Queue(elems) {
    def head = elems.last

    def tail = new SlowHeadQueue(elems.init)

    def append(x: T) = new SlowHeadQueue(x :: elems)
  }

  class FastQueue[T](elems: List[T]) extends Queue(elems) {
    private val leading: List[T] = List()
    private val trailing: List[T] = List()

    def head = elems.last

    def tail = new SlowHeadQueue(elems.init)

    def append(x: T) = new SlowHeadQueue(x :: elems)
  }

  def func1() = {
    println("\nfunc1()")
    val q1 = new SlowAppendQueue[Int](List(1, 2, 3, 4, 5))

    println("q1 = " + q1)
    println("q1.head = " + q1.head)
    println("q1.tail = " + q1.tail)
    println("q1.append(255)" + q1.append(255))
  }

  def func2() = {
    println("\nfunc2()")
    val q2 = new SlowHeadQueue[Int](List(1, 2, 3, 4, 5))

    println("q2 = " + q2)
    println("q2.head = " + q2.head)
    println("q2.tail = " + q2.tail)
    println("q2.append(255)" + q2.append(255))
  }

  def main(args: Array[String]): Unit = {
    func1()
    func2()
  }
}
