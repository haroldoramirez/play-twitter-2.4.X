name := "play-twitter"

version := "1.0"

lazy val module = (project in file("module")).enablePlugins(PlayJava)

lazy val `play-twitter` = (project in file(".")).enablePlugins(PlayJava).aggregate(module).dependsOn(module)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq( javaJdbc ,  cache , javaWs )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"  