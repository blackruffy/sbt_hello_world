lazy val root = (project in file(".")).
  settings(
    name := "hello_world",
    version := "1.0",
    scalaVersion := "2.11.8",

    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test",

    assemblyJarName in assembly := "hello_world.jar",
    mainClass in assembly := Some("net.blackruffy.Main")
  )
