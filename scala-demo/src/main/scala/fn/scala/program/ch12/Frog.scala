package fn.scala.program.ch12

class Frog extends Philosophical {
  override def toString = "green"
}

object Frog {
  def main(args: Array[String]): Unit = {
    val frog = new Frog
    println("frog:" + frog)
    frog.philosophize()

    val phil: Philosophical = frog
    println("phil:" + phil)
    phil.philosophize()
  }
}
