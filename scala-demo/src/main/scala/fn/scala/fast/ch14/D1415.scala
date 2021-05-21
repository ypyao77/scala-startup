package fn.scala.fast.ch14

import fn.scala.fast.ch14.D1409.Currency

object D1415 {
  sealed abstract class Color
  case object Red extends Color
  case object Yellow extends Color
  case object Green extends Color

  def meet(color: Color) = color match {
    case Red => println("red => stop")
    case Yellow => println("yellow => hurry up")
    case Green => println("green => go")
  }

  def main(args: Array[String]): Unit = {
    meet(Red)
    meet(Yellow)
    meet(Green)
  }
}
