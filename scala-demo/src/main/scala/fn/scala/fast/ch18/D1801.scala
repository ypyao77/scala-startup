package fn.scala.fast.ch18

import fn.scala.program.ch23.Person

object D1801 {
  class Person(_name: String, _age: Int) {
    var (name, age) = (_name, _age)

    def setName(_name: String): this.type = { this.name = _name; this }
    def setAge(_age: Int): this.type = { this.age = _age; this }

    override def toString: String = "Person(" + name + ", " + age + ")"
  }

  class Student(_name: String, _age: Int, _score: Int) extends Person(_name, _age) {
    var score = _score

    def setScore(_score: Int): this.type = { this.score = _score; this }
    override def toString: String = "Student(" + name + ", " + age + ", " + score + ")"
  }

  def main(args: Array[String]): Unit = {
    val p = new Person("Ada", 10)
    println(p)

    p.setName("Beta").setAge(21)
    println(p)

    val s = new Student("Ada", 10, 1)
    println(s)

    s.setName("Carl").setAge(25).setScore(61)
    println(s)
  }
}
