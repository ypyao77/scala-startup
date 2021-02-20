package fn.scala.fast.ch04

object T7 {
  def pr1() = {
    println("pr1()")

    import scala.collection.JavaConversions.propertiesAsScalaMap
    val properties: scala.collection.Map[String, String] = System.getProperties.take(10)
    val keyMaxLength = (for (key <- properties.keySet) yield key.length).max

    properties.foreach {
      case (a, b) => println(a + " " * (keyMaxLength - a.length) + " | " + b)
    }

    println()
  }

  def pr2() = {
    println("pr2()")

    import scala.collection.JavaConversions.propertiesAsScalaMap
    val properties: scala.collection.Map[String, String] = System.getProperties.take(10)
    val keyMaxLength = (for (key <- properties.keySet) yield key.length).max

    val o = for ((a, b) <- properties) yield {
      (a + " " * (keyMaxLength - a.length) + " | " + b).toString
    }

    o.foreach(println)
    println()
  }

  def main(args: Array[String]): Unit = {
    pr1()
    pr2()
  }
}
