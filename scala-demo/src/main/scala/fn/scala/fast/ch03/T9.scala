package fn.scala.fast.ch03

object T9 {
  def timezone() = {
    val prefix = "America/"
    val timeZone = java.util.TimeZone.getAvailableIDs()

    timeZone.filter(_.startsWith(prefix)).map(_.drop(prefix.length)).sorted.mkString("<", ", ", ">")
  }
  def main(args: Array[String]): Unit = {
    println("timezone(): " + timezone())
  }
}
