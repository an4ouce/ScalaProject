import Dependencies._
import ScalaOptionsUtil._

scalaVersion := "2.12.10"
lazy val root = (project in file("."))
  .settings(
    version := "0.1",
    name := "TotalAreaCalculator",
    scalacOptions ++= Seq("-encoding", "UTF-8"),
    libraryDependencies ++= Dependencies.testLibs,
    mainClass := Some("Main.scala")
  )
