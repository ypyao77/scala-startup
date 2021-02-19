package scala.program.ch15

object Sealed {
  def main(args: Array[String]): Unit = {
    sealed abstract class O;

    case class A(x: Int) extends O;
    case class B(x: Int) extends O;
    case class C(x: Int) extends O;

    val o: O = A(1);

    o match {
      case e@A(_) => println("A: " + e)
      case e@B(_) => println("B: " + e)
      // warning if C(_) is not routed
    }
  }
}

