package fn.scala.fast.ch08

object D87 {
  class Person(val name: String) {
    override def toString: String = "Person(name=" + name + ")"
  }

  def meet(p: Person {def greeting: String}): Unit = {
    println("it says: " + p.greeting)
  }

  def main(args: Array[String]): Unit = {
    val p = new Person("alpha")
    val alien = new Person("fred") {
      def greeting = "Hello, " + name + "."
    }

    println(p)
    println(alien)
    println(alien.greeting)

    meet(alien)
  }
}

