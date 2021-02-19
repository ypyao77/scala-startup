package scala.fast.ch07

import scala.fast.ch07.people.Person

package object people {
  val defaultName = "John Q. Public"
}

package people {
  class Person {
    var name = defaultName
    println("Person.name: " + this.name)
  }
}

object PackageObject {
  def main(args: Array[String]): Unit = {
    new Person
    new people.Person
  }
}
