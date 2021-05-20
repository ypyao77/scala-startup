package fn.scala.fast.ch11

object D1108 {
  class Mail(_user: String, _domain: String) {
    val user = _user
    val domain = _domain

    override def toString = user + "@" + domain
  }

  object Mail {
    def apply(user: String, domain: String) = {
      new Mail(user, domain)
    }

    def unapply(mail: Mail): Option[(String, String)] = {
      if (!mail.user.isEmpty && !mail.domain.isEmpty) {
        Some(mail.user, mail.domain)
      } else {
        None
      }
    }
  }

  def meet(mail: Mail) = {
    mail match {
      case Mail("jay", domain) => println("e-mail jay@" + domain)
      case Mail(user, "z.cn") => println("e-mail " + user + "@z.cn")
      case _ => println("unknown e-mail: " + mail.user + "@" + mail.domain)
    }
  }

  def main(args: Array[String]): Unit = {
    meet(Mail("jay", "t.com"))
    meet(Mail("mary", "t.com"))
    meet(Mail("mary", "z.cn"))
    meet(Mail("mary", "p.cn"))
    meet(Mail("", ""))
  }
}

