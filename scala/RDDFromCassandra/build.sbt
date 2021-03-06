name := "RDDFromCassandra"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core"              % "1.2.1" % "provided",
  "org.apache.spark" %% "spark-streaming"         % "1.2.1" % "provided",
  "org.apache.spark" %% "spark-streaming-twitter" % "1.2.1")

libraryDependencies += "org.twitter4j" % "twitter4j-stream" % "3.0.6"

libraryDependencies += "org.twitter4j" % "twitter4j-core" % "3.0.6"

libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "1.2.1"