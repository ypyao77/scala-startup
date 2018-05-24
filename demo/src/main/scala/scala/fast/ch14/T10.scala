package scala.fast.ch14

object T10 {
  import scala.math.{sqrt}

  def f(x : Double) = if ( x > 0) Some(sqrt(x)) else None
  def g(x : Double) = if ( x != 1) Some( 1 / ( x - 1)) else None

  def compose1(a: Double => Option[Double], b: Double => Option[Double])(x: Double) : Option[Double] = {
    if (a(x) == None) None
    else if (b(x) == None) None
    else g(x)
  }

  def compose2(a: Double => Option[Double], b: Double => Option[Double]): Double => Option[Double] = {
    (x: Double) =>
      if (a(x) == None) None
      else if (b(x) == None) None
      else g(x)
  }

  def main(args: Array[String]): Unit = {
    val h1 = compose1(f, g) _
    val h2 = compose2(f, g)

    println("h1(2) = " + h1(2))
    println("h1(1) = " + h1(1))
    println("h1(0) = " + h1(0))

    println("h2(2) = " + h2(2))
    println("h2(1) = " + h2(1))
    println("h2(0) = " + h2(0))
  }
}
