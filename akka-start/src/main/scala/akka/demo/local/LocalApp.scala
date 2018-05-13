package akka.demo.local

import akka.actor._
import org.json.JSONObject

object Start extends Serializable

object Stop extends Serializable

trait Message {
  val id: String
}

case class Shutdown(waitSecs: Int) extends Serializable

case class Heartbeat(id: String, magic: Int) extends Message with Serializable

case class Header(id: String, len: Int, encrypted: Boolean) extends Message with Serializable

case class Packet(id: String, seq: Long, content: String) extends Message with Serializable

class LocalActor extends Actor with ActorLogging {
  def receive = {
    case Start => log.info("start")
    case Stop => log.info("stop")
    case Heartbeat(id, magic) => log.info("Heartbeat" + (id, magic))
    case Header(id, len, encrypted) => log.info("Header" + (id, len, encrypted))
    case Packet(id, seq, content) => log.info("Packet" + (id, seq, content))
    case _ =>
  }
}

object LocalClient extends App {
  // Local actor
  val system = ActorSystem("local-system") // 创建一个ActorSystem对象，用来管理Actor实例
  println(system)
  val localActorRef = system.actorOf(Props(new LocalActor()), name = "local-actor") // 通过ActorSystem对象，获取到一个Actor的引用
  println(localActorRef)

  localActorRef ! Start // 向LocalActor发送Start消息
  localActorRef ! Heartbeat("3099100", 0xabcd) // 向LocalActor发送Heartbeat消息

  // 创建一个JSON类型的消息Packet
  val content = new JSONObject()
  content.put("name", "Stone")
  content.put("empid", 51082001)
  content.put("score", 89.36581)
  localActorRef ! Packet("3000001", System.currentTimeMillis(), content.toString) // 向LocalActor发送Packet消息

  localActorRef ! Stop // 停止LocalActor实例
  system.terminate() // 终止ActorSystem对象，释放资源
}
