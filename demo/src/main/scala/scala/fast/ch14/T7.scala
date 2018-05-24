package scala.fast.ch14

object T7 {

  sealed abstract class Tree
  case class Leaf(value: Int) extends Tree
  case class Node(leafs: Tree*) extends Tree

  def leafSum(tree: Tree): Int = tree match {
    case Leaf(value) => value
    case Node(leafs @ _*) => leafs.map(leafSum).sum
  }

  def main(args: Array[String]): Unit = {
    val tree1 = Node(Node(Leaf(3), Leaf(8)), Leaf(2))
    val tree2 = Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5), Node(Leaf(4))))
    val tree3 = Node(Leaf(1))
    val tree4 = Node()

    println("leafSum(tree1): " + leafSum(tree1))
    println("leafSum(tree2): " + leafSum(tree2))
    println("leafSum(tree3): " + leafSum(tree3))
    println("leafSum(tree4): " + leafSum(tree4))
  }
}
