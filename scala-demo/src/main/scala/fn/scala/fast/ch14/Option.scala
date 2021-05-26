package fn.scala.fast.ch14

object Option {
  def f1() = {
    val myMap: Map[String, String] = Map("key1" -> "value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")

    println(value1) // Some("value1")
    println(value2) // None
  }

  def f2() = {
    val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")

    println("sites.get( \"runoob\" ) : " + sites.get("runoob")) // Some(www.runoob.com)
    println("sites.get( \"baidu\" ) : " + sites.get("baidu")) //  None
  }

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }

  def f3() = {
    val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")

    println("show(sites.get( \"runoob\")) : " + show(sites.get("runoob")))
    println("show(sites.get( \"baidu\")) : " + show(sites.get("baidu")))
  }

  def f4() = {
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    println("a.getOrElse(0): " + a.getOrElse(0))
    println("b.getOrElse(10): " + b.getOrElse(10))
  }

  def f5() = {
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    println("a.isEmpty: " + a.isEmpty)
    println("b.isEmpty: " + b.isEmpty)
  }

  def main(args: Array[String]): Unit = {
    f1()
    f2()
    f3()
    f4()
    f5()
  }
}
