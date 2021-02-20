package fn.scala.fast.ch03

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}

object T10 {
  def imageFlavor() = {
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    flavors.getNativesForFlavor(DataFlavor.imageFlavor).toArray.mkString("<", ", ", ">")
  }
  def main(args: Array[String]): Unit = {
    println("imageFlavor(): " + imageFlavor)
  }
}
