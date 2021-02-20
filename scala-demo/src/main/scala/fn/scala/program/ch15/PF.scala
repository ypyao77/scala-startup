package fn.scala.program.ch15

object PF {
  def main(args: Array[String]): Unit = {
    // case 1
    println("\n[case 1]")

    val pf: PartialFunction[Int, String] = {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case _ => "Other"
    }
    println("pf(1): " + pf(1))
    println("pf(2): " + pf(2))
    println("pf(3): " + pf(3))
    println("pf(4): " + pf(4))
    println("pf.isDefinedAt(1): " + pf.isDefinedAt(1))
    println("pf.isDefinedAt(100): " + pf.isDefinedAt(100))
    // error: println("pf.isDefinedAt(\"1\"): " + pf.isDefinedAt("1"))

    // case 2
    println("\n[case 2]")

    val pf2: PartialFunction[Int, String] = {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
    }
    println("pf2(1): " + pf2(1))
    // error: println("pf2(4): " + pf2(4))
    println("pf2.isDefinedAt(1): " + pf2.isDefinedAt(1))
    println("pf2.isDefinedAt(100): " + pf2.isDefinedAt(100))

    // case 3
    println("\n[case 3]")
    val ppf1: PartialFunction[Int, String] = { case 1 => "One" }
    val ppf2: PartialFunction[Int, String] = { case 2 => "Two" }
    val ppf3: PartialFunction[Int, String] = { case 3 => "Three" }
    val ppfo: PartialFunction[Int, String] = { case _ => "Other" }
    val ppf = ppf1 orElse ppf2 orElse ppf3 orElse ppfo

    println("ppf(1): " + ppf(1))
    println("ppf(2): " + ppf(2))
    println("ppf(3): " + ppf(3))
    println("ppf(4): " + ppf(4))
  }
}
