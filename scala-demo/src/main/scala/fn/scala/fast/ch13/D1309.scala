package fn.scala.fast.ch13

object D1309 {
  def main(args: Array[String]): Unit = {
    def sp(v: Vector[String]) = v
    val sentence = List(Vector("Mary", "had"), Vector("a", "little", "lamb"))

    println(sentence.flatMap(sp))
    println(sentence.flatMap(x => x))
  }
}
