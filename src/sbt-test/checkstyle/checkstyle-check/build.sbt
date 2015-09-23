
version := "0.1"

name := "checkstyle-test"

organization := "com.etsy"

com.etsy.sbt.Checkstyle.checkstyleSettings
com.etsy.sbt.Checkstyle.CheckstyleTasks.checkstyleCheckSeverityLevel := Set("error")
com.etsy.sbt.Checkstyle.CheckstyleTasks.checkstyleConfig := scala.xml.XML.loadFile(file("my-checkstyle-config.xml"))
