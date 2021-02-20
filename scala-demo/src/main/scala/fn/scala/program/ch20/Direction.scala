package fn.scala.program.ch20

object Direction extends Enumeration {
  val East = Value("East")
  val South = Value("South")
  val West = Value("West")
  val North = Value("North")

  def main(args: Array[String]): Unit = {
    println("Direction: " + Direction)
    println("North: " + North)
    println("East: " + East)
    println("South: " + South)
    println("West: " + West)

    println("Direction(0): " + Direction(0))
    println("Direction.East.id: " + Direction.East.id)
  }
}
