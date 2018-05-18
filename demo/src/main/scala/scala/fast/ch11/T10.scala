package scala.fast.ch11

object T10 {
  class RichFile(val path: String = "") {}

  object RichFile {
    def apply(path: String): RichFile = new RichFile(path)

    def unapplySeq(richFile: RichFile): Option[Seq[String]] = {
      if (richFile.path == "") {
        None
      } else {
        Some(richFile.path.split("/").filter(_ != ""))
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val richFile = RichFile("/home/cay/yuan/readme.txt")
    val RichFile(r @ _*) = richFile

    println("richFile.r = " + r)
  }
}
