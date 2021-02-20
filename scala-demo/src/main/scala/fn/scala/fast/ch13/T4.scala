package fn.scala.fast.ch13

object T4 {

  import collection.mutable.{HashMap}

  def namesMap1(names: List[String], map: HashMap[String, Int]): List[Int] = {
    names.flatMap(map.get(_))
  }

  def namesMap2(names: List[String], map: HashMap[String, Int]): List[Int] = {
    names.map(map.getOrElse(_, 0))
  }

  def main(args: Array[String]): Unit = {
    val a = List("Tom", "Fred", "Harry", "Mike")
    val m = HashMap("Tom" -> 3, "Dick" -> 4, "Mike" -> 4, "Harry" -> 5)

    println(namesMap1(a, m).mkString("List(", ", ", ")"))
    println(namesMap2(a, m).mkString("List(", ", ", ")"))
  }
}
