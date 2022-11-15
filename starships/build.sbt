import Dependencies._

ThisBuild / scalaVersion     := "3.2.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"

resolvers += "GitHub Package Registry" at "https://maven.pkg.github.com/austral-ingsis/starships-ui"
credentials += Credentials("GitHub Package Registry", "maven.pkg.github.com", "jalopbauer", "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")

libraryDependencies += "edu.austral.ingsis.starships" % "starships-ui" % "1.0.0"

lazy val root = (project in file("."))
  .settings(
    name := "starships",
  )
