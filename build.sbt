name := "j2s-cli"
version := "0.1"
scalaVersion := "2.12.8"

assemblyJarName in assembly := s"${name.value}-v${version.value}.jar"

libraryDependencies ++= Seq(
  "com.hubspot.jinjava" % "jinjava"   % "2.5.0",
  "com.github.scopt"    %% "scopt"    % "4.0.0-RC2",
  "org.slf4j"           % "slf4j-nop" % "1.7.21"
)
