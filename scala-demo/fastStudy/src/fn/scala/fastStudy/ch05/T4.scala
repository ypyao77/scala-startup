package scala.fast.ch05

object T4 {
  class Time(val hours: Int, val minutes: Int) {
    def before(other: Time): Boolean = {
      hours * 60 + minutes < other.hours * 60 + other.minutes
    }

    override def toString(): String = {
      (hours * 60 + minutes).toString
    }
  }
  def main(args: Array[String]): Unit = {

  }
}
