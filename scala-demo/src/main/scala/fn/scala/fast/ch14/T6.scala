package fn.scala.fast.ch14

object T6 {

  sealed abstract class BTree
  case class Leaf(value: Int) extends BTree
  case class Node(leftLeaf: BTree, rightLeaf: BTree) extends BTree

  def leafSum(btree: BTree): Int = btree match {
    case Leaf(value) => value
    case Node(leftLeaf, rightLeaf) => leafSum(leftLeaf) + leafSum(rightLeaf)
  }

  def main(args: Array[String]): Unit = {
    val tree1 = Node(Node(Leaf(3), Leaf(8)), Leaf(2))

    println("leafSum(tree1): " + leafSum(tree1))
  }
}
