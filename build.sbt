import AssemblyKeys._

assemblySettings

name := "sparksql-perf"

version := "0.1"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core"      % "1.0.0",
  "org.apache.spark" %% "spark-catalyst"  % "1.0.0",
  "org.apache.spark" %% "spark-hive"      % "1.0.0",
  "org.apache.spark" %% "spark-sql"       % "1.0.0",
  "org.scalatest"    %% "scalatest"       % "1.9.1"             % "test"
)
