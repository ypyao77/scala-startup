package scala.fast.ch11

object T6 {

  import collection.mutable.ArrayBuffer

  class ASCIIArt(str: String) {
    val arr: ArrayBuffer[ArrayBuffer[String]] = new ArrayBuffer[ArrayBuffer[String]]()

    if (str != null && !str.trim.eq("")) {
      str.split("[\r\n]+").foreach {
        line =>
          val s = new ArrayBuffer[String]()
          s += line
          arr += s
      }
    }

    def this() {
      this("")
    }

    def +(other: ASCIIArt): ASCIIArt = {
      val art = new ASCIIArt()
      val length = if (this.arr.length >= other.arr.length) this.arr.length else other.arr.length

      for (i <- 0 until length) {
        val s = new ArrayBuffer[String]()
        val thisArr: ArrayBuffer[String] = if (i < this.arr.length) this.arr(i) else new ArrayBuffer[String]()
        val otherArr: ArrayBuffer[String] = if (i < other.arr.length) other.arr(i) else new ArrayBuffer[String]()
        thisArr.foreach(s += _)
        otherArr.foreach(s += _)
        art.arr += s
      }
      art
    }

    def *(other: ASCIIArt): ASCIIArt = {
      val art = new ASCIIArt()
      this.arr.foreach(art.arr += _)
      other.arr.foreach(art.arr += _)
      art
    }

    override def toString() = {
      var ss: String = ""
      arr.foreach {
        ss += _.mkString(" ") + "\n"
      }
      ss
    }
  }

  def main(args: Array[String]): Unit = {
    val a = new ASCIIArt(
      """ /\_/\
        |( ' ' )
        |(  -  )
        | | | |
        |(__|__)
        |""".stripMargin)
    val b = new ASCIIArt(
      """    -----
        |  / Hello \
        | <  Scala |
        |  \ Coder /
        |    -----
        |""".stripMargin)

    println("a")
    println(a)
    println("b")
    println(b)
    println("a + b * b")
    println(a + b * b)
    println("(a + b) * b")
    println((a + b) * b)
    println("a * b")
    println(a * b)
  }
}
