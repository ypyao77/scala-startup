package fn.scala.fast.ch14

object TrafficLight {
  abstract class TrafficLightColor
  case object Red extends TrafficLightColor
  case object Yellow extends TrafficLightColor
  case object Green extends TrafficLightColor

  def toMatch(c: TrafficLightColor) = c match {
    case Red => "stop"
    case Yellow => "hurry up"
    case Green => "go"
  }

  def func1() = {
    println("toMatch(Red): " + toMatch(Red))
    println("toMatch(Yellow): " + toMatch(Yellow))
    println("toMatch(Green): " + toMatch(Green))
  }

  def main(args: Array[String]): Unit = {
    func1()
  }
}