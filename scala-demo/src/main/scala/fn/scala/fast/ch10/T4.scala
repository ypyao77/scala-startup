package fn.scala.fast.ch10

object T4 {
  trait Logger {
    def log(str: String, key: Int = 3): String
  }

  class CryptoLogger extends Logger {
    def log(str: String, key: Int): String = {
      for (i <- str) yield if (key >= 0) (97 + ((i - 97 + key) % 26)).toChar else (97 + ((i - 97 + 26 + key) % 26)).toChar
    }
  }

  def main(args: Array[String]): Unit = {
    val plain = "student and teacher"

    println("明文为：" + plain)
    println("加密后为：" + new CryptoLogger().log(plain))
    println("加密后为：" + new CryptoLogger().log(plain, -3))
  }
}
