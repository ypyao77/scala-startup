package fn.scala.fast.ch11

object D1110 {
  class Name(name: String) {
    override def toString = "Name(" + name + ")"
  }

  object Name {
    def apply(name: String) = new Name(name)
    def unapplySeq(name: String): Option[Seq[String]] =
      if (name.trim == "") None else Some(name.trim.split("\\s+"))
  }

  def dump(author: Any): Unit = {
    author match {
      case Name(first) => println("Name1: " + first)
      case Name(first, last) => println("Name2: " + first + ", " + last)
      case Name(first, middle, last) => println("Name3: " + first + ", " + middle + ", " + last)
      case _ => println("Name Unknown")
    }
  }

  def main(args: Array[String]): Unit = {
    dump(Name("aaa"))
    dump(Name("aaa bbb"))
    dump(Name("aaa bbb ccc"))
    dump(Name("aaa bbb ccc ddd"))

    val author = Name("aaa bbb")
    author match {
      case Name(first) => println("Name1: " + first)
      case Name(first, last) => println("Name2: " + first + ", " + last)
      case Name(first, middle, last) => println("Name3: " + first + ", " + middle + ", " + last)
      case _ => println("Name Unknown")
    }
  }
}

