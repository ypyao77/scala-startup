package fn.scala.fast.ch09

import com.alibaba.fastjson._
import scala.collection.JavaConverters._

object Json {
  def main(args: Array[String]): Unit = {
    val str =
      """{
        |    "name": "宝塔",
        |    "test": [
        |        "python",
        |        "java"
        |    ]
        |}
        |""".stripMargin

    JSON.parseObject(str).entrySet.forEach(entry => println("key= " + entry.getKey + ", value= " + entry.getValue))
  }
}
