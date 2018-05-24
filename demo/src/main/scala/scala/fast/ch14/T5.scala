package scala.fast.ch14

object T5 {
  def leafSum1(list: List[Any]): Int = {
    list.map {
      item => item match {
        case value: Int => value
        case subList: List[Any] => leafSum1(subList)
      }
    }.sum
  }

  def leafSum2(list: List[Any]): Int = list match {
    case List(value: Int, _*) => value + leafSum2(list.tail)
    case List(subList: List[Any], _*) => leafSum2(subList) + leafSum2(list.tail)
    case _ => 0
  }

  def leafSum3(list: List[Any]): Int = list match {
    case (value: Int) :: tail => value + leafSum3(tail)
    case (subList: List[Any]) :: tail => leafSum2(subList) + leafSum3(tail)
    case _ => 0
  }

  def main(args: Array[String]): Unit = {
    val list1: List[Any] = List(List(3, 8), 2, List(5, List(4, List(3))))
    val list2 = List[Any]()

    println("leafSum1(list1): " + leafSum1(list1))
    println("leafSum2(list1): " + leafSum2(list1))
    println("leafSum3(list1): " + leafSum3(list1))

    println("leafSum1(list2): " + leafSum1(list2))
    println("leafSum2(list2): " + leafSum2(list2))
    println("leafSum3(list2): " + leafSum3(list2))
  }
}
