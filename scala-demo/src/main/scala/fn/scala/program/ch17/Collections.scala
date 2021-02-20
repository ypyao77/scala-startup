package fn.scala.program.ch17

object Collections {
  def func1 = {
    println("\nin func1()")
    val text = "See Spot run. Run, Spot, Run. Spot run"
    val wordsArray = text.split("[ ~,.]+")
    println("wordsArray: " + wordsArray)

    var words = Set.empty[String]
    for (word <- wordsArray) words += word.toLowerCase

    println("words: " + words)
  }

  def func2 = {
    println("\nin func2()")
  }

  def func3 = {
    println("\nin func3()")
  }

  def func4 = {
    println("\nin func4()")
  }

  def func5 = {
    println("\nin func5()")
  }

  def main(args: Array[String]): Unit = {
    func1
    func2
    func3
    func4
    func5
  }
}
