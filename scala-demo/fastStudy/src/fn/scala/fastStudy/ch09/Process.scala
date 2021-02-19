package scala.fast.ch09

object Process {
  def main(args: Array[String]): Unit = {
    import sys.process._
    "ipconfig" !
  }
}
