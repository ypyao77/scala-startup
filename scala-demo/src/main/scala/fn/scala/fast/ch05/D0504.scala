package fn.scala.fast.ch05

import scala.beans.BeanProperty
object D0504 {
  class Person1 {
    @BeanProperty var name = ""
  }

  class Person2(@BeanProperty var name: String) {
  }

  def main(args: Array[String]): Unit = {
    val person1 = new Person1
    person1.name = "abc"
    println("person1: " + person1.name)
    println("person1: " + person1.getName)

    val person2 = new Person2("xxx")
    println("person2: " + person2.name)
    println("person2: " + person2.getName)
  }
}
