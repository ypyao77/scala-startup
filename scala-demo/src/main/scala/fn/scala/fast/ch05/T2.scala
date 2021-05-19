package fn.scala.fast.ch05

object T2 {
  class BankAccount(var balance: Long = 0L) {
    def deposit(count: Long): Unit = {
      balance = balance + count
      println("deposit(" + count + ") -> " + balance)
    }

    def withdraw(count: Long): Unit = {
      if (balance >= count) {
        balance = balance - count
        println("withdraw(" + count + ") -> " + balance)
      } else {
        println("low balance error: balance(" + balance + "), count(" + count + ")")
      }
    }

    def current(): Unit = {
      println("current(): " + balance)
    }
  }

  def main(args: Array[String]): Unit = {
    val bankAccount = new BankAccount

    bankAccount.deposit(100)
    bankAccount.withdraw(44)
    bankAccount.current()
  }
}
