import sbt._
import Keys._
import play.PlayScala

object ApplicationBuild extends Build {

  val appName         = "temp"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    "mysql" % "mysql-connector-java" % "5.1.21",
    "com.typesafe.play" %% "anorm" % "2.3.3",
    "com.typesafe.play" %% "play-jdbc" % "2.3.3",
    "com.lucidchart" %% "relate" % "1.5-SNAPSHOT"
  )


  val main = Project(appName, file(".")).enablePlugins(PlayScala).settings(
    libraryDependencies ++= appDependencies,
    scalaVersion := "2.11.2",
    resolvers ++= List(   
      Resolver.file("local ivy repository", file(System.getenv("HOME") + "/.ivy2/local/"))(Resolver.ivyStylePatterns),
      "Staging Sonatype repository" at "https://oss.sonatype.org/content/groups/staging/" ),
    version := appVersion
  )

}
