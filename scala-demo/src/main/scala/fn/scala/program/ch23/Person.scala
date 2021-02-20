package fn.scala.program.ch23

object Person {

  object Sex extends Enumeration {
    type Sex = Value
    val Male, Female = Value
  }

  case class PersonX(name: String, sex: Sex.Value, children: PersonX*) {
    override def toString: String = "Person('" + name + "', '" + sex + "'): \n" + children.mkString("\t", "\t", "")
  }

  def main(args: Array[String]): Unit = {
    println("Male: " + Sex.Male)
    val lara = PersonX("Lara", Sex.Female)
    val bob = PersonX("Bob", Sex.Male)
    val julie = PersonX("Julie", Sex.Female, lara, bob)
    val charlie = PersonX("Charlie", Sex.Male, lara, bob)
    val persons = List(lara, bob, julie, charlie)

    println("lara = " + lara)
    println("bob = " + bob)
    println("julie = " + julie)
    println("charlie = " + charlie)
    println("persons = " + persons)

    val relat1 = for (p <- persons; if p.sex == Sex.Female; c <- p.children) yield (p.name, c.name)
    val relat2 = persons.filter(p => p.sex == Sex.Female).flatMap(p => (p.children.map(c => (p.name, c.name))))
    val relat3 = for (p <- persons; c <- p.children) yield (p.name, c.name)
    println("relat1 = " + relat1)
    println("relat2 = " + relat2)
    println("relat3 = " + relat3)

    val s1 = for (p <- persons; n = p.name; if (n.startsWith("C"))) yield n
    println("s1 = " + s1)

    val s2 = for {
      p <- persons
      n = p.name
      if (n.startsWith("C") || n.startsWith("B"))
    } yield n
    println("s2 = " + s2)

    val r1 = for (x <- (1 to 10); y <- (1 to 11); if (x + 1 == y)) yield (x, y)
    println("r1 = " + r1)
  }
}
