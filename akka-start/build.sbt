name := "akka-start"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.12",
  "com.typesafe.akka" %% "akka-remote" % "2.5.12",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.12" % Test
)

// https://mvnrepository.com/artifact/org.json/json
libraryDependencies += "org.json" % "json" % "20171018"
