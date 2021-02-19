package scala.fast.ch10

object T7 {

  trait Fly {
    def fly() {
      println("flying")
    }

    def flywithnowing()
  }

  trait Walk {
    def walk() {
      println("walk")
    }
  }

  class Bird {
    var name: String = _
  }

  class BlueBird extends Bird with Fly with Walk {
    def flywithnowing() = {
      println("BlueBird flywithnowing")
    }
  }

  def main(args: Array[String]): Unit = {
    val b = new BlueBird()

    b.walk()
    b.flywithnowing()
    b.fly()
  }
}
