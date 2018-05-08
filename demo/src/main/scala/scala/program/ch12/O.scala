package scala.program.ch12

class A {
  override def toString = "A::A()"
}

trait B {
  override def toString = "B::B()"
}

class O extends A with B {
  override def toString = "O::O()"
}

object O {
  def main(args: Array[String]): Unit = {
    val a = new A
    /*val b = new B*/
    val o = new O

    println("a: " + a)
    /*println("b: " + b)*/
    println("o: " + o)
  }
}

