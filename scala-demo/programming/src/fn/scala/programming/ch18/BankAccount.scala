package scala.program.ch18

class BankAccount(var bal: Int) {
  def balance = bal

  def deposit(amount: Int) = {
    require(amount > 0)
    bal += amount
  }

  def withdraw(amount: Int): Boolean = {
    if (amount > bal) false
    else {
      bal -= amount
      true
    }
  }

  override def toString() = {
    "BankAccount(" + this.bal + ")"
  }
}

object BankAccount {
  def apply(bal: Int): BankAccount = new BankAccount(bal)

  def main(args: Array[String]): Unit = {
    val ba = BankAccount(10)
    println("ba: " + ba)
    ba.deposit(31)
    println("ba: " + ba)
    ba.withdraw(25)
    println("ba: " + ba)
    ba.withdraw(25)
    println("ba: " + ba)
  }
}
