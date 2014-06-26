import play.Project._

name := "tweetmap"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
	jdbc,
  	anorm,
 	"mysql" % "mysql-connector-java" % "5.1.21",
    "com.lucidchart" %% "relate" % "1.3"
)

playScalaSettings

resolvers += Resolver.file("local ivy repository", file(System.getenv("HOME") + "/.ivy2/local/"))(Resolver.ivyStylePatterns)