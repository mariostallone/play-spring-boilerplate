import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play-spring-boilerplate"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "org.springframework" % "spring-context" % springVersion,
    "org.springframework" % "spring-orm" % springVersion,
    "org.springframework" % "spring-jdbc" % springVersion,
    "org.springframework" % "spring-tx" % springVersion,
    "org.springframework" % "spring-test" % springVersion % "test",
    "org.hibernate" % "hibernate-core" % "3.6.0.Final"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
