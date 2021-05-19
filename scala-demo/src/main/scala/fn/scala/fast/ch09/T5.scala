package fn.scala.fast.ch09

import java.io.PrintWriter
import scala.math.pow

object T5 {
  def main(args: Array[String]): Unit = {
    val out = new PrintWriter("T5.txt")

    for (i <- 0 to 20) {
      out.println(pow(2, i) + ", " + 1 / pow(2, i))
    }

    out.close()
  }
}
