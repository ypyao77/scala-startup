package fn.scala.fast.ch18

object D1804 {
  class Book {
    import scala.collection.mutable._
    type INDEX = HashMap[String, (Int, Int)]

    val m: INDEX = HashMap("red" -> (201, 202), "azure" -> (101, 102))

    override def toString: String = "Book(" + m + ")"
  }

  def main(args: Array[String]): Unit = {
    println(new Book)
  }
}
