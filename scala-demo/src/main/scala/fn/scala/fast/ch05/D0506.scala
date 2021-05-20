package fn.scala.fast.ch05

import scala.beans.BeanProperty

object D0506 {
  class Person {
    private var name = "default"
    private var age = 0

    def this(name: String) {
      this()
      this.name = name
    }

    def this(name: String, age: Int) {
      this(name)
      this.age = age
    }

    override def toString(): String = {
      "Person(" + this.name + ", " + this.age +")"
    }
  }

  def main(args: Array[String]): Unit = {
    val person1 = new Person
    val person2 = new Person("person2")
    val person3 = new Person("person3", 15)

    println("person1: " + person1)
    println("person2: " + person2)
    println("person3: " + person3)
  }
}
