addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.1.1")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.4.0")

libraryDependencies +=
  "de.jflex" % "jflex" % "1.4.3"

libraryDependencies +=
  "classycle" % "classycle" % "1.3.2" from
    "http://ccl.northwestern.edu/devel/classycle-1.3.2.jar"

