package scala.program.ch15

object PAF {
  def main(args: Array[String]): Unit = {
    def add(x: Int, y: Int, z: Int) = x + y + z

    def addX = add(1, _: Int, _: Int) // x is known
    def addXY = add(1, 10, _: Int) // x, y is known
    def addZ = add(_: Int, _: Int, 10) // x, y is known

    println("addX(3, 4): " + addX(3, 4))
    println("addXY(4): " + addXY(4))
    println("addZ(3, 4): " + addZ(3, 4))
  }
}
