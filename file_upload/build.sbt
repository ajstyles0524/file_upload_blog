name := "file_upload"

version := "0.1"

scalaVersion := "2.12.8"
val akkaVersion = "2.5.20"
val akkaHttpVersion = "10.1.7"

libraryDependencies ++= Seq(
  // akka streams
  "com.typesafe.akka" %% "akka-stream" % "2.5.20",
  // akka http
  "com.typesafe.akka" %% "akka-http" % "10.1.7"
)