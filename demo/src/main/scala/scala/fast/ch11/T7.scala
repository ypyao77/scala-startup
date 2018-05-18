package scala.fast.ch11

object T7 {

  class BigSequence(var value: Long = 0) {
    private val bits = new Array[Byte](64)
    set(value)

    def reset(): Unit = {
      value = 0L
    }

    def set(_value: Long): Unit = {
      value = _value
      var v = _value

      for (i <- 0 until bits.length) {
        bits(i) = (v & 0x01).toByte
        v = v >> 1
      }
    }

    override def toString: String = {
      if (value == 0L) {
        "0(0)"
      } else {
        val s = bits.reverse.mkString("")
        val content = s.drop(s.indexOf('1'))

        value + "(" + content + ")"
      }
    }
  }

  object BigSequence {
    def apply(value: Long = 0): BigSequence = new BigSequence(value)
  }

  def main(args: Array[String]): Unit = {
    val bs = BigSequence(1)
    println("bs: " + bs)

    bs.set(4L)
    println("bs: " + bs)

    bs.set(0L)
    println("bs: " + bs)

    bs.set(87583146029L)
    println("bs: " + bs)
  }
}
