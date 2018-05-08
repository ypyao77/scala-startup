package fn.demo.scala.ch7

object Grep extends App {
  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines.toList

  def grep(pattern: String) = {
    val filesHere = (new java.io.File(".")).listFiles
    println("filesHere = " + filesHere)

    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      if line.trim.matches(pattern)
    } println(file + ": " + line.trim)
  }

  grep(".*gcd.*")
}
