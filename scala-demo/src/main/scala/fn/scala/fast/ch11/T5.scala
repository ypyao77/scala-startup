package fn.scala.fast.ch11

object T5 {

  class Table {
    private var s: String = ""

    def |(str: String): Table = {
      val t = Table()
      t.s = this.s + "\n\t\t<td>" + "\n\t\t\t" + str + "\n\t\t</td>"
      t
    }

    def ||(str: String): Table = {
      val t = Table()
      t.s = this.s + "\n\t</tr>\n\t<tr>\n\t\t<td>" + "\n\t\t\t" + str + "\n\t\t</td>"
      t
    }

    override def toString = "<table>\n\t<tr>" + this.s + "\n\t</tr>\n</table>\n"
  }

  object Table {
    def apply() = new Table()
  }

  def main(args: Array[String]): Unit = {
    val table = Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
    println("table: \n" + table)
  }
}
