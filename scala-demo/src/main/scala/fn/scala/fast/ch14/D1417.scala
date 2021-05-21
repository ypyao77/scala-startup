package fn.scala.fast.ch14

object D1417 {
  def main(args: Array[String]): Unit = {
    val f: PartialFunction[Char, Int] = { case '+' => 1; case '-' => -1 }

    val a = "-3+4".collect { case '+' => 1; case '-' => -1 }
    println(a)

    println(f('-'))
    println(f.isDefinedAt('0'))
    println(f.isDefinedAt('+'))
    println(f('0'))
  }
}
