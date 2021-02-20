package fn.scala.fast.ch08

object T1 {

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance

    def deposit(amount: Double) = {
      balance += amount; balance
    }

    def withdraw(amount: Double) = {
      balance -= amount; balance
    }

    override def toString = balance.toString
  }

  class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    override def deposit(amount: Double) = {
      super.deposit(amount - 1.0)
    }

    override def withdraw(amount: Double) = {
      super.withdraw(amount + 1.0)
    }
  }

  def main(args: Array[String]): Unit = {
    val acc = new CheckingAccount(10.0)

    println("acc = " + acc)
    println("acc.deposit(15.0) = " + acc.deposit(15.0))
    println("acc.withdraw(6.0) = " + acc.withdraw(6.0))
  }
}
