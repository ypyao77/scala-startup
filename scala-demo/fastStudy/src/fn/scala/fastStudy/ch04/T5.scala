package scala.fast.ch04

object T5 {
  def main(args: Array[String]): Unit = {
    import scala.collection.JavaConversions.mapAsScalaMap

    val words: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]
    val in4 = new java.util.Scanner(new java.io.File("myfile.txt"))

    while (in4.hasNext()) {
      val key = in4.next()
      words += (key -> (words.getOrElse(key, 0) + 1))
    }

    words.retain((k, v) => v > 4)
    println(words)
    println("words.size: " + words.size)
  }
}
