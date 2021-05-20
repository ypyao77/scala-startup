package fn.scala.fast.ch06

object D0604 {
  class Account(val id: Long, val _balance: Long) {
    private val balance = _balance

    override def toString() = {
      "Account(" + this.id + ", " + this.balance + ")"
    }
  }

  object Account {
    private var lastNumber = 0L

    private def newUniqueNumber() = {
      lastNumber += 1L; lastNumber
    }

    def apply(balance: Long) = {
      new Account(newUniqueNumber(), balance)
    }

    override def toString: String = super.toString
  }

  def main(args: Array[String]): Unit = {
    val acct1 = Account(101)
    val acct2 = Account(201)
    val acct3 = Account(301)

    println(acct1)
    println(acct2)
    println(acct3)
  }
}
