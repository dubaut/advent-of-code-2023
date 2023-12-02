scalaVersion := "3.3.1"

// Define the project and organization details
organization := "buildingdragons.dev"
name := "advent-of-code-2023"
version := "1.0.0"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)

mainClass := Some("dev.buildingdragons.aoc23.Main")
