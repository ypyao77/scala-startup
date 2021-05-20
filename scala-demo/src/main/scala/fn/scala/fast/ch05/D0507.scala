package fn.scala.fast.ch05

object D0507 {
  class Person(val name: String, val age: Int) {
    override def toString(): String = {
      "Person(" + name + ", " + age +")"
    }

    def description = name + " is " + age + " years old"
  }

  def main(args: Array[String]): Unit = {
    val person1 = new Person("person1", 21)
    println("person1: " + person1)
    println("person1.name: " + person1.name + "  age: " + person1.age)
    println("person1.description: " + person1.description)
  }
}
