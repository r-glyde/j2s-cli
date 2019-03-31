package com.rgl10.j2scli

import com.hubspot.jinjava.Jinjava
import com.rgl10.j2scli.ConfigParser.parser
import com.rgl10.j2scli.Utils.{inputToString, outputToFile}
import scopt.OParser

import scala.collection.JavaConverters._

object Main {
  def main(args: Array[String]): Unit =
    run(args, sys.env) match {
      case Some(_) => System.exit(0)
      case None =>
        println("Something went wrong!")
        System.exit(1)
    }

  def run(args: Array[String], envVars: Map[String, String]): Option[Unit] =
    OParser.parse(parser, args, Config()) match {
      case Some(config) =>
        val input = inputToString(config.inputFile)
        val output = new Jinjava().render(input, envVars.asJava)
        config.outputFile.fold(Some(print(output)))(f => Some(outputToFile(output, f)))
      case _ => None
    }
}
