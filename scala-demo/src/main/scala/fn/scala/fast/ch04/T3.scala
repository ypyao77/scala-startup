package fn.scala.fast.ch04

object T3 {
  def main(args: Array[String]): Unit = {
    var words = Map[String, Int]()
    val in2 = new java.util.Scanner(new java.io.File("myfile.txt"))

    while (in2.hasNext()) {
      val key = in2.next()
      words += (key -> (words.getOrElse(key, 0) + 1))
    }

    val wds = words.filter((wc: (String, Int)) => wc._2 > 4)
    println(wds)
    println("words.size: " + wds.size)
  }
}
