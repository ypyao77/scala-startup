package fn.scala.fast.ch05

object T3 {
  class Time(val hours: Short, val minutes: Short) {
    def before(other: Time): Boolean = {
      hours < other.hours || (hours == other.hours && minutes < other.minutes)
    }

    override def toString() = {
      hours + ":" + minutes
    }
  }

  def main(args: Array[String]): Unit = {
    val time1 = new Time(12, 21)
    val time2 = new Time(12, 21)
    val time3 = new Time(11, 21)
    val time4 = new Time(14, 21)

    println("time1 -> " + time1)
    println("time2 -> " + time2)
    println("time3 -> " + time3)
    println("time4 -> " + time4)

    println("time1.before(time2): " + time1.before(time2))
    println("time1.before(time3): " + time1.before(time3))
    println("time1.before(time4): " + time1.before(time4))
  }
}
