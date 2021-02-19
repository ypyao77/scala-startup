package scala.fast.ch06

object T2 {

  abstract class UnitConversion {
    def inchesToCentimeters(inches: Double): Double = {
      0.0
    }

    def gallonsToLiters(gallons: Double): Double = {
      0.0
    }

    def milesToKilometers(miles: Double): Double = {
      0.0
    }
  }

  object InchesToCentimeters extends UnitConversion {
    override def inchesToCentimeters(inches: Double) = {
      0.0
    }
  }

  object GallonsToLiters extends UnitConversion {
    override def gallonsToLiters(gallons: Double) = {
      0.0
    }
  }

  object MilesToKilometers extends UnitConversion {
    override def milesToKilometers(miles: Double) = {
      0.0
    }
  }

  def main(args: Array[String]): Unit = {

  }
}
