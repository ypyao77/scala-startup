package scala.program.ch18

class Time(private var _hour: Int, private var _minute: Int) {
  override def toString = _hour + ":" + _minute

  def hour: Int = this._hour

  def hour_=(h: Int) = {
    require(0 <= h && h < 24)
    _hour = h
  }

  def minute: Int = this._minute

  def minute_=(m: Int) = {
    require(0 <= m && m < 24)
    _minute = m
  }
}

object Time {
  def apply(hour: Int, minute: Int): Time = new Time(hour, minute)

  def main(args: Array[String]): Unit = {
    val time = Time(3, 15)
    println("time: " + time)

    val time2 = Time(10, 36)
    println("time2: " + time2)
    time2.hour = 12
    time2.minute = 21
    println("time2: " + time2)

    time2.hour = 33
    println("time2: " + time2)
  }
}
