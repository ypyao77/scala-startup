package fn.scala.fast.ch14

object D1409 {
  abstract class Amount

  case class Dollar(value: Long) extends Amount

  case class Currency(value: Long, unit: String) extends Amount

  case object NO extends Amount

  def meet1(amt: Amount) = amt match {
    case Dollar(v) => println("$" + v)
    case Currency(v, u) => println("Oh noes, I got " + u + " " + v)
    case NO => println("nothing")
    case _ => println("null")
  }

  def main(args: Array[String]): Unit = {
    meet1(new Dollar(5))
    meet1(new Currency(8, "USD"))
    meet1(new Currency(8, "GBP"))
    meet1(new Currency(8, "CNY"))
    meet1(NO)
  }
}
