package scala.program.ch24

class EMail(_user: String, _domain: String) {
  val user = _user
  val domain = _domain

  override def toString: String = user + '@' + domain
}
object EMail {
  def apply(user: String, domain: String): EMail = new EMail(user, domain)
  def unapply(email: EMail): Option[(String, String)] = Some(email.user, email.domain)

  def doMatch(x: Any) = {
    x match {
      case EMail(_, "store.co") => println("yes, it is in store.co")
      case EMail(_, "buy.it") => println("yes, it is in buy.it")
      case EMail("mike", _) => println("yes, it is mike's email")
      case EMail(_, _) => println("yes, it is an email")
      case _ => println("no!")
    }
  }
  def main(args: Array[String]): Unit = {
    doMatch(EMail("mike", "store.co"))
    doMatch(EMail("mike", "buy.it"))
    doMatch(EMail("john", "store.co"))
    doMatch(EMail("mike", "see.cc"))
    doMatch(EMail("boy", "see.cc"))
    doMatch(None)
  }
}
