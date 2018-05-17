package scala.fast.ch11

object Unapply {
  class Currency(private val v: Double, private val u: String) {
    override def toString = "Currency(" + value + ", " + unit + ")"

    val value = v
    val unit = u
  }
  object Currency {
    def apply(v: Double, u: String) = new Currency(v, u)

    def unapply(currency: Currency): Option[(Double, String)] = if (currency == null) None else Some((currency.value, currency.unit))
  }

  def printMoney(currency: Currency) = currency match {
    case Currency(value, "USD") => println("$" + value)
    case Currency(value, "RMB") => println("￥" + value)
    case Currency(value, _) => println("*" + value)
    case _ => println("()")
  }

  def main(args: Array[String]): Unit = {
    printMoney(Currency(23.15, "USD"))
    printMoney(Currency(23.15, "RMB"))
    printMoney(Currency(23.15, "HKD"))
    printMoney(null)
  }
}
