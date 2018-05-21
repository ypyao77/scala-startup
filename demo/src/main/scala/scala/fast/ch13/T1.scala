package scala.fast.ch13

import scala.collection.mutable

object T1 {

  import collection.mutable.{Map, HashMap, TreeMap, SortedSet}

  def indexes1(str: String): Map[Char, SortedSet[Int]] = {
    println("indexes1")

    var map = HashMap[Char, SortedSet[Int]]()
    var i = 0

    str.foreach {
      c =>
        map.get(c) match {
          case Some(result) => map(c) = result + i
          case None => map += (c -> SortedSet {
            i
          })
        }
        i += 1
    }
    map
  }

  def indexes2(str: String): Map[Char, SortedSet[Int]] = {
    println("indexes2")

    val map = HashMap[Char, SortedSet[Int]]()

    for (i <- (0 until str.length)) {
      val result = map.getOrElse(str(i), mutable.SortedSet[Int]())
      map(str(i)) = result + i
    }
    map
  }

  def indexes3(str: String): Map[Char, SortedSet[Int]] = {
    println("indexes3")

    val map = HashMap[Char, SortedSet[Int]]()

    for (i <- (0 until str.length)) {
      map.getOrElseUpdate(str(i), mutable.SortedSet[Int]()) += i
    }
    map
  }

  def main(args: Array[String]): Unit = {
    println(indexes1("Mississippi").mkString(", "))
    println(indexes2("Mississippi").mkString(", "))
    println(indexes3("Mississippi").mkString(", "))
  }
}
