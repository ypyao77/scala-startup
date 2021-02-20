package fn.scala.fast.ch12

object T8 {
  def main(args: Array[String]): Unit = {
    val a = Array("abc","ab","abcd")
    val b = Array(3,2,4)
    val c = Array(3,2,1)
    val d = Array(3,2)
    val e = Array(3,2, 4, 3)

    println(a.corresponds(b)(_.length == _))
    println(a.corresponds(c)(_.length == _))
    println(a.corresponds(d)(_.length == _))
    println(a.corresponds(e)(_.length == _))
  }
}
