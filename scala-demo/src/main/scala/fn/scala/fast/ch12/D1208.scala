package fn.scala.fast.ch12

object D1208 {
  def main(args: Array[String]): Unit = {
    def mul(x: Int, y: Int) = x * y
    def mul2(x: Int) = (y: Int) => x * y
    def mul3(x: Int)(y: Int) = x * y

    println(mul(6, 7))
    println(mul2(6)(7))
    println(mul3(6)(7))

    val f1 = mul3(6)(_)
    println(f1(7))

    // ERROR
    // val f2 = mul3(_)(7)
    // println(f2(6))
  }
}
