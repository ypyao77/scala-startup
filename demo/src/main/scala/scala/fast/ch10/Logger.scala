package scala.fast.ch10

import java.text.SimpleDateFormat

object Logger {
  trait ConsoleLogger {
    def log(msg: String): Unit = {
      println(msg)
    }
  }

  trait ShortenLogger extends ConsoleLogger {
    val MAX_LENGTH = 30

    override def log(msg: String): Unit = {
      if (msg.length < MAX_LENGTH) {
        super.log(msg)
      } else {
        super.log(msg.substring(0, MAX_LENGTH - 3) + "...")
      }
    }
  }

  trait TimestampLogger extends ConsoleLogger {
    val dateFormat = new SimpleDateFormat("(yyyy-MM-dd H:mm:ss)")
    override def log(msg: String): Unit = {
      super.log(dateFormat.format(new java.util.Date()) + " " + msg)
    }
  }


  class Logger1 extends TimestampLogger with ShortenLogger
  class Logger2 extends ShortenLogger with TimestampLogger

  def main(args: Array[String]): Unit = {
    val msg = "Hello, my friend. This is my first Scala log."
    val log1 = new Logger1
    val log2 = new Logger2

    log1.log(msg)
    log2.log(msg)
  }
}
