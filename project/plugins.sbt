import sbt._

import Defaults._

resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/releases/"

libraryDependencies+= sbtPluginExtra(
    m = "com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0", // Plugin module name and version
    sbtV = "0.12",    // SBT version
    scalaV = "2.9.2"    // Scala version compiled the plugin
)

libraryDependencies+= sbtPluginExtra(
    m = "com.github.mpeltonen" % "sbt-idea" % "1.2.0", // Plugin module name and version
    sbtV = "0.12",    // SBT version
    scalaV = "2.9.2"    // Scala version compiled the plugin
)
