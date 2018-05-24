package scala.fast.ch14

object T4 {
  abstract class Item

  case class Multiple(n: Int, item: Item) extends Item
  case class Article(desc: String, price: Double) extends Item
  case class Bundle(desc: String, discount: Double, items: Item*) extends Item

  def price(item: Item): Double = item match {
    case Article(_, p) => p
    case Bundle(_, discount, items @ _*) => items.map(price _).sum - discount
    case Multiple(num, item) => num * price(item)
    case _ => 0.0
  }

  def main(args: Array[String]): Unit = {
    val article1 = Article("article", 3.0)
    val article2 = Article("article", 4.0)
    val bundle = Bundle("bundle", 0.9, article1, article2)
    val multiple1 = Multiple(3, article1)
    val multiple2 = Multiple(3, bundle)
    val multiple3 = Multiple(3, multiple2)

    println("price(article1) => " + price(article1))
    println("price(article2) => " + price(article2))
    println("price(bundle) => " + price(bundle))
    println("price(multiple1) => " + price(multiple1))
    println("price(multiple2) => " + price(multiple2))
    println("price(multiple3) => " + price(multiple3))
  }
}
