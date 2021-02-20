package fn.scala.program.ch30

object MyFuture {

  import scala.concurrent.Future
  import scala.concurrent.ExecutionContext.Implicits.global

  def f1(): Unit = {
    println("f1()")
    val fut = Future {
      Thread.sleep(2000); 21 + 21
    }

    for (_ <- (1 to 4)) {
      println("fut.isCompleted = " + fut.isCompleted + "  fut.value = " + fut.value)
      Thread.sleep(1000)
    }
  }

  def f2(): Unit = {
    println("f2()")
    val fut = Future {
      Thread.sleep(2000); 21 / 0
    }

    for (_ <- (1 to 4)) {
      println("fut.isCompleted = " + fut.isCompleted + "  fut.value = " + fut.value)
      Thread.sleep(1000)
    }
  }

  def f3(): Unit = {
    println("f3()")
    val fut = Future {
      Thread.sleep(2000); 21 + 21
    }
    val result = fut.map(x => x + 1)

    for (_ <- (1 to 4)) {
      println("fut.isCompleted = " + fut.isCompleted + "  fut.value = " + fut.value + "  result.value = " + result.value)
      Thread.sleep(1000)
    }
  }

  def f4(): Unit = {
    println("f4()")
    val fut1 = Future {
      Thread.sleep(2000); 21 + 21
    }
    val fut2 = Future {
      Thread.sleep(2000); 23 + 23
    }

    val result = for {
      x <- fut1
      y <- fut2
    } yield x + y

    for (_ <- (1 to 4)) {
      println("fut1.isCompleted = " + fut1.isCompleted + "  fut1.value = " + fut1.value + "  fut2.value = " + fut2.value + "  result.value = " + result.value)
      Thread.sleep(1000)
    }
  }

  def f5(): Unit = {
    println("f5()")

    val result = for {
      x <- Future { Thread.sleep(2000); 21 + 21 }
      y <- Future { Thread.sleep(2000); 23 + 23 }
    } yield x + y

    for (_ <- (1 to 7)) {
      println("result.isCompleted = " + result.isCompleted + "  result.value = " + result.value)
      Thread.sleep(1000)
    }
  }

  def main(args: Array[String]): Unit = {
    f1()
    f2()
    f3()
    f4()
    f5()
  }
}
