import org.scalastyle.sbt.ScalastylePlugin.settings._

enablePlugins(ScalastylePlugin)

scalastyleConfig := file("scalastyle-config.xml")

(scalastyleConfig in Test) := file("test-scalastyle-config.xml")

version := "0.1"

scalaVersion := "2.10.0"
