ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.6"

lazy val root = (project in file("."))
  .settings(
    name := "optaplanner101",

    // https://mvnrepository.com/artifact/org.optaplanner/optaplanner-core
    libraryDependencies ++= Seq("org.optaplanner" % "optaplanner-core" % "9.44.0.Final",
        "junit" % "junit" % "4.13.2" % Test,
        "ch.qos.logback" % "logback-classic" % "1.5.18")

)
