lazy val root = (project in file(".")).
  settings(
    name := "hello_world",
    version := "1.0",
    scalaVersion := "2.11.8",

    libraryDependencies ++= Seq(
      "org.specs2" %% "specs2-core" % "3.8.5" % "test"
    ),

    scalacOptions in Test ++= Seq("-Yrangepos"),

    assemblyJarName in assembly := "hello_world.jar",
    mainClass in assembly := Some("net.blackruffy.Main")
  )
