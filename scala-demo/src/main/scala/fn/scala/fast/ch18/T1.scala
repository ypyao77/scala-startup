package fn.scala.fast.ch18

object T1 {
  class Bug {
    var (location, direct) = (0L, 1)

    def move(offset: Long): this.type = { location += offset * direct; this }

    def turn(): this.type = { direct *= -1; this }

    def show(): this.type = { println(toString); this }

    override def toString: String = "Bug(" + location + ", " + direct + ")"
  }

  def main(args: Array[String]): Unit = {
    val b = new Bug
    b.move(4).show().move(6).show().turn().move(5).show()
  }
}
