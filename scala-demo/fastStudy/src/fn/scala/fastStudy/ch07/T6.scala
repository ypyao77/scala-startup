package scala.fast.ch07

object T6 {
  def main(args: Array[String]): Unit = {
    import java.util.{HashMap => JavaHashMap}
    import scala.collection.JavaConversions.mapAsScalaMap
    import scala.collection.mutable.{Map => ScalaHashMap}

    val map = new JavaHashMap[String, Int]();
    map.put("test1", 1);
    map.put("test2", 2);
    map.put("test3", 3);

    val m2: ScalaHashMap[String, Int] = map;
    println(m2.mkString(", "))
    m2.put("test4", 4)
    println(m2.mkString(", "))
  }
}
