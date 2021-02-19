package scala.program.ch15

class Currency(val value: Double, val unit: String) {
  override def toString: String = "(" + value + ", " + unit + ")"
}

object Currency {
  def apply(value: Double, unit: String): Currency = new Currency(value, unit)

  def unapply(currency: Currency): Option[(Double, String)] = {
    if (currency == null) {
      None
    } else {
      Some(currency.value, currency.unit)
    }
  }

  def route(currency: Currency) = currency match {
    case Currency(amount, "USD") => println("$" + amount)
    case _ => println("No match.")
  }

  def main(args: Array[String]): Unit = {
    val c1 = Currency(30.2, "EUR")
    val c2 = Currency(30.2, "USD")

    println("c1 = " + c1)
    println("route(c1) = " + route(c1))
    println("c2 = " + c2)
    println("route(c2) = " + route(c2))
  }
}

