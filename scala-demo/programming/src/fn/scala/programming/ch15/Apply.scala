package scala.program.ch15

class Apply(_foo: String) {
  def foo = _foo

  override def toString: String = "Apply::" + _foo
}

object Apply {
  def apply(foo: String) = new Apply(foo)

  def apply(foo: String, bar: String) = new Apply(foo + "," + bar)

  def unapply(app: Apply): Option[String] = {
    if (app == null)
      None
    else
      Some(app.foo)
  }

  def main(args: Array[String]): Unit = {
    val a = Apply("abc")
    println("a = " + a)
    println("a.foo = " + a.foo)
    println("a == Apply(\"abc\") = " + (a == Apply("abc")))
    println("unapply(a) = " + unapply(a))

    val b = Apply("abc", "bbb")
    println("b = " + b)

  }
}
