name := "demo"

version := "0.1"

scalaVersion := "2.12.6"

javacOptions ++= Seq("-encoding", "UTF-8")

resolvers += "Maven Fn" at "http://maven.fn.com/nexus/content/groups/public"
resolvers += "Maven Central" at "https://mvnrepository.com"

/*
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.12",
  "com.typesafe.akka" %% "akka-remote" % "2.5.12",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.12" % Test
)
*/

// https://mvnrepository.com/artifact/org.scala-lang.modules/scala-parser-combinators
// libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0"

// https://mvnrepository.com/artifact/org.scala-lang.modules/scala-swing
// libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "2.0.3"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-swing" % "2.0.3",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0"
)
