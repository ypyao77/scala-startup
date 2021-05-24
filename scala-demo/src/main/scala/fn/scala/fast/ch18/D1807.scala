package fn.scala.fast.ch18

object D1807 {
  def add(a: Int, b: Int) = a + b
  def mul(a: Int, b: Int) = a * b

  def main(args: Array[String]): Unit = {
    print(mul(add(2, 3), 4))
  }
}
