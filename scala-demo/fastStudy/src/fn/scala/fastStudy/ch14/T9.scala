package scala.fast.ch14

object T9 {
  def sum1(list: List[Option[Int]]): Int = {
    list.map(_.getOrElse(0)).sum
  }

  def sum2(list: List[Option[Int]]): Int = {
    list.map {
      _ match {
        case value: Option[Int] => value.getOrElse(0)
      }
    }.sum
  }

  def main(args: Array[String]): Unit = {
    val list = List(Option(1), Option(2), None, Option(3))

    println("sum1(list) = " + sum1(list))
    println("sum2(list) = " + sum2(list))
  }
}
