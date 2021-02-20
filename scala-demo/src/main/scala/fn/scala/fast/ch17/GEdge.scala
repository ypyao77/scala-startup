package fn.scala.fast.ch17

object GEdge {

  class Pair[T <: Comparable[T]](val first: T, val second: T) {
    def smaller = if (first.compareTo(second) < 0) first else second

    override def toString = "Pair(" + first + ", " + second + ")" + "  smaller: " + smaller.toString
  }

  def f1(): Unit = {
    println("f1()")

    println(new Pair("Fred", "Brooks"))
    println(new Pair[BigInt](3, 5))
  }

  sealed class A

  class B1(desc: String) extends A

  class B2(desc: String, price: Int) extends A

  class C11(desc: String) extends B1(desc)

  class C12(desc: String) extends B1(desc)

  class C21(desc: String, price: Int) extends B2(desc, price)

  class C22(desc: String, price: Int) extends B2(desc, price)

  def desc[T](t: T) = println(t.getClass.getName)

  def desc1[T <: B1](t: T) = {
    desc(t)
  }

  def desc2[T >: B1](t: T) = {
    desc(t)
  }

  def f2(): Unit = {
    println("f2()")

    val a = new A()
    val b1 = new B1("b1")
    val b2 = new B2("b2", 10)
    val c11 = new C11("c11")
    val c12 = new C12("c12")
    val c21 = new C21("c21", 10)
    val c22 = new C22("c22", 10)

    // desc1(a) // error
    desc1(b1)
    // desc1(b2) // error
    desc1(c11) // error
    desc1(c12) // error
    // desc1(c21) // error
    // desc1(c22) // error
  }

  def f3(): Unit = {
    println("f3()")

    val a = new A()
    val b1 = new B1("b1")
    val b2 = new B2("b2", 10)
    val c11 = new C11("c11")
    val c12 = new C12("c12")
    val c21 = new C21("c21", 10)
    val c22 = new C22("c22", 10)

    desc2(a)
    desc2(b1)
    desc2(b2)
    desc2(c11)
    desc2(c12)
    desc2(c21)
    desc2(c22)
  }

  def main(args: Array[String]): Unit = {
    f1()
    f2()
    f3()
  }
}
