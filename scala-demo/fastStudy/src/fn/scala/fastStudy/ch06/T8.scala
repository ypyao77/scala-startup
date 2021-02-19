package scala.fast.ch06

object T8 {

  object RGB extends Enumeration {
    val BLACK = Value(0x000000, "Black")
    val RED = Value(0xFF0000, "Red")
    val GREEN = Value(0x00FF00, "Green")
    val BLUE = Value(0x0000FF, "Blue")
    val CYAN = Value(0x00FFFF, "Cyan")
    val YELLOW = Value(0xFFFF00, "Yellow")
    val MAGENTA = Value(0xFF00FF, "Magenta")
    val WHITE = Value(0xFFFFFF, "White")
  }

  def main(args: Array[String]): Unit = {
    println("RGB: " + RGB)
    println("RGB.values: " + RGB.values)
  }
}
