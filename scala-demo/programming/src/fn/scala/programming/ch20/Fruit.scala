package scala.program.ch20

abstract class Fruit {
  val v: String

  def m: String

  override def toString = "(v, m) => (" + v + ", " + m + ")"
}

class Apple extends Fruit {
  val v: String = "v"
  val m: String = "m"
}

class GoodApple extends Fruit {
  val v: String = "v"
  var m: String = "m"
}

class BadApple extends Fruit {
  val v: String = "v"

  /*def v: String = "v"*/
  def m: String = "m"
}

object Fruit {
  def main(args: Array[String]): Unit = {
    val apple = new Apple
    val badapple = new BadApple
    val goodapple = new GoodApple

    println("apple = " + apple)
    println("badapple = " + badapple)
    println("goodapple = " + goodapple)

    val fruit = new Fruit {
      override val v: String = "vv"
      override def m: String = "mm"
    }
    println("fruit = " + fruit)

    val fruit2 = new {
      val v: String = "vv"
      val m: String = "mm"
    } with Fruit

    println("fruit2 = " + fruit2)
    println("type(fruit2) = " + fruit2.getClass.getName)
  }
}
