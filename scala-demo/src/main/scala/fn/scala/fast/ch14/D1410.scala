package fn.scala.fast.ch14

import fn.scala.fast.ch14.D1409.Currency

object D1410 {
  class Currency(value: Long, unit: String) {
    override def toString: String = "Currency(" + value + ", " + unit + ")"
  }

  def main(args: Array[String]): Unit = {
    val amt1 = Currency(12, "USD")
    val amt2 = amt1.copy(value = 22)
    val amt3 = amt1.copy(unit = "CNY")

    println(amt1)
    println(amt2)
    println(amt3)
  }
}
