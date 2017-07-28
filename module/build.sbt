name := "fizzed-play-module-twitter"

version := "2.3.0"

startYear := Some(2013)

description := "PlayFramework 2.x module to fetch, cache, and display tweets from Twitter"

organization := "com.fizzed"

organizationName := "Fizzed, Inc."

organizationHomepage := Some(new URL("http://fizzed.com"))

lazy val `module` = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.10.4", "2.11.2", "2.11.6")

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.twitter4j" % "twitter4j-core" % "4.0.6",
  "com.twitter" % "twitter-text" % "1.14.7"
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

// required for publishing artifact to maven central via sonatype
// credentials now in ~/.sbt/0.13/sonatype.sbt

publishMavenStyle := true

publishTo <<= version { v: String =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("http://fizzed.com/oss/play-module-twitter"))

scmInfo := Some(ScmInfo(url("https://github.com/fizzed/play-module-twitter"), "https://github.com/fizzed/play-module-twitter.git"))

pomExtra := (
  <developers>
    <developer>
      <name>Fizzed Inc</name>
      <email>oss@fizzed.com</email>
    </developer>
  </developers>
  )