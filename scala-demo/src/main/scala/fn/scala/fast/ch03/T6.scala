package fn.scala.fast.ch03

import scala.collection.mutable.ArrayBuffer

object T6 {
  def reverse(a: Array[Int]) = {
    a.reverse.mkString("<", ", ", ">")
  }

  def reverse(a: ArrayBuffer[Int]) = {
    a.reverse.mkString("<", ", ", ">")
  }

  def main(args: Array[String]): Unit = {
    val array = Array(0, 1, 2, 3, 4)
    val arrayBuffer = ArrayBuffer(0, 1, 2, 3, 4)

    println("reverse(array): " + reverse(array))
    println("reverse(arrayBuffer): " + reverse(arrayBuffer))
  }
}
