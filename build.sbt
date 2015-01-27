organization := "com.github.utgarda"

name := "Joise"

version := "0.1"

scalaVersion := "2.11.5"

libraryDependencies += "junit" % "junit" % "4.11" % "test"

excludeFilter in Compile ~= { _ ||
  new FileFilter {
    def accept(f: File) = f.getPath.containsSlice("/examples/")
  } }

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

licenses := Seq("Apache License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))

homepage := Some(url("https://github.com/utgarda/Joise"))

pomExtra := <scm>
    <url>git@github.com:utgarda/Joise.git</url>
    <connection>scm:git@github.com:utgarda/Joise.git</connection>
  </scm>
  <developers>
    <developer>
      <id>codetaylor</id>
      <name>Jason Taylor</name>
      <url>http://www.sudoplaygames.com/</url>
    </developer>
  </developers>
