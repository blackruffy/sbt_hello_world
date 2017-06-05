lazy val root = (project in file(".")).
  settings(
    name := "hello_world",
    version := "1.0",
    scalaVersion := "2.12.2",

    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.3" % "test"
    ),

    scalacOptions in Test ++= Seq("-Yrangepos"),

    assemblyJarName in assembly := "hello_world.jar",
    mainClass in assembly := Some("net.blackruffy.Main")
  )
