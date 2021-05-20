package fn.scala.fast.ch11

object D1110 {
  class Name(n: String) {
    val name = n
    override def toString = "Name(" + name + ")"
  }

  object Name {
    def apply(name: String) = new Name(name)

    def unapplySeq(name: Name): Option[Seq[String]] =
      if (name.name.trim == "") None else Some(name.name.trim.split("\\s+"))
  }

  def meet(author: Name): Unit = author match {
      case Name(first) => println("Name1: " + first)
      case Name(first, last) => println("Name2: " + first + ", " + last)
      case Name(first, middle, last) => println("Name3: " + first + ", " + middle + ", " + last)
      case _ => println("Name Unknown")
  }

  def main(args: Array[String]): Unit = {
    meet(Name("aaa"))
    meet(Name("aaa bbb"))
    meet(Name("aaa bbb ccc"))
    meet(Name("aaa bbb ccc ddd"))
  }
}

