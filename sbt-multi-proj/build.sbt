ThisBuild / scalaVersion := "2.12.13"
ThisBuild / organization := "fn.scala"

lazy val root = (project in file("."))
  .aggregate(sub1, sub2, sub3)
  .dependsOn(sub1, sub2, sub3)
  .settings(
  name := "sbt-multi-proj"
)

lazy val sub1 = (project in file("sub1")).settings(
  name := "sub1",
)
lazy val sub2 = (project in file("sub2")).settings(
  name := "sub2",
)
lazy val sub3 = (project in file("sub3")).settings(
  name := "sub3",
)
