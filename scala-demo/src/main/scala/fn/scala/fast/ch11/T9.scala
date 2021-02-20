package fn.scala.fast.ch11

object T9 {

  class RichFile(val path: String = "") {}

  object RichFile {
    def apply(path: String): RichFile = new RichFile(path)

    def unapply(richFile: RichFile): Option[(String, String, String)] = {
      if (richFile.path == "") {
        None
      } else {
        val reg = "([/\\w+]+)/(\\w+)\\.(\\w+)".r
        val reg(r1, r2, r3) = richFile.path
        Some((r1, r2, r3))
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val richFile = RichFile("/home/cay/yuan/readme.txt")
    val RichFile(r1, r2, r3) = richFile

    println("richFile.r1 = " + r1)
    println("richFile.r2 = " + r2)
    println("richFile.r3 = " + r3)
  }
}
