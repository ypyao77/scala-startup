package fn.scala.fast.ch12

object D1205 {
  def main(args: Array[String]): Unit = {
    (1 to 10).map("*" * _ + "-").foreach(println _)
  }
}
