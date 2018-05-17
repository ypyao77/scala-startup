package scala.fast.ch10

object T8 {

  import java.io.{InputStream, FileInputStream}

  trait Buffering {
    this: InputStream =>
    val BUF_SIZE: Int = 5

    private val buf = new Array[Byte](BUF_SIZE)
    private var bufsize: Int = 0
    private var pos: Int = 0

    override def read(): Int = {
      if (pos >= bufsize) {
        bufsize = this.read(buf, 0, BUF_SIZE)
        if (bufsize > 0) -1
        pos = 0
      }

      pos += 1
      buf(pos - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    val f = new FileInputStream("myfile.txt") with Buffering

    for (i <- 1 to 10) println(f.read())
  }
}
