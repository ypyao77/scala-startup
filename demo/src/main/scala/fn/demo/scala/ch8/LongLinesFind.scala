package fn.demo.scala.ch8

object LongLinesFind {
  def main(args: Array[String]): Unit = {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      LongLines.processFile(arg, width)
  }
}
