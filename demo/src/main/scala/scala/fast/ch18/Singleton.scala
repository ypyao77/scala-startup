package scala.fast.ch18

object Singleton {

  class Document {
    var title = ""
    var author = ""

    def setTitle(title: String) : this.type = { this.title = title; this}
    def setAuthor(author: String) : this.type= { this.author = author; this }

    override def toString = "Document(" + title + ", " + author + ")"
  }

  class Book extends Document {
    var chapter = ""

    def setChapter(chapter: String): this.type = { this.chapter = chapter; this }

    override def toString = "Book(" + title + ", " + author + ", " + chapter + ")"
  }

  def main(args: Array[String]): Unit = {
    val doc = new Document
    val book = new Book

    doc.setTitle("topic").setAuthor("Ada")
    book.setTitle("topic").setAuthor("Ada").setChapter("chapter")

    println(doc)
    println(book)
  }
}
