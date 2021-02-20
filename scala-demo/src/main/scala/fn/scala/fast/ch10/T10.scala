package fn.scala.fast.ch10

object T10 {

  class IterableInputStream extends java.io.InputStream with Iterable[Byte] {

    class InputStreamIterator(outer: IterableInputStream) extends Iterator[Byte] {
      def hasNext: Boolean = outer.available() > 0

      def next: Byte = outer.read().toByte
    }

    override def iterator: Iterator[Byte] = new InputStreamIterator(this)

    override def read(): Int = 0
  }

  def main(args: Array[String]): Unit = {

  }
}
