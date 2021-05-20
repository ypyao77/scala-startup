package fn.scala.fast.ch08

object D0803 {
  class Person(val name: String) {
    override def toString: String = "Person(name=" + name + ")"
  }

  class Employee(override val name: String, val salary: Int) extends Person(name) {
    override def toString: String = "Employee(name=" + name + ", salary=" + salary + ")"
  }

  def main(args: Array[String]): Unit = {
    val p = new Person("alpha")
    val e = new Employee("beta", 50)

    println(p)
    println(e)

    println(p.isInstanceOf[Person] + ", " + p.isInstanceOf[Employee])
    println(e.isInstanceOf[Person] + ", " + e.isInstanceOf[Employee])

    println((p.getClass == classOf[Person]) + ", " + (p.getClass == classOf[Employee]))
    println((e.getClass == classOf[Person]) + ", " + (e.getClass == classOf[Employee]))

    p match {
      case _: Person => println("is instance of Person")
      case _: Employee => println("is instance of Employee")
      case _ => println("is instance of OTHER")
    }

    e match {
      case _: Person => println("is instance of Person")
      case _: Employee => println("is instance of Employee")
      case _ => println("is instance of OTHER")
    }

    null match {
      case _: Person => println("is instance of Person")
      case _: Employee => println("is instance of Employee")
      case _ => println("is instance of OTHER")
    }
  }
}

