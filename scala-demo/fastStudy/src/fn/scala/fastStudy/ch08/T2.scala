package scala.fast.ch08

object T2 {

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance

    def deposit(amount: Double) = {
      balance += amount;
      balance
    }

    def withdraw(amount: Double) = {
      balance -= amount;
      balance
    }

    override def toString = balance.toString
  }

  class SavingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    private var num: Int = _

    def earnMonthlyInterest() = {
      num = 3
      super.deposit(1)
    }

    override def deposit(amount: Double): Double = {
      num -= 1
      if (num < 0) super.deposit(amount - 1)
      else super.deposit(amount)
    }

    override def withdraw(amount: Double): Double = {
      num -= 1
      if (num < 0) super.withdraw(amount + 1)
      else super.withdraw(amount)
    }
  }

  def main(args: Array[String]): Unit = {

  }
}
