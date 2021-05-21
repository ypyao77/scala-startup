package fn.scala.fast.ch14

object D1401 {
  def meet1(ch: Char) = ch match {
    case '+' => println("[" + ch + "] => +")
    case '-' => println("[" + ch + "] => -")
    case _ => println("[" + ch + "] => 0")
  }

  def main(args: Array[String]): Unit = {
    meet1('c')
    meet1('+')
    meet1('-')
    meet1(' ')
  }
}
