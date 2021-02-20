package fn.scala.fast.ch06

object T6 {

  object Card extends Enumeration {
    val BLACK = "Black"
    val RED = "Red"

    val M = Value("♣")
    val T = Value("♠")
    val H = Value("♥")
    val F = Value("♦")

    def color(c: Card.Value) = c match {
      case Card.M => BLACK
      case Card.T => BLACK
      case _ => RED
    }
  }

  def main(args: Array[String]): Unit = {
    println("Card.M: " + Card.M)
    println("Card.T: " + Card.T)
    println("Card.H: " + Card.H)
    println("Card.F: " + Card.F)

    println("Card.color(Card.M): " + Card.color(Card.M))
    println("Card.color(Card.T): " + Card.color(Card.T))
    println("Card.color(Card.H): " + Card.color(Card.H))
    println("Card.color(Card.F): " + Card.color(Card.F))
  }
}
