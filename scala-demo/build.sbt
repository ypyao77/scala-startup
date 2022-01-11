name := "scala-demo"
organization := "fn.scala"
version := "0.1"
scalaVersion := "2.12.13"
val AkkaVersion = "2.6.14"

resolvers += "aliyun public" at "https://maven.aliyun.com/repository/public"

//libraryDependencies ++= Seq(
//  "org.scala-lang.modules" %% "scala-swing" % "2.1.1",
//  "com.alibaba" % "fastjson" % "1.2.60"
//)

libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "2.1.1"
libraryDependencies += "com.alibaba" % "fastjson" % "1.2.60"
libraryDependencies += "com.typesafe.akka" % "akka-actor_2.12" % AkkaVersion
libraryDependencies += "com.typesafe.akka" % "akka-actor-typed_2.12" % AkkaVersion
libraryDependencies += "com.typesafe.akka" % "akka-actor-testkit-typed_2.12" % AkkaVersion % Test
libraryDependencies += "com.typesafe.akka" % "akka-stream_2.12" % AkkaVersion
libraryDependencies += "com.typesafe.akka" % "akka-remote_2.12" % AkkaVersion

