package scala.fast.ch14

object T8 {
  sealed abstract class Tree
  case class Leaf(value: Int) extends Tree
  case class Node(oper: Char, leafs: Tree*) extends Tree

  def eval1(tree: Tree): Int = tree match {
    case Leaf(value) => value
    case Node(oper, leafs @ _*) => oper match {
      case '+' => leafs.map(eval1).sum
      case '*' => leafs.map(eval1).reduceLeft(_ * _)
      case '-' => leafs.map(eval1).foldLeft(0)(_ - _)
    }
  }

  def eval2(tree: Tree): Int = tree match {
    case Leaf(value) => value
    case Node(oper, leafs @ _*) => oper match {
      case '+' => leafs.map(eval2).foldLeft(0)(_ + _)
      case '*' => leafs.map(eval2).foldLeft(1)(_ * _)
      case '-' => leafs.map(eval2).foldLeft(0)(_ - _)
    }
  }

  def eval3(tree: Tree): Int = tree match {
    case Leaf(value) => value
    case Node(oper, leafs @ _*) => oper match {
      case '+' => leafs.map(eval3).reduceLeft(_ + _)
      case '*' => leafs.map(eval3).reduceLeft(_ * _)
      case '-' => leafs.map(eval3).foldLeft(0)(_ - _)
    }
  }

  def main(args: Array[String]): Unit = {
    val tree1 = Node('+', Node('*', Leaf(3), Leaf(8)), Leaf(2), Node('-', Leaf(5)))

    println("eval1(tree1): " + eval1(tree1))
    println("eval2(tree1): " + eval2(tree1))
    println("eval3(tree1): " + eval3(tree1))
  }
}
