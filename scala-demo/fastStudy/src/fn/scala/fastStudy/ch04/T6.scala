package scala.fast.ch04

object T6 {
  def main(args: Array[String]): Unit = {
    val calendar = new scala.collection.mutable.LinkedHashMap[String, Int]

    calendar += ("Monday" -> java.util.Calendar.MONDAY)
    calendar += ("Tuesday" -> java.util.Calendar.TUESDAY)
    calendar += ("Wednesday" -> java.util.Calendar.WEDNESDAY)
    calendar += ("Thursday" -> java.util.Calendar.THURSDAY)
    calendar += ("Friday" -> java.util.Calendar.FRIDAY)
    calendar += ("Saturday" -> java.util.Calendar.SATURDAY)
    calendar += ("Sunday" -> java.util.Calendar.SUNDAY)

    println(java.util.Calendar.MONDAY)
    println(calendar)
  }
}
