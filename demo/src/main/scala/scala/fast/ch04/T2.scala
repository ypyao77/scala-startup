package scala.fast.ch04

object T2 {
  def main(args: Array[String]): Unit = {
    val words = new scala.collection.mutable.HashMap[String,Int]
    val in = new java.util.Scanner(new java.io.File("myfile.txt"))

    while (in.hasNext()){
      val key = in.next()
      words(key) = words.getOrElse(key,0) + 1
    }

    words.retain((k, v) => v > 4)
    println(words)
    println("words.size: " + words.size)
  }
}
