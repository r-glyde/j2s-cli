import BuildInfo._

val dependencies = Seq(
  "com.hubspot.jinjava"        % "jinjava"          % "2.5.0",
  "com.github.scopt"           %% "scopt"           % "4.0.0-RC2",
  "com.typesafe.scala-logging" %% "scala-logging"   % "3.5.0",
  "org.slf4j"                  % "log4j-over-slf4j" % "1.7.25",
  "ch.qos.logback"             % "logback-classic"  % "1.2.3" % Runtime
)

val root = (project in file("."))
  .enablePlugins(BuildInfoPlugin, JavaAppPackaging)
  .settings(
    name := "j2s-cli",
    version := "0.1.0",
    scalaVersion := "2.12.8",
    libraryDependencies ++= dependencies,
    fork in run := true,
    buildInfoSettings,
    assemblyJarName in assembly := s"${name.value}-v${version.value}.jar"
  )
