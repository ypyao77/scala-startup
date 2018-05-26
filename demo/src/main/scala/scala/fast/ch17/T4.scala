package scala.fast.ch17

import scala.fast.ch17.T4.YoungStudent

object T4 {
  class Person
  class Student extends Person
  class YoungStudent extends Student

  class Pair[T](val first: T, val second: T) {
    def replaceFirst(newFirst: T) = new Pair(newFirst, second)

    override def toString = "Pair(" + first.toString + ", " + second.toString + ")"
  }

  def main(args: Array[String]): Unit = {
    val person = new Person
    val student = new Student
    val youngStudent = new YoungStudent

    val pair = new Pair(person, person)

    println(pair.replaceFirst(student))
    println(pair.replaceFirst(youngStudent))

    /*val pair2 = new Pair(student, student)
    println(pair2.replaceFirst(person)) // error
    println(pair2.replaceFirst(youngStudent))*/
  }
}
