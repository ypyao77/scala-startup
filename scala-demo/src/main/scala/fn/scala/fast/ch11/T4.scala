package fn.scala.fast.ch11

object T4 {

  class Money(val dollar: Int, val cent: Int) {
    val UNIT = 100

    def +(that: Money): Money = {
      val sumCent = this.totalCent + that.totalCent
      val (a, b) = (sumCent / UNIT, sumCent % UNIT)
      Money(a, b)
    }

    def -(that: Money): Money = {
      val diffCent = this.totalCent - that.totalCent
      val (a, b) = (diffCent / UNIT, diffCent % UNIT)
      Money(a, b)
    }

    private val totalCent = this.dollar * 100 + this.cent

    def ==(that: Money): Boolean = totalCent == that.totalCent

    def <(that: Money): Boolean = totalCent < that.totalCent

    def >(that: Money): Boolean = totalCent > that.totalCent

    override val toString = "dollar = " + dollar + " cent = " + cent
  }

  object Money {
    def apply(dollar: Int, cent: Int): Money = new Money(dollar, cent)
  }

  def main(args: Array[String]): Unit = {
    val m1 = Money(1, 200)
    val m2 = Money(2, 2)

    println(m1 + m2)
    println(m1 - m2)
    println(m1 == m2)
    println(m1 < m2)

    println(Money(1, 75) + Money(0, 50))
    println(Money(1, 75) + Money(0, 50) == Money(2, 25))
  }
}
