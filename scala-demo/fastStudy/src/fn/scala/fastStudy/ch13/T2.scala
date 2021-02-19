package scala.fast.ch13

import scala.collection.mutable

object T2 {

  import collection.mutable.{HashMap, Map, ListBuffer}

  def indexes1(str: String): Map[Char, List[Int]] = {
    println("indexes1")

    val map = HashMap[Char, List[Int]]()

    for (i <- (0 until str.length)) {
      map(str(i)) = map.getOrElse(str(i), List[Int]()) ::: List(i)
    }
    map
  }

  def indexes2(str: String): Map[Char, ListBuffer[Int]] = {
    println("indexes1")

    val map = HashMap[Char, ListBuffer[Int]]()

    for (i <- (0 until str.length)) {
      map.getOrElseUpdate(str(i), ListBuffer[Int]()) += i
    }
    map
  }

  def indexes3(str: String): Map[Char, List[Int]] = {
    println("indexes1")

    val map = HashMap[Char, List[Int]]()

    for (i <- (0 until str.length)) {
      map(str(i)) = map.getOrElse(str(i), List[Int]()) ::: List(i)
    }
    map
  }


  def main(args: Array[String]): Unit = {
    println(indexes1("Mississippi").mkString(", "))
    println(indexes2("Mississippi").mkString(", "))
    println(indexes3("Mississippi").mkString(", "))
  }
}
