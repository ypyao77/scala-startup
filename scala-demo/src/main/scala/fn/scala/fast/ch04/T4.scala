package fn.scala.fast.ch04

object T4 {
  def main(args: Array[String]): Unit = {
    var words = scala.collection.immutable.SortedMap[String,Int]()
    val in3 = new java.util.Scanner(new java.io.File("myfile.txt"))

    while(in3.hasNext()){
      val key = in3.next()
      words += (key->(words.getOrElse(key,0) + 1))
    }

    val wds = words.filter((wc: (String, Int)) => wc._2 > 4)
    println(wds)
    println("words.size: " + wds.size)
  }
}
