package fn.scala.fast.ch05

object T3 {
  class Time(val hours:Int,val minutes:Int ){
    def before(other:Time):Boolean={
      hours < other.hours || (hours == other.hours && minutes < other.minutes )
    }
    override def toString():String = {
      hours + " : " + minutes
    }
  }

  def main(args: Array[String]): Unit = {

  }
}
