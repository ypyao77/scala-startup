package fn.scala.fast.ch08

object D86 {
  class Person(val name: String) {
    override def toString: String = "Person(name=" + name + ")"
  }

  class SecretPerson(val codename: String) extends Person(codename) {
    override val name = "secret"
    override def toString: String = "SecretPerson(name=" + name + ")"
  }

  def main(args: Array[String]): Unit = {
    val p = new Person("alpha")
    val s = new SecretPerson("beta")

    println(p)
    println(s)
  }
}

