package scala.fast.ch07

object T9 {
  val SECRET = "secret"

  def main(args: Array[String]): Unit = {
    val username = System.getProperty("user.name")
    println("username: " + username)
    print("password: ")

    if (Console.readLine == SECRET)
      println("welcome, " + username)
    else
      println("wrong password")
  }
}
