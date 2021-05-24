package fn.scala.fast.ch18

object T2 {
  object Title

  object Author

  object Chapter

  class Document {
    protected var (title, author) = ("", "")
    protected var useNextArgAs: Any = null

    def setTitle(_title: String): this.type = {
      title = _title;
      this
    }

    def setAuthor(_author: String): this.type = {
      author = _author;
      this
    }

    def set(obj: Title.type): this.type = {
      useNextArgAs = obj;
      this
    }

    def set(obj: Author.type): this.type = {
      useNextArgAs = obj;
      this
    }

    def to(arg: String): this.type = {
      if (useNextArgAs == Title)
        title = arg
      else if (useNextArgAs == Author)
        author = arg

      this
    }

    def show(): this.type = {
      println(toString);
      this
    }

    override def toString: String = "Document: title(" + title + "), author(" + author + ")"
  }

  class Book extends Document {
    protected var chapter = ""

    def addChapter(_chapter: String): this.type = {
      chapter = _chapter;
      this
    }

    def set(obj: Chapter.type): this.type = {
      useNextArgAs = obj;
      this
    }

    override def to(arg: String): this.type = {
      if (useNextArgAs == Title)
        title = arg
      else if (useNextArgAs == Author)
        author = arg
      else if (useNextArgAs == Chapter)
        chapter = arg

      this
    }

    override def toString: String = "Book: title(" + title + "), author(" + author + "), chapter(" + chapter + ")"
  }

  def main(args: Array[String]): Unit = {
    val book1 = new Book
    val book2 = new Book

    book1.setTitle("Scala for the Impatient").addChapter("Chapter 1").setAuthor("Ada").show()

    book2 set Title to "Scala for the Impatient" set Chapter to "Chapter 2" set Author to "Stall"
    book2 show
  }
}
