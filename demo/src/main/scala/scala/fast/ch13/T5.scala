package scala.fast.ch13

object T5 {

  import collection.mutable
  import collection.mutable.HashSet

  trait MyMkString {
    this: mutable.Iterable[String] =>
    def myMkString = if (this != Nil) this.reduceLeft(_ + _)
  }

  def main(args: Array[String]): Unit = {
    var a = new HashSet[String] with MyMkString
    a += "aaa"
    a += "bbb"
    a += "ccc"

    println(a.myMkString)
  }
}
