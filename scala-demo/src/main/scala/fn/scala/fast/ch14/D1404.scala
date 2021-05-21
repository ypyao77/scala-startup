package fn.scala.fast.ch14

object D1404 {
  def meet1(any: Any) = any match {
    case _: Byte => println("[" + any + "] is Byte")
    case _: Short => println("[" + any + "] is Short")
    case _: Int => println("[" + any + "] is Int")
    case _: Long => println("[" + any + "] is Long")
    case _: Float => println("[" + any + "] is Float")
    case _: Double => println("[" + any + "] is Double")
    case _: Char => println("[" + any + "] is Char")
    case _: String => println("[" + any + "] is String")
    case _ => println("[" + any + "] is unknown")
  }

  def main(args: Array[String]): Unit = {
    val s: Short = 1
    val b: Byte = 1
    meet1(s)
    meet1(b)

    meet1(1)
    meet1(1L)
    meet1(1.1)
    meet1(1.12345f)
    meet1(1.12345678901234567890123456789)
    meet1('c')
    meet1("it's a string")
    meet1(None)
  }
}
