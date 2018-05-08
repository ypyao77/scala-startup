package scala.program.ch15

abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

class PointX(x: Int, y: Int) {
  val xc = x
  val yc = y

  override def toString = "(" + x + ", " + y + ")"
}
object PointX {
  def apply(x: Int, y: Int) = new PointX(x, y)
}

object Expr {
  def describe(x: Any) = x match {
    case 1 => "one"
    case 5 => "five"
    case "hello" => "hi"
    case true => "truth"
    case Nil => "empty list"
    case _ => "something else"
  }

  def list(expr: Any) = expr match {
    case List(0, _, _) => "found it"
    case _ => "not found"
  }

  def list2(expr: Any) = expr match {
    case List(0, _*) => "found it"
    case _ => "not found"
  }

  def generalSize(x: Any) = x match {
    case s: String => s.length
    case m: Map[_, _] => m.size
    case l: List[_] => l.size
    case _ => 1
  }

  def isEqual(x: Any) = x match {
    case p: PointX if p.xc == p.yc => "PointX equal"
    case p: PointX if p.xc != p.yc => "PointX not equal"
    case _ => "exception"
  }

  def main(args: Array[String]): Unit = {
    // case 1
    val v = Var("X")
    println("v = " + v)
    println("v.name = " + v.name)

    // case 2
    val op = BinOp("+", Number(1), v)
    println("op = " + op)
    println("op.left = " + op.left)
    println("op.right = " + op.right)

    println("(op.right == Var(\"X\"): " + (op.right == Var("X")))

    // case 3
    /*
    println("UnOp(\"-\", UnOp(\"-\", e)): " + UnOp("-", UnOp("-", e)))
    println("BinOp(\"+\", e, Number(0)): " + BinOp("+", e, Number(0)))
    println("BinOp(\"*\", e, Number(1)): " + BinOp("*", e, Number(1)))
    */

    // case 4
    println("")
    println("[case 4]")
    println("describe(1): " + describe(1))
    println("describe(Nil): " + describe(Nil))
    println("describe(\"cc\"): " + describe("cc"))
    println("describe(\"hello\"): " + describe("hello"))
    println("describe(true): " + describe(true))

    // case 5
    println("")
    println("[case 5]")
    println("list(List(1, 2, 3)): " + list(List(1, 2, 3)))
    println("list(List(0, 2, 3)): " + list(List(0, 2, 3)))
    println("list(List(0, 2, 3, 4)): " + list(List(0, 2, 3, 4)))
    println("list(List(0, 1)): " + list(List(0, 1)))
    println("list(Array(0, 1, 2)): " + list(Array(0, 1, 2)))

    // case 6
    println("")
    println("[case 6]")
    println("list2(List(1, 2, 3)): " + list2(List(1, 2, 3)))
    println("list2(List(0, 2, 3)): " + list2(List(0, 2, 3)))
    println("list2(List(0, 2, 3, 4)): " + list2(List(0, 2, 3, 4)))
    println("list2(List(0, 1)): " + list2(List(0, 1)))
    println("list2(Array(0, 1, 2)): " + list2(Array(0, 1, 2)))

    // case 7
    println("")
    println("[case 7]")
    println("generalSize(abc): " + generalSize("abc"))
    println("generalSize(math.Pi): " + generalSize(math.Pi))
    println("generalSize(List(1, 2, 3)): " + generalSize(List(1, 2, 3)))
    println("generalSize(Map(1 -> 'a', 2 -> 'b')): " + generalSize(Map(1 -> 'a', 2 -> 'b')))
    println("generalSize(Map(1 -> 'a', 2 -> 'b', 3 -> 'c')): " + generalSize(Map(1 -> 'a', 2 -> 'b', 3 -> 'c')))

    // case 8
    println("")
    println("[case 7]")
    println("isEqual(PointX(1, 3)):" + isEqual(PointX(1, 3)))
    println("isEqual(PointX(3, 3)):" + isEqual(PointX(3, 3)))
    println("isEqual(Nil):" + isEqual(Nil))
  }
}

